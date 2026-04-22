# 🏥 TurnoExpress

> **Sistema de gestión de turnos médicos desarrollado en Java. Interfaz de consola, arquitectura orientada a objetos y desarrollo semanal continuo — cada semana, nuevas funcionalidades.**

-----

## 📋 Descripción

**TurnoExpress** es una aplicación desarrollada en Java que permite gestionar turnos para centros de salud de manera simple e intuitiva. El proyecto nace con la idea de resolver un problema cotidiano: sacar un turno médico sin complicaciones, con una experiencia clara tanto para pacientes como para el personal de salud.

El desarrollo es **incremental y público**: cada semana se incorporan nuevas funcionalidades y mejoras, por lo que el proyecto está en constante evolución.

-----

## 🗂️ Progreso Semanal

|Semana  |Tema Principal                                          |Estado      |
|--------|--------------------------------------------------------|------------|
|Semana 1|Fundamentos — paquetes, entrada de datos, clase Paciente|✅ Completada|
|Semana 2|Nuevas clases, composición, Enum y array                |✅ Completada|

-----

## 🏗️ Arquitectura

```
TurnoExpress/
└── src/
    ├── ar.salud.turnoexpress.modelo/
    │   ├── Paciente.java          # Entidad que representa a un paciente
    │   ├── Medico.java            # Entidad que representa a un médico
    │   ├── Turno.java             # Representa un turno médico
    │   └── Especialidad.java      # Enum de especialidades médicas
    ├── ar.salud.turnoexpress.principal/
    │   └── Principal.java         # Punto de entrada del programa
    └── module-info.java           # Configuración del módulo Java
```

-----

## ✨ Funcionalidades

### Semana 1

- [x] Bienvenida al usuario
- [x] Solicitud de nombre y DNI por consola
- [x] Creación de objeto Paciente con los datos ingresados
- [x] Visualización de los datos del paciente
- [x] Estructura de paquetes con nomenclatura estándar Java

### Semana 2

- [x] Clase `Medico` con nombre y especialidad
- [x] Clase `Turno` con composición de objetos (Paciente + Medico)
- [x] Enum `Especialidad` con valores fijos y controlados
- [x] Lista de especialidades generada automáticamente con `values()`
- [x] Selección de especialidad por índice con `values()[opcion]`
- [x] Flujo completo: ingreso de datos → selección de especialidad → confirmación de turno

-----

## 👀 Ejemplo de ejecución

```
----BIENVENIDO/A A TurnoExpress---
Por favor, ingrese su nombre y apellido:
Federico Adamo
Por favor, ingrese su DNI:
46013531
Nombre: Federico Adamo
DNI: 46013531

Especialidades disponibles:
[0] CLINICA_GENERAL
[1] CARDIOLOGIA
[2] PEDIATRIA
[3] TRAUMATOLOGIA

Seleccione una especialidad:
1

Turno confirmado
Paciente:     Federico Adamo
Médico:       Dr. García
Especialidad: CARDIOLOGIA
```

-----

## 🚀 Cómo ejecutar el proyecto

### Requisitos

- Java JDK 11 o superior
- IDE recomendado: [IntelliJ IDEA](https://www.jetbrains.com/idea/) o [Eclipse](https://www.eclipse.org/)

### Pasos

```bash
# 1. Clonar el repositorio
git clone https://github.com/tu-usuario/TurnoExpress.git

# 2. Abrir el proyecto en tu IDE

# 3. Ejecutar Principal.java
```

-----

## 🛠️ Tecnologías

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)

-----

## 📝 Notas de Versión

### v0.2 — Semana 2

- Incorporación de composición entre clases
- Uso de Enum para valores constantes controlados
- Recorrido de Enum con `values()` para generación dinámica de listas
- Selección de elementos por índice con `values()[opcion]`

### v0.1 — Semana 1

- Estructura inicial del proyecto con nomenclatura estándar de paquetes Java
- Clase `Paciente` con atributos, constructor, getters y método `mostrarDatos()`
- `Principal.java` con flujo completo: bienvenida → ingreso de datos → visualización

-----

## 👤 Autor

Desarrollado por **Federico Adamo Morales**
*Proyecto independiente en desarrollo activo — se actualiza semana a semana.*

-----

> 💡 *¿Tenés sugerencias o encontraste un bug? ¡Abrí un issue o mandá un PR!*