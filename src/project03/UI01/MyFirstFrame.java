//package project03.UI01;
//
//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//import javax.swing.border.TitledBorder;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.SwingConstants;
//
//public class MyFirstFrame extends JFrame {
//    public static void main(String[] args) {
//        MyFirstFrame frame = new MyFirstFrame();
//        frame.setVisible(true);
//    }
//    public MyFirstFrame(){
//        setTitle("登陆窗口");
//        setBounds(200, 200, 500, 500);
//        getContentPane().setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//
//        final JLabel label = new JLabel("POSSystem");
//        label.setHorizontalAlignment(SwingConstants.CENTER);
//        label.setBounds(106, 31, 262, 66);
//        label.setBorder(new TitledBorder(null, "" , TitledBorder.DEFAULT_JUSTIFICATION,
//                TitledBorder.DEFAULT_JUSTIFICATION, null, null));
//        label.setForeground(new Color(255, 0, 0));
//        label.setFont(new Font("",Font.BOLD,18));
//        getContentPane().add(label);
//
//        final JLabel label2 = new JLabel("用户名");
//        label2.setBounds(58, 122, 60, 15);
//        getContentPane().add(label2);
//        JTextField textField = new JTextField();
//        textField.setBounds(133, 111, 213, 36);
//        getContentPane().add(textField);
//
//        final JLabel label3 = new JLabel("密码");
//        label3.setBounds(58, 192, 60, 15);
//        getContentPane().add(label3);
//        JPasswordField jPasswordField = new JPasswordField();
//        jPasswordField.setBounds(133, 181, 213, 36);
//        getContentPane().add(jPasswordField);
//
//        final JButton button = new JButton("确定");
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed (ActionEvent e) {
//                quding QD = new quding();
//                QD.setVisible(true);
//            }
//        });
//        button.setBounds(106, 294, 83, 36);
//        getContentPane().add(button);
//
//        final JButton button2 = new JButton("取消");
//        button2.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                quxiao QX = new quxiao();
//                QX.setVisible(true);
//            }
//        });
//        button2.setBounds(263, 294, 83, 36);
//        getContentPane().add(button2);
//
//    }
//}
