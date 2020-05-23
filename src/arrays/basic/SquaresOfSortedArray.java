package arrays.basic;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] A) {
        int sortedArray[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            sortedArray[i] = A[i] * A[i];
        }

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String args[]) {
        int nums[] = new int[] { -4, -1, 0, 3, 10 };
        for (int num : sortedSquares(nums)) {
            System.out.println(num);
        }
    }
}
