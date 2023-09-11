package ar.edu.unju.fi.tp1pto1;


import ar.edu.unju.fi.tp1pto1.model.CalculadoraModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraApplicationTest {

    private CalculadoraModel calculadoraModel;

    @BeforeEach
    public void setUp() {
        calculadoraModel = new CalculadoraModel();
    }

    @Test
    public void testSuma() {
        calculadoraModel.setOperacion(5, 3, "+");
        calculadoraModel.calcular();
        assertEquals(8, calculadoraModel.getResultado(), 0.001);
    }

    @Test
    public void testResta() {
        calculadoraModel.setOperacion(5, 3, "-");
        calculadoraModel.calcular();
        assertEquals(2, calculadoraModel.getResultado(), 0.001);
    }

    @Test
    public void testMultiplicacion() {
        calculadoraModel.setOperacion(5, 3, "X");
        calculadoraModel.calcular();
        assertEquals(15, calculadoraModel.getResultado(), 0.001);
    }

    @Test
    public void testDivision() {
        calculadoraModel.setOperacion(6, 2, "/");
        calculadoraModel.calcular();
        assertEquals(3, calculadoraModel.getResultado(), 0.001);
    }

    @Test
    public void testDivisionPorCero() {
        calculadoraModel.setOperacion(6, 0, "/");
        calculadoraModel.calcular();
        assertEquals(0, calculadoraModel.getResultado(), 0.001); // Se espera un resultado de 0 porque no se puede dividir por cero.
    }

    @Test
    public void testOperadorNoValido() {
        calculadoraModel.setOperacion(5, 3, "invalido");
        calculadoraModel.calcular();
        assertEquals(0, calculadoraModel.getResultado(), 0.001); // Se espera un resultado de 0 porque el operador no es válido.
    }

    @Test
    public void testBorrar() {
        calculadoraModel.setOperacion(5, 3, "+");
        calculadoraModel.calcular();
        calculadoraModel.borrar();
        assertEquals(0, calculadoraModel.getResultado(), 0.001);
        assertEquals(0, calculadoraModel.getA(), 0.001);
        assertEquals(0, calculadoraModel.getB(), 0.001);
        assertEquals("", calculadoraModel.getOp());
    }
}