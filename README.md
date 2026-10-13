# Proyecto Final Integrador — Backend

Backend desarrollado como parte del Proyecto Final Integrador de Argentina Programa.

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

Este backend forma parte del Proyecto Final Integrador de Argentina Programa y representa la etapa inicial de mi formación y práctica en desarrollo web full stack.

---

**Autor:** Yael Nemer

**Repositorio:** [Proyecto — GitHub](https://github.com/YaelNmr/Proyecto)
