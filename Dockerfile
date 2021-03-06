FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk:8-jdk-alpine

#expose port 8080
EXPOSE 9090

#default command
CMD java -jar /data/LoginDemo-0.0.1-SNAPSHOT.jar

#copy LoginDemo world to docker image from builder image

COPY --from=maven_build /tmp/target/LoginDemo-0.0.1-SNAPSHOT.jar /data/LoginDemo-0.0.1-SNAPSHOT.jar