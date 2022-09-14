package Сycle;

import java.util.Scanner;

public class BMIFunc {
    static double BMI(double weight, double height) {
        double finalBMI = weight / (Math.pow(height, 2));
        return finalBMI;
    }

    static String printBMI(double BMI) {
        String underWeight = "Underweight";
        String normalWeight = "NormalWeight";
        String overWeight = "Overweight";
        String obesity = "Obesity";
        String count;
        if (BMI < 18.5) {
            count = underWeight;
        } else if (18.5 <= BMI && BMI < 25) {
            count = normalWeight;
        } else if (25 <= BMI && BMI < 30) {
            count = overWeight;
        } else {
            count = obesity;
        }
            return count;
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите вес");
            double weight = scanner.nextDouble();
            System.out.println("Введите рост");
            double height = scanner.nextDouble();

            double result = BMI(weight, height);

            System.out.println("Индекс массы тела " + result);

             String index = printBMI(result);
             System.out.println( index);


        }
    }

