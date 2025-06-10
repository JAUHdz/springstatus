FROM maven:3.9.6-eclipse-temurin-21-alpine

WORKDIR /app

COPY . .

WORKDIR /status

RUN mvn clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/status-0.0.1-SNAPSHOT.jar"]
