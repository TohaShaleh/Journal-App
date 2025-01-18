# Journal App

A **backend application** built with **Spring Boot** to manage personal journal entries efficiently. This project demonstrates RESTful API development, seamless database integration, and the implementation of advanced features like search functionality and exception handling.

---

## Features

### Backend:
- **CRUD Operations**: Built RESTful APIs to create, read, update, and delete journal entries.
- **Search Functionality**: Enabled case-insensitive search for journal entries by title.
- **Database Integration**:
  - Connected to a MySQL database using **Spring Data JPA**.
  - Ensured robust data persistence for journal entries with auto-generated schema management.
- **Exception Handling**: Implemented comprehensive error handling to provide meaningful error messages.
- **Modern Java Support**: Utilized Java 17 with Spring Boot 3.2.11 for modern and scalable backend development.

---

## My Contributions

- **Backend Development**:
  - Designed and implemented REST APIs for journal management.
  - Integrated a MySQL database and implemented schema generation using Spring JPA.
  - Debugged and resolved API endpoint issues during development and testing.
- **Error Handling**:
  - Developed exception handling for scenarios like missing entries or invalid input.
  - Enhanced user experience by ensuring meaningful error responses.
- **Search Implementation**:
  - Used Spring Data JPA to enable case-insensitive title-based search functionality.
  - Validated search queries and optimized for performance.

---

## Challenges Faced and Solutions

### 1. **Database Connection Issues**:
   - **Problem**: Faced `Access Denied` errors when connecting to MySQL.
   - **Solution**: Corrected database credentials and granted appropriate permissions:

### 2. **Implementing Search Functionality**:
   - **Problem**: Needed an efficient way to search journal entries by a substring in the title.
   - **Solution**: Leveraged Spring Data JPA's `findByTitleContainingIgnoreCase` to perform case-insensitive searches seamlessly.

### 3. **API Testing and Debugging**:
   - **Problem**: Some API endpoints were not returning expected results.
   - **Solution**: Tested endpoints in Postman, fixed input validation, and added logging for debugging.

---

## API Endpoints

1. **GET** `/api/journals` - Retrieve all journal entries.
2. **GET** `/api/journals/{id}` - Retrieve a journal entry by ID.
3. **POST** `/api/journals` - Add a new journal entry.
4. **PUT** `/api/journals/{id}` - Update a journal entry by ID.
5. **DELETE** `/api/journals/{id}` - Delete a journal entry by ID.
6. **GET** `/api/journals/search?title={title}` - Search journal entries by title.
