package niuke;

/**
 * 第一个数不动，第二个数和第一个比，小的话，换位置
 * 第三个数，和前面的数相比，小的话，换位置，直到前面没数
 * 像扑克牌一样，插入
 * 最好情况，已经排好序O(N)
 * 最差，O(N的平方）
 * 时间复杂度，是最差情况
 * 空间复杂度O(1)
 */
public class Code_01_InsertionSort {
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                Code_00_BubbleSort.swap(arr, j, j + 1);
            }
        }
    }
}
