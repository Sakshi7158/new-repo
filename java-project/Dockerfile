# Use official OpenJDK runtime as the base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file
COPY pom.xml .

# Copy the source code
COPY src ./src

# Compile the Java application directly
RUN javac -d . src/main/java/HelloWorld.java

# Expose any necessary ports (if this was a web app)
# EXPOSE 8080

# Define the command to run the application
CMD ["java", "HelloWorld"]