package AA;

import java.util.Scanner;

public class PositiveNumbers {
    static int positiveNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < 0 && secondNumber < 0 && thirdNumber < 0) {
            return 0;
        } else if (firstNumber > 0 && secondNumber < 0 && thirdNumber < 0) {
            return 1;
        } else if (firstNumber > 0 && secondNumber > 0 && thirdNumber < 0) {
            return 2;
        } else if (firstNumber > 0 && secondNumber > 0 && thirdNumber > 0)
            return 3;
        return positiveNumbers(firstNumber,secondNumber,thirdNumber);
    }


    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье число");
        int thirdNumber = scanner.nextInt();

        int result = positiveNumbers(firstNumber,secondNumber,thirdNumber);

        System.out.println("Колличество положительных чисел" + result);

        }

    } //переписать с переменной count

