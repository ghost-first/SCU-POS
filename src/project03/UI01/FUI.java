package project03.UI01;

import project03.UI01.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FUI extends JFrame {

    //按钮
    JButton btnlong = new JButton("登录");
    JButton btnreset = new JButton("重置");
    //文本
    JLabel usertext = new JLabel("账号:");
    JLabel passtext = new JLabel("密码:");

    //文本框
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();

    public FUI() {
        //设置布局自定义布局
        this.setLayout(null);
        //设置窗口大小
        this.setSize(500, 300);

        //设置原件的位置和大小
        usertext.setBounds(15, 10, 50, 50);
        username.setBounds(50, 20, 150, 30);

        passtext.setBounds(15, 68, 50, 50);
        password.setBounds(50, 75, 150, 30);

        btnlong.setBounds(30, 150, 100, 50);
        btnreset.setBounds(150, 150, 100, 50);

        //讲原件添加到当前窗口当中
        this.add(btnlong);
        this.add(btnreset);

        this.add(usertext);
        this.add(passtext);

        this.add(username);
        this.add(password);

        this.setVisible(true);

        btnlong.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                checklogin();
            }
        });


        btnreset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                textclearn();

            }
        });



    }

    public void checklogin(){

        String usern = username.getText();
        String passw = password.getText();

        if(usern.equals("") && passw.equals("") ){

            JOptionPane.showMessageDialog(this, "用户名密码不正确");

        }
        //设置当前窗口为不显示
        this.setVisible(false);

        //打开另外一个窗口
        MainFrame mainFrame = new MainFrame();
    }

    public void textclearn(){

        //清空对应文本框的内容
        username.setText("");
        password.setText("");

    }

}
