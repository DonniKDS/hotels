package programming;

// на решение ушло 5 минут

public class Task4 {

    public boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number-1; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
