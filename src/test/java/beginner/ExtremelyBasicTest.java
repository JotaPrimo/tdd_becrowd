package beginner;

import org.example.beginner.ExtremelyBasic;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class ExtremelyBasicTest {

    @ParameterizedTest
    @CsvSource({
        "10, 9, X = 19",
        "-10, 4, X = -6",
        "15, -7, X = 8",
    })
    public void somaDeveSerIgual(int a, int b, String expected) {
        // cenario
        ExtremelyBasic extremelyBasic = new ExtremelyBasic(a, b);

        // açao
        String actual = extremelyBasic.calcularSoma();
        expected += "\n";

        // assertion
        assertEquals(expected, actual, "Somas deve ser igual");
    }
}
