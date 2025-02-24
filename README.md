## Project Description

This JavaFX application provides a system for managing and tracking COVID-19 test data.  It allows users to input patient information, including name, city, profession, gender, temperature, and test results (positive or negative). The data is displayed in a table, and users can add, update, and delete entries.

**Technologies Used:**

* Java
* JavaFX
* FXML (for UI design)
* CSS (for styling)


**Key Features:**

* Input and display of patient data in a tabular format.
* Add new patient records.
* Update existing patient records.
* Delete patient records.


## Project Structure

The `src/application` directory contains the core Java source code for the application:

* **`Corona.java`:**  The main controller class handling user interactions and data management.
* **`Main.java`:** The main application class launching the JavaFX application.
* **`Test.java`:** A data class representing a single COVID-19 test result.
* **`application.css`:**  A stylesheet for styling the application's user interface.

The `src/FXML` directory contains the FXML file defining the application's user interface:

* **`CoronaVirus.fxml`:** The FXML file defining the UI layout.


## Build Process

The application is built using the `build.fxbuild` Ant build file.  To build the application, you will need the Eclipse FX IDE (or a compatible Ant setup).  The build process is not described in detail, as the provided `build.fxbuild` file contains limited instructions.  More detailed build instructions may need to be added here if the build process becomes more complex.


## Running the Application

1.  **Prerequisites:** Ensure you have a Java Development Kit (JDK) and JavaFX installed and configured correctly on your system.
2.  **Build (if necessary):** If you have made changes to the source code, build the application using the `build.fxbuild` file (see Build Process).
3.  **Run:** Execute the `Main` class. This will launch the JavaFX application.



## Code Style and Conventions

No specific code style guide is explicitly mentioned in the provided project files.  A consistent style should be adopted for future development and maintenance.
