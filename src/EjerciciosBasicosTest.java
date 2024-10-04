import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EjerciciosBasicosTest {
    public static void main(String[] args) {

    }

    @Test
    public void testEjercicio1() {
        String resultado = Ejercicios00.ejercicio1();
        assertTrue(resultado.contains("x = 144") && resultado.contains("y = 999"));
        assertTrue(resultado.contains("Suma: 1143"));
        assertTrue(resultado.contains("Resta: 855"));
        assertTrue(resultado.contains("División: 6,94"));
        assertTrue(resultado.contains("Multiplicación: 143856"));
    }

    @Test
    public void testEjercicio2() {
        assertEquals("Mi nombre es Adrián Ucha", Ejercicios00.ejercicio2("Adrián Ucha"));
    }

    @Test
    public void testEjercicio3() {
        String resultado = Ejercicios00.ejercicio3("Adrián Ucha", "Quencia 7", "619766936");
        assertTrue(resultado.contains("Nombre: Adrián Ucha"));
        assertTrue(resultado.contains("Dirección: Quencia 7"));
        assertTrue(resultado.contains("Teléfono: 619766936"));
    }

    @Test
    public void testEurosAPesetas() {
        assertEquals(16638.6, Ejercicios00.eurosAPesetas(100), 0.01);
    }

    @Test
    public void testPesetasAEuros() {
        assertEquals(60.10, Ejercicios00.pesetasAEuros(10000), 0.01);
    }

    @Test
    public void testCalcularTotalFactura() {
        assertEquals(121.0, Ejercicios00.calcularTotalFactura(100), 0.01);
    }
}