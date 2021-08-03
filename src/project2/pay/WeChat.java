package project2.pay;

public class WeChat implements PayWay {
    @Override
    public void payOnline() {
        System.out.println("您正在使用微信支付");
    }
}
