# Rest Api Dockerize
FROM openjdk:18
LABEL maintainer="hamitmizrak"
ADD target/DevOps_PropertyFinder-0.0.1-SNAPSHOT.jar DevOps_PropertyFinder.jar
ENTRYPOINT ["java", "-jar" ,"DevOps_PropertyFinder.jar"]