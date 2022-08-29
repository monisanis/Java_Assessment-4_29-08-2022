FROM openjdk:8

EXPOSE 8080

ADD target/monis.jar monis.jar

ENTRYPOINT ["java","-jar","monis.jar"]

