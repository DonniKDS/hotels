package programming;

import java.util.ArrayList;

// на решение ушло 20 минут

public class Task5 {

    public static int[] moreThanOneNumber(int[] array1, int[] array2) {
        ArrayList<Integer> reiteration1 = new ArrayList<>();
        ArrayList<Integer> reiteration2 = new ArrayList<>();
        ArrayList<Integer> allReiteration = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (i != j && array1[i] == array1[j]) {
                    boolean isPresent = false;
                    for (int number : reiteration1) {
                        if (number == array1[i]) {
                            isPresent = true;
                            break;
                        }
                    }
                    if (!isPresent) {
                        reiteration1.add(array1[i]);
                    }
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (i != j && array2[i] == array2[j]) {
                    boolean isPresent = false;
                    for (int number : reiteration2) {
                        if (number == array2[i]) {
                            isPresent = true;
                            break;
                        }
                    }
                    if (!isPresent) {
                        reiteration2.add(array2[i]);
                    }
                }
            }
        }
        for (int number1 : reiteration1) {
            for (int number2 : reiteration2) {
                if (number1 == number2) {
                    allReiteration.add(number1);
                }
            }
        }
        int[] array = new int[allReiteration.size()];
        for (int i = 0; i < allReiteration.size(); i++) {
            array[i] = allReiteration.get(i);
        }

        return array;
    }
}
