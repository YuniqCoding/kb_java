package ch07.sec07.exam01;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

//        자식타입 객체를 부모타입 변수에 넣을때는 자동 타입 변환이 일어난다
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        상속 관계가 아니기 때문에 컴파일 에러
//        B b3 = e;
//        C c2 = d;
    }
}
