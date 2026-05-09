package beginner;

import org.example.beginner.SimpleSum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleSumTest {

    @ParameterizedTest
    @CsvSource({
            "30, 10, SOMA = 40",
            "-30, 10, SOMA = -20",
            "0, 0, SOMA = 0",
    })
    public void somasDevemSerIguais(int a, int b, String expected) {
        SimpleSum simpleSum = new SimpleSum(a, b);
        String actual = simpleSum.calculateSum();
        assertEquals(expected, actual, "Deveriam ser iguais");
    }
}
