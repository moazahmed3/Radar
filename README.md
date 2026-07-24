#  Quantum Radar

A simple Java-based traffic radar system .

The system receives vehicle observations, validates them against traffic rules, generates violations, issues fines, and provides statistics about all generated fines and violated rules.

---

## ✨ Features

* Receive vehicle observations
* Validate observations using traffic rules
* Generate zero or more violations
* Issue traffic fines
* Store all generated fines
* Retrieve all fines with their total amounts
* Count violated rules
* Easily add new traffic rules without modifying the radar

---

## 📁 Project Structure

```text
src
│
├── Main.java
├── QuRadar.java
├── Observation.java
├── Fine.java
├── Violation.java
├── Rule.java
├── SpeedRule.java
└── SeatbeltRule.java
```

---

## ⚙️ System Flow

```text
Vehicle Observation
        │
        ▼
     QuRadar
        │
        ▼
   Execute Rules
        │
        ▼
Generate Violations
        │
        ▼
 Create Fine
        │
        ▼
 Store Fine
        │
        ▼
Statistics & Reports
```

---

## 🧩 Classes

| Class            | Responsibility                                              |
| ---------------- | ----------------------------------------------------------- |
| **QuRadar**      | Main system that processes observations and generates fines |
| **Observation**  | Represents data received from the radar                     |
| **Rule**         | Interface for all traffic rules                             |
| **SpeedRule**    | Checks speed limits based on vehicle type                   |
| **SeatbeltRule** | Checks seatbelt status                                      |
| **Violation**    | Represents a single traffic violation                       |
| **Fine**         | Stores violations and calculates the total amount           |
| **Main**         | Demonstrates the system                                     |

---

## 🚘 Example Observation

```text
Plate Number : ABC1234
Car Type     : Private
Speed        : 94
Seatbelt     : Not Fastened
```

Generated Fine

```text
Traffic for car ABC1234

Total amount: 400 EGP

Violations:
- Seatbelt not fastened : 100 EGP
- Speed of 94 exceeded max allowed 80 : 300 EGP
```

---

## 📊 Example Output

```text
ABC1234 -> 400 EGP
XYZ999  -> 300 EGP

Violated Rules

Speed Rule : 2
Seatbelt Rule : 1
```

---

## 💡 Extensibility

The project follows the **Open/Closed Principle (OCP)**.

To add a new traffic rule:

1. Create a class that implements the `Rule` interface.
2. Register the rule using:

```java
radar.addRule(new YourNewRule());
```

No changes are required inside `QuRadar`.

---

## 🛠 Technologies

* Java
* Object-Oriented Programming (OOP)




