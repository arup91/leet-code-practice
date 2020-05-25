package arrays.basic;

public class ReplaceElementWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (max > arr[j]) {
                    arr[j] = max;
                }
                arr[i] = -1;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 17, 18, 5, 4, 6, 1 };
        for (int a : replaceElements(arr)) {
            System.out.print(a + " ");
        }
    }
}
