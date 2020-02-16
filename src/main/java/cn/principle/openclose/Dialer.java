package cn.principle.openclose;

/**
 * 拨号器
 */
public class Dialer {
    public void enterDigit(int digit) {
        System.out.println("enter digit: " + digit);
    }

    public void dial() {
        System.out.println("dialing...");
    }
}
