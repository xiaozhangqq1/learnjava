package niuke;

//import org.junit.Test;

import java.util.Arrays;

public class code_03_MergeSort {
    private static void sortProcess(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);// 右移一位，相当于L+(R-L)/2
        sortProcess(arr, L, mid);
        sortProcess(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    private static void merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 两个必有且只有一个越界
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    // 5 3 4 6 | 7 2 9 3
    // 5 3 | 4 6
    // 5 | 3
    // 3 | 5
    // 4 6 同理
    // 7 2 3 9 同理

//    @Test
    public void test() {
        int[] arr = {5, 3, 4, 6};
        sortProcess(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }
}
