package AA;

import java.util.Scanner;

public class sameNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье число");
        int thirdNumber = scanner.nextInt();

        if(firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) {

            System.out.println("Yes");
        }

else {
    System.out.println("No");
        }

    }
}
