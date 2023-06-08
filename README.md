# Complete Guide to Developing and Deploying a React Spring Boot MySQL Boilerplate

React, Spring Boot and MySQL Boilerplate is a full-stack development framework that makes it easy to create web applications. It combines the power of React, a popular JavaScript library for building user interfaces, with the simplicity of Spring Boot, a Java framework for creating RESTful APIs. MySQL is a popular relational database that provides a scalable and reliable database for your applications.

This boilerplate provides a starting point for building your own web applications. It includes everything you need to get started, including a pre-configured React application, a Spring Boot API, and a MySQL database. You can use this boilerplate as-is or customize it to meet your specific needs.

If you are new to React, Spring Boot, or MySQL, this boilerplate is a great way to get started. It provides a solid foundation that you can build on to create your own web applications.

Here are some of the benefits of using React Spring Boot and MySQL Boilerplate:

-   Easy to use: The boilerplate is easy to use and configure. You can get started with just a few simple steps.
-   Scalable: The boilerplate is scalable and can be used to create large and complex applications.
-   Reliable: The boilerplate uses MySQL, a reliable and proven database.

If you are looking for a full-stack development framework that is easy to use, scalable, reliable, and secure, then React Spring Boot and MySQL Boilerplate is a great option.

## Architectural diagram

