FROM adoptopenjdk/openjdk11

EXPOSE 8080

COPY target/hwn_0907_authorisationService-0.0.1-SNAPSHOT.jar authorizationapp.jar

CMD ["java", "-jar", "authorizationapp.jar"]