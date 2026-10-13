# Proyecto Final Integrador — Backend

Backend del Proyecto Final Integrador de Argentina Programa 4ta Edición (#YoProgramo).

Este proyecto fue desarrollado durante mi formación en desarrollo web Full Stack entre 2022 y 2023.
La aplicación permite administrar la información del portfolio mediante una API REST y ofrece autenticación para las operaciones que lo requieren.

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Security**
- **JWT (JSON Web Token)** para autenticación
- **Spring Data JPA / Hibernate**
- **MySQL** como base de datos
- **Maven** para la gestión de dependencias y compilación
- **Docker** para la construcción de la imagen de despliegue
- **Render** para el hosting del backend
- **Clever Cloud** para la base de datos

## Funcionalidades

- Autenticación de usuarios mediante JWT.
- Gestión de la información personal del portfolio.
- Administración de estudios y formación académica.
- Administración de experiencia laboral.
- Gestión de habilidades.
- Gestión de proyectos.
- Persistencia de datos mediante MySQL.
- Endpoints REST para la comunicación con el frontend.

## Estructura del proyecto

```text
Proyecto/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/portfolioyael/Proyecto/
│       └── resources/
│           └── application.properties
├── .mvn/
├── Dockerfile
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Despliegue

El backend está preparado para desplegarse en Render mediante Docker.

La configuración de producción utiliza variables de entorno para conectarse a la base de datos y firmar los tokens de autenticación. Los valores sensibles deben configurarse desde el entorno de despliegue y no incluirse en el repositorio.

## Proyecto académico

Este repositorio forma parte de mi recorrido de aprendizaje y representa el inicio de mi formación como desarrolladora Full Stack.

---

**Autor:** Yael Nemer

**Repositorio:** [Proyecto — GitHub](https://github.com/YaelNmr/Proyecto)
