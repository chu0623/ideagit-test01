package cn.kgc.test01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");
        a(1,2,3);
    }

    public static void a(Integer a,Integer b,Integer c){
        b(a,b,c);
    }

    public static void b(Integer b,Integer c,Integer a){
        System.out.println(c+"-"+b+"-"+a);
    }
}
