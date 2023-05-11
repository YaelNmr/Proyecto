FROM amazoncorretto:17-alpine-jdk
MAINTAINER yaelnemer
COPY target/Proyecto-0.0.1-SNAPSHOT.jar yaelnmr-app.jar
ENTRYPOINT ["java","-jar","/yaelnmr-app.jar"]

