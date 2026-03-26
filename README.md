# Task Manager REST API  

## Overview  
This project is a simple Task Manager REST API built with Spring Boot. It provides endpoints to manage tasks, utilizing PostgreSQL as the database backend, Docker for containerization, and Spring Data JPA for data access.  

## Technologies Used  
- **Java 11**: The programming language used for the application.  
- **Spring Boot**: A framework for building Java applications quickly.  
- **Spring Data JPA**: A part of the Spring framework that simplifies the data access layer.  
- **PostgreSQL**: A powerful, open-source relational database system.  
- **Docker**: A platform used to develop, ship, and run applications in containers.  

## Features  
- **Create a Task**: Create a new task with a title, description, and status.  
- **Retrieve Tasks**: Fetch all tasks or find a task by its ID.  
- **Update a Task**: Modify the details of an existing task.  
- **Delete a Task**: Remove a task from the database.  
- **Task Filtering**: Filter tasks by status and other criteria.  

## Getting Started  
To get a local copy up and running follow these simple steps.  

### Prerequisites  
- JDK 11 or higher  
- Docker  
- PostgreSQL  

### Installation  
1. Clone the repository  
   ```bash  
   git clone https://github.com/ImeshaDissa/task-manager.git  
   ```  
2. Navigate to the project directory  
   ```bash  
   cd task-manager  
   ```  
3. Build the Docker image  
   ```bash  
   docker build -t task-manager .  
   ```  
4. Run the Docker container  
   ```bash  
   docker run -p 8080:8080 task-manager  
   ```  
5. Access the API at `http://localhost:8080`.  

## API Endpoints  
- **POST /tasks**: Create a new task  
- **GET /tasks**: Retrieve all tasks  
- **GET /tasks/{id}**: Retrieve task by ID  
- **PUT /tasks/{id}**: Update task by ID  
- **DELETE /tasks/{id}**: Delete task by ID  

## Database Setup  
Ensure that you have PostgreSQL running and a database created for the Task Manager. Configure the database connection in the `application.properties` file.  

## Authors  
- **Imesha Dissanayaka**  

## License  
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.  

## Acknowledgments  
- Inspired by various task management applications.  
- Special thanks to the Spring community for their support and documentation.
