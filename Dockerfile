FROM amazoncorretto:20

MAINTAINER yaelnemer

COPY target/Proyecto-0.0.1-SNAPSHOT.jar yaeln-app.jar

ENTRYPOINT ["java","-jar","/yaeln-app.jar"]

EXPOSE 8080
