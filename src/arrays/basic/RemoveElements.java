package arrays.basic;

public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                length--;
            }
        }
        return length;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 3, 2, 2, 3 };
        int val = removeElement(arr, 3);
        for (int i = 0; i < val; i++) {
            System.out.println(arr[i]);
        }

    }
}
