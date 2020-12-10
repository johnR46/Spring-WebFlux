FROM openjdk:11-jre-slim
EXPOSE 8080
add target/*.jar /app.jar
ENTRYPOINT java $JAVA_OPTS -jar /app.jar