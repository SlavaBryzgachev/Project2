package functions;

import java.util.Scanner;

public class FuelCalculator {

    public static double fuelPrice(int litres, double pricePerLitre) {
        double discount;
        if (litres < 2) {
            discount = 0;
        }
        else if (litres < 4) {
            discount = 0.05;
        }
        else if (litres < 6) {
            discount = 0.1;
        }
        else if (litres < 8) {
            discount = 0.15;
        }
        else if (litres < 10) {
            discount = 0.2;
        }
        else {
            discount = 0.25;
        }

        double result = litres * (pricePerLitre - discount);
        result = Math.round(result * 100) / 100.0;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во литров");
        int litres = scanner.nextInt();
        System.out.println("Введите стоимость литра");
        double priceLiter = scanner.nextDouble();

        double result = fuelPrice(litres, priceLiter);
        System.out.println(result);
    }
}
