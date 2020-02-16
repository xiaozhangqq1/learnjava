package cn.principle.openclose;

/**
 * 策略模式拨号器
 */
public class StrategyDialer implements ButtonServer{
    @Override
    public void buttonPressed(int token) {
        System.out.println("拨号器实现了ButtonServer,按下了 "+token);
    }

    public void enterDigit(int digit) {
        System.out.println("enter digit: " + digit);
    }

    public void dial() {
        System.out.println("dialing...");
    }
}
