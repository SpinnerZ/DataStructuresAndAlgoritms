package sort_algoritms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        int[] values = new int[20];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {

            values[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(values));

        bubbleSortAscending(values);

        System.out.println(Arrays.toString(values));
    }

    private static void bubbleSortAscending(int[] values) {

        boolean hadChange = true;
        int iteractions = 0;

        while (iteractions < values.length && hadChange) {

            hadChange = false;

            // Pushes the lessers values to the beginning of the array
            for (int i = values.length - 1; i > 0; i--) {

                if (values[i] < values[i - 1]) {

                    hadChange = true;
                    int aux = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = aux;
                    System.out.println(Arrays.toString(values));
                }
            }
        }
    }
}
