package cn.principle.openclose;

/**
 * 适配器，不要由Dialer直接实现ButtonServer接口，由该适配器实现ButtonServer接口，在适配器的buttonPressed方法中
 * 调用Dialer的enterDigit方法和dial方法，而Dialer保持不变，Dialer类实现开闭原则
 */
public class DigitButtonDialerAdepter implements ButtonServer {
    Dialer dialer = new Dialer();

    @Override
    public void buttonPressed(int token) {
        dialer.enterDigit(token);
        dialer.dial();
    }
}
