package beginner;

import org.example.beginner.SimpleProduct;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleProductTest {

    @ParameterizedTest
    @CsvSource({
            "3, 9, PROD = 27",
            "-30, 10, PROD = -300",
            "0, 9, PROD = 0",
            "0, 0, PROD = 0",
            "1, 1, PROD = 1",
            "10000, 10000, PROD = 100000000",
    })
    public void produtosDevemSerIguais(int a, int b, String expectedResult) {
        String actual = SimpleProduct.calculate(a, b);
        assertEquals(expectedResult, actual, "Produtos deveriam ser iguais");
    }
}
