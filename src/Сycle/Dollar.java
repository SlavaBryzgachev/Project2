package Сycle;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double courseDollar =  scanner.nextDouble();
         for(int i =1 ;i <100;i++){
             double priceRub = i * courseDollar;
             double numberOfCandies = priceRub / 20;
             System.out.println(i + "$" + " " + priceRub + " " + numberOfCandies);
         }
    }
}
