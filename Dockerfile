FROM openjdk:17
EXPOSE 8080
ADD target/dockerDemo-0.0.1-SNAPSHOT.jar dockerDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/dockerDemo-0.0.1-SNAPSHOT.jar"]