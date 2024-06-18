package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value=123;
//        souf : printf 단축키
//        printf : 포맷을 적용하여 프린트 가능
        System.out.printf("상품의 가격:%d\n", value);
        System.out.printf("상품의 가격:%6d\n", value);
        System.out.printf("상품의 가격:%-6d\n", value);
        System.out.printf("상품의 가격:%06d\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}
