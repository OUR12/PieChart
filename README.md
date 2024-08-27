# Project Setup
Prerequisites
Before running this project, make sure you have the following installed on your system:

# Java Development Kit (JDK) - Version 11 or higher
Download from Oracle or AdoptOpenJDK.
Verify installation by running java -version in your terminal.

# Apache Maven
Download and install Maven from Maven Official Site.
Verify installation by running mvn -version in your terminal.

# Git
Download and install Git from Git Official Site.
Clone the repository using: git clone https://github.com/OUR12/PieChart.git

# IDE Setup (VS Code)
To work with this project in Visual Studio Code, you'll need the following extensions:
Spring Boot Extension Pack
Install from the VS Code marketplace: Spring Boot Extension Pack.

# Java Extension Pack
Includes essential extensions for Java development in VS Code.
Install from the VS Code marketplace or use this link: Java Extension Pack.

# Maven for Java
Helps in managing your Maven projects.
Install from the VS Code marketplace or use this link: Maven for Java.

 # Debugger for Java
Essential for debugging your Spring Boot applications.
Install from the VS Code marketplace or use this link: Debugger for Java.

# Running the Project
Once you have the prerequisites installed:

Navigate to the Project Directory:
Open your terminal and navigate to the project’s root directory using cd /path/to/project.
Build the Project:
Run mvn clean install to compile the project and resolve dependencies.
Run the Spring Boot Application:

Use mvn spring-boot:run to start the application.
Alternatively, you can run the project directly from your IDE by running the main method in the Application class.
Access the Application:

# Once the application starts, it will be available at http://localhost:8080 in your browser.
Additional Notes
Database Configuration: If your project requires a database, ensure that you have the correct configurations in the application.properties or application.yml file.
Environment Variables: Make sure any required environment variables are set according to the project’s needs.
