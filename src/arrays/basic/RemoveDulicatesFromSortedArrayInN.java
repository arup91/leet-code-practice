package arrays.basic;

public class RemoveDulicatesFromSortedArrayInN {
    public static int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i + 1];
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String args[]) {
         int arr[] = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
       // int arr[] = new int[] { 1, 1, 2 };
        // int arr[] = new int[] { 1, 2 };
        int val = removeDuplicates(arr);
        for (int i = 0; i < val; i++) {
            System.out.println(arr[i]);
        }

    }
}
