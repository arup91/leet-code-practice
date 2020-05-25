package arrays.basic;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1] = nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String args[]) {
        int heights[] = new int[] { 1, 1, 4, 2, 1, 3 };
        // 4,3,2,7,8,2,3,1
        System.out.println(findDisappearedNumbers(heights));
    }
}
