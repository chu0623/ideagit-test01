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
        System.out.println(c+"-"+b+"-"+a);
        System.out.println(c+"-"+b+"-"+a);
        System.out.println(c+"-"+b+"-"+a);
        System.out.println(c+"-"+b+"-"+a);
        System.out.println(c+"-"+b+"-"+a);
        System.out.println(c+"-"+b+"-"+a);
        System.out.println(c+"-"+b+"-"+a);
        System.out.println(c+"-"+b+"-"+a);
        //asdfsadfasdfasdf
        System.out.println("合并练习");
        System.out.println("合并练习二");
        System.out.println("hebinglianxi");
        System.out.println("主分支提交");
    }
}
