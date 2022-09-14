package August23;
import java.util.Scanner;
public class TovarTask1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите кол-во товаров");
            int count = scanner.nextInt();
            int total = 0;
            int maxCost = Integer.MIN_VALUE;
            int minCost = Integer.MAX_VALUE;
            for (int i = 0; i < count; i++) {
                System.out.println("Введите стоимость товара");
                int cost = scanner.nextInt();
                total = total + cost;
                if (cost > maxCost) {
                    maxCost = cost;
                }
                if (cost < minCost) {
                    minCost = cost;
                }
            }
            System.out.println("Итого = " + total);
            System.out.println("Max = " + maxCost);
            System.out.println("Min = " + minCost);
        }
    }


