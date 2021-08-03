package test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Fu {
    public static int i = 10;
    static{
        i = 9;
        System.out.println("Fu静态代码块");
    }
    {
        j = 10;
        System.out.println("Fu构造代码块");
    }
    public Fu(){
        System.out.println("Fu_构造方法");
    }
    public int j = 9;
    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void a(){
        System.out.println("父类的a方法");
    };

    public static void staticMethod(){
        System.out.println("fu");
    }
}