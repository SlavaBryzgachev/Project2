package BB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите курс доллара");
	    double courseDollar = scanner.nextDouble();

        System.out.println("Введите сумму в долларах");
        double sumDollar = scanner.nextDouble();

        double sumRub = courseDollar * sumDollar;
        System.out.println("Результат = " + sumRub);
    }
}
