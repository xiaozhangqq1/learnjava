package cn.principle.openclose;

/**
 * 观察者模式，本质上和ButtonServer一致
 */
public interface ButtonListener {
    void buttonPressed(int token);
}
