# Mend.io QA Automation Assignment – GitHub Sanity Test Suite

This project is a Java-based automation suite. It validates 4 core MVP capabilities on [GitHub.com](https://github.com), covering both UI and API flows using modern testing practices.

## Tech Stack

- Java 17
- Selenium WebDriver
- TestNG
- RestAssured (for API validation)
- ExtentReports (for test reporting)
- Maven (build & dependency management)

---

## MVPs Covered

### 1. GitHub Home Page

- Open GitHub home page
- Validate search input is accessible

### 2. GitHub Repository Search

- Search for a term (e.g., "selenium")
- Validate that search results appear
- Validate search results header
- Print repository names from results

### 3. Sign-in Page Test

- Navigate to sign-in page
- Validate presence of form fields (username, password)
- Negative login attempt (with dummy credentials)
- Validate error message display

### 4. API vs UI Search Result Comparison

- Validate that repository search through GitHub REST API returns same result count as the UI

---

## How to Run

```bash
mvn clean test
```

You can also run the API checker:

```bash
mvn test -Dtest=GitHubApiSearchTest
```

---

## Reporting

### ExtentReports (Enhanced HTML Report)

- Automatically generated after test execution
- Location: `test-output/ExtentReport.html`
- Visual overview of test case status (pass/fail/skip)

### How to View the Report

1. After running the tests, open the following file:

```
test-output/ExtentReport.html
```

2. Open with your browser

> **Note:** The file `ExtentReport.html` is ignored in `.gitignore`

---

## Project Structure

```
├── base                     # BaseTest class for WebDriver setup/teardown
├── pages                   # Page classes representing elements
├── actions                 # Action classes performing test steps
├── api                     # API utilities and test classes
├── utils                   # Reusable utilities (WebDriverUtils, RestUtils)
├── reports                 # ExtentReports config and listener
├── tests                   # Test classes (TestNG)
└── pom.xml                 # Maven config
```

---

## Author

- **Or Kowalsky**
- Assignment for Mend.io QA Automation Engineer position

---

## Notes

- Project uses Page Object Model (POM) structure
- Tests are kept modular, readable, and easy to maintain
