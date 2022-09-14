package functions;

public class MoneyManager {
    public static String findDeclination(int rub) {
        int last = rub % 10;
        int lastTwo = rub % 100;
        String result;
        if (lastTwo > 10 && lastTwo < 15) {
            result = "рублей";
        }
        else if (last == 1) {
            result = "рубль";
        }
        else if (last == 2 || last == 3 || last == 4) {
            result = "рубля";
        }
        else {
            result = "рублей";
        }
        return result;
    }
}
