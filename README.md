# Task Manager

This is a Spring Boot application for managing tasks. It provides RESTful APIs to perform CRUD operations on tasks.

## Features
- Add new tasks
- Retrieve all tasks
- Delete tasks by ID

## Technologies Used
- Java 17
- Spring Boot 3.4.4
- H2 Database
- Maven

## How to Run
1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run`.
4. Access the application at `http://localhost:8090`.

## API Endpoints
- `GET /api/v1/tasks` - Retrieve all tasks
- `POST /api/v1/add` - Add a new task
- `DELETE /api/v1/id` - Delete a task by ID