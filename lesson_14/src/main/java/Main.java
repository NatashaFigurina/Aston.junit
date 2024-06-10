import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bведите число, для которого нужно посчитать факториал: ");
        Scanner scanner = new Scanner(System.in);
        BigInteger result = Factorial.getFactorial(scanner.nextInt());
        System.out.println("Результат вычислений: " + result);
    }
}