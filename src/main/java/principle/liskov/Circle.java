package principle.liskov;

/**
 * Created by zhangxuelong10 on 2020/2/27.
 *
 * 符合里氏替换原则和开闭原则
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    private static void drawShape(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.draw();

        drawShape(new Circle());
    }

}
