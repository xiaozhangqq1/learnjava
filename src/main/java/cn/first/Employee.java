package cn.first;

import lombok.Data;

/**
 * Created by zhangxuelong on 2017/11/23
 */
@Data
public class Employee {
    String name;
    int age;
    String destination;
    double salary;
    public Employee(String name){
        this.name = name;
    }
    public void printEmployee(){
        System.out.println("名字" + name);
        System.out.println("年龄" + age);
        System.out.println("职位" + destination);
        System.out.println("薪水" + salary);
    }
}
