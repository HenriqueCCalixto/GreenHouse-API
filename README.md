# Greenhouse Environment Control System

A desktop application designed to monitor and control the environmental conditions of a greenhouse.
Built using Java with Hibernate for database management, Swing for the user interface, Maven for dependency management, and Arduino for hardware integration.

## Features

- **Real-Time Monitoring**: View temperature, humidity, and light levels in the greenhouse in real time.
- **Automated Control**: Adjust settings automatically based on predefined thresholds for optimal plant growth.
- **Manual Override**: Control devices such as fans, heaters, and irrigation systems manually from the application.
- **Data Logging**: Store and analyze historical environmental data for better decision-making.
- **User-Friendly Interface**: Simple and intuitive UI built with Java Swing.
- **Arduino Integration**: Communicate with sensors and actuators via Arduino.

## Technologies Used

- **Java**: Core programming language for application development.
- **Hibernate**: ORM framework for database operations.
- **Swing**: Framework for building the graphical user interface.
- **Maven**: Tool for dependency management and project build.
- **Arduino**: Microcontroller for hardware integration and sensor data collection.

## Requirements

- **Java JDK 11+**
- **Apache Maven 3.8+**
- **MySQL or PostgreSQL**: For storing environmental data.
- **Arduino IDE**: To upload sketches to the Arduino board.
- **Arduino Uno/Nano**: Compatible microcontroller board.
- **Sensors**: DHT11/DHT22 (temperature and humidity), LDR (light intensity).
- **Actuators**: Relays, fans, heaters, irrigation pumps (optional).
