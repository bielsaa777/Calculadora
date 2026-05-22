package cesur.daml.practica;

/**
 * Calculadora básica con operaciones aritméticas.
 * Proyecto: calculadora-basica
 * Versión: 1.0
 */
public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    // ¿Qué pasa si b es 0?
    public double dividir(double a, double b) {
        return a / b;
    }

    // Devuelve el mayor de dos números
    public double maximo(double a, double b) {
        if (a > b) return b; // ¡Ojo aquí!
        return a;
    }

    // Calcula el porcentaje de 'valor' sobre 'total'
    public double porcentaje(double valor, double total) {
        return (valor * total) / 100; // ¿Seguro que es esta fórmula?
    }
}