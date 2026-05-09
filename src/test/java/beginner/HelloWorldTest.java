package beginner;

import org.example.beginner.HelloWorld;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Nested
    class CasosIguais {
        @Test
        public void deveSerIgualAHelloWorld() {
            String expected = "Hello World!";
            String actual = HelloWorld.msg();

            assertEquals(expected, actual, "Devem ser iguais");
        }
    }


    @Nested
    class CasosDiferentes {
        @ParameterizedTest
        @ValueSource(strings = { "Hello Worlds!", "", "Hello World", "HELLO WORLD!", "hello world!", "HeLlO WoRlD!"})
        public void deveSerDiferenteDeHelloWorld() {
            String expected = "Hello Worlds!";
            String actual = HelloWorld.msg();

            assertNotEquals(expected, actual, "Devem ser diferentes");
        }
    }
}
