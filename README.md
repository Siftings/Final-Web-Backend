# Bodegas Backend

Parte del backend del examen final, API REST en Spring Boot para registrar bodegas y consultar sus productos

## Requisitos

- Java 21 o superior

## Ejecutar

```bash
./mvnw spring-boot:run
```

La API queda en `http://localhost:8080`.

Se usa una base de datos H2 en memoria. Al iniciar se cargan 2 bodegas y 3 productos de prueba.

## Endpoints

- POST `/bodegas` -> Registrar bodega 
- GET `/bodegas` -> Consultar bodegas con sus productos 
