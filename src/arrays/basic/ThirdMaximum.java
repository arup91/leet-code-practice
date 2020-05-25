package arrays.basic;

import java.util.Arrays;

public class ThirdMaximum {
    public static int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        Arrays.sort(nums);
        int arr[] = new int[3];
        int uniqueIndex = 0;
        arr[uniqueIndex] = nums[nums.length - 1];
        for (int n = nums.length - 2; n >= 0; n--) {
            if (nums[n] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = nums[n];
            }
            if (uniqueIndex == 2) {
                break;
            }
        }
        if (uniqueIndex == 2) {
            return arr[2];
        }
        return arr[0];
    }

    public static void main(String args[]) {
        int heights[] = new int[] { 1, 2, -2147483648 };
        System.out.println(thirdMax(heights));
    }
}
