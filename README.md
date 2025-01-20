# Java Annotations Exercises

This repository contains exercises designed to practice and understand Java annotations. Below are the details of each exercise, grouped by level.

---

## **Level 1**

### **Exercise 1: Worker Hierarchy**
- Create a class hierarchy with three classes: `Treballador`, `TreballadorOnline`, and `TreballadorPresencial`.
- The `Treballador` class has the attributes: `nom` (name), `cognom` (surname), `preu/hora` (hourly rate), and a method `calcularSou()` (calculate salary). This method takes the number of hours worked as a parameter and multiplies it by the hourly rate.
- The child classes override the `calcularSou()` method using the `@Override` annotation:
  - In `TreballadorPresencial`, add a static attribute `benzina` (fuel cost) and include it in the salary calculation.
  - In `TreballadorOnline`, use a constant `Internet flat rate` in the salary calculation.
- From the `main()` method of the `Principal` class, demonstrate the functionality of the `@Override` annotation.

---

### **Exercise 2: Deprecated Methods**
- Add deprecated methods to the child classes and use the `@Deprecated` annotation.
- From an external class, invoke the deprecated methods while suppressing warnings using the `@SuppressWarnings` annotation.

---

## **Level 2**

### **Exercise 1: Custom Annotation for Serialization**
- Create a custom annotation to serialize a Java object into a JSON file.
- The annotation should accept a parameter specifying the directory where the resulting JSON file will be saved.

---

This repository explores the practical applications of Java annotations, including overriding methods, marking methods as deprecated, and creating custom annotations.
