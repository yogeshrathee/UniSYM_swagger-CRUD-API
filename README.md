# 📚 UMS (University Management System)

UMS is a simple Java-based application built using Spring Boot framework. This application allows you to manage student records in a university.
![Example Image](example.png)

## 🔑 Features

- [x] Create a new student record
- [x] Get student record by registration number
- [x] Get all student records
- [x] Update student record
- [x] Delete student record by registration number
- [x] Delete all student records

## 🚀 Tech Stack

1. [Spring Boot](https://spring.io/projects/spring-boot)
2. [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
3. [Hibernate](https://hibernate.org/)
4. [MySQL](https://www.mysql.com/)
5. [Swagger](https://swagger.io/) (API documentation)

## 💻 Setup and Run

1. Clone the repository
2. Open the project in your favorite IDE
3. Create a MySQL database named "ums"
4. Update the `application.properties` file with your MySQL credentials
5. Run the `UmsApplication` class
6. Access the Swagger UI at `http://localhost:8080/swagger-ui/index.html`

## 📚 API Documentation

Swagger UI is available at `http://localhost:8080/swagger-ui/index.html`. You can find the details of each API, including the request method, endpoint, required parameters, and response format.

## 📁 Code Structure

1. `Ums`: The model class representing the student record
2. `UmsRepo`: The JPA repository interface for database operations
3. `UmsService`: The service interface defining the CRUD operations
4. `UmsImpl`: The service implementation class for CRUD operations
5. `UmsController`: The REST controller class handling HTTP requests and responses

## Usage

- **GET /ums/{regNo}**: Retrieve a user record by registration number.
- **GET /ums**: Retrieve all user records.
- **POST /ums**: Create a new user record.
- **PUT /ums**: Update an existing user record.
- **DELETE /ums/{regNo}**: Delete a user record by registration number.
- **DELETE /ums**: Delete all user records.


## 🤝 Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

## 📝 License

This project is licensed under the MIT License - see the `LICENSE` file for details.
