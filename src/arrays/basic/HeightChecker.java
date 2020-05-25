package arrays.basic;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int sorted[] = new int[heights.length];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);
        int steps = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                steps++;
            }
        }
        return steps;
    }

    public static void main(String args[]) {
        int heights[] = new int[] { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(heights));
    }
}