![](https://cdn-images-1.medium.com/max/800/1*HGrUz4yAayXHy8CcHt5i-w.png)

## Pre requirement

### Software

-   Google Chrome: A web browser that is required for testing the React application.
-   IntelliJ IDEA: An IDE for Java development.
-   Visual Studio Code: A code editor that can be used for React development.
-   Postman: A tool for testing REST APIs.

### Services

-   Gmail account: An account for project managemnt.
-   GitHub account: A repository for storing your code.

### Languages, Packages, and Libraries

-   Node.js: A JavaScript runtime environment.
-   Java 11: A programming language for server-side development.
-   Gradle: A build automation tool.

These are the minimum requirements for setting up a development environment for React Spring Boot and MySQL Boilerplate. You may need to install additional software or libraries depending on your specific needs.

Here are some additional tips for setting up your development environment:

-   Install the latest versions of the software and libraries.
-   Create a new project folder and initialize it with Gradle.
-   Add the required dependencies to your project.
-   Create a React application and a Spring Boot API.
-   Configure the database.
-   Run the application and test it.

Once you have set up your development environment, you can start developing your web applications.

## Setup environment

Create a GitHub repository for your project. This will allow you to store your code and track your changes. In your repository, create three branches: frontend, backend, and database. The frontend branch will contain your React application, the backend branch will contain your Spring Boot API, and the database branch will contain your MySQL database.

Here are some additional details about each branch:

-   Frontend branch: This branch will contain your React application. This is the part of your application that users will interact with.
-   Backend branch: This branch will contain your Spring Boot API. This is the part of your application that handles the business logic and data access.
-   Database branch: This branch will contain your MySQL database. This is where your application will store its data.

Once you have created these three branches, you can start developing your application. You can make changes to your code in any of the branches, and then use Git to merge your changes into the master branch when you are ready to deploy your application.

1.  Create repository in GitHub.
2.  Create 3 branches (frontend, backend, database).

![](https://cdn-images-1.medium.com/max/800/1*iG7xeXPdU0aT4oQm_mgBhA.png)

![](https://cdn-images-1.medium.com/max/800/1*IbbeeH44Qs239Ywj4ZMhUA.png)

## Working with MySQL Database

MySQL is a popular open-source relational database management system (RDBMS). It is used by a wide variety of applications, including web applications, mobile applications, and desktop applications.

To work with MySQL, you need to create a database and tables. A database is a collection of related data, and a table is a collection of related data rows and columns.

### To create a new database in Railway.app, follow these steps:

1.  Open [Railway.app](https://railway.app)
2.  Click on the “New project” button.
3.  Click on the “Provision MySQL” in dropdown.

![](https://cdn-images-1.medium.com/max/800/1*--tTQv2xCt4BfuTjaWst1Q.png)

![](https://cdn-images-1.medium.com/max/800/1*6MPW8-5AN-r4_HVzNOb-sQ.png)

### To create a new table in a database, follow these steps:

1.  Click on the “MySQL” button.
2.  Click on the “Query” in tabs.
3.  Add query in to text field for create new table.
4.  Click on the “Run query” button.

![](https://cdn-images-1.medium.com/max/800/1*jMHgKpYUGkEbEmXC55GLfw.png)

    CREATE TABLE user (  
        id int NOT NULL AUTO_INCREMENT,  
        f_name varchar(255),  
        l_name varchar(255),  
        email varchar(255),  
        phone int,  
        PRIMARY KEY (id)  
    );

![](https://cdn-images-1.medium.com/max/800/1*L_CyUK0t7r4iQMAUBnilCA.png)

#### To add sample data to a table, follow these steps:

1.  Click on the “Query” in tabs.
2.  Add query in to text field for create add new data.
3.  Click on the “Run query” button.
4.  To view data go to “Data” tab and click on “user” card.

![](https://cdn-images-1.medium.com/max/800/1*1MuQSSbeq1vQWrppRCKvlQ.png)


    INSERT INTO user (f_name, l_name, email, phone)  
    VALUES ("John", "Keeth", "johnkeeth@mail.com", 771234567);

![](https://cdn-images-1.medium.com/max/800/1*q7nNQt7qzSKY9HhKdykF9w.png)

### To get MySQL database credentials, follow these steps:

1.  Click on the “Connect” in tabs.
2.  Open notepad and copy connection details(MYSQL_URL and MYSQLPASSWORD).

```
MYSQL_URL        *******  
MYSQLPASSWORD    *******
```
![](https://cdn-images-1.medium.com/max/800/1*a3EVCwUqYwofImIm_tH4gQ.png)

Once you have created a database and tables, you can use MySQL to store and retrieve data.

This subtopic provides a general overview of working with MySQL Database. It does not show the steps involved in creating a database, table, or adding sample data. Instead, it focuses on the concepts and terminology associated with MySQL Database.

### Backend Development with Spring Boot

We are going to create a Spring Boot application with Gradle, create a REST API for testing, and deploy it to Render.com.

Spring Boot is a popular framework for creating Java applications. It provides a number of features that make it easy to create production-ready applications, such as auto-configuration, starter dependencies, and embedded servers.

Gradle is a build automation tool that allows us to automate the process of building, testing, and deploying our application.

Render.com is a cloud platform that makes it easy to deploy and scale web applications.

those thing cover in this section

-   Move to backend branch in github.
-   Genarate new spring boot application with gradle.
-   Create a controller class that exposes a REST API endpoint.
-   Create a Dockerfile that builds and deploys our application.
-   Push our application to Render.com.

#### To create new spring boot project, follow these steps:

1.  Go to backend branch in github.
2.  Genarate new spring Boot application with Gradle using [Spring Initializr](https://start.spring.io/)
3.  Download and extract in backend branch.

![](https://cdn-images-1.medium.com/max/800/1*g4UUOhXRRg7AGsQWLXIw8w.png)
```
Project   Gradle - Groovy  
Language  Java  
Version   2.7.12  
java      11

Dependencies  
  * MySQL Driver  
  * Lombok  
  * Spring Web  
  * Validation  
  * Spring Data JPA
  ```

![](https://cdn-images-1.medium.com/max/800/1*7ieKD48vXuU91f4lNkieLg.png)

#### To setup Rest API , follow these steps:

1.  Update src\main\resources\application.properties file.
```
--- DB Properties ----  
spring.cloud.gcp.sql.enabled=false  
spring.datasource.url=jdbc:XXXXXXXXXXXXXXXX?useSSL=false&&createDatabaseIfNotExist=true  
spring.datasource.username=root  
spring.datasource.password=XXXXXXXXXXXXXXXXXX

-   Replace “XXXXXXXXXXXXXXXXXX” using previous railway project details.
```
2. Create model.

-   File path “src\main\java\com\example\boilerplate\model\User”
```
package com.example.boilerplate.model;  
import lombok.*;  
import lombok.experimental.SuperBuilder;  
import javax.persistence.*;  
@Getter  
@Setter  
@SuperBuilder  
@NoArgsConstructor  
@AllArgsConstructor  
@ToString  
@Entity  
@Table(name = "user")  
public class User {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Integer id;  
    @Column(name = "fName")  
    private String firstName;  
    @Column(name = "lName")  
    private String lastName;  
    @Column(name = "email")  
    private String email;  
    @Column(name = "phone")  
    private int phone;  
}
```
3. Create repository.

-   File path “src\main\java\com\example\boilerplate\repository\UserRepository”
```
package com.example.boilerplate.repository;  
  
import com.example.boilerplate.model.User;  
import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;  
@Repository  
public interface UserRepository extends JpaRepository<User, Integer> {  
}
```
4. Create service

-   File path “src\main\java\com\example\boilerplate\service\UserService”
```
package com.example.boilerplate.service;  
  
import com.example.boilerplate.model.User;  
import java.util.List;  
public interface UserService {  
    List<User> viewAll();  
}
```
6. Create ServiceImpl

-   File path “src\main\java\com\example\boilerplate\service\impl\UserServiceImpl”
```
package com.example.boilerplate.service.impl;  
  
import com.example.boilerplate.model.User;  
import com.example.boilerplate.repository.UserRepository;  
import com.example.boilerplate.service.UserService;  
import lombok.extern.slf4j.Slf4j;  
import org.springframework.stereotype.Service;  
import java.util.List;  
@Slf4j  
@Service  
public class UserServiceImpl implements UserService {  
    private final UserRepository userRepository;  
    public UserServiceImpl(UserRepository userRepository) {  
        this.userRepository = userRepository;  
    }  
    @Override  
    public List<User> viewAll() {  
        return userRepository.findAll();  
    }  
}
```
7. Create controller

-   File path “src\main\java\com\example\boilerplate\service\impl\controller\UserController”
```
package com.example.boilerplate.controller;  
  
import com.example.boilerplate.model.User;  
import com.example.boilerplate.service.UserService;  
import lombok.extern.slf4j.Slf4j;  
import org.springframework.validation.annotation.Validated;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
import java.util.List;  
@Slf4j  
@Validated  
@RestController  
@RequestMapping(path = "user")  
public class UserController {  
    private final UserService userService;  
    public UserController(UserService userService) {  
        this.userService = userService;  
    }  
    @GetMapping("/all")  
    public List<User> view_all_users() {  
        return userService.viewAll();  
    }  
}
```
8. Create WebMvcConfig

Step 1 :

Go to firbase and create firebase project.

![](https://cdn-images-1.medium.com/max/800/1*kHBJKHwq8nJPi1d_STgwNg.png)

Step 2:

Create web app on firebase.

![](https://cdn-images-1.medium.com/max/800/1*gTPmLzAtOnCsY6t57Mqa9Q.png)

Step 3:

copy web URL. Example,
```
"https://boilerplate-xxxxxxxxxxxxxxxxxxxxxxxxxxxxx.web.app/"
```
Step 4:

-   File path “src\main\java\com\example\boilerplate\core\config\WebMvcConfig”
```
package com.example.boilerplate.core.config;  
  
import org.springframework.context.annotation.Configuration;  
import org.springframework.web.servlet.config.annotation.CorsRegistry;  
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;  
  
@Configuration  
public class WebMvcConfig implements WebMvcConfigurer {  
@Override  
    public void addCorsMappings(CorsRegistry registry) {  
        registry.addMapping("/**")  
                .allowedMethods("*")  
                .allowedHeaders("*")  
                .allowedOrigins("https://boilerplate-xxxxxxxxxxxxxxxxxxxxxxxxxxxxx.web.app/")  
                .allowCredentials(false)  
                .maxAge(-1);  
    }  
}
```
#### To create docker file , follow these steps:

1.  Create docker file

-   File path “P0001-Boilerplate — React-spring-boot-MySQL\Dockerfile”
```
FROM openjdk:11  
ADD build/libs/*.jar dockerapp.jar  
EXPOSE 8080  
ENTRYPOINT ["java", "-jar", "dockerapp.jar"]
```
#### To prepare project for deploy , follow these steps:

1. Run this command in CMD.
```
gradlew build
```
2. Remove “/build” in .gitignore and update GitHub repo

#### To deploy , follow these steps:

1.  Create account [Render.com](https://dashboard.render.com)
2.  Create new project on render(new => web server).
3.  connect GitHub repo with render.
4.  Add project details and deploy

![](https://cdn-images-1.medium.com/max/800/1*YEEq1XadV1D9nT7PI1jVHA.png)

![](https://cdn-images-1.medium.com/max/800/1*5H4OH9TEki066e2fL2DnpQ.png)

![](https://cdn-images-1.medium.com/max/800/1*sbYJoE9u3YgE7FQZZl7bfg.png)
```
Name        : P0001-Boilerplate  
Region      : Singapore (Southeast Asia)  
Branch      : backend  
Runtime     : Docker
```
#### To test project, follow these steps:

1.  Get render project URL.
2.  Use that URL for testing in postman.

![](https://cdn-images-1.medium.com/max/800/1*wcioksqHYp4JQc_t_jZWbA.png)

![](https://cdn-images-1.medium.com/max/800/1*Zrjpp8JJRgTg8Pag2dXRmA.png)
```
Get mathord  
http://localhost:8080/user/all
```
#### After every update, follow these steps: (Additional)

1.  Run Gradle build command.
2.  Pull to GitHub. After that render server automatically update.
```
gradlew build
```
### Frontend Development with React:

In this part, you will create a React application that connects to a backend API and shows sample data in the frontend. You will then deploy the application using Firebase Hosting.

First, you will create a new React application using Create React App. Then, you will create a new backend API using Node.js and Express. Once you have created the backend API, you will connect the React application to the API. Finally, you will deploy the React application using Firebase Hosting.

By the end of this project, you will have learned how to create a React application that connects to a backend API and deploys the application using Firebase Hosting.

#### To create new react.js project, follow these steps:

1.  Go to frontend branch in GitHub.
2.  Run “npx create-react-app boilerplate” command to create new react project
```
npx create-react-app boilerplate
```
3. Install other important npm packages.
```
npm install firebase  
npm install -g firebase-tools
```
4. Config firebase in react.
```
firebase login  
firebase init
```
![](https://cdn-images-1.medium.com/max/800/1*UVMytGlPmdyOI70n8NKMzw.png)

![](https://cdn-images-1.medium.com/max/800/1*L0Mv6RItNdNcglEpMf4QLQ.png)

![](https://cdn-images-1.medium.com/max/800/1*X48j0YRsEIm9VbJDV_AJcg.png)

![](https://cdn-images-1.medium.com/max/800/1*Y3M1RTanw61u24Le0g9fiA.png)

#### To connect frontend and backend, follow these steps:

1.  Edit App.js file
```
import * as React from "react";  
import "./App.css";  
function App() {  
  const test = () => {  
    fetch("https://XXXXXXXXXXX-boilerplate.onrender.com/user/all")  
      .then((response) => response.json())  
      .then((data) => {  
        alert("Hello "+ data[0]["firstName"] + " " + data[0]["lastName"])  
      })  
      .catch((error) => {  
        alert("Not connect")  
      });  
  };  
return (  
    <div className="App">  
      <button onClick={test}>Test</button>  
    </div>  
  );  
}  
export default App;
```
2. Clean App.css

#### To deploy frontend, follow these steps:

1.  Build react application.
2.  Deploy project in firebase host.

  ```
npm run build  
firebase deploy
```
![](https://cdn-images-1.medium.com/max/800/1*Hum0v0FPXqV45RVfuVo1lg.png)

![](https://cdn-images-1.medium.com/max/800/1*dy4n9YG8DgXrQI0nt4parA.png)

#### To test project, follow these steps:

1.  Open hosting URL

![](https://cdn-images-1.medium.com/max/800/1*B3O-zSgLUYNR3c3oqQZiNg.png)

#### After every update, follow these steps: (Additional)

1.  Run react build command.
2.  Deploy project in firebase host.
```
npm run build  
firebase deploy
```
### Reference

GitHub repo : [https://github.com/viraj-official/P0001-React-Spring-boot-MySQL-Boilerplate](https://github.com/viraj-official/P0001-React-Spring-boot-MySQL-Boilerplate)

### Contact

For any questions or suggestions, feel free to reach out:

-   Name: Viraj Shakya Samaranayake
-   Email: [virajofficialinfo@gmail.com](http://virajofficialinfo@gmail.com)
-   GitHub: [github.com/viraj-official](https://github.com/viraj-official)
-   Linkedin: [Linkedin/virajofficial](https://www.linkedin.com/in/virajofficial/)
