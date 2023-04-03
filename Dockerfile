FROM openjdk:11
ARG JAR_FILE=target/*.jar
#RUN mkdir /opt/dockertest-app
COPY ${JAR_FILE} docker-test.jar
ENTRYPOINT ["java","-jar","/opt/dockertest-app/docker-test.jar"]


