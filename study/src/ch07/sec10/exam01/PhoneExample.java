package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
//        추상 클래스는 객체 생성 불가능
//        Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
