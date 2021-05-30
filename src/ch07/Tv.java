package ch07;

public class Tv extends Product{
    boolean power;
    int channel;

    public Tv(){
        super(100);
    }

    public String toString() {
        return "Tv";
    }

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
