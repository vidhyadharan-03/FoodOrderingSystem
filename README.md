# 🍽️ FoodOrderingSystem

A modular, console-based food ordering application built using **Core Java** with a clean **Low-Level Design (LLD)** and adherence to **SOLID principles**. This project simulates the basic flow of a food ordering system, allowing users to browse the menu, add items to a cart, and place orders — while also enabling **restaurant owners** to dynamically manage the menu.

---

## 🎯 Project Objective

To design a real-world-inspired **food ordering system** that demonstrates:

- Strong understanding of **Object-Oriented Programming (OOP)**
- Clean **Low-Level Design (LLD)** structure for backend systems
- Application of **SOLID principles** to achieve scalability and maintainability
- Practical use of **Data Structures** to manage items, carts, and orders
- A simulation of both **customer** and **owner** perspectives within the ordering flow

---

## ✨ Key Features

### 👨‍🍳 Owner Perspective
- ➕ Add new food items to the menu dynamically

### 🧑‍💻 Customer Perspective
- 📜 View available food items
- 🛒 Add items to the cart
- 📦 Place orders directly from the cart or from the main menu
- 🧾 Receive a printed bill after order placement

---

## 🧩 Low-Level Design (LLD)

This project is structured around clean and reusable components:

| Class | Responsibility |
|-------|----------------|
| `FoodItem` | Represents each dish with details (name, id, price, likes) |
| `StoreFoodItems` | Maintains the menu and allows owners to add items |
| `Cart` | Holds selected items before purchase |
| `Orders` | Final order record (item and quantity) |
| `CartService` | Business logic for handling cart behavior |
| `OrderServices` | Manages order placement and billing |

### 🔌 Interfaces

- `CartService` – Abstracts cart-related operations
- `OrderService` – Abstracts order placement and billing logic

---

## 🧠 SOLID Principles in Action

| Principle | Status | How It's Achieved |
|----------|--------|--------------------|
| **S - Single Responsibility** | ✅ | Each class has one focused job (cart, order, item, menu) |
| **O - Open/Closed** | ✅ | Behavior is extensible via interfaces without modifying existing classes |
| **L - Liskov Substitution** | ✅ | Interfaces are correctly implemented and substitutable |
| **I - Interface Segregation** | ✅ | Interfaces are minimal and task-specific |
| **D - Dependency Inversion** | ✅ | High-level modules rely on abstractions, not concrete implementations (via constructor injection) |

---

## 📦 Use of Data Structures

The project makes extensive use of **Java Collection Framework** to store and manage application data efficiently:

| Data Structure | Usage |
|----------------|--------|
| `List<FoodItem>` | Used to maintain the menu and the cart |
| `HashMap<FoodItem, Integer>` | Used to store orders along with quantities |

> This demonstrates practical usage of data structures in real-life scenarios such as cart management and order history.

---

## 🛠️ Tech Stack

- ☕ **Java (Core)**
- 📚 Java Collections (List, Map)
- 🧠 OOP Concepts: Abstraction, Inheritance, Encapsulation
- 📐 SOLID Design Principles
- 🏗️ Modular Codebase (LLD)

---

## 🚀 How to Run

1. 📥 **Clone this repo**
   ```bash
   git clone https://github.com/vidhyadharan-03/FoodOrderingSystem.git
