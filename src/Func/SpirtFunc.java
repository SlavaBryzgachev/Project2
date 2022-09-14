package Func;

import java.util.Scanner;

public class SpirtFunc {
    static int countMolecule(int c, int h, int o) {
        int countC = c / 2;
        int countH = h / 6;
        int countO = o;

        return Math.min(Math.min(countC, countH), countO);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("C = ");
        int c = scanner.nextInt();

        System.out.print("H = ");
        int h = scanner.nextInt();

        System.out.print("O = ");
        int o = scanner.nextInt();

        int result = countMolecule(c, h, o);

        System.out.println("Кол-во молекул спирта = " + result);
    }
}
