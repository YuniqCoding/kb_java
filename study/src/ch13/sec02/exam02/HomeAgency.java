package ch13.sec02.exam02;

//인터페이스의 P가 Home으로 전부 대체됨
public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home();
    }
}

