FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD bff-service.jar /opt/bff-service/
EXPOSE 8080
WORKDIR /opt/bff-service/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "bff-service.jar"]
