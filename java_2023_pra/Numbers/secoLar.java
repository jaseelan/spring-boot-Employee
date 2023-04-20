package java_2023_pra.Numbers;

public class secoLar {
    public static void main(String[] args) {
        int[] Numbers = { 43, 2, 1, 55, 678, 5, 43, 23, 56, 76, 23 };

        int large = Numbers[0];
        int second = Numbers[1];
        for (int x = 0; x < Numbers.length; x++) {
            if (Numbers[x] > large) {
                second = large;

                large = Numbers[x];

            } else if (Numbers[x] > second) {
                second = Numbers[x];
            }
        }
        System.out.println(second);
    }
}
