package BB;

import java.util.Scanner;

public class SmallMoneyTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
     System.out.println("Сколько у Вас монет по 50 копек?");
     int cop50 = scanner.nextInt();
        System.out.println("Сколько у Вас монет по 10 копек?");
        int cop10 = scanner.nextInt();
        System.out.println("Сколько у Вас монет по 5 копек?");
        int cop5 = scanner.nextInt();
        System.out.println("Сколько у Вас монет по 1 копейке?");
        int cop1 = scanner.nextInt();

        int sumCop = cop50 + cop10 + cop5 + cop1;
        System.out.println("Результат = " + sumCop);
    }
}
