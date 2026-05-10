package beginner;

import org.example.beginner.AverageOne;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class AverageOneTest {

    @ParameterizedTest
    @CsvSource({
            "5.0, 7.1, MEDIA = 6.43182",
            "0.0, 7.1, MEDIA = 4.84091",
            "10.0, 10.0, MEDIA = 10.00000",
    })
    public void mediasDevemSerIguais(String a, String b, String expectedResult) {
        AverageOne averageOne = new AverageOne(a, b);
        String actual = averageOne.calculateMedia();
        assertEquals(expectedResult, actual);
    }
}
