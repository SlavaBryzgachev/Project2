package BB;

import java.util.Scanner;

public class Apples2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во людей");
        int countPeople = scanner.nextInt();

        System.out.println("Введите кол-во яблок");
        int countApple = scanner.nextInt();

        if (countPeople > 0) {
            int countEvery = countApple / countPeople;
            int rest = countApple % countPeople;

            System.out.printf("Каждому достанется по %d яблок, останется %d", countEvery, rest);
        }
        else {
            System.out.println("Нет людей");
        }
    }
}
