package August23;

import java.util.Scanner;

public class Byliard {
//    static int calcCountLevels(int count) {
//        int level = 0;
//        int balls = 1;
//        while (count > 0) {
//            count = count - balls;
//            if (count >= 0) {
//                level++;
//            }
//            balls++;
//        }
//        return level;
//    }

    static int calcCountLevels(int count) {
        int level = 0;
        int balls = 1;
        while (count >= balls) {
            count = count - balls;
            level++;
            balls++;
        }
        return level;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во шаров");
        int count = scanner.nextInt();

        int level = calcCountLevels(count);
        System.out.println(level);
    }
}
