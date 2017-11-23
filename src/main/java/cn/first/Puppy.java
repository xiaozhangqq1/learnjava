package cn.first;

/**
 * Created by zhangxuelong on 2017/11/23
 * java 对象和类
 */
public class Puppy {
    public Puppy(){}
    public Puppy(String name){
        System.out.println("小猫咪" + name);
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("catty");
    }
}
