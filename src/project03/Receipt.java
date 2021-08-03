package project03;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Receipt {
    String str;
    static int num = 1;

    public void print(Sale s){
        System.out.println("打印票据。。。");
        transToString(s);
        writeToTxt();
    }
    private void transToString(Sale s)
    {
        //将销售数据按照定制单据样式格式化为为字符串，赋给str
        str = "第" + num + "次订单\n";
        for (SaleLineItem lineItem : s.getLineItems()) {
            str += lineItem.toString() + "\n";
        }
        str += "商品总金额：" + s.getTotal() + "\n顾客支付金额：" + s.pay.getCash()
                + "\n找零：" + s.getBalance();
        System.out.println(str);
    }
    private void writeToTxt(){
        //将 str 写入一个Txt文件中，“写TXT”模拟“写HP打印机”
        try {
            num++;
            PrintStream ps = new PrintStream("C:\\Users\\qwe\\Desktop\\a"+ num + ".txt");
            System.setOut(ps); //把创建的打印输出流赋给系统
            ps.print(str);
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
