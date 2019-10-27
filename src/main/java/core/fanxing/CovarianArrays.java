package core.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangxuelong10 on 2019/10/10.
 */
class Fruit {
}

class Apple extends Fruit {
}

class Jonathan extends Apple {
}

class Orange extends Fruit {
}

public class CovarianArrays {
    public static void main(String[] args) {
  // 上界
        List<? extends Fruit> flistTop = new ArrayList<>();
        flistTop.add(null);
        // add Fruite对象会报错
//        flistTop.add(new Fruit());
        Fruit fruit1 = flistTop.get(0);

    // 下界
    List<? super  Apple> flistBottem = new ArrayList<>();
    flistBottem.add(new Apple());
    flistBottem.add(new Jonathan());
    // get Apple对象会报错
//        Apple apple = flistBottem.get(0);

    }

}
