package ch09;

public class Person {
    long id;

    public Person(long id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        if(obj instanceof  Person) {
            return id == ((Person)obj).id;
        } else {
            return false;
        }
    }
}
