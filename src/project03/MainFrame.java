package project03;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MainFrame extends JFrame{

    //按钮
    JButton addButton = new JButton("添加");
    JButton aliPayButton = new JButton("支付宝付款");
    JButton weChatButton = new JButton("微信付款");
    //文本
    JLabel IDLabel = new JLabel("商品ID:");
    JLabel quaLabel = new JLabel("数量:");

    //文本框
    JTextField IDField = new JTextField();
    JTextField quaField = new JTextField();

    // 表头（列名）
    String[] columnNames = {"商品ID", "数量"};
    // 表格所有行数据
    Object[][] rowData = new Object[20][20];
    int num = 0;
    // 创建一个表格，指定 所有行数据 和 表头
    JTable table = new JTable(rowData, columnNames);
    //加载POSSystem
    POSSystem pos = new POSSystem();

    public static void main(String[] args) {
        MainFrame  mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }

    public MainFrame(){
        initial();
        //加载菜单
        pos.startUp();
        //可以从这+循环
        //开始新的销售
        pos.makeNewSale();

    }

    public void initial(){
        setTitle("销售窗口");
        setBounds(200, 200, 700, 700);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        IDLabel.setBounds(15, 10, 50, 50);
        IDField.setBounds(65, 20, 75, 30);

        quaLabel.setBounds(150, 10, 50, 50);
        quaField.setBounds(185, 20, 75, 30);
        addButton.setBounds(300, 20, 60, 30);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                pos.enterItem(IDField.getText(),Integer.parseInt(quaField.getText()));
                flushTable(IDField.getText(),quaField.getText());
            }
        });

        aliPayButton.setBounds(450, 20, 120, 30);
        aliPayButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                String s = "project03.pay.AliPay";
                linkToPayment(s);
            }
        });

        weChatButton.setBounds(450, 60, 120, 30);
        weChatButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                String s = "project03.pay.WeChat";
                linkToPayment(s);
            }
        });



        this.add(IDLabel);
        this.add(IDField);
        this.add(quaLabel);
        this.add(quaField);
        this.add(addButton);
        this.add(aliPayButton);
        this.add(weChatButton);


        // 将表格加入到滚动条组件中
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(15,90,400,400);
        this.getContentPane().add(scrollPane);
        this.setVisible(true);
    }

    public void linkToPayment(String s){
        pos.endPurchase();
        PaymentFrame paymentFrame = new PaymentFrame(s,pos);
    }

    //刷新GUI中的表格
    public void flushTable(String ID,String qua){
        Object[] o = {ID,qua};
        rowData[num] = o;
        num++;
        DefaultTableModel defaultTableModel = new DefaultTableModel(rowData, columnNames);

        table = new JTable(defaultTableModel);
        defaultTableModel.getDataVector().clear();

        defaultTableModel.setDataVector(rowData, columnNames);

        table.updateUI();
        // 将表格加入到滚动条组件中
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(15,90,400,400);
        this.getContentPane().add(scrollPane);
    }




}
