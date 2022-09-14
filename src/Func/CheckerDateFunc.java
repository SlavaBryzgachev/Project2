package Func;

import java.util.Scanner;

public class CheckerDateFunc {
    static boolean isLeap(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    static int calcCountDays(int m, int y) {
        int countDays;
        if (m == 2) {
            if (isLeap(y)) {
                countDays = 29;
            }
            else {
                countDays = 28;
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            countDays = 30;
        }
        else {
            countDays = 31;
        }
        return countDays;
    }

    static boolean checkDate(int d, int m, int y) {
        if (d >= 1 && d <= 31 && m >= 1 && m <= 12 && y > 0) {
            int countDays = calcCountDays(m, y);
            if (d <= countDays) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день");
        int d = scanner.nextInt();

        System.out.println("Введите месяц");
        int m = scanner.nextInt();

        System.out.println("Введите год");
        int y = scanner.nextInt();

        if (checkDate(d, m, y)) {
            System.out.println("Корректная дата");
        }
        else {
            System.out.println("Некорректная дата");
        }
    }
}
