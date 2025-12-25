# Java Docker Project

This is a simple Java project that demonstrates how to containerize a Java application using Docker.

## Project Structure

```
java-project/
├── src/
│   └── main/
│       └── java/
│           └── HelloWorld.java
├── pom.xml
├── Dockerfile
└── README.md
```

## Files Description

- `HelloWorld.java`: A simple Java application that prints a greeting message and performs basic operations
- `pom.xml`: Maven configuration file that defines project dependencies and build settings
- `Dockerfile`: Instructions to build a Docker image for the Java application

## How to Build and Run

### Using Docker

1. Build the Docker image:
```bash
docker build -t java-docker-app .
```

2. Run the application in a container:
```bash
docker run java-docker-app
```

### Running locally with Maven

1. Make sure you have Maven and Java 11+ installed
2. Navigate to the project directory
3. Run the following commands:
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="HelloWorld"
```

## Dockerfile Explanation

The Dockerfile does the following:
1. Uses Eclipse Temurin OpenJDK 17 JDK as the base image
2. Sets the working directory to `/app`
3. Copies the source code
4. Compiles the Java application
5. Runs the Java application

The application will print a greeting message, perform a simple calculation, and display system information.

## GitHub Actions CI/CD

This project includes a GitHub Actions workflow that automatically builds and pushes the Docker image to Docker Hub when changes are pushed to the main or master branches.

To use this workflow, you need to set up the following secrets in your GitHub repository:

1. `DOCKERHUB_USERNAME` - Your Docker Hub username
2. `DOCKERHUB_TOKEN` - Your Docker Hub access token (recommended) or password

To add these secrets:

1. Go to your repository on GitHub
2. Navigate to Settings > Secrets and variables > Actions
3. Click "New repository secret" and add each secret

The workflow will build the Docker image on every push to main/master branches and pull requests, but will only push to Docker Hub on pushes (not pull requests).