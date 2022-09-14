package August23;
public class Battle {
    public static void main(String[] args) {
        int HP = 100;
        int hits = 0;
        do {
            int hit = (int) (Math.random() * 10 + 1);
            HP = HP - hit;
            hits++;
            System.out.println("Осталось " + HP);
            System.out.println("Урон " + hit);
        }
        while (0 < HP);

        System.out.println("Колличесво ударов " + hits);
    }
}


