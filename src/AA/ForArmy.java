package AA;

import java.util.Scanner;

public class ForArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой возраст");
        int age = scanner.nextInt();
        if(age >= 18 && age <=27){
            System.out.println("Вы подлежитe призыву на срочную службу или можете служить по контракту.");
        }
        else if ( age > 27 && age <= 59){
            System.out.println("Вы можете служить по контракту");
        }
        else if (age < 18 && age > 0  || age > 59 && age < 100) {
            System.out.println("Вы находитесь в непризывном возрасте");
        }
        else {
                System.out.println("Ошибка");
            }

        }
    }

