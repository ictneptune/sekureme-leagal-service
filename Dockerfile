# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file to the container
COPY target/legal-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 9899

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]