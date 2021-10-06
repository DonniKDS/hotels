package programming;

// на решение ушло 10 минут

public class Task2 {

    public static int round(float f) {
        int integer;
        integer = Math.round(f);

        if (integer % 5 == 0) {
            return integer;
        } else if (integer % 10 < 3) {
            integer = integer - (integer%10);
        } else if (integer % 10 < 5) {
            integer = integer + (5 - integer%5);
        } else if (integer % 10 < 8) {
            integer = integer - (integer%5);
        } else integer = integer - integer%5 + 5;
        return integer;
    }
}
