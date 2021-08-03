package test;

public class Interview {
    public static void main(String[] args) {
        String hello="Hello",lo = "lo";
        String world = new String("aaa");

        System.out.println(hello=="Hello");
        System.out.println(Other.hello==hello);
        System.out.println(other.Other.hello==hello);
        System.out.println(hello==("Hel"+lo));
        System.out.println(hello==("Hel"+"lo"));
        System.out.println(world.intern()=="aaa");
    }
}

class Other{
    static String hello = "Hello";
}
