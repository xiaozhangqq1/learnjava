package niuke;

//import org.junit.Test;

import java.util.Arrays;

/**
 * 时间复杂度是N+N-1+N-2+...+1是个等差数列
 * 时间复杂度为O(N的平方)
 */
public class Code_00_BubbleSort {
    private static void bubbleSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

//    @Test
    public void testBubbleSort() {
        int[] arr = {1, 9, 7, 4};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // for test
    public static int[] generateRandomArray(int size, int value) {
        // Math.random() -> double [0,1);包含0，不包含1
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random()) - (int) (value * Math.random());
        }
        return arr;
    }

    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
        return res;
    }

}
