# Playwright Java Cucumber Framework with Jenkins CI/CD

A UI test automation framework built using **Java, Playwright, Cucumber (BDD), and Maven**, integrated with **Jenkins** to understand and implement a CI/CD workflow.

The goal of this project is to build practical SDET skills by automating browser tests and executing them through a Jenkins pipeline.

## Tech Stack

- **Language:** Java
- **Automation:** Playwright
- **BDD:** Cucumber (Gherkin)
- **Build Tool:** Maven
- **CI/CD:** Jenkins
- **Version Control:** Git & GitHub

## Key Features

- Browser automation using Playwright with Java.
- BDD-based test scenarios using Cucumber and Gherkin.
- Page Object Model (POM) for better test maintainability.
- Maven-based test execution and dependency management.
- Jenkins pipeline configuration using a `Jenkinsfile`.
- Automated test execution through CI/CD.
- Test result publishing and reporting.

## What I Learned from This Project

### SDET & CI/CD Skills

Through this project, I gained practical experience with:

- **Git & GitHub Integration:** Managing source code, commits, branches, and remote repositories.
- **Jenkins Pipeline:** Creating and configuring CI/CD pipelines.
- **Jenkinsfile:** Defining automated build and test stages using Pipeline as Code.
- **Maven Build Lifecycle:** Understanding Maven commands, dependencies, compilation, and test execution.
- **Playwright on CI Agents:** Understanding browser automation execution in a CI environment.
- **Cucumber BDD:** Writing and executing test scenarios using Gherkin.
- **Automated Test Reporting:** Publishing test execution results through Jenkins.
- **GitHub Webhooks:** Understanding how code pushes can trigger automated Jenkins builds.

## Project Structure

```text
src
 └── test
     ├── java
     │   ├── factory
     │   ├── hooks
     │   ├── locators
     │   ├── pages
     │   ├── runner
     │   └── stepdefinitions
     └── resources
         └── features

Jenkinsfile
pom.xml
README.md
```

## Run Tests Locally

Clone the repository:

```bash
git clone https://github.com/priotosh265/playwright-java-cucumber-framework.git
```

Navigate to the project directory:

```bash
cd playwright-java-cucumber-framework
```

Execute the tests:

```bash
mvn clean test
```

## CI/CD Workflow

```text
Developer Push
      ↓
GitHub Repository
      ↓
Jenkins Pipeline
      ↓
Code Checkout
      ↓
Maven Build
      ↓
Playwright + Cucumber Tests
      ↓
Test Reports
```

## Project Goal

To gain hands-on experience in building a maintainable UI automation framework and integrating it with Jenkins for continuous integration and automated test execution.
