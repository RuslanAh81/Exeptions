import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator {

    public static double calculatePower(int a, int b) throws InvalidInputsException{
        if (b > 0) {
            return Math.pow(a,b);
        } else {
            throw new InvalidInputsException("Показатель степени меньше или равен 0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = checkInt(sc, "Введите число А :");
        int b = checkInt(sc, "Введите степень В :");
        try {
            System.out.println("А в степени В = " + calculatePower(a,b));
        } catch (InvalidInputsException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }

    public static int checkInt(Scanner sc, String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Ошибка : Введено некорректное число. Попробуйте еще");
                sc.next();
            }
        }
    }

    static class InvalidInputsException extends Exception {
        public InvalidInputsException(String message) {
            super(message);
        }
    }
}

