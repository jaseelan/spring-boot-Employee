package java_2023_pra.Numbers;

public class secondsmall {
    public static void main(String[] args) {
        int[] numbers = { 34, 22, 45, 67, 54, 22, 34, 67, 90, 23 };
        int small = numbers[0];
        int secondsmall = numbers[1];

        if (small > secondsmall) {
            int temp = small;
            small = secondsmall;
            secondsmall = temp;
        }

        for (int x = 2; x < numbers.length; x++) {
            if (numbers[x] < small) {
                secondsmall = small; // update secondsmall before updating small
                small = numbers[x];
            } else if (numbers[x] < secondsmall && numbers[x] != small) {
                secondsmall = numbers[x];
            }
        }
        System.out.println(secondsmall);
    }
}
