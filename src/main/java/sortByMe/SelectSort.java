package sortByMe;

/**
 * 选择排序
 * 2019.7.24自己写，耗时40分钟
 */
public class SelectSort {

    private static void selectSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    minIndex = j;
                    Utils.swap(arr, i, minIndex);
                }
            }
        }
        for (Integer i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        selectSort(new int[]{4, 8/*, 6, 3, 1, 9*/});
    }
}
