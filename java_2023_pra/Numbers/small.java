package java_2023_pra.Numbers;

public class small {
    public static void main(String[] args) {
        int[] nums = { 120, 45, 32, 17, 90, 555, };
        int little = nums[0];
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] < little) {
                little = nums[x];
            }

        }
        System.out.println(little);
    }
}
