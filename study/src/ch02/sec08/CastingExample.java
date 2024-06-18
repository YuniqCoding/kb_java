package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        int var1=10;
//        큰 값을 작은 값에 넣을 때는 명시적으로 형변환을 해줘야 한다 (캐스팅)
//        작은 값을 큰 값에 넣을 때는 자동으로 형변환이 된다
        byte var2=(byte)var1;
        System.out.println(var2);

        long var3=300;
        int var4=(int)var3;
        System.out.println(var4);

        int var5=65;
        char var6=(char)var5;
        System.out.println(var6);

//        실수를 정수에 넣을 경우 소수점 이하 값은 버려진다
        double var7=3.14;
        int var8=(int)var7;
        System.out.println(var8);
    }
}
