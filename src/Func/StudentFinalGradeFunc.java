package Func;

import java.util.Scanner;

public class StudentFinalGradeFunc {
    static int finalGrade( int grade, int projects) {
        int result;
        if (grade > 90 || projects > 10) {
            result = 100;
        } else if (grade > 75 && projects > 5) {
            result = 90;
        } else if (grade > 75 && projects > 2) {
            result = 75;
        } else
            result = 0;
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку");
        int grade = scanner.nextInt();
        System.out.println("Введите колчество выполненых проектов");
        int projects = scanner.nextInt();
        int finalResult = finalGrade(grade,projects);
        System.out.println(finalResult);
    }
}
