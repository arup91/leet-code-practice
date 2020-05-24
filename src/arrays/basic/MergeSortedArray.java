package arrays.basic;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[nums1.length];
        int index1 = 0, index2 = 0;
        int arrIndex = 0;
        for (int i = arrIndex; i < arr.length; i++, arrIndex++) {
            if (index1 >= m || index2 >= n) {
                break;
            }
            if (nums1[index1] <= nums2[index2]) {
                arr[i] = nums1[index1];
                index1++;
            } else {
                arr[i] = nums2[index2];
                index2++;
            }
        }
        for (int i = index1; i < m; i++) {
            arr[arrIndex++] = nums1[i];
        }
        for (int i = index2; i < n; i++) {
            arr[arrIndex++] = nums2[i];
        }
        for (int i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
        }
    }

    public static void main(String args[]) {
        int nums1[] = new int[] { 1, 2, 3, 0, 0, 0 };
        int nums2[] = new int[] { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);
        for (int a : nums1) {
            System.out.println(a);
        }
    }
}
