# Movie Ticket Management System

A comprehensive movie ticket management system built using Java Swing and MySQL.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Database Schema](#database-schema)

## Introduction

The Movie Ticket Management System is designed to streamline the process of booking and managing movie tickets. This application provides a robust platform for users to browse movies, select seats, and make payments seamlessly. Utilizing Java Swing for the graphical user interface and MySQL for the database management, this system ensures a smooth and efficient user experience.

### Objectives
- **User-Friendly Interface:** The system employs Java Swing to create an intuitive and visually appealing GUI, making it easy for users to navigate through different functionalities.
- **Efficient Database Management:** MySQL is used to handle the backend database operations, ensuring data integrity and security.
- **Comprehensive Functionality:** From user authentication to booking history, the system covers all essential features required for a movie ticket booking system.

### Key Components
1. **User Authentication:** Users can sign up and log in to their accounts. The system ensures secure authentication and authorization mechanisms.
2. **Movie Browsing:** Users can view the list of available movies, along with details like duration, and showtimes.
3. **Ticket Booking:** Users can select seats and book tickets for their chosen movies. The system handles seat availability and prevents double bookings.

### Educational Value
This project serves as an excellent learning tool for students and developers interested in:
- Java GUI development with Swing
- Database integration with MySQL
- Developing a full-stack application
- Understanding the complexities of a ticket booking system

## Features

- User authentication (Login and Signup)
- Browse a list of available movies
- Select and book movie tickets

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/AnsariZayd/MovieTicketManagementSystem.git
    ```
2. Navigate to the project directory:
    ```sh
    cd MovieTicketManagementSystem
    ```
3. Set up the MySQL database:
    - Create a database named `movie_ticket_management_system`.
    - Import the provided SQL file:
        ```sh
        mysql -u yourusername -p movie_ticket_management_system < movie_ticket_management_system_CP.sql
        ```
4. Update the database connection settings in `Conn.java`:
    ```java
    String url = "jdbc:mysql://localhost:3306/movie_ticket_management_system";
    String username = "yourusername";
    String password = "yourpassword";
    ```
5. Compile and run the application:
    ```sh
    javac *.java
    java Login
    ```

## Usage

1. Launch the application by running the `Login` class.
2. Register a new user account or log in with existing credentials.
3. Browse through the list of movies and select the one you wish to watch.
4. Choose your preferred seats and proceed to payment.
5. View your booking.

## Database Schema

The database schema includes the following tables:
- `users`: Stores user information (ID, username, password, etc.)
- `movies`: Stores movie details (ID, title, genre, duration, etc.)
- `bookings`: Records ticket bookings (ID, user ID, movie ID, seat number, etc.)
- `payments`: Manages payment information (ID, booking ID, amount, method, etc.)
- `feedback`: Collects user feedback and suggestions (ID, user ID, message, etc.)

