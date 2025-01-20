# Worker Hierarchy Exercise

## 📄 Description
This program demonstrates a worker hierarchy with three classes: `Worker`, `OnlineWorker`, and `OnsiteWorker`. Each class has a `calculateSalary()` method that calculates the salary based on the number of hours worked. The `OnlineWorker` class adds an internet fee, while the `OnsiteWorker` class adds a fuel cost.

### Functionality
1. **Worker Class:**
    - Stores `firstName`, `lastName`, and `hourlyRate`.
    - Implements a `calculateSalary()` method to calculate salary based on worked hours.
2. **OnlineWorker Class:**
    - Inherits from `Worker`.
    - Overrides `calculateSalary()` to add an internet fee.
3. **OnsiteWorker Class:**
    - Inherits from `Worker`.
    - Overrides `calculateSalary()` to add a fuel cost.

---

## 💻 Technologies Used
- **Java 17**
- **IDE Recommended:** IntelliJ IDEA or any Java-compatible IDE.

---

## 📋 Requirements
- **Java Development Kit (JDK):** Version 17 or higher.

---

## 🛠️ Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/eze-ms/Annotations-N1-E1.git
