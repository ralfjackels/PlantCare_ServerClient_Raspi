# PlantCare - ServerClient - Raspberry Pi
It serves as a server as well as a client to the PlantCare_Backend, enabling data exchange and handling HTTP-requests.

## Getting Started | Prerequisites

- IDE
- Raspberry Pi
- MariaDB Relational Database
- Web Browser

## Technologies and Libraries

- Java
- REST
- Maven - Dependency Management
- Spring Boot - Microservice Framework
- RESTful Webservices
- Lombok
- Pi4J Framework

## Application Properties

server.port=4567 <br>
backend.ip=192.168.43.26 <br>
backend.port=6060 <br>
backend.url=http://${backend.ip}:${backend.port}
LED_PIN_NAME=GPIO 4 <br>
PUMP_PIN_NAME=GPIO 5 <br>
MOIST_CHANNEL_NAME=ANALOG INPUT 2 <br>
SPI_CHANNEL=0
IMG_WIDTH=800 <br>
IMG_HEIGHT=600 <br>
IMG_FORMAT=png <br>

## Authors

- Lorenz Josten
- Evgeni Kozyr
- Laura Yawira Lewinski
- Ralf Jackels

## Project impressions | Project Structure
![Image](./src/images/projectstructure.JPG?raw=true)
