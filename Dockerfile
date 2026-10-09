# Etapa 1: compilar el backend
FROM maven:3.9-eclipse-temurin-17-alpine AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn -B -DskipTests package

# Etapa 2: ejecutar la aplicación
FROM amazoncorretto:17-alpine-jdk

WORKDIR /app

COPY --from=build /app/target/Proyecto-0.0.1-SNAPSHOT.jar yaeln-app.jar

ENTRYPOINT ["java", "-jar", "/app/yaeln-app.jar"]
