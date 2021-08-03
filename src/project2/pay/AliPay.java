package project2.pay;

public class AliPay implements PayWay {
    @Override
    public void payOnline() {
        System.out.println("您正在使用支付宝支付");
    }
}
