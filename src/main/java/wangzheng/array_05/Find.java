package wangzheng.array_05;

/**
 * 数组中，查找key，返回key的位置
 *
 * @Author zhangxuelong10
 * @create 2019/9/19 10:59
 */
public class Find {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 10, 2, 4};
        System.out.println(find(array, array.length, 4));
    }

    /**
     * @param a   数组
     * @param n   数组长度
     * @param key 关键字
     * @return 关键字位置
     */

    private static int find(int[] a, int n, int key) {
        // 边界条件，如果a为空，或者n <= 0,说明数组中没有数据，就不用while循环比较了
        if (a == null || n <= 0) {
            return -1;
        }

        int i = 0;
        // 这里有两个比较操作，i<n和a[i]==key
        while (i < n) {
            if (a[i] == key) {
                return i;
            }
            ++i;
        }
        return -1;
    }
}
