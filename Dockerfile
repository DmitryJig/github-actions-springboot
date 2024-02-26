FROM openjdk:17-oracle
COPY target/*.jar app.jar
EXPOSE 8189
ENTRYPOINT ["java", "-jar", "app.jar"]