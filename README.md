# ☁️ CloudNotes – Spring Boot Note Management API

CloudNotes is a simple **Note Management REST API** developed using **Java and Spring Boot**.  
It allows users to create, view, update, and delete notes using REST API endpoints.

## 🚀 Features

- Create a new note
- View all notes
- Update an existing note
- Delete a note
- RESTful API architecture
- Database integration using Spring Data JPA
- Automatic ID generation
- Simple MVC structure

## 🛠️ Technologies Used

- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Lombok**
- **Maven**

## 📂 Project Structure

```text
src/main/java/com/cloudnotes
│
├── CloudNotesApplication.java
│
├── HomeController.java
│
├── controller
│   └── NoteController.java
│
├── entity
│   └── Note.java
│
└── repository
    └── NoteRepository.java
```

## 🔗 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/notes` | Get all notes |
| POST | `/api/notes` | Add a new note |
| PUT | `/api/notes/{id}` | Update a note |
| DELETE | `/api/notes/{id}` | Delete a note |

## 📝 Example JSON

### Create Note

```json
{
    "title": "My First Note",
    "content": "Learning Spring Boot REST API"
}
```

### Response

```json
{
    "id": 1,
    "title": "My First Note",
    "content": "Learning Spring Boot REST API"
}
```

## ⚙️ How to Run

### 1. Clone the repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Open the project

Open the project in **Eclipse / IntelliJ IDEA / VS Code**.

### 3. Configure MySQL

Create a database:

```sql
CREATE DATABASE cloudnotes;
```

Configure your database details in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cloudnotes
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the application

Run:

```text
CloudNotesApplication.java
```

The application will start on:

```text
http://localhost:8080
```

## 🧪 Testing

You can test the APIs using **Postman**.

Example:

```text
GET    http://localhost:8080/api/notes
POST   http://localhost:8080/api/notes
PUT    http://localhost:8080/api/notes/1
DELETE http://localhost:8080/api/notes/1
```

## 🎯 Learning Outcomes

Through this project, I practiced:

- Building REST APIs using Spring Boot
- Creating Controllers
- Creating Entity classes
- Using Spring Data JPA
- Performing CRUD operations
- Connecting a Spring Boot application with a database
- Using Git and GitHub for project management

## 👩‍💻 Author

**Diksha Dipak Chothe**

B.Tech Computer Science & Engineering

---

⭐ If you find this project useful, feel free to star the repository.
