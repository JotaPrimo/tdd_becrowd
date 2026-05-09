package beginner;

import org.example.beginner.Circulo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AreaOfCircleTest {

    @ParameterizedTest
    @CsvSource({
            "2.00, A=12.5664",
            "100.64, A=31819.3103",
            "150.00, A=70685.7750",
    })
    public void calcularAreCirculo(BigDecimal raio, String expected) {
        Circulo circulo = new Circulo(raio);
        String actual = circulo.calcularArea();
        assertEquals(expected, actual, "Areas deveriam ser iguais");
    }
}
