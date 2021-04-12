FROM openjdk:8
ADD target/docker-sp-boot.jar docker-sp-boot.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-sp-boot.jar"]