package ch07;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    String getXY() {
        return "(" + x + ", " + y + ")";
    }
}
