package BB;

import java.util.Scanner;

public class SquareTask {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону квадрата");
        double sideSquare = scanner.nextDouble();

        double perimeterSquare = sideSquare * 4 ;
        System.out.println("Периметр квадрата = " + perimeterSquare);

        double areaSquare = sideSquare * sideSquare;
        System.out.println("Площадь квадрата = " + areaSquare);
    }
}
