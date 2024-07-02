package ch13.sec02.exam02;

public interface Rentable<P> {
//    무조건 인터페이스에 넣어준 타입을 리턴해줘야 하는 메소드
    P rent();
}
