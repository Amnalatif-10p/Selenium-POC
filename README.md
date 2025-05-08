# Selenium Java Automation Framework

This is a Java-based Selenium automation project developed to demonstrate a test automation framework using Selenium WebDriver, TestNG, and Page Object Model.

## Project Structure
SeleniumPOC/
│
├── .idea/                     # IntelliJ IDEA config files
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── base/          # Base test setup (e.g., WebDriver config)
│   │       │   └── BaseTest.java
│   │       ├── org.example/   # Main entry (optional)
│   │       │   └── Main.java
│   │       └── pages/         # Page Object Models
│   │           └── LoginPage.java
│   └── test/
│       └── java/
│           └── tests/         # Test classes
│               └── LoginTest.java
│
├── target/                    # Compiled output
├── extent-report.html         # Test report
├── pom.xml                    # Maven dependencies and plugins
├── testing.xml                # TestNG suite configuration
└── README.md                  # Project description

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports

## How to Run

 **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/SeleniumPOC.git
   cd SeleniumPOC

**Install dependencies:**
Maven will handle dependencies using the pom.xml.

**Run the tests:**

bash
Copy
Edit
mvn clean test
View Report:
Open extent-report.html in a browser after test execution.

**Test Structure**
BaseTest.java: Sets up and tears down WebDriver.

LoginPage.java: Contains locators and methods for login functionality.

LoginTest.java: Contains actual test case(s) for login.

**Test Suite**
Uses testing.xml to manage test execution order and configuration.

