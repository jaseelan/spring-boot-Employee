package java_2023_pra.Numbers;

import java.util.Arrays;

public class largest {
    public static void main(String[] args) {
        int[] array = { 23, 78, 90, 230 };

        int largest = array[0];
        for (int x = 1; x < array.length; x++) {
            if (largest < array[x]) {
                largest = array[x];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(largest);
    }
}
