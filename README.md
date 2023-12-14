# Project Name

## Description

Provide a brief description of what your project does and its purpose.

## Setup and Installation

Explain how to set up and run your project. Include steps for:

1.  Cloning the repository.
2.  Installing dependencies.
3.  Running the application.

## Features and Implementation

Detail the key features of the project and where they can be found in your code.

### Spring MVC Application

- **Description**: Briefly describe how you've implemented this feature.
- **Location**: `src/main/java/com/lambton/project/...`

### Form with Validation

- **Description**: This feature includes a form where users can input their details. Validation is performed on the server side.
- **Location**:
  - Form: `src/main/resources/templates/contact.html`
  - Controller: `src/main/java/com/lambton/project/ContactController.java`
  - Validation: `src/main/java/com/lambton/project/Contact.java`

### Database Persistence

- **Description**: Details from the form are persisted into a database after passing validation.
- **Location**: `src/main/java/com/lambton/project/ContactRepository.java`

### List Items with Optional Filtering

- **Description**: Users can view a list of items entered through the form. The list supports optional filtering.
- **Location**: `src/main/java/com/lambton/project/ContactController.java` (method: `listContacts`)

### Asynchronous API Call for Page Hits

- **Description**: An API that returns the number of page hits, which is called asynchronously every 3 seconds.
- **Location**:
  - API: `src/main/java/com/lambton/project/PageHitController.java`
  - Frontend implementation: `src/main/resources/templates/index.html`

### Dependency Injection

- **Description**: Example of how dependency injection is used in the project.
- **Location**: `src/main/java/com/lambton/project/ContactController.java`

### Use of CSS

- **Description**: The application uses CSS for styling to ensure an aesthetically pleasing website.
- **Location**: `src/main/resources/static/css/style.css`

### Unit Tests

- **Description**: Classes in the project are accompanied by unit tests.
- **Location**: `src/test/java/com/lambton/project/...`

### README File

- **Description**: This README file contains all the necessary information and locations for each requirement in the project.
