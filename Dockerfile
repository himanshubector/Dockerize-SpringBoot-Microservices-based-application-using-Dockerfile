FROM openjdk:11
COPY target/*.jar docker-test.jar
ENTRYPOINT ["java","-jar","/docker-test.jar"]

