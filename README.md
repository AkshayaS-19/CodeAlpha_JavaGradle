# CodeAlpha Java Gradle Project

## Project Overview

This project demonstrates how to automate the build process of a Java application using **Gradle**. It includes dependency management, unit testing, and a CI/CD pipeline using **GitHub Actions**.

The project was developed as part of the **CodeAlpha Java Gradle Build Automation Task**.

## Objectives

* Automate Java project builds using Gradle
* Manage external dependencies using Gradle
* Implement unit testing using JUnit
* Configure CI/CD using GitHub Actions
* Automatically build and test the project when changes are pushed to GitHub

## Technologies Used

* **Java 8**
* **Gradle 7.6.4**
* **JUnit 5**
* **Google Guava**
* **Git & GitHub**
* **GitHub Actions**

## Project Structure

```text
CodeAlpha_JavaGradle/
│
├── app/
│   ├── build.gradle
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── codealpha_javagradle/
│       │           └── App.java
│       │
│       └── test/
│           └── java/
│               └── codealpha_javagradle/
│                   └── AppTest.java
│
├── .github/
│   └── workflows/
│       └── gradle.yml
│
├── gradle/
│   └── wrapper/
│
├── gradlew
├── gradlew.bat
├── settings.gradle
└── README.md
```

## Dependencies

The project uses the following dependencies:

### Google Guava

```text
com.google.guava:guava:32.1.3-jre
```

Guava is used in the Java application for string validation.

### JUnit Jupiter

```text
org.junit.jupiter:junit-jupiter:5.9.1
```

JUnit is used for unit testing the Java application.

## Application

The application displays a personalized welcome message and a project greeting.

Example output:

```text
Welcome, Akshu!
Hello from CodeAlpha Gradle Project!
```

## How to Run

Make sure Java and Gradle are installed.

### Run the application

```bash
gradle run
```

### Clean and build the project

```bash
gradle clean build
```

### Run unit tests

```bash
gradle :app:test
```

### View dependencies

```bash
gradle :app:dependencies
```

## Testing

The project uses **JUnit 5** for unit testing.

Tests can be executed using:

```bash
gradle :app:test
```

The test task completed successfully during project verification.

## CI/CD Pipeline

GitHub Actions is configured to automatically build and test the project.

Workflow file:

```text
.github/workflows/gradle.yml
```

The pipeline performs the following operations:

1. Checks out the source code
2. Sets up Java
3. Sets up Gradle
4. Builds the project
5. Runs the tests

The GitHub Actions workflow has been successfully executed.

## GitHub Actions Workflow

The CI/CD workflow is triggered when code is pushed to the `main` branch or when a pull request targets the `main` branch.

```text
Developer
    ↓
GitHub Repository
    ↓
GitHub Actions
    ↓
Checkout Source Code
    ↓
Setup Java
    ↓
Setup Gradle
    ↓
Build Project
    ↓
Run Tests
    ↓
Success
```

## Build Verification

The following Gradle commands were successfully tested:

```text
gradle run
gradle clean build
gradle :app:test
gradle :app:dependencies
```

The GitHub Actions CI/CD workflow also completed successfully.

## Learning Outcomes

Through this project, the following concepts were practiced:

* Gradle project initialization
* Java project structure
* Build automation
* Dependency management
* Unit testing
* Git version control
* GitHub repository management
* CI/CD automation
* GitHub Actions workflows

## Author

**Akshaya S.**

B.E. Computer Science and Engineering
Cyber Security
IFET College of Engineering
