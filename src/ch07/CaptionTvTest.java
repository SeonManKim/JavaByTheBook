package ch07;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);

        ctv.displayCaption("hello, world");
        ctv.caption = true;
        ctv.displayCaption("hello, world");

    }
}
