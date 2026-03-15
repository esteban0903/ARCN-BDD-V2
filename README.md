# Prueba de Dropdown con BDD y Selenium

Este proyecto implementa una **prueba BDD usando Selenium, Cucumber y
PageFactory** para el sitio web:

https://the-internet.herokuapp.com/

La funcionalidad implementada valida el **comportamiento del Dropdown**,
verificando que un usuario pueda seleccionar opciones del menú desplegable.

------------------------------------------------------------------------

## Tecnologías usadas

- Java 17
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- PageFactory (Page Object Model)

------------------------------------------------------------------------

## Estructura del proyecto

```text
ARCN-BDD-V2/
├── pom.xml
├── README.md
├── src/
│   └── test/
│       ├── java/
│       │   └── edu/
│       │       └── eci/
│       │           └── bdd/
│       │               ├── pages/
│       │               │   └── DropdownPage.java
│       │               ├── steps/
│       │               │   └── DropdownSteps.java
│       │               └── runners/
│       │                   └── TestRunner.java
│       └── resources/
│           └── features/
│               └── dropdown.feature
└── target/
```

------------------------------------------------------------------------

## Funcionalidad implementada

Escenario de ejemplo:

Feature: Selección de Dropdown

Scenario: El usuario selecciona la Opción 1\
Given el usuario abre la página del dropdown\
When el usuario selecciona "Option 1"\
Then el dropdown debe mostrar "Option 1"

------------------------------------------------------------------------

## Cómo ejecutar las pruebas

Desde la raíz del proyecto:

mvn test

Esto realizará:
1. Compilar el proyecto
2. Ejecutar las pruebas de Cucumber
3. Abrir Chrome usando Selenium
4. Ejecutar los escenarios definidos

------------------------------------------------------------------------

## Patrón de diseño utilizado

Este proyecto utiliza **Page Object Model (POM)** junto con **PageFactory**.

Beneficios:
- Separación entre la lógica de pruebas y las interacciones con la interfaz
- Mejor mantenibilidad
- Pasos de prueba más limpios

------------------------------------------------------------------------

## Autor

Esteban Aguilera\
Escuela Colombiana de Ingeniería\
ARCN - BDD Selenium Lab
