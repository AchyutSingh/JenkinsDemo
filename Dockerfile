FROM openjdk:17
EXPOSE 8080
ADD target/JenkinsDemo-application.jar JenkinsDemo-application.jar
ENTRYPOINT ["java","-jar","/JenkinsDemo-application.jar"]