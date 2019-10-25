package first;

/**
 * Created by zhangxuelong on 2018/1/5
 */
class A{
    static{
        System.out.println("A");
    }
    public A(){
        System.out.println("1");
    }
}

class B extends A{
    static {
        System.out.println("B");
    }
    public B(){
        System.out.println("2");
    }
}

public class C {
    public static void main(String[] args) {
        B b = new B();
        b = new B();
    }
}
