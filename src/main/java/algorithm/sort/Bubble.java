package algorithm.sort;

/**
 * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
 * <p>
 * 在一轮循环中，如果没有发生交换，那么说明数组已经是有序的，此时可以直接退出。
 *
 * @param <T>
 */
public class Bubble<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        System.out.println("before sort ");
        for (T t : nums) {
            System.out.print(t);
        }
        int N = nums.length;
        boolean isSorted = false;
        for (int i = N - 1; i > 0 && !isSorted; i--) {
            isSorted = true;
            for (int j = 0; j < i; j++) {
                if (less(nums[j + 1], nums[j])) {
                    isSorted = false;
                    swap(nums, j, j + 1);
                }
            }
        }
        System.out.println("after sort ");
        for (T t : nums) {
            System.out.print(t);
        }
    }

    public static void main(String[] args) {
        int i = 4;
        boolean isSorted = false;
        System.out.println(i > 0 && !isSorted);
    }

}
