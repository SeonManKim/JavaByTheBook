package ch07;

public class Outer2 {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println("value : " + value);
            System.out.println("this.value : " + this.value);
            System.out.println("Outer.this.value : " + Outer2.this.value);
        }
    }
}
