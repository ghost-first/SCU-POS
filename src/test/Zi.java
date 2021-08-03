package test;

public class Zi extends Fu{
    public int j = 3;
    static {
        i = 3;
        System.out.println("Zi静态代码块");
    }
    public static int i = 2;

    {
        System.out.println("Zi构造代码块");
    }

    public Zi(){
        System.out.println("Zi构造方法");
    }

    public void a(){
        try {
            throw new Exception();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("子类的a方法");
    }

    public int getJ() {
        return j;
    }
    public void setJ(int j) {
        this.j = j;
    }

    public static void main(String[] args) {
        Zi a = new Zi();
        System.out.println(a.j);
    }
}