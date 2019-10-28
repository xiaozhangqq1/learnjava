package wangzheng.array_05;

import java.util.Objects;

/**
 * Created by zhangxuelong10 on 2019/10/27.
 * <p>
 * 动态数组
 */
public class GenericArray<T> {
    private T[] data;
    private int size;

    // 根据传入容量，构造Array
    public GenericArray(int capacity) {
        data = (T[]) new Objects[capacity];
        size = 0;
    }

    // 无参构造方法，默认数组容量为10
    public GenericArray() {
        this(10);
    }

    // 获取数组容量
    public int getCapacity() {
        return data.length;
    }

    // 获取当前元素个数
    public int count() {
        return size;
    }

    // 判断数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 修改index元素的位置
    public void set(int index,T e){
        checkIndex(index);;
        data[index] = e;
    }

    // 获取对应index位置的元素
    public T get(int index){
        checkIndex(index);;
        return data[index];
    }

    // 查看数组是否包含元素e
    public boolean contains(T e){
        for(int i = 0;i<size;i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    // 获取对应元素的下标，未找到，返回-1
    public int find(T e){
        for(int i = 0;i<size;i++){
            if (data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    // 在index位置，插入元素e，时间复杂度O(m+n)
    public void add(int index,T e){
        checkIndex(index);
        // 如果当前元素个数等于数组容量，则将数组扩容为原来的2倍

    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed! Require index >= 0 and index <= size.");
        }
    }
}
