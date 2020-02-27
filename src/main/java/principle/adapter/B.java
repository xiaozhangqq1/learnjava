package principle.adapter;

/**
 * Created by zhangxuelong10 on 2020/2/27.
 *
 * 适配器模式，类B需要使用类A的方法，不去继承类A，而实去组合类A，也能达到
 * 使用类A的效果。
 */
public class B {
    private A a;

    public Element select(int id) {
        a.query(id);
        return null;
    }

    public void modify(Element e) {
        a.modify(e);
    }
}
