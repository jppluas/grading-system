# Grading System - Juan Pablo Plúas

Este programa es un sistema simple de gestión de calificaciones para estudiantes, escrito en Java.

## ¿Qué hace?

Permite:
- Crear estudiantes con un nombre y un ID.
- Agregar y eliminar calificaciones (notas) para cada estudiante.
- Calcular el promedio de las calificaciones.
- Obtener la calificación en letra (A, B, C, D, F) según el promedio.
- Determinar si el estudiante está en el cuadro de honor (honor roll).
- Saber si el estudiante aprobó o reprobó.
- Mostrar un reporte resumen del estudiante.

## ¿Cómo funciona?

El archivo principal es `main.java`, que crea un estudiante, agrega y elimina calificaciones, valida casos de error y muestra un reporte final usando la clase `Student`.

## Ejemplo de uso

Al ejecutar el programa, verás mensajes en consola indicando:
- Si una calificación fue agregada o rechazada.
- El promedio actual.
- Si se intentó eliminar una calificación inválida.
- Un reporte final con todos los datos del estudiante.

## Archivos principales

- `Student.java`: Lógica y estructura del estudiante.
- `Main.java`: Ejemplo de uso y pruebas de la clase `Student`.

## Requisitos

- Java 8 o superior.

## Ejecución

Compila y ejecuta con:

```sh
javac Student.java Main.java
java Main
