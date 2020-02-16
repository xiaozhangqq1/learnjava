package javaGuide;

public class Alipay implements Payment{
    private RealPayment payment;
    public Alipay(RealPayment payment){
        this.payment = payment;
    }
    public void beforePay(){
        System.out.println("从招行取款");
    }
    @Override
    public void pay(){
        beforePay();
        payment.pay();
        afterPay();
    }
    public void afterPay(){
        System.out.println("支付给慕课网");
    }
}
