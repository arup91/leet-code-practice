package arrays.basic;

public class MountainArray {
    public static boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        boolean decreasing = false;
        int num = A[0];
        if (num > A[1]) {
            return false;
        }
        for (int i = 1; i < A.length - 1; i++) {
            if (decreasing && A[i] < A[i + 1]) {
                return false;
            }
            if (A[i] == A[i + 1]) {
                return false;
            }
            if (A[i] > A[i + 1]) {
                decreasing = true;
            }
            if (!decreasing && A[i] < num) {
                return false;
            }
            num = A[i];
        }
        if (!decreasing)
            return false;
        return true;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 3, 5, 5 };
        // int arr[] = new int[] { -2, 0, 10, -19, 4, 6, -8 };
        System.out.println(validMountainArray(arr));
    }
}
