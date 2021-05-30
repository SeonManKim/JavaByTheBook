package ch07;

public class Child2 extends Parent2 implements MyInterface, MyInterface2{
    @Override
    public void method1() {
        System.out.println("method1() in child");
    }
}
