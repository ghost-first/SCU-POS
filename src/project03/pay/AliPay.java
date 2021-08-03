package project03.pay;

public class AliPay implements PayWay {
    @Override
    public void payOnline(double saleMoney,double realMoney) {
        System.out.println("您正在使用支付宝支付");
    }
}
