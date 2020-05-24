package arrays.basic;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int number = nums[i];
            int count = 0;
            for (int j = i + 1; j < length; j++) {
                if (nums[j] != number) {
                    break;
                }
                count++;
            }

            for (int k = i + 1, z = i + count + 1; k < length && z < length; k++, z++) {
                nums[k] = nums[z];
            }
            if (i + count <= length) {
                length = length - count + 1;
            }
            length--;
        }
        return length;
    }

    public static void main(String args[]) {
        // int arr[] = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
         int arr[] = new int[] { 1, 1, 2 };
        //int arr[] = new int[] { 1, 2 };
        int val = removeDuplicates(arr);
        for (int i = 0; i < val; i++) {
            System.out.println(arr[i]);
        }

    }
}
