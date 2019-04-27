FROM 11.0.2-jdk-windowsservercore-1809
ADD target/FactoryApi-0.0.1-SNAPSHOT.jar .
EXPOSE 8083
CMD java -jar FactoryApi-0.0.1-SNAPSHOT.jar