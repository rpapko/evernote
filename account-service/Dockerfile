FROM java:8-jre
MAINTAINER Ruslan Papko <ruslan.papko@gmail.com>

ADD ./target/account-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/account-service.jar"]

EXPOSE 7000