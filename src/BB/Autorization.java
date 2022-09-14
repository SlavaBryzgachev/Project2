package BB;

import java.util.Random;
import java.util.Scanner;

public class Autorization {
    public static void main(String[] args) {
        final String adminLogin = "admin";
        final String adminPassword = "123";

        final String guestLogin = "guest";
        final String guestPassword = "555";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.next();

        System.out.println("Введите пароль");
        String password = scanner.next();

        if (login.equals(adminLogin) && password.equals(adminPassword) ||
                login.equals(guestLogin) && password.equals(guestPassword)) {
            Random random = new Random();
            int code = random.nextInt(9000) + 1000;
            System.out.print("Введите код " + code + ": ");
            int userCode = scanner.nextInt();

            if (code == userCode) {
                System.out.println("Добро пожаловать");
            }
            else {
                System.out.println("Неверный код");
            }
        }
        else {
            System.out.println("Неверный логин или пароль");
        }
    }
}
