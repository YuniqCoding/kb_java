package ch07.sec02;

// Phone 클래스의 자식 클래스
public class SmartPhone extends Phone{
    //필드 선언
    public boolean wifi;

    //생성자 선언
    public SmartPhone(String model, String color){
//        부모 클래스에서 model, color 필드를 상속받음
        this.model=model;
        this.color=color;
    }

    //메소드 선언
    public void setWifi(boolean wifi){
        this.wifi=wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
