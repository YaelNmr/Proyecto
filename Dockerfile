FROM amazoncorretto:17-alpine-jdk
MAINTAINER yaelnemer
COPY target/Proyecto-0.0.1-SNAPSHOT.jar  Proyecto-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Proyecto-0.0.1-SNAPSHOT.jar"]

