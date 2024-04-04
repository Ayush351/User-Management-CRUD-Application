# User Management CRUD Application

This application is a CRUD (Create, Read, Update, Delete) User Management system implemented using Spring Boot, React JS, MySQL, and Hibernate. It allows seamless communication between the frontend and backend, enabling users to perform CRUD operations on user records.


https://github.com/Ayush351/User-Management-CRUD-Application/assets/41275743/5ebd6b80-b81f-41da-affd-f243f45501d1


# Technologies Used

- Spring Boot: Backend framework for building Java-based applications.
- React JS: Frontend library for building user interfaces.
- MySQL: Relational database management system used for data storage.
- Hibernate: Object-relational mapping tool for Java applications.
- Spring Data JPA: Part of the Spring Data project that makes it easy to implement JPA-based repositories.
  
## Features

- RESTful APIs: Developed RESTful APIs to enable communication between the frontend and backend.
- CRUD Operations: Users can Create, Read, Update, and Delete user records.
- Database Integration: Utilizes Spring Data JPA for seamless integration with the MySQL database.
- Backend Logic: Implemented backend logic to handle CRUD operations on user records.
- Integration with Backend APIs: Frontend React JS application integrates seamlessly with the backend APIs.
  
## Setup Instructions

### Prerequisites
- JDK 8 or higher installed on your system.
- Node.js and npm installed for running React JS frontend.
- MySQL database server installed and running.
  
### Backend Setup

- Clone this repository to your local machine.
- Navigate to the backend directory.
- Open application.properties and configure your MySQL database connection details.
- Run the Spring Boot application using your IDE or by executing mvn spring-boot:run in the terminal.
  
### Frontend Setup

- Navigate to the frontend directory.
- Install dependencies by running npm install.
- Start the React development server by running npm start.
  
### Database Setup

- Create a MySQL database named user_management.
- Run the SQL scripts provided in the database directory to create the necessary tables.
  
### Usage
Access the application by visiting http://localhost:3000 in your web browser.
Perform CRUD operations on user records using the provided interface.

### API Endpoints
- GET /api/users: Retrieve all users.
- GET /api/users/{id}: Retrieve a specific user by ID.
- POST /api/users: Create a new user.
- PUT /api/users/{id}: Update an existing user.
- DELETE /api/users/{id}: Delete a user by ID.
  
