package BB;

import java.util.Scanner;

public class CountryCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите страну 1.Турция 2.Тайланд 3.Греция");
        int country = scanner.nextInt();

        int cost;
        if (country == 1) {
            cost = 45000;
        }
        else if (country == 2) {
            cost = 60000;
        }
        else {
            cost = 50000;
        }

        System.out.println("Желаете сидеть у окна? 1.Да 2.Нет");
        int window = scanner.nextInt();

        //вес багажа
        //страховка от невылета

    }
}
