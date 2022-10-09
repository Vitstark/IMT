FROM eclipse-temurin:18-jdk-jammy as build
WORKDIR /opt/myapp
ADD . .
COMMAND ["./mvnw", "spring-boot:run"]
