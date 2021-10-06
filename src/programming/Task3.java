package programming;

// на решение ушло 5 минут

public class Task3 {

    public String comp(int count) {
        String str = "";
        final String COMPUTER = " компьютер";
        final String COMPUTERS = " компьютеров";
        if (count % 10 == 1) {
            str = count + COMPUTER;
        } else str = count + COMPUTERS;
        return str;
    }
}
