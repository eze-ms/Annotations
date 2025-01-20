# Worker Hierarchy Exercise

## 📄 Description
This program demonstrates a worker hierarchy with three classes: `Worker`, `OnlineWorker`, and `OnsiteWorker`. Each class has a `calculateSalary()` method to compute salaries. The `OnlineWorker` adds an internet fee, and the `OnsiteWorker` adds a fuel cost. Deprecated methods are included and suppressed for demonstration.

### Functionality
1. **Worker Class:**
   - Stores `firstName`, `lastName`, and `hourlyRate`.
   - Implements `calculateSalary()` to compute salary based on worked hours.
2. **OnlineWorker Class:**
   - Inherits from `Worker`.
   - Overrides `calculateSalary()` to add an internet fee.
3. **OnsiteWorker Class:**
   - Inherits from `Worker`.
   - Overrides `calculateSalary()` to add a fuel cost.
4. **Deprecated Methods:**
   - Each class has a deprecated method (`oldMethod()`) to demonstrate the use of the `@Deprecated` annotation and `@SuppressWarnings("deprecation")`.

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
   git clone https://github.com/eze-ms/Annotations-N1-E2.git
