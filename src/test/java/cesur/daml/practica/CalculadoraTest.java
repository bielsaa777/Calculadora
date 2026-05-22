package cesur.daml.practica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas unitarias para la clase Calculadora según ISO 29119")
public class CalculadoraTest {

    // --- PRUEBAS DE SUMA ---
    @Test
    @DisplayName("Suma de dos números positivos")
    void testSumarPositivos() {
        // Diseñado
    }

    @Test
    @DisplayName("Suma de dos números negativos")
    void testSumarNegativos() {
        // Diseñado
    }

    // --- PRUEBAS DE RESTA ---
    @Test
    @DisplayName("Resta de dos números positivos")
    void testRestarPositivos() {
        // Diseñado
    }

    @Test
    @DisplayName("Resta con resultado negativo")
    void testRestarResultadoNegativo() {
        // Diseñado
    }

    // --- PRUEBAS DE MULTIPLICACIÓN ---
    @Test
    @DisplayName("Multiplicación por cero devuelve cero")
    void testMultiplicarPorCero() {
        // Diseñado
    }

    @Test
    @DisplayName("Multiplicación de dos números negativos")
    void testMultiplicarNegativos() {
        // Diseñado
    }

    // --- PRUEBAS DE DIVISIÓN ---
    @Test
    @DisplayName("División normal de dos números")
    void testDividirNormal() {
        // Diseñado
    }

    @Test
    @DisplayName("Dividir entre cero debe lanzar ArithmeticException")
    void testDividirPorCeroDeboLanzarExcepcion() {
        // Diseñado
    }

    // --- PRUEBAS DE MÁXIMO (Caja Blanca) ---
    @Test
    @DisplayName("El máximo cuando el primer parámetro es mayor")
    void testMaximoPrimerValorMayor() {
        // Diseñado
    }

    @Test
    @DisplayName("El máximo cuando el segundo parámetro es mayor")
    void testMaximoSegundoValorMayor() {
        // Diseñado
    }

    @Test
    @DisplayName("El máximo cuando ambos valores son iguales")
    void testMaximoValoresIguales() {
        // Diseñado
    }

    // --- PRUEBAS DE PORCENTAJE ---
    @Test
    @DisplayName("Cálculo normal de un porcentaje sobre un total")
    void testPorcentajeNormal() {
        // Diseñado
    }

    @Test
    @DisplayName("Porcentaje cuando el total es cero")
    void testPorcentajeTotalCero() {
        // Diseñado
    }
}