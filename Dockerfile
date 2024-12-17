# Use the official image as a parent image
FROM eclipse-temurin:21-jre

# Set the working directory
WORKDIR /app

# Copy the jar file to the container
COPY build/libs/study-0.0.1-SNAPSHOT.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=dev"]
