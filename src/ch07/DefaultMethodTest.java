package ch07;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}
