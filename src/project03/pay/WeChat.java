package project03.pay;

public class WeChat implements PayWay {
    @Override
    public void payOnline(double saleMoney,double realMoney) {
        System.out.println("您正在使用微信支付");
    }
}
