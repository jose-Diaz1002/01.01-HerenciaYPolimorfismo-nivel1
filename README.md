# Java Exercises - Music Instruments & Car Class

## 📄 Description

This repository contains two Java exercises that demonstrate **inheritance, polymorphism, static blocks, and method behaviors**.

### **Exercise 1: Music Instruments**
In a music group, there are different types of musical instruments:
- **Wind Instruments**
- **String Instruments**
- **Percussion Instruments**

All instruments have the attributes **name** and **price**, and a method called `play()`. This method is abstract 
in the `Instrument` class and must be implemented in the child classes.

Each type of instrument plays differently:
- **Wind instruments** → `"A wind instrument is playing"`
- **String instruments** → `"A string instrument is playing"`
- **Percussion instruments** → `"A percussion instrument is playing"`

Additionally, this exercise demonstrates how **class loading occurs in Java**. The loading process can be triggered by:
1. Creating the first instance of a class.
2. Accessing a static member of the class.

**Concepts Covered**:
- Abstract classes & method overriding
- Static blocks & initialization blocks
- Polymorphism in Java

---

### **Exercise 2: Car Class**
This exercise focuses on the differences between `static`, `final`, and `static final` attributes.

The `Car` class has the following attributes:
- `brand` *(static final)* → Shared by all instances, cannot be modified.
- `model` *(static)* → Shared by all instances, can be modified.
- `power` *(final)* → Unique for each instance, cannot be modified after initialization.

Additionally, the `Car` class contains:
- A **static method** `brake()` → Prints `"The vehicle is braking"`.
- A **non-static method** `accelerate()` → Prints `"The vehicle is accelerating"`.

**Concepts Covered**:
- Static vs Non-Static members
- The difference between `final`, `static`, and `static final`
- Calling static and non-static methods

---

## 💻 Technologies Used

- **Java 8+**
- **OOP Concepts** (Inheritance, Polymorphism, Static Members)

---

## 📋 Requirements

Ensure you have the following installed:

- **JDK 8 or higher**  
- **An IDE (IntelliJ, Eclipse, or VS Code with Java support)**

---

## 🛠️ Installation

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-repo/java-exercises.git

