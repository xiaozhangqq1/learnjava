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
    public static double ss;
    public static final String DEPARTMENT = "开发人员";
    public Employee(String name){
        this.name = name;
    }
    public void printEmployee(){
        System.out.println("名字" + name);
        System.out.println("年龄" + age);
        System.out.println("职位" + destination);
        System.out.println("薪水" + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Runoob");
        employee.setSalary(1);
        employee.setAge(1);
        employee.printEmployee();
        ss = 111;
        System.out.println(DEPARTMENT + "平均工资" + ss);
    }
}
