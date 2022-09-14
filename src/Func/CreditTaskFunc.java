package Func;

import java.util.Scanner;

public class CreditTaskFunc {
    static double calcMounthPayment( double loanAmount ,double loanPercentage,double loanTime ){
        double r = loanPercentage / 100;

        double monthlyPayment = ((1+ r ) * loanTime) / (((( 1 + r) * loanTime) -1) * 12);
        return monthlyPayment;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Размер займа");
        double loanAmount = scanner.nextDouble();

        System.out.println("Процент займа");
        double loanPercentage = scanner.nextDouble();

        System.out.println("Время займа(колличество лет)");
        double loanTime = scanner.nextDouble();

        double result = calcMounthPayment(loanAmount,loanPercentage,loanTime);

        System.out.println("Месячная выплата =" + result);



    }

}