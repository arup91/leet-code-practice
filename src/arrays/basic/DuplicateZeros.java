package arrays.basic;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = new int[] { 0, 0, 0 };
        duplicateZeros(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
