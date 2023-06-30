import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InvalidNumberException, DivisionByZeroException,
            NumberOutOfRangeException, NumberSummException{
//        task1();
//        task2();
        task3();
        sc.close();
    }
    public static void task1() throws InvalidNumberException{

        while(true) {
            int x = Integer.parseInt(sc.nextLine());
            if (x <= 0) {
                throw new InvalidNumberException("Некорректное число");
            }
        }
    }

    public static void task2() throws DivisionByZeroException{
        int a,b;
        while(true){
            try {
                System.out.println( " Введите число а :");
                a = sc.nextInt();
                break;
            }catch (InputMismatchException ex){
                System.out.println( "Ошибка : некорректный ввод");
                sc.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println(" Введите число В :");
                b = sc.nextInt();
                if (b == 0) {
                    throw new DivisionByZeroException(" Деление на ноль недопустимо");
                } else {
                    System.out.println(a/b);
                }
                break;
            }catch (InputMismatchException ex){
                System.out.println(" Ошибка некорректный ввод");
            }break;
        }
    }

    public static void task3() throws NumberOutOfRangeException , NumberFormatException, NumberSummException, DivisionByZeroException {
        System.out.println("Ведите первое число :");
        int a,b,c;
        try {
            System.out.println( " Введите число а :");
            a = sc.nextInt();
            if(a > 100){
                throw new NumberOutOfRangeException("Первое число вне допустимого диапозона");
            }
            System.out.println( " Введите число b :");
            b = sc.nextInt();
            if (b < 0){
                throw new NumberOutOfRangeException("Второе число вне допустимого диапозона");
            } else if ((a + b)<10) {
                throw new NumberSummException("Сумма первого и второго чисел слишком мала");

            }
            System.out.println( " Введите число c :");
            c = sc.nextInt();
            if (c == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            else {
                System.out.println("Проверка пройдена успешно");
            }
        }catch (InputMismatchException ex){
            System.out.println("Ошибка некорректный ввод");
        }
    }
}