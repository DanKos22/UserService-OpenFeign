FROM openjdk:17-jdk-slim
ENV PROFILE=docker
#LABEL authors="G00397054@atu.ie"

#ENTRYPOINT ["top", "-b"]

WORKDIR /app

# Set the JAR file from the target directory to the container at /app
COPY target/UserService-0.0.1-SNAPSHOT.jar /app

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file when the container launches
CMD ["java", "-jar", "UserService-0.0.1-SNAPSHOT.jar"]
