package arrays.basic;

public class SortByParity {
    public static int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;
        if (A.length < 2) {
            return A;
        }
        while (left <= right) {
            if (A[left] % 2 != 0 && A[right] % 2 == 0) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            } else if (A[left] % 2 == 0 && A[right] % 2 == 0) {
                left++;
            } else if (A[left] % 2 == 0 && A[right] % 2 != 0) {
                left++;
                right--;
            } else if (A[left] % 2 != 0 && A[right] % 2 != 0) {
                right--;
            }
        }
        return A;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 0, 1 };
        for (int i : sortArrayByParity(arr)) {
            System.out.println(i);
        }
    }
}
