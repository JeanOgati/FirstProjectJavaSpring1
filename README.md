# First Project - Java Spring Boot & Thymeleaf Web App

## Project Overview
This project is a foundational Spring Boot web application designed to demonstrate MVC (Model-View-Controller) architecture, server-side rendering using Thymeleaf, static resource handling, and dynamic request parameters.

## Tech Stack
* Java: Version 17+
* Framework: Spring Boot (Web, DevTools)
* Template Engine: Thymeleaf
* Build Tool: Maven

## Project Structure & Key Files
* HelloController.java: Intercepts GET requests at /greeting, processes optional query string parameters (?name=...), and populates the UI model context.
* greeting.html: A server-side rendered HTML template utilizing Thymeleaf components (th:text, th:src) to display personalized greetings and embedded media assets dynamically.
* src/main/resources/static/image/: Host directory containing static image files (vistula.jpg) served directly from the root classpath.

## Getting Started & Testing
1. Run the application main class: FirstProjectJavaSpringApplication.java.
2. Open your web browser and navigate to:
   * Standard URL: http://localhost:8080/greeting
   * Dynamic URL parameter: http://localhost:8080/greeting?name=Jean
