package ch07;

public class BBB implements II{
    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }

    public String toString() {
        return "class B";
    }
}
