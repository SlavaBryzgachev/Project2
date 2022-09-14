package August23;

import java.util.Scanner;

public class MultiplicationTableCheck {
    static int  checkAnswer(int first, int second){
        return first * second;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N = ");
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int first = (int) (Math.random() * 11);
            int second = (int) (Math.random() * 11);
            System.out.println(first + " * " +  second + " =");
            System.out.println("Введите ответ ");
            int answer = scanner.nextInt();
            System.out.println("Ответ " + checkAnswer(first, second));
            if( answer == checkAnswer(first, second)){
                System.out.println("Правильный ответ");
                count++;
            }
            else {
                System.out.println("Неправильный ответ");

            }
        }
        double procent =  100.0 * count / N;
        int oc = convertation(procent);
        System.out.println(oc);
    }
    static int convertation(double procent){
        if( procent > 90){
            return 5;
        }
        else if (procent > 70){
            return 4;
        }
        else if (procent > 50){
            return 3;
        }
        else {
            return 2;
        }
    }
}
