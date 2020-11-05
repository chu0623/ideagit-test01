package cn.kgc.test01;

public class Test {
    public static void main(String[] args) {
        String path=Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath();
        System.out.println(path);
    }
}
