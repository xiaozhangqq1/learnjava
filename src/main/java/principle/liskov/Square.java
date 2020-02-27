package principle.liskov;

/**
 * Created by zhangxuelong10 on 2020/2/27.
 *
 * 子类比父类的契约更严格，都是违反里氏替换原则的
 *
 * 如果父类的访问控制是protected，那么子类override这个方法
 * 的时候，可以改成是public，但是不能改为private。
 *
 * 如果不是抽象类或接口，最好不要继承它。
 */

public class Square extends Rectangle {
    public void setWidth(double w) {
        width = height = w;
    }
    public void setHeight(double h) {
        height = width = h;
    }

    private static void testArea(Rectangle rectangle){
        rectangle.setWidth(3);
        rectangle.setHeight(4);
        assert 12 == rectangle.calculateArea();
    }

    public static void main(String[] args) {
        testArea(new Square());
    }

}
