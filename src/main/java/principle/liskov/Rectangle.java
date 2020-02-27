package principle.liskov;

/**
 * Created by zhangxuelong10 on 2020/2/27.
 *
 */
public class Rectangle {
    double width;
    double height;

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }
}
