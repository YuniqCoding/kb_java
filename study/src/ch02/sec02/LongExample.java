package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1=10;
        long var2=20L;
//        long var3=1000000000000; int를 넘는 큰 값을 직접 long으로 할당하려고 하면 에러
        long var4=1000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
