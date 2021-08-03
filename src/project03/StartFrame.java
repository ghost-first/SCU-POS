package project03;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartFrame extends JFrame {
    //文本框
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();

    public static void main(String[] args) {
        StartFrame frame = new StartFrame();
        frame.setVisible(true);
    }
    public StartFrame(){
        setTitle("登陆窗口");
        setBounds(200, 200, 500, 500);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        final JLabel label = new JLabel("POSSystem");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(106, 31, 262, 66);
        label.setBorder(new TitledBorder(null, "" , TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_JUSTIFICATION, null, null));
        label.setForeground(new Color(255, 0, 0));
        label.setFont(new Font("",Font.BOLD,18));
        getContentPane().add(label);

        final JLabel label2 = new JLabel("用户名");
        label2.setBounds(58, 122, 60, 15);
        getContentPane().add(label2);

        username.setBounds(133, 111, 213, 36);
        getContentPane().add(username);

        final JLabel label3 = new JLabel("密码");
        label3.setBounds(58, 192, 60, 15);
        getContentPane().add(label3);

        password.setBounds(133, 181, 213, 36);
        getContentPane().add(password);

        final JButton button = new JButton("确定");
        button.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                checkLogin();
            }
        });
        button.setBounds(106, 294, 83, 36);
        getContentPane().add(button);

        final JButton button2 = new JButton("重置");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textClean();
            }
        });
        button2.setBounds(263, 294, 83, 36);
        getContentPane().add(button2);

    }

    public void checkLogin(){

        String usern = username.getText();
        String passw = password.getText();

        if(usern.equals("admin") && passw.equals("123") ){
            //设置当前窗口为不显示
            this.setVisible(false);

            //TODO 打开另外一个窗口
        MainFrame mainFrame = new MainFrame();
        }else {
            JOptionPane.showMessageDialog(this, "用户名密码不正确");
        }

    }

    public void textClean(){

        //清空对应文本框的内容
        username.setText("");
        password.setText("");

    }
}
