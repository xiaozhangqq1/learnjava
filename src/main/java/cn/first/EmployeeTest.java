package cn.first;

/**
 * Created by zhangxuelong on 2017/11/23
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");
        empOne.setAge(26);
        empOne.setDestination("回家吃饭了");
        empOne.setSalary(1000);
        empOne.printEmployee();
        empTwo.setSalary(500);
    }
}
