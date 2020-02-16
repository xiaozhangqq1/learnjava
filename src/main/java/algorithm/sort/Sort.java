package algorithm.sort;

/**
 * 约定，使用辅助函数less()和swap()来进行比较和交换的操作
 * 使代码的可读性和可移植性更好
 * @param <T>
 */
public abstract class Sort<T extends Comparable<T>> {
    public abstract void sort(T[] nums);

    protected boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
