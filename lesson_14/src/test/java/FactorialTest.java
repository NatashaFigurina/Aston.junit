import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    @DisplayName("Вычисление факториала от 0")
    void testFactorialZero() {

        assertEquals(BigInteger.valueOf(1), Factorial.getFactorial(0));
    }

    @Test
    @DisplayName("Вычисление факториала положительного числа")
    void testFactorialPositiveNumber() {
        assertEquals(BigInteger.valueOf(1), Factorial.getFactorial(1));
        assertEquals(BigInteger.valueOf(6), Factorial.getFactorial(3));
    }


    @Test
    @DisplayName("Вычисление факториала отрицательного числа")
    void testFactorialNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.getFactorial(-3));
    }

    @Test
    @DisplayName("Вычисление факториала большого числа")
    void testFactorialBigNumber() {
        assertEquals(BigInteger.valueOf(355687428096000L), Factorial.getFactorial(17));
    }

    @Test
    @DisplayName("Вычисление факториала введенного символа")
    void testFactorialNegativeSymbol() {
        assertThrows(NumberFormatException.class, () -> Factorial.getFactorial(Integer.parseInt("-")));
        Assertions.assertThrows(NumberFormatException.class, () -> Factorial.getFactorial(Integer.parseInt("5d")));
    }
}

