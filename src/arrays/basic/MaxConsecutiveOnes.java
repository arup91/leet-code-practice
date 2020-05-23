package arrays.basic;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes = 0;
        int maxConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutiveOnes++;
            }
            if (maxConsecutiveOnes < consecutiveOnes) {
                maxConsecutiveOnes = consecutiveOnes;
            }
            if (nums[i] == 0) {
                consecutiveOnes = 0;
            }
        }
        return maxConsecutiveOnes;
    }

    public static void main(String args[]) {
        int nums[] = new int[] { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
