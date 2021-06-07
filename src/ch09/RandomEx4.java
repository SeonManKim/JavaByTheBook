package ch09;

public class RandomEx4 {
    final static int RECORD_NUM = 10;
    final static String TABLE_NAME = "TEST_TABLE";
    final static String[] CORD1 = {"010", "011", "017", "018", "019"};
    final static String[] CORD2 = {"남자", "여자"};
    final static String[] CORD3 = {"10대", "20대", "30대", "40대", "50대"};

    public static void main(String[] args) {
        for (int i = 0; i < RECORD_NUM; i++) {
            System.out.println(" INSERT INTO " + TABLE_NAME + " VALUES ("
                    + " '" + getRandArr(CORD1) + "'"
                    + ", '" + getRandArr(CORD2) + "'"
                    + ", '" + getRandArr(CORD3) + "'"
                    + ", " + getRand(100, 200)
                    + ");");
        }
    }

    public static String getRandArr(String[] arr) {
        return arr[getRand(arr.length-1)];
    }

    public static int getRand(int n) {
        return getRand(0, n);
    }

    public static int getRand(int from, int to) {
        return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
    }
}
