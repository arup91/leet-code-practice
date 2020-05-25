package arrays.basic;

import java.util.Arrays;

public class SquaresOfSortedArrayInPlace {
    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String args[]) {
        int nums[] = new int[] { -4, -1, 0, 3, 10 };
        for (int num : sortedSquares(nums)) {
            System.out.println(num);
        }
    }
}
