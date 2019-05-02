FROM openjdk:latest
ADD target/FactoryApi-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
CMD java -jar FactoryApi-0.0.1-SNAPSHOT.jar