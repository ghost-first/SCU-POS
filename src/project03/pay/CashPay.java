package project03.pay;

public class CashPay implements PayWay {
    @Override
    public void payOnline(double saleMoney,double realMoney) {
        System.out.println("您正在使用现金支付");
    }
}
