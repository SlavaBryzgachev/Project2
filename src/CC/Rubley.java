package functions;

import java.util.Scanner;

public class Rubley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в рублях");
        int rub = scanner.nextInt();

        String declination = MoneyManager.findDeclination(rub);
        System.out.println(rub + " " + declination);
    }
}
