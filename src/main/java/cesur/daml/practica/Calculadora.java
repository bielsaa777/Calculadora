package cesur.daml.practica;

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

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public double maximo(double a, double b) {
        if (a >= b) return a; 
        return b;
    }

    public double porcentaje(double valor, double total) {
        if (total == 0) {
            return 0.0;
        }
        return (valor / total) * 100;
    }
}