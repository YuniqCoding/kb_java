package ch08.sec04;

public interface RemoteControl {
    //상수 필드
    //인터페이스에서의 필드는 자동으로 상수 처리된다(static final 생략)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
