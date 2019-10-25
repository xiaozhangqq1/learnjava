package algorithm.sort;

public class Shell<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;//1,4,13,40
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(nums[j], nums[j - 1]); j--) {
                    swap(nums, j, j - 1);
                }
            }
            h = h / 3;
        }
    }
}
