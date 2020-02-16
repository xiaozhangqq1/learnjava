package cn.principle.openclose;

/**
 * 策略模式实现开闭原则
 *
 * 在Button和Dialer之间增加了一个抽象接口ButtonServer，Button依赖ButtonServer,而Dialer实现ButtonServer
 */
public interface ButtonServer {
    void buttonPressed(int token);
}
