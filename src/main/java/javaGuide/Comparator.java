package javaGuide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Comparator定制排序
 */
public class Comparator {
    public void comparator() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-1, 3, 3, -5, 7, 4, -9, -7));
        System.out.println("原始数组");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println("翻转数组");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("排序数组");
        System.out.println(arrayList);
        // 定制排序的用法
        Collections.sort(arrayList, new java.util.Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制后排名");
        System.out.println(arrayList);
    }
}
