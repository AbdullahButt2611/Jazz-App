# Jazz-App

## Introduction

**Jazz-App** is a **Java-based desktop application** developed as a two-member university project. It combines the core features of the popular mobile apps **JazzCash** and **JazzWorld**, along with additional functionality, into a single desktop-based solution.

> **Disclaimer:** This project was built purely for academic purposes as part of a term assignment. No official APIs were used, and no rights have been purchased from **Jazz**. All rights belong to Jazz.

## Features

* **User-Friendly Interface** – Clean, intuitive UI built with Java Swing.
* **Two Actor Roles:**

  * **User** – Must register with a **unique ID** to access the system. Users can check balance, perform actions, and manage account features.
  * **Admin** – Full control to manage users, validate operations, and oversee system functions.
* **Balance Management** – Users’ balances are updated automatically upon activation.
* **JazzCash & JazzWorld Simulation** – Provides a desktop clone of the features from both apps.
* **Authentication & Security** – Basic validation to ensure authorized access.

## Technologies Used

* **Language:** Java
* **UI Framework:** Swing
* **Architecture:** MVC (Model-View-Controller)
* **Design Patterns:** MVC, Singleton
* **Concepts Applied:**

  * Object-Oriented Programming (Encapsulation, Inheritance, Polymorphism)
  * Exception Handling
  * Modular Architecture

## Project Structure

```
Jazz-App/
│── src/                  # Source code
│   ├── model/            # Business logic and data handling
│   ├── view/             # UI components
│   └── controller/       # Application control flow
│── assets/               # Images, icons, etc.
│── jazzApp.png           # Sample GUI screenshot
│── README.md             # Project documentation
```

## Outcome of Project

Below is the snapshot of the GUI:

![GUI of Project](jazzApp.png)

## Design Patterns & Concepts

### 🔹 Model-View-Controller (MVC)

Separates the application into three layers (Model, View, Controller) to make the project scalable and maintainable.

### 🔹 Singleton

Ensures critical classes (e.g., configuration or controllers) are instantiated only once across the app’s lifecycle.

### 🔹 Object-Oriented Programming (OOP)

Applied encapsulation, inheritance, and polymorphism to model real-world entities and simplify feature expansion.

### 🔹 Exception Handling

Implemented structured error handling to ensure smooth user experience and system reliability.

## How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/<your-username>/Jazz-App.git
   ```
2. Open the project in any Java-supported IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).
3. Compile and run the application directly from the IDE.
4. The app is file-system based (no database required).

## Team

This project was collaboratively developed by:

* [@AbdullahYaqub72](https://github.com/AbdullahYaqub72)
* [@AbdullahButt2611](https://github.com/AbdullahButt2611)

## Notes

* This project **does not use APIs** from the official Jazz apps.
* It is **not for commercial use** — only for educational purposes.

## Conclusion

Jazz-App demonstrates effective teamwork and the application of **Java, OOP, MVC, and design patterns** in building a real-world style desktop application. While limited by the absence of a connected database, the project successfully simulates core features of JazzCash and JazzWorld and serves as a strong foundation for future development.
