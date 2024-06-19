package ch06.sec14;

public class Car {
    //필드 선언
    private int speed;
    private boolean stop;

    //speed 필드의 Getter/Setter 선언
//    getter와 setter를 만들어서 사용자가 직접 필드에 접근하지 못하도록 함
//    get과 set을 할때마다 유효성을 검증하여 올바른 값만 처리할 수 있게 됨
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed<0){
            this.speed=0;
            return;
        }else{
            this.speed = speed;
        }
    }

    //stop 필드의 Getter/Setter 선언
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
