package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
//        대입과 연산을 동시에 가능 => 복합대입연산자
        int result = 0;
        result += 10; // result => 10
        System.out.println("result = " + result);
        result -= 5; // result => 5
        System.out.println("result = " + result);
        result *= 3; // result => 15
        System.out.println("result = " + result);
        result /= 5; // result => 3
        System.out.println("result = " + result);
        result %= 3; // result => 0
        System.out.println("result = " + result);
    }
}
