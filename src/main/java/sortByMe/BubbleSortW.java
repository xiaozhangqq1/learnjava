package sortByMe;

/**
 * 冒泡排序
 * <p>
 * Created by zhangxuelong10 on 2019/9/24.
 */
public class BubbleSortW {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 7};
        bubbleSort(arr, 5);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * @param a 数组
     * @param n 数组大小
     */
    private static void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    Utils.swap(a, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
