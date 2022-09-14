package BB;

import java.util.Scanner;

public class TimeDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите время");
        int time = scanner.nextInt();

//        if (time > 4 && time < 12) {
//            System.out.println("Доброе утро");
//        }
//        else if (time > 11 && time < 17) {
//            System.out.println("Добрый день");
//        }
//        else if (time > 16 && time < 24) {
//            System.out.println("Добрый вечер");
//        }
//        else if (time >= 0 && time < 5) {
//            System.out.println("Доброй ночи");
//        }
//        else {
//            System.out.println("Неверное время");
//        }

        if (time >= 0 && time < 24) {
            if (time < 5) {
                System.out.println("Доброй ночи");
            }
            else if (time < 12) {
                System.out.println("Добрый день");
            }
            else if (time < 17) {
                System.out.println("Добрый вечер");
            }
            else {
                System.out.println("Доброй ночи");
            }
        }
        else {
            System.out.println("Неверное время");
        }
    }
}
