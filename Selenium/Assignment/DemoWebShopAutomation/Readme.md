Here’s an updated `README.md` file with the correct project structure and your GitHub repository link:

```markdown
# TestNG + Selenium Automation for Demo Webshop

## Overview
This project automates the registration and login functionality of the Demo Webshop website using Selenium WebDriver and the TestNG framework. The tests are structured to ensure that the registration process completes successfully before executing the login functionality.

## Prerequisites
- **Java Development Kit (JDK)**
- **Apache Maven**
- **Selenium WebDriver**
- **TestNG**
- **An IDE** Eclipse

DemoWebShopAutomation/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── demo/
│   │               └── automation/
│   │                   ├── RegisterTest.java
│   │                   └── LoginTest.java
│   └── test/
│       └── java/
│           └── com/
│               └── demo/
│                   └── automation/
│                       └── TestSuite.java
├── resources/
│   ├── config.properties
│   └── test-data/
│       └── test-users.csv
├── screenshots/
│   └── demo-preview.png
├── pom.xml
└── README.md


## How to Run the Tests
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Adityapatel-dev/Software-testing-Lavatech.git
   cd Software-testing-Lavatech/Selenium/Assignment/DemoWebShopAutomation
  

2. **Open the project in your IDE**.

3. **Run the TestNG test suite**:
   - Right-click on the `TestSuite.java` file and select `Run As > TestNG Test`.

## Test Details
### Registration Test
- **Test Class**: `RegisterTest`
- **Description**: Automates the registration process on the Demo Webshop website.

### Login Test
- **Test Class**: `LoginTest`
- **Description**: Automates the login process using the credentials registered in the previous test.
- **Dependency**: This method depends on the registration test and executes only if the registration is successful.

## Conclusion
This project demonstrates the effective use of TestNG and Selenium for automating web applications. By structuring tests to ensure dependencies are respected, we achieve reliable and maintainable automation scripts.

## License
This project is licensed under the MIT License. See the LICENSE file for details.


Feel free to modify any sections further!
