package sortByMe;

/**
 * Created by zhangxuelong10 on 2019/9/23.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 9, 7};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                Utils.swap(arr, j, j + 1);
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
