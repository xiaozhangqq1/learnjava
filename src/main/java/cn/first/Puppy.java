package cn.first;

/**
 * Created by zhangxuelong on 2017/11/23
 * java 对象和类
 */

public class Puppy {
    int puppyAge;
    public Puppy(){}

    public Puppy(String name){
        System.out.println("小猫咪" + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("小猫咪的年龄为" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("catty");
        puppy.setAge(2);
        System.out.println("变量值：" + puppy.getAge());
    }

}
