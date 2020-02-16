package algorithm;

import java.util.Arrays;

/**
 * 将数组进行排序，对两个元素求和，并用二分查找方法查找是否存在该和的相反数，
 * 如果存在，说明存在和为0的三元组
 * <p>
 * 只有数组不含相同元素才能使用这种解法，否则二分查找的结果会出错
 * <p>
 * 该方法可以将 ThreeSum 算法增长数量级降低为 O(N2logN)。
 */
public class ThreeSumBinarySearch implements ThreeSum {
    @Override
    public int count(int[] nums) {
        Arrays.sort(nums);
        int N = nums.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int target = -nums[i] - nums[j];
                int index = BinarySearch.search(nums, target);
                // 应该注意这里的下标必须大于j,否则会重复统计
                if (index > j) {
                    cnt++;
                }
            }

        }
        return cnt;
    }
}
