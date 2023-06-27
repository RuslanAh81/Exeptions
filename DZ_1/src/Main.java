import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
        sc.close();
    }

    public static void task1(){
                System.out.println("Введите первое число А = ");

        int a = sc.nextInt();
        System.out.println("Введите второе число В = ");
        int b = sc.nextInt();
        try {
            System.out.println("Результат деления " +  a / b);
        }catch (ArithmeticException ex){
            System.out.println(" Ошибка : деление на ноль ");
        }
    }

    public static void task2() {
        while (true){
            try {
                System.out.println("Введите ваш возраст :");
                String userAge = sc.nextLine();
                int age = Integer.parseInt(userAge);
                if (age > 0 ){
                    System.out.println(" Ваш возраст = " + age);
                    break;
                }else {
                    System.out.println("Ну хватит врать, пишите как есть");
                }
            }catch (NumberFormatException ex){
                System.out.println("Вы точно ввели число? Попробуйте еще раз");
            }
        }
    }

    public static void task3() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("List.txt"));
            String line;
            int summ = 0;
            try {
                while ((line = br.readLine()) != null){
                    try {
                        summ += Integer.parseInt(line);
                        System.out.println("Сумма чисел = " + summ);
                    }catch (NumberFormatException e){
                        System.out.println("Некорректное значение числа в файле");
                    }
                }
            }catch (IOException e){
                System.out.println("Ошибка в чтении файла");
            }
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}