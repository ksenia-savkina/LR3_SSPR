FROM openjdk:17-oracle
ADD build/libs/*.jar LR3_SSPR.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","LR3_SSPR.jar"]