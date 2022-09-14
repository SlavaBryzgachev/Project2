package functions;

import java.util.Scanner;

public class DistancePoints {
    static double calcDistance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dist;
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

        double dist = calcDistance(x1, y1, x2, y2);
        System.out.println(dist);
    }
}
