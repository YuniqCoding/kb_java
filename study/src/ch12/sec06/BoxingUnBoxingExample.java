package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing (primitive -> wrapper)
        Integer obj = 100;
//        박싱된 래퍼 객체에서 해당 값을 꺼내려면 객체 안에 한번더 접근해야한다
        System.out.println("value: "+obj.intValue());

        // Unboxing (wrapper -> primitive)
        int value = obj;
        System.out.println("value: "+value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result: "+result);
    }
}
