# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk-slim AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and src folder (if using Maven)
COPY pom.xml .
COPY src ./src

# Build the app using Maven (adjust the command for Gradle if needed)
RUN apt-get update && apt-get install -y maven
RUN mvn clean package

# Copy the jar from the target directory into the container
#COPY target/RPPricingCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar /app/RPPricingCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar

# Expose the port that the Spring Boot app runs on (default: 8080)
EXPOSE 8080

# Run the Spring Boot app
CMD ["java", "-jar", "/target/RPPricingCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]