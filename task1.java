public class task1 {
    public task1() {
    }

    public static void main(String[] args) {
        int[] nums = new int[]{13, 5, 4, 22, 8, 74};
        System.out.print("Odd numbers:");

        int i;
        for(i = 0; i < nums.length; ++i) {
            if (nums[i] % 2 != 0) {
                System.out.print(nums[i] + " ");
            }
        }

        System.out.print("\nNot odd numbers:");

        for(i = 0; i < nums.length; ++i) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }

    }
}