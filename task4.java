public class task4 {
    public static void main(String[] args) {
        int[] nums = new int[]{13, 5, 4, 22, 8, 74};

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Max. number from array:" + max);

        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Min. number from array:" + min);
    }
}
