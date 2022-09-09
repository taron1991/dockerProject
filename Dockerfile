FROM openjdk:11
COPY /target/demo-0.0.1-SNAPSHOT.jar /target
CMD ["java","-jar","/target"]