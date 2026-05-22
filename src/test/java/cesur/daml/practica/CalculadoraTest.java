package cesur.daml.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas Unitarias Avanzadas - ISO/IEC 29119")
public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora(); [cite: 338]
    }

    @Test
    @DisplayName("Suma de dos números positivos comunes")
    void testSumarPositivos() {
        assertEquals(8.5, calc.sumar(5.0, 3.5), 0.001, "5.0 + 3.5 debería ser 8.5");
    }

    @Test
    @DisplayName("Suma de dos números negativos")
    void testSumarNegativos() {
        assertEquals(-6.0, calc.sumar(-2.0, -4.0), 0.001);
    }

    @Test
    @DisplayName("Suma con valor frontera (Elemento neutro cero)")
    void testSumarCero() {
        assertEquals(10.0, calc.sumar(10.0, 0.0), 0.001);
    }

    @Test
    @DisplayName("Resta básica de dos números positivos")
    void testRestarPositivos() {
        assertEquals(6.0, calc.restar(10.0, 4.0), 0.001);
    }

    @Test
    @DisplayName("Resta cuyo resultado produce un número negativo")
    void testRestarResultadoNegativo() {
        assertEquals(-3.0, calc.restar(2.0, 5.0), 0.001);
    }

    @Test
    @DisplayName("Multiplicación por cero (Caso Límite)")
    void testMultiplicarPorCero() {
        assertEquals(0.0, calc.multiplicar(6.0, 0.0), 0.001);
    }

    @Test
    @DisplayName("Multiplicación de dos números negativos (Regla de signos)")
    void testMultiplicarNegativos() {
        assertEquals(9.0, calc.multiplicar(-3.0, -3.0), 0.001);
    }

    @Test
    @DisplayName("División exacta estándar")
    void testDividirNormal() {
        assertEquals(5.0, calc.dividir(10.0, 2.0), 0.001);
    }

    @Test
    @DisplayName("Dividir entre cero debe lanzar ArithmeticException")
    void testDividirPorCeroDeboLanzarExcepcion() {
        // El enunciado requiere capturar ArithmeticException en divisiones por cero
        assertThrows(ArithmeticException.class, () -> calc.dividir(10.0, 0.0)); [cite: 345]
    }

    @Test
    @DisplayName("Caja Blanca: Primer parámetro es mayor (Debería devolver 'a')")
    void testMaximoPrimerValorMayor() {
        assertEquals(8.0, calc.maximo(8.0, 3.0), 0.001);
    }

    @Test
    @DisplayName("Caja Blanca: Segundo parámetro es mayor (Debería devolver 'b')")
    void testMaximoSegundoValorMayor() {
        assertEquals(4.0, calc.maximo(1.0, 4.0), 0.001);
    }

    @Test
    @DisplayName("Caja Negra: Ambos valores son idénticos (Valor límite)")
    void testMaximoValoresIguales() {
        assertEquals(5.0, calc.maximo(5.0, 5.0), 0.001);
    }

    @ParameterizedTest
    @CsvSource({
        "25.0, 200.0, 12.5",
        "50.0, 100.0, 50.0",
        "0.0, 500.0, 0.0"
    })
    @DisplayName("Cálculo de porcentaje sobre un total")
    void testPorcentajeParametrizados(double valor, double total, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calc.porcentaje(valor, total), 0.001);
    }

    @Test
    @DisplayName("Porcentaje cuando el total es cero (Caso límite frontera)")
    void testPorcentajeTotalCero() {
        assertEquals(0.0, calc.porcentaje(10.0, 0.0), 0.001);
    }
}