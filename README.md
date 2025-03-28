# 🧪 Mend.io QA Automation Assignment – GitHub Sanity Test Suite

This project is a Java-based automation suite. It validates 4 core MVP capabilities on [GitHub.com](https://github.com), covering both UI and API flows using modern testing practices.

---

## Features & Goals

- Sanity test suite covering 4 commonly used GitHub flows
- Clear, modular code using the **Page Object Model**
- Reusable **WebDriver** and **REST API** utilities
- **Concurrent testing** of GitHub’s public API
- Built with **readability**, **performance**, and **extensibility** in mind

---

## MVP Capabilities Covered

| MVP # | Feature                        | Method(s)                    |
| ----- | ------------------------------ | ---------------------------- |
| 1     | Homepage Sanity                | Logo, Search, Sign-In        |
| 2     | Search Results Page            | Query, results validation    |
| 3     | Sign-In Flow + Negative Test   | Invalid login + error msg    |
| 4     | GitHub Search API (Concurrent) | REST API + CompletableFuture |

---

## Tech Stack

- **Java 17+**
- **Maven**
- **Selenium WebDriver**
- **JUnit/TestNG**
- **HttpClient (Java 11)**
- **JSON.org** for response parsing
- **Page Object Model (POM)** design pattern

---

## 🚀 Setup Instructions

1. **Clone the repo**
   git clone https://github.com/your-username/mendio-assignment.git
   cd mendio-assignment

## Insatll Dependencies

mvn clean install

## Run UI Tests

mvn test

## Run API Concurrency Test

mvn compile exec:java -Dexec.mainClass="com.mendio.githubtests.api.GitHubApiSearchChecker"

## Author

**Or Kowalsky**  
Okowalsky@gmail.com
