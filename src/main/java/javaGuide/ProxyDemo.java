package javaGuide;

public class ProxyDemo {
    public static void main(String[] args) {
        Payment proxy = new Alipay(new RealPayment());
        proxy.pay();
    }
}
