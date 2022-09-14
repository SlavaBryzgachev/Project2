package BB;

import java.util.Scanner;

public class BuyingSweetsAndCookies {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Веедите цену 1кг конфет");
        double priceSweets = scanner.nextDouble();

        System.out.println("Введите цену 1кг печенья");
        double priceCookies = scanner.nextDouble();

        double buySweets = priceSweets * 0.3;

        double buyCookies = priceCookies * 0.4;

        double sumCookiesAndSweets = buySweets + buyCookies;

        System.out.println("Стоимость покупки 300гр конфет и 400гр печенья = " + sumCookiesAndSweets);

    }
}
