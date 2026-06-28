# 🛒 E-Commerce Backend API

A feature-rich **Spring Boot E-Commerce Backend Application** that provides REST APIs for managing products with image upload, search functionality, and full CRUD operations. This project demonstrates real-world backend development using Spring Boot, JPA, and MySQL.

---

## 🚀 Overview

This backend system allows users to:

* Manage products (Create, Read, Update, Delete)
* Upload and retrieve product images
* Search products by keyword
* Store product data in a relational database
* Handle REST API requests efficiently

The application is built using a clean layered architecture (Controller → Service → Repository).

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL Database
* Lombok
* Maven
* Multipart File Handling

---

## 📁 Project Structure

```text id="p0kq7a"
Controller → Service → Repository → Database
```

```
com.example.E_Commerce
│
├── Controller
│   └── ProductController
│
├── Service
│   └── ProductService
│
├── Repo
│   └── ProductRepo
│
├── Model
│   └── Product
│
└── ECommerceApplication
```

---

## ✨ Features

### 🛍️ Product Management

* Add new products
* Update existing products
* Delete products
* View all products
* View product by ID

### 🖼️ Image Handling

* Upload product images using `MultipartFile`
* Store images in database as byte array
* Retrieve product images via API

### 🔎 Search Functionality

* Search products by:

  * Name
  * Brand
  * Category
  * Description

### 📦 REST APIs

* Fully RESTful endpoints using Spring Boot
* Proper HTTP status handling (`200`, `201`, `404`, `500`)

---

## 🌐 API Endpoints

| Method | Endpoint                         | Description                  |
| ------ | -------------------------------- | ---------------------------- |
| GET    | `/api/`                          | Welcome message              |
| GET    | `/api/products`                  | Get all products             |
| GET    | `/api/product/{id}`              | Get product by ID            |
| POST   | `/api/product`                   | Add new product (with image) |
| PUT    | `/api/product/{id}`              | Update product               |
| DELETE | `/api/product/{id}`              | Delete product               |
| GET    | `/api/product/{productId}/image` | Get product image            |
| GET    | `/api/products/search?keyword=`  | Search products              |

---

## 🧠 Key Concepts Implemented

* Spring Boot REST API development
* Layered architecture (Controller-Service-Repository)
* JPA & Hibernate ORM
* Custom JPQL queries
* File upload & image storage in database
* Exception handling with ResponseEntity
* RESTful best practices
* Dependency Injection

---

## 🧾 Product Entity Structure

* id
* name
* description
* brand
* price
* category
* releaseDate
* productAvailable
* stockQuantity
* imageName
* imageType
* imageData (BLOB)

---

## 📸 Image Handling Logic

* Images are uploaded using `MultipartFile`
* Stored in database as:

  * `imageName`
  * `imageType`
  * `imageData (byte[])`
* Retrieved using:

  ```
  /api/product/{productId}/image
  ```

---

## 🔍 Search Logic

Search is implemented using JPQL:

* Searches across:

  * name
  * brand
  * category
  * description

Case-insensitive search using `LOWER()` and `LIKE`.

---

## 🎯 Learning Outcomes

This project helped me understand:

* Building real-world backend systems
* REST API design principles
* File upload handling in Spring Boot
* Database relationships and entity mapping
* Writing custom JPQL queries
* Exception handling in APIs
* Clean architecture design

---

## 🚀 Future Enhancements

* Spring Security (Admin/User roles)
* JWT Authentication
* Cart & Order Management
* Payment Gateway Integration
* Swagger API Documentation
* Pagination & Sorting
* Cloud storage for images (AWS S3)
* Docker deployment

---

## ⚙️ How to Run

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the Spring Boot application
4. Use Postman to test APIs

---

## 👩‍💻 Author

**Bhargavi Bavirisetty**

Java Backend Developer passionate about building scalable and production-ready applications using Spring Boot and modern backend technologies.
