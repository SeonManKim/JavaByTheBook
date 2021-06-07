package ch09;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(801108L);
        Person p2 = new Person(801108L);

        if(p1 == p2) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }

        if(p1.equals(p2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }
    }
}
