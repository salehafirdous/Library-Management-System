Library Management System

A Java Spring Boot MVC + Hibernate + MySQL project designed to efficiently manage a library’s operations, including book inventory, student records, and issue/return tracking.

This system provides a user-friendly interface for both administrators and users, ensuring seamless handling of library activities.

Features:

User Management: Add, update, delete, and view student details.

Book Management: Add, update, delete, and manage book records.

Issue & Return: Track which student borrowed which book and due dates.

Search Functionality: Find books or students quickly using keywords.

Attendance of Books: View availability status of books (Issued / Available).

Hibernate ORM: Handles database persistence without JDBC boilerplate code.

DAO Pattern: Clean separation of database logic for maintainability.

Technologies Used:

Backend: Java, Spring Boot MVC, Hibernate

Frontend: JSP, HTML, CSS, JavaScript

Database: MySQL

Tools: Maven, Git, Postman (for API testing)

Server: Embedded Tomcat

📂 Project Structure
Library-Management-System/
│── src/main/java/com/tka/library/      # Source code (controllers, services, DAO, models)
│── src/main/resources/                 # Configuration files
│── src/main/webapp/WEB-INF/jsp/        # JSP frontend pages
│── pom.xml                             # Maven dependencies
│── README.md                           # Documentation



Configure Database:

Create a database in MySQL (e.g., library_db).

Update application.properties with your MySQL username & password.

spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


Future Enhancements:

Role-based login (Admin / Librarian / Student).

Email notifications for overdue books.

REST API endpoints for mobile integration.

Advanced reporting & analytics.

