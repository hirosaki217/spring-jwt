# mvn clean package spring-boot:repackage
FROM openjdk:11-jre-slim
WORKDIR /usr/src/myapp
COPY target/spring-jwt-1.jar /usr/src/myapp/app.jar
EXPOSE 8080
CMD [ "java", "-jar", "/usr/src/myapp/app.jar" ]
