package Func;

import java.util.Scanner;

public class FatManFunc {
    static boolean checkMass(int  mass1, int mass2, int mass3){
        if ( mass1 > 94 && mass1 < 727 && mass2 > 94 && mass2 < 727 && mass3 > 94 && mass3 < 727){
            return true;
        }
        else
            return false;
    }
    static int findMaxMass( int m1 , int m2 , int m3){
        int max = Math.max(Math.max(m1, m2),  m3);
        return max;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Масса первого толстяка");
        int firstMan = scanner.nextInt();
        System.out.println("Масса второго толстяка");
        int secondMan = scanner.nextInt();
        System.out.println("Масса третьего толстяка");
        int thirdMan = scanner.nextInt();
        boolean check = checkMass(firstMan, secondMan, thirdMan);
        if (check == true){
            int max = findMaxMass(firstMan, secondMan, thirdMan);
            System.out.println(max);
        }
        else
            System.out.println("Error");
    }

        }



