import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static Map<String,Integer> account;
    public static void main(String[] args) {
        account = new HashMap<>();
        account.put("Pocket", 1000);
        account.put("Wife", 0);
        account.put("Son", 1000);
        account.put("Owner", 10000);
        System.out.println(account);
        boolean Flag = true;
        while (Flag) {
            System.out.println("Введите имя счета (Цифру) :");
            System.out.println(" 1. Жене ");
            System.out.println(" 2. Ребенку ");
            System.out.println(" 3. Себе на расходы ");
            System.out.println(" 4. Выход");
            try {
                Scanner sc = new Scanner(System.in);
                int action = sc.nextInt();

            switch (action) {
                case 1:
                    try {
                        System.out.println("Введите сумму :");
                        int summ = sc.nextInt();
                        checkSumm(summ);
                        String currAccount = "Wife";
                        transfer(currAccount, summ);

                    }catch (InvalidAmountException e1){
                        System.out.println(e1.getMessage());

                    }catch (InsufficientFundsException e2){
                        System.out.println(e2.getMessage());
                    }sc.nextLine();
                    break;
                case 2:
                    try {
                        System.out.println("Введите сумму :");
                        int summ = sc.nextInt();
                        checkSumm(summ);
                        String currAccount = "Son";
                        transfer(currAccount, summ);

                    }catch (InvalidAmountException e1){
                        System.out.println(e1.getMessage());

                    }catch (InsufficientFundsException e2){
                        System.out.println(e2.getMessage());
                    }sc.nextLine();
                    break;

                case 3:
                    try {
                        System.out.println("Введите сумму :");
                        int summ = sc.nextInt();
                        checkSumm(summ);
                        String currAccount = "Pocket";
                        transfer(currAccount, summ);

                    }catch (InvalidAmountException e1){
                        System.out.println(e1.getMessage());

                    }catch (InsufficientFundsException e2){
                        System.out.println(e2.getMessage());
                    }sc.nextLine();
                    break;

                case 4:
                    Flag = false;
            }
                    }catch ( InputMismatchException e){
                        System.out.println("Ошибка : некорректный ввод");
                    }
            }
        }
    public static void addSumm(String transfAccount,int summ) {
        String currAccount = transfAccount;
        int res = account.get(currAccount) + summ;
        account.put(transfAccount, res);
        System.out.println(res);
    }
    public static void transfer(String currAccount, int summ) {
        int ownerAcc = account.get("Owner") - summ;
        account.put("Owner", ownerAcc);
        int res = account.get(currAccount) + summ;
        System.out.println(" У вас на счету осталось " + ownerAcc);
        System.out.println(currAccount + " " + res);
    }

    public static void printAccount(String currAccount){
        System.out.println(account.get(currAccount));
    }

    public static void checkSumm(int summ) throws InsufficientFundsException, InvalidAmountException {
        /// System.out.println(" Проверка");
        if (summ >= account.get("Owner")){
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }
        if (summ <= 0){
            throw new InvalidAmountException("Некорректная сумма перевода");
        }
    }
}
/*
    Классы ошибок
 */
class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}