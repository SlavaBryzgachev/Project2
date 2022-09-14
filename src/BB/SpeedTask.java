package BB;

import java.util.Scanner;

public class SpeedTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите расстояние (км)");
        int s = scanner.nextInt();

        System.out.println("Введите время (ч)");
        int t = scanner.nextInt();

        s = s * 1000;
        t *= 3600; //t = t * 3600

        double v = (double) s / t;

        System.out.println(v);
    }
}
