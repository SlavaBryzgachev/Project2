package August23;

import java.util.Scanner;

public class Calculator {
    static int inputAction() {
        Scanner scanner = new Scanner(System.in);
        int action;
        while (true) {
            action = scanner.nextInt();
            if (action >= 0 && action <= 4) {
                break;
            } else {
                System.out.print("Введено неверное значение. Повторите: ");
            }
        }
        return action;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println("1.Сумма");
            System.out.println("2.Разность");
            System.out.println("3.Произведение");
            System.out.println("4.Частное");
            System.out.println("0.Выход");

            action = inputAction();
            if (action != 0) {
                System.out.println("Введите первое число");
                double first = scanner.nextDouble();

                System.out.println("Введите второе число");
                double second = scanner.nextDouble();

                 double result = calc(first, second, action);
                System.out.println("Результат = " + result);
            }
        }
        while (action != 0);
    }

    public static double calc(double first, double second, int action) {
        double result;
        switch (action) {
            case 1:
                result = first + second;
                break;
            case 2:
                result = first - second;
                break;
            case 3:
                result = first * second;
                break;
            default:
                result = first / second;
                break;
        }

                return result;
    }
}
