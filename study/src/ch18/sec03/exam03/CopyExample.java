package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception{
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

        try(InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);) {
            byte[] data = new byte[1024];
            while(true){
//                최대 배열의 크기인 1024바이트 읽기
                int num = is.read(data);
                if(num == -1) break;
//                num만큼 데이터 파일 쓰기
                os.write(data, 0, num);
            }
//            내부 버퍼에 있는 바이트 출력하고 비우기
            os.flush();
            System.out.println("복사가 잘 되었습니다.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
