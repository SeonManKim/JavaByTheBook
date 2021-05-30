package ch07;

public class TVCR extends Tv{
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}
