# 🌐 Live Demo
You can access a live demo of the project here :- https://electoralbondsapplication.azurewebsites.net/swagger-ui/index.html#/

# 📚 UMS (University Management System)

UMS is a simple Java-based application built using Spring Boot framework. This application allows you to manage student records in a university.
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(24).png)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 🔑 Features

- ## [A] Create a new student record

      1. Empty Database
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(25).png)

      2. Excute the post request
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(26).png)

      3. Record Created Successfully !!
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(27).png)

      4. Record is showing in database , after excuted the post request. 
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(28).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- ## [B] Get record by the student registration number
  
      1. Enter the Sudent Registration number , and Excute the get request
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(30).png)

      2. Record Fetched Successfully by the Student Registration Number.
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(31).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- ## [C] Update student record

      1. Previous record is
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(28).png)

      2. Excute the put request
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(33).png)

      3. Record updated Successfully !!
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(34).png)

      4. Updated Record is showing in database , after excuted the put request.
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(35).png)

  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
- ## [D] Delete record by the student registration number

      1. Enter the Sudent Registration number , and Excute the delete request
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(36).png)
  
      2. Record deleted Successfully by the Student Registration Number.
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(37).png)
  
      3. Record is not showing in database , after excuted the delete request.
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(38).png)

  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- ## [E] Get all student records

      1. Records in Database
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(38.1)%20-%20Copy.png)

      2. Excute the request for fetched the all records.
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(38.1).png)

      3. All Records Fetched Successfully.
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(39).png)

  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
- ## [F] Delete all student records

      1. Records in Database
  ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(38.1)%20-%20Copy.png)

      2. Excute the request for deleted the all records.
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(41).png)

      3. All Records Deleted Successfully.
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(42).png)

      4. No record founds.
![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(43).png)
      
  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
6. Access the Swagger UI at
   `http://localhost:8080/swagger-ui/index.html`
   ![](https://github.com/yogeshrathee/UniSYM_swagger-CRUD-API/blob/9027a48a3aa63a6341008a8f4dcc6243c3f3ba2d/images/Screenshot%20(24).png)

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
