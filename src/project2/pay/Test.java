package project2.pay;

import java.lang.reflect.Method;

/**
 * 反射
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String str = "reflect.test01.WeChat"; //前台交互得到路径
        String str1 = "reflect.test01.AliPay";

        Class cls = Class.forName(str1); //获取类的字节码
        Object o = cls.newInstance(); //创建实例
        Method method = cls.getMethod("payOnline");
        method.invoke(o);

    }

    public static void pay(PayWay m){
        m.payOnline(); //策略模式
    }
}
