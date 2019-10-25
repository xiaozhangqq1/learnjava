package algorithm;

public class TestCmp {
    public static void insertSort(int[] a, IntCompare cmp) {
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                int temp = a[i], j = i;
                if (cmp.compare(a[j - 1], temp) == 1) {
                    while (j >= 1 && cmp.compare(a[j - 1], temp) == 1) {
                        a[j] = a[j - 1];
                        j--;
                    }
                }
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 19, 40, 7, 1};
        insertSort(arr1, new Cmp1());
        System.out.println("升序排列");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();
    }
}
