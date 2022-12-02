FROM openjdk:17
EXPOSE 8080
ADD target/springboot-new-app.jar springboot-new-app.jar
ENTRYPOINT ["java" , "-jar" , "/springboot-new-app.jar"]