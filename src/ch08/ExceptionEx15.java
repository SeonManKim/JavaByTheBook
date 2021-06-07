package ch08;

import java.io.File;

public class ExceptionEx15 {
    public static void main(String[] args) {
        args = new String[1];
        args[0] = null;
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일이름이 유효하지 않습니다.");
            }
        }catch (Exception e) {
            fileName = "제목없음.txt";
        }finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) {

        }
    }
}
