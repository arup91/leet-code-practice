package arrays.basic;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int uniqueIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        for (int i = uniqueIndex + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 0, 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
