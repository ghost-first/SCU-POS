package project2;

import project2.pay.PayWay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        POSSystem pos;

        //可以从这+循环
        pos = new POSSystem();
        //加载菜单
        pos.startUp();

        //开始新的销售
        pos.makeNewSale();

        while(!pos.curSale.isComplete) {
            System.out.println("请输入商品ID：");
            String ID = sc.next();
            System.out.println("请输入商品数量：");
            int quantity = sc.nextInt();
//            System.out.println("验证--" + ID + "---" + quantity);
            pos.enterItem(ID, quantity);
            System.out.println("继续--1，付款--2");
            if (sc.next().equals("2")) {
                pos.endPurchase();
            }
        }


        //选择付款方式 反射 OCP原则 TODO 什么模式？

        //前端每个选项设置按钮，点击按钮返回对应名字
        System.out.println("请选择付款方式：1.支付宝 2.微信");
        String paySelection = sc.next();
        if (paySelection.equals("1")){
            paySelection = "project2.pay.AliPay";
        }else {
            paySelection = "project2.pay.WeChat";
        }

        try {
            PayWay payWay = (PayWay)Class.forName(paySelection).newInstance();
            payWay.payOnline();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //付款
        System.out.println("请输入顾客付款金额：");
        float cash = sc.nextInt();
        pos.makePayment(cash);
        pos.ef.show();

        //结束订单
        pos.finishASale();
    }
}
