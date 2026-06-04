FROM amazoncorretto:21
ARG JAR_FILE=target/*.jar
COPY ./target/munchmate-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]