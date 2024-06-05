# Simple Assembly Simulator

This is a simple assembly simulator application built using Spring Boot.

## Description

This application simulates the execution of assembly-like programs. It supports basic commands such as `MV` (Move), `ADD` (Addition), and `SHOW` (Display). The simulator takes a program as input and executes it, providing the final result or any errors encountered during execution.

## Features

- Execute assembly-like programs
- Support for basic commands: `MV`, `ADD`, `SHOW`
- Error handling for invalid commands or formats

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- Maven

### Installation

1. Clone the repository:

```bash
git clone https://github.com/naveedgaibu03/simple-assembly-simulator.git

2.  Navigate to the project directory:
cd simple-assembly-simulator

3.  Build the project:
mvn clean install

4.  Run the application:
mvn spring-boot:run


Usage
1. Send POST requests to http://localhost:8080/api/programs with the assembly program in the request body.

3. The simulator will execute the program and return the result or any errors encountered.
Example using Uri:
Invoke-WebRequest -Uri "http://localhost:8080/api/programs" -Method Post -ContentType "text/plain" -Body "MV REG1,2000`nMV REG2,4000`nADD REG1,REG2`nADD REG1,600`nSHOW REG1"

