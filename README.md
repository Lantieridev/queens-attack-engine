# 👑 Queen's Attack Engine

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.9-blue?style=for-the-badge&logo=apache-maven)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Build](https://img.shields.io/github/actions/workflow/status/Lantieridev/queens-attack-engine/maven-ci.yml?style=for-the-badge)

> [!IMPORTANT]
> **High-Performance Algorithm:** A sophisticated implementation of the Queen's Attack II logical challenge, optimized for O(k) time complexity and featuring a premium terminal interface.

Welcome to **Queen's Attack Engine**, a technical showcase of algorithmic efficiency and clean code principles. This project solves the problem of calculating valid attack squares for a Queen on a large chessboard with arbitrary obstacles.

---

## 🚀 Key Features

*   **⚡ Optimized Performance:** Calculates attackable squares in **8 directions** in linear time relative to the number of obstacles (O(k)).
*   **🛠️ Robust Engine:** Handles board boundaries and obstacle collisions with mathematical precision.
*   **✨ Executive CLI:** A refined terminal interface with ANSI colors, progress markers, and professional ASCII branding.
*   **🧪 100% Test Stability:** Extensive unit tests ensuring accuracy across edge cases (corners, zero obstacles, overlapping paths).

---

## 🛠️ Tech Stack

*   **Java 21**: Modern language features and optimal performance.
*   **Maven**: Industry-standard build and dependency management.
*   **JUnit 5**: Comprehensive test suite.
*   **GitHub Actions**: Automated CI/CD pipeline.

---

## 📖 How to Run

### 1. Build and Test
```powershell
mvn clean install
```

### 2. Run the Engine
```powershell
mvn exec:java "-Dexec.mainClass=ar.edu.utn.frc.tup.piii.App"
```

---

## 📜 Academic Context
Originally developed for the Java Programming curriculum at UTN FRC, this project has been elevated to meet professional portfolio standards through English localization, UI/UX polish, and standardized documentation.

---

*Developed by [Martin Lantieri](https://github.com/Lantieridev) - 2026*