package niuke;

/**
 * 测试递归
 */
public class TestDigui {
    // L和R是位置
    public static int getMax(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int mid = (L + R) / 2;//或 L+((R-L)/2)
        int maxLeft = getMax(arr, L, mid);
        int maxRight = getMax(arr, mid + 1, R);
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 0};
        int max = getMax(arr, 0, arr.length - 1);
        System.out.println(max);
    }
}
