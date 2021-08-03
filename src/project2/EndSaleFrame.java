package project2;

public class EndSaleFrame {
    float sum,balance;

    private final static EndSaleFrame instance = new EndSaleFrame();

    private EndSaleFrame(){}

    public static EndSaleFrame getInstance(){
        return instance;
    }

    public void setCurSaleTotal(float sum){
        this.sum = sum;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }
    public void show(){
        System.out.println("---------------------------");
        System.out.println("结算界面");
        System.out.println("商品总金额：" + sum + "\n找零：" + balance);
    }
}
