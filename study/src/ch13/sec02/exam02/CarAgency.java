package ch13.sec02.exam02;

//인터페이스의 P가 Car로 전부 대체됨
public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
