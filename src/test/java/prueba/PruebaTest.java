package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 * Pruebas visibles de la pregunta 14: los ejemplos del enunciado. No las modifiques.
 *
 * La pregunta se califica de forma automática con pruebas ocultas, que incluyen estas y agregan los
 * valores límite y los casos extremos: que estas pasen no asegura todo el puntaje.
 * Un ciclo que no termina falla por tiempo.
 */
@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PruebaTest {

    private static final double TOLERANCIA = 1e-9;

    // a. Selección

    @Test
    @DisplayName("a1. 120 → Baja")
    void categoria1() {
        assertEquals("Baja", Prueba.categoriaVenta(120));
    }

    @Test
    @DisplayName("a2. 500 → Normal")
    void categoria2() {
        assertEquals("Normal", Prueba.categoriaVenta(500));
    }

    @Test
    @DisplayName("a3. 900 → Excelente")
    void categoria3() {
        assertEquals("Excelente", Prueba.categoriaVenta(900));
    }

    @Test
    @DisplayName("a4. 0 → Monto inválido")
    void categoria4() {
        assertEquals("Monto inválido", Prueba.categoriaVenta(0));
    }

    // b. Ciclos

    @Test
    @DisplayName("b1. (5, 2) → 3.0: (1 + 3 + 5) / 3")
    void promedio1() {
        assertEquals(3.0, Prueba.promedioNoMultiplos(5, 2), TOLERANCIA);
    }

    @Test
    @DisplayName("b2. (6, 4) → 3.4: (1 + 2 + 3 + 5 + 6) / 5")
    void promedio2() {
        assertEquals(3.4, Prueba.promedioNoMultiplos(6, 4), TOLERANCIA);
    }

    @Test
    @DisplayName("b3. (3, 1) → 0.0: todos son múltiplos de 1")
    void promedio3() {
        assertEquals(0.0, Prueba.promedioNoMultiplos(3, 1), TOLERANCIA);
    }
}
