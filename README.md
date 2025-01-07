# Todo Application

This is a Todo application built using Angular for the frontend and a Spring Boot REST API backend.

## Table of Contents

- [Project Description](#project-description)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Project Description

This Todo application allows users to create, read, update, and delete (CRUD) tasks. The frontend is built with Angular and it communicates with a Spring Boot REST API backend to manage the tasks.

## Features

- Add, edit, delete, and complete tasks
- Filter tasks by status (All, Active, Completed)
- Toggle all tasks as completed or active
- Clear all tasks

## Technologies Used

- **Frontend:** Angular
- **Backend:** Spring Boot REST API
- **HTTP Client:** Angular HttpClient
- **RxJS:** For reactive programming
- **TypeScript:** For type-safe JavaScript

## Prerequisites

- [Node.js](https://nodejs.org/) (version 14 or higher)
- [Angular CLI](https://cli.angular.io/) (version 19 or higher)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (for backend API)

## Setup Instructions

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/todo-app.git
    cd todo-app
    ```

2. **Install frontend dependencies:**

    ```bash
    cd frontend
    npm install
    ```

3. **Run the frontend application:**

    ```bash
    ng serve
    ```

4. **Install backend dependencies and run the backend API:**

    ```bash
    cd backend
    mvn spring-boot:run
    ```

## Usage

Once the application is set up, you can access the frontend of the application at `http://localhost:4200/`.

### Adding a Todo

- Enter a task in the input field and press Enter or click the Add button.

### Editing a Todo

- Click on the task text to edit it. Press Enter to save changes.

### Deleting a Todo

- Click the Delete button next to the task you want to delete.

### Toggling Completion Status

- Click the checkbox next to the task to toggle its completion status.

### Filtering Tasks

- Use the filter buttons (All, Active, Completed) to filter tasks by their status.

## API Endpoints

### Base URL

`http://localhost:8080/api/todos`

### Endpoints

- `GET /`: Get all todos
- `GET /{id}`: Get a todo by ID
- `POST /`: Create a new todo
- `PUT /{id}`: Update a todo by ID
- `DELETE /{id}`: Delete a todo by ID

## Contributing

Contributions are welcome! Please create a pull request or open an issue for any changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.