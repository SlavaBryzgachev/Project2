package functions;

import java.util.Scanner;

public class TrianglePerimeter {

    static double calcDistance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dist;
    }

    static double calcPerimeter(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = calcDistance(x1, y1, x2, y2);
        double b = calcDistance(x1, y1, x3, y3);
        double c = calcDistance(x2, y2, x3, y3);
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();

        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();

        System.out.print("x3 = ");
        int x3 = scanner.nextInt();
        System.out.print("y3 = ");
        int y3 = scanner.nextInt();

        double p = calcPerimeter(x1, y1, x2, y2, x3, y3);
        System.out.println("P = " + p);
    }
}
