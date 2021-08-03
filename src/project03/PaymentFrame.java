package project03;

import project03.pay.PayWay;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentFrame extends JFrame{
    POSSystem pos;
    //文本框
    JTextField getMoneyField = new JTextField();

    public static void main(String[] args) {
        PaymentFrame paymentFrame = new PaymentFrame("project03.pay.AliPay",new POSSystem());
        paymentFrame.setVisible(true);
    }

    public PaymentFrame(String payString, POSSystem pos){
        this.pos = pos;
        double saleMoney = pos.curSale.getTotal();
        initial(payString,saleMoney);


        //增加找回
        addThing(saleMoney);
    }


    public void initial(String payString,double saleMoney){
        setTitle("支付窗口");
        setBounds(200, 200, 700, 700);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] ss = payString.split("project03.pay.");


        final JLabel title = new JLabel("正在使用" + ss[1] + "支付");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBounds(176, 31, 262, 66);
        title.setBorder(new TitledBorder(null, "" , TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_JUSTIFICATION, null, null));
        title.setForeground(new Color(255, 0, 0));
        title.setFont(new Font("",Font.BOLD,18));
        this.add(title);

        //按钮
        JButton payButton = new JButton("结束");
        payButton.setBounds(250, 290, 80, 50);
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                pay(payString,saleMoney);
            }
        });
        this.add(payButton);

        JButton endButton = new JButton("结束");
        endButton.setBounds(150, 290, 80, 50);
        endButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                end();
            }
        });
        this.add(endButton);
        //文本
        JLabel label1 = new JLabel("应付金额:" + saleMoney);
        label1.setBounds(30, 90, 80, 50);
        this.add(label1);

        JLabel label2 = new JLabel("实收金额:");
        label2.setBounds(30, 150, 80, 50);
        getMoneyField.setBounds(220, 150, 80, 50);
        this.add(label2);
        this.add(getMoneyField);

        this.setVisible(true);

    }

    //m部分未完成
    //TODO 一部分做一部分的事，支付不应该放在这， 理好思路
    public void addThing(double m){
        //文本
        JLabel label3 = new JLabel("找回:" + m);
        label3.setBounds(30, 210, 80, 50);
        this.add(label3);
    }

    //使用支付方式
    public void pay(String payString,double saleMoney){
        //实收金额
        double getMoney = Double.parseDouble(getMoneyField.getText());
        getMoneyField.setDragEnabled(false);
        pos.makePayment((float)getMoney);
        //支付
        try {
            PayWay payWay = (PayWay)Class.forName(payString).newInstance();
            payWay.payOnline(saleMoney,getMoney);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void end(){
        pos.ef.show();
        //结束订单
        pos.finishASale();
    }
}
