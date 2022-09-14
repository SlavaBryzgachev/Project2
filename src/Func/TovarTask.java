package loops;

import java.util.Scanner;

public class TovarTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во товаров");
        int count = scanner.nextInt();

        int total = 0;
        int maxCost = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Введите стоимость товара");
            int cost = scanner.nextInt();

            total = total + cost;
            if (cost > maxCost) {
                maxCost = cost;
            }
        }

        System.out.println("Итого = " + total);
        System.out.println("Max = " + maxCost);
    }
}
