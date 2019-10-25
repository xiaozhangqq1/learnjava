package niuke;

import static niuke.Code_00_BubbleSort.swap;

public class Code_03_HeapSort {
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 得到大根堆，可能无序
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
    }

    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
        }
    }
}
