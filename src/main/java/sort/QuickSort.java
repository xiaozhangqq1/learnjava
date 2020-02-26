package sort;

import java.util.Arrays;

/**
 * Created by zhangxuelong10 on 2020/2/25.
 */
public class QuickSort {
    private static void quick_sort(int[] arr, int n) {
        quick_sort_c(arr, 0, n - 1);
    }

    private static void quick_sort_c(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(arr, p, r); // 获取分区点

        quick_sort_c(arr, p, q - 1);
        quick_sort_c(arr, q + 1, r);
    }

    // 获取分区点
    private static int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (arr[j] < pivot) {
//                if (i == j) {
//                    ++i;
//                } else {
//                    int tmp = arr[i];
//                    arr[i++] = arr[j];
//                    arr[j] = tmp;
//                }
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }
        int tmp = arr[i];
        arr[i] = arr[r];
        arr[r] = tmp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 5, 7, 8, 11, 9};
        quick_sort(arr, 8);
        System.out.println(Arrays.toString(arr));
    }
}
