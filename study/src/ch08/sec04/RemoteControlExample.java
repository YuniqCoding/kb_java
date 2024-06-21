package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        //rc 변수에 Television 객체를 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        //rc 변수에 Audio 객체를 대입(교체)
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(7);
        rc.turnOff();
    }
}
