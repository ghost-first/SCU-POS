package project03;

import project03.pay.PayWay;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        POSSystem pos = new POSSystem();
        Scanner sc= new Scanner(System.in);


        //加载菜单
        pos.startUp();
        //可以从这+循环
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

        //付款
        System.out.println("请输入顾客付款金额：");
        float cash = sc.nextInt();

        try {
            PayWay payWay = (PayWay)Class.forName(paySelection).newInstance();
            payWay.payOnline(pos.curSale.getTotal(),cash);
        } catch (Exception e) {
            e.printStackTrace();
        }



        pos.makePayment(cash);
        pos.ef.show();

        //结束订单
        pos.finishASale();
    }
}
