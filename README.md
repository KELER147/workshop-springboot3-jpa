# Workshop Spring Boot 3 + JPA

This project was developed by following the "Java Completo" course by Professor Nelio Alves on the Udemy platform. Its purpose is to apply backend development concepts using Spring Boot 3 and JPA, following clean architecture and best coding practices.

---

## About the Project

This is a simple order management system with the following main features:

- CRUD operations for **Users**, **Products**, and **Categories**.
- Order registration with multiple items, payment, and status handling.
- Use of **DTOs**, service and repository layers for clean organization.
- Custom exception handling.

---

## Project Diagrams

### Domain Model (UML)

This diagram shows the main entities and their relationships:

![Domain Model UML](docs/images/domain-model.png)

### Domain Instance

Example of populated domain objects, illustrating how data interacts:

![Domain Instance](docs/images/domain-instance.png)

### Logical Architecture Layers

Diagram showing the layered architecture of the system:

![Logical Layers](docs/images/logical-layers.png)

---

## How to Run the Project

1. Clone this repository.
2. Import it into your favorite IDE (e.g., IntelliJ IDEA).
3. Configure the database in `application.properties`.
4. Run the application as a Spring Boot project.
5. Use the REST endpoints to interact with the system.

---

## License

This project was created for educational purposes as part of the Udemy course by Nelio Alves.
