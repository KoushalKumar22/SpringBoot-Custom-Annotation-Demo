# SpringBoot-Custom-Annotation-Demo

This project gives an example for creatiing custom annotation in an spring boot application.

## Features

- Add new Customer
- List all Customers profiles
- limit any specified fields

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- postgreSQL (can be replaced with any other database)
- Spring Validation

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
   https://github.com/KoushalKumar22/SpringBoot-Custom-Annotation-Demo.git
   cd SpringBoot-Custom-Annotation-Demo
2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save DATA
- URL: `/save`
- Method: POST
- Description: Save a new customer data record to the database
- Request Body: json in postman
  ```sh
    {
    "name": "Ramesh",
    "address": "delhi",
    "age": 19
    }

3. Get All Users
- URL: `/all`
- Method: GET
- Description: Returns a list of all Customers profiles.
  
4. Validation
- address: sholuld only be that is specified in the validator class.
  
### Project Structure

- `Customer`: Entity class representing a Customer profile.
- `CustomerRepository`: Repository interface for CRUD operations on user profiles.
- `CustomerValidation`: custome annotation class.
- `CustomerValidator`: validator for providing the field options.
- `CustomerController`: REST controller for handling Customer-related requests.

## Acknowledgements

I would like to thank the following resources and individuals who made this project possible:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](http://hibernate.org/)
- [Spring Validation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#validation)
- [JetBrains](https://www.jetbrains.com/idea/)
- [Stack Overflow](https://stackoverflow.com/)
