package arrays.basic;

public class EvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int evenDigitNumberedCount = 0;
        for (int num : nums) {
            if (findEvenDigits(num)) {
                evenDigitNumberedCount++;
            }
        }
        return evenDigitNumberedCount;
    }

    public static boolean findEvenDigits(int num) {
        int noOfDigits = 0;
        while (num != 0) {
            num = num / 10;
            noOfDigits++;
        }
        if (noOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = new int[] { 12, 245, 5687, 100, 9, 2404 };
        System.out.println(findNumbers(nums));
    }
}
