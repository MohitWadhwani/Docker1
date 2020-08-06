package com.login.Controller;

import java.nio.channels.FileChannel.MapMode;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.login.Service.TodoService;

@Controller
@SessionAttributes("name")
public class todoController {

	@Autowired
	TodoService service;
	@RequestMapping(value="/todo-list",method=RequestMethod.GET)
	public String showTodo(ModelMap map)
	{
		String name=map.get("name").toString();
		map.put("todo",service.retrieveTodos(name));
		return "todo-list";
	}
	
	@RequestMapping(value="/addtodo",method=RequestMethod.GET)
	public String addtodo(ModelMap map)
	{
		//map.put("description",description);
		//service.addTodo(map.get("name").toString(), description, new Date(), false);
		return "addtodo";
	}
	
	@RequestMapping(value="/showtodo",method=RequestMethod.POST)
	public String showtodo(ModelMap map,@RequestParam String description)
	{
		//map.put("description",description);
		service.addTodo(map.get("name").toString(), description, new Date(), false);
		return "redirect:todo-list";
	}
	
}
