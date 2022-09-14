package August23;

import java.util.Scanner;

public class AimTask {
    static boolean checkAim(int x, int y, int r){
        return x * x + y * y < r * r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();

        System.out.print("R = ");
        int r = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("x = ");
            int x = scanner.nextInt();

            System.out.print("y = ");
            int y = scanner.nextInt();

            if (checkAim(x, y, r)) {
                count++;
                System.out.println("Попали");
            }
            else {
                System.out.println("Не попали");
            }
        }

        double p = 100.0 * count / n;
        System.out.println("Процент попаданий = " + p);
    }
}
