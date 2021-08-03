//package project03.UI01;
//
//import java.awt.Color;
//import java.awt.Font;
//
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.border.TitledBorder;
//
//public class quding extends JFrame {
//
//
//    public static void main(String[] args) {
//
//        MyFirstFrame frame = new MyFirstFrame();
//        frame.setVisible(true);
//    }
//    public quding(){
//        setTitle("恭喜通过 ");
//        setBounds(500, 500, 500, 500);
//        getContentPane().setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        final JLabel label = new JLabel("hhhh");
//        label.setBounds(98, 127, 295, 156);
//        label.setBorder(new TitledBorder(null, "" , TitledBorder.DEFAULT_JUSTIFICATION,
//                TitledBorder.DEFAULT_JUSTIFICATION, null, null));
//        label.setForeground(new Color(0, 0, 255));
//        label.setFont(new Font("微软雅黑 Light", Font.BOLD, 26));
//        getContentPane().add(label);
//    }
//
//}