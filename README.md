# E-Learning Platform

## Project Overview

This project is an e-learning platform implemented using **Spring Boot**, **Hibernate**, and **Spring Data JPA**. The platform allows users to manage courses, sections, lectures, and various types of resources, such as videos, files, and texts. It demonstrates the use of various relationships such as **One-to-Many**, **Many-to-Many**, and **One-to-One** associations, along with inheritance mapping for different resource types.

## Features

- **Course Management**: Create and manage courses, each containing multiple sections.
- **Section Management**: Each section can have multiple lectures.
- **Lecture Management**: Manage lectures with one-to-one relationships to resources.
- **Resource Management**: Different types of resources, including **Video**, **File**, and **Text**.
- **Inheritance Strategy**: Implements the **Table-per-Class** inheritance strategy for managing resources with different properties (Video, File, Text).

## Technologies Used

- **Spring Boot**: To build the backend REST APIs.
- **Hibernate**: ORM framework for mapping Java objects to database tables.
- **Spring Data JPA**: For handling data persistence with relational databases.
- **PostgreSQL**: Relational database used for storing data.
- **Lombok**: To reduce boilerplate code.

## Database Design

The database consists of the following tables:

1. **Course**: Represents an online course.
   - Many-to-Many relationship with **Author**.
   - One-to-Many relationship with **Section**.

2. **Section**: Represents different sections of a course.
   - One-to-Many relationship with **Lecture**.

3. **Lecture**: Represents a lecture in a section.
   - One-to-One relationship with **Resources**.

4. **Resource**: Base class for different types of resources (Video, File, Text).
   - **Video**: Contains additional field `length`.
   - **File**: Contains additional field `type`.
   - **Text**: Contains additional field `content`.

## Class Diagram
![Screenshot (84)](https://github.com/user-attachments/assets/48aef51a-6644-4dea-b37d-9574da82aec7)

![Screenshot (88)](https://github.com/user-attachments/assets/0f56a81e-0ccb-4b2e-a103-a36457df523f)


## Getting Started

### Prerequisites

- **Java 17**
- **PostgreSQL** (or any other relational database)
- **Maven** (or Gradle)

### Running the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/AhmedMosad255/E-Learning-Platform.git
    ```

2. Navigate to the project directory:
    ```bash
    cd repository-name
    ```

3. Configure the database settings in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.jpa.hibernate.ddl-auto=update
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## How to Contribute

1. Fork the repository.
2. Create a new branch for your feature (`git checkout -b feature/new-feature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
