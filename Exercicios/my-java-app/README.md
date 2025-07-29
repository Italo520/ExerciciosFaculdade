# My Java App

This is a simple Java application to demonstrate the setup of a Java project using Maven.

## Project Structure

```
my-java-app
├── src
│   └── main
│       └── java
│           └── App.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven 3.6 or higher

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="App"
```

## Description

The `App.java` file contains the main class with the entry point of the application. You can modify this file to add your own functionality.

## License

This project is licensed under the MIT License.