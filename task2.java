public class task2 {
    public static void main(String[] args) {
        int[] nums = new int[]{13, 5, 4, 22, 8, 74, 7};

        int trigger = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 2; j < 10; j++) {
                if (nums[i] % j == 0 && j != nums[i]) {
                    trigger++;
                }
            }
            if (trigger == 0) {
                System.out.println(nums[i]);
            }
            trigger = 0;
        }
    }
}
