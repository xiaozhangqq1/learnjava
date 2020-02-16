package cn.principle.openclose;

/**
 * 代码和dialer一致
 */
public class ObserveDialer {
    public void enterDigit(int digit) {
        System.out.println("enter digit: " + digit);
    }

    public void dial() {
        System.out.println("dialing...");
    }
}
