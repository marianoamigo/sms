FROM openjdk:21-slim
COPY deploy/sms-0.0.1.jar mic_sms.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "mic_sms.jar"]

