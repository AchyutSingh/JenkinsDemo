FROM openjdk:17
EXPOSE 8080
ADD target/jenkins-demo-application.jar jenkins-demo-application.jar
ENTRYPOINT ["java","-jar","/jenkins-demo-application.jar"]