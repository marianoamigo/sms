FROM openjdk:21-slim
ARG JAR_FILE=target/sms-0.0.1.jar
COPY ${JAR_FILE} mic_sms.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "mic_sms.jar"]

