package offer;

import java.util.Random;

/**
 * 用于随机打乱一组数，并且时间复杂度为O(N)
 */
public class Shuffle {
    public static void shuffle(int[] nums) {
        Random random = new Random();
        for (int i = nums.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            swap(nums, i, j);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
