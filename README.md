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
- [Known Issues](#known-issues)
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

- **Frontend:** Angular 19
- **Backend:** Spring Boot
- **HTTP Client:** Angular HttpClient
- **RxJS:** For reactive programming
- **TypeScript:** For type-safe JavaScript

## Prerequisites

- [Node.js](https://nodejs.org/) (version 18 or higher)
- [Angular CLI](https://cli.angular.io/) (version 19 or higher)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (for backend API)

## Setup Instructions

1. **Clone the repository:**

    ```bash
    git clone https://github.com/renegrossGit/SimpleSpringBootHackathron.git
    cd todo-app
    ```

2. **Install frontend dependencies:**

    ```bash
    cd Angular-Todo_list
    npm install
    ```

3. **Run the frontend application:**

    ```bash
    ng serve
    ```

4. **Install backend dependencies and run the backend API:**

    ```bash
    cd tovodoo
    mvn spring-boot:run
    ```
## Docker Setup and Run Guide

### Prerequisites

Before you begin, ensure you have Docker installed on your machine. You can download and install Docker from [here](https://www.docker.com/products/docker-desktop).

### Step 1: Clone the Repository

Clone the repository to your local machine:

```bash
git clone https://github.com/renegrossGit/SimpleSpringBootHackathron.git
cd SimpleSpringBootHackathron
```

### Step 2: Build and Run the Docker Containers

Build the Docker images and start the containers:

```bash
docker-compose up --build
```

This command will build the Docker images for both the Angular frontend and the Spring Boot backend, and then start the containers.




## Usage

Once the application is set up, you can access the frontend of the application at [http://localhost:4200/](http://localhost:4200/).

Access the H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)


    JDBC URL: jdbc:h2:mem:testdb
    Username: sa
    Password: password

Bugreport: Do not work with dockerimage.

### Adding a Todo

- Enter a task in the input field and press Enter or click the Add button.

### Editing a Todo

- Click on the task text to edit it. Press Enter to save changes.

### Deleting a Todo

- Click the Delete button next to the task you want to delete.

### Delete All

- Click the "Delete All" button to delete all tasks (Do not work with Dockerimage).

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

# Known Issues

### Docker Image Issues

1. **Delete Button Not Working:**

   When running the application using the Docker image specified in the `Dockerfile`, the "Delete All" button does not function as expected. This issue is likely due to differences in the environment or dependencies between the Docker container and the development setup. We are currently investigating this issue and will provide a fix in future updates.

2. **H2 Console Access:**

   The H2 database console cannot be accessed when the application is running in the Docker container. This is due to the fact that the Docker image does not support GUI-based applications, which are required for the H2 console. To manage and inspect the H2 database, please run the application outside of Docker, using your local development environment.

### Workarounds

#### Running Locally

To avoid these issues, you can run the application locally without Docker: [Setup Instructions](#setup-instructions)

## Contributing

Contributions are welcome! Please create a pull request or open an issue for any changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.