FROM openjdk:17
EXPOSE 8761
COPY target/tagservice-0.0.1-SNAPSHOT.jar tagservice.jar
ENTRYPOINT ["java", "-jar", "/tagservice.jar"]