package arrays.basic;

public class CheckIfNAndDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (i != j && 2 * arr[j] == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 3, 1, 7, 11 };
        // int arr[] = new int[] { -2, 0, 10, -19, 4, 6, -8 };
        System.out.println(checkIfExist(arr));
    }
}
