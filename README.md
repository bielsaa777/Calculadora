# Proyecto: Calculadora Básica (Testing con ISO/IEC 29119)

Este repositorio contiene la entrega correspondiente al módulo de *Entornos de Desarrollo* (1º DAM) en *CESUR. El objetivo principal es aplicar los procesos de la norma **ISO/IEC 29119* para el diseño, ejecución y documentación de pruebas unitarias automatizadas sobre un componente de software con defectos intencionados.

---

## Tecnologías y Entorno

* *Lenguaje:* Java 17 (OpenJDK)
* *Gestor de Proyectos / Build:* Maven 3.x
* *Framework de Pruebas:* JUnit 5.10 (Jupiter)
* *Métrica de Cobertura:* JaCoCo 0.8.11
* *IDE:* IntelliJ IDEA

---

## Estrategia de Pruebas Aplicada

Siguiendo las directrices del estándar internacional, la suite se ha diseñado combinando dos enfoques fundamentales:

1. *Pruebas de Caja Negra:*
   * *Particiones de Equivalencia:* División de entradas en conjuntos válidos e inválidos (positivos, negativos, elementos neutros).
   * *Análisis de Valores Límite:* Pruebas críticas orientadas a la robustez (denominadores en cero, totales equivalentes a cero en cálculos de porcentaje).
2. *Pruebas de Caja Blanca:*
   * *Cobertura de Caminos/Ramas:* Aplicado exhaustivamente en las estructuras condicionales del método maximo(a, b) para garantizar que el 100% de los flujos lógicos sean transitados de forma segura.

---

## Ciclo de Vida del Proyecto: Bugs Detectados y Corregidos

La fase de ejecución inicial con JUnit localizó con éxito *3 defectos críticos* integrados en el código original:

* *IR-001 (División por Cero):* El método no controlaba la división matemática, devolviendo un valor Infinity. Se corrigió implementando una cláusula de guarda que lanza ArithmeticException.
* *IR-002 (Lógica en Máximo):* Operador condicional invertido que devolvía el número menor en lugar del mayor. Refactorizado con la lógica condicional correcta.
* *IR-003 (Cálculo de Porcentaje):* Uso de una ecuación aritmética incorrecta ((valor * total) / 100). Se reemplazó por la fórmula de razón proporcional real ((valor / total) * 100).