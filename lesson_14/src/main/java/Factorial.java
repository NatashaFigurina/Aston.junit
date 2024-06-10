import java.math.BigInteger;


public class Factorial {

    public static BigInteger getFactorial(int inputNumber) {
        if (inputNumber == 1) {
            return BigInteger.valueOf(1);
        }
        if (inputNumber < 0) {
            throw new IllegalArgumentException("Нельзя вычислить факториал отрицательного числа");
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= inputNumber; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

}

