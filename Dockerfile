FROM amazoncorretto:17
MAINTAINER Yael_Nemer
COPY target/Proyecto-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080

