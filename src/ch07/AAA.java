package ch07;

public class AAA {
    void methodA() {
        II i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}
