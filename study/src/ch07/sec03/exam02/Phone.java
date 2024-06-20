package ch07.sec03.exam02;

// 부모 클래스
public class Phone {
    //필드 선언
    public String model;
    public String color;

    //매개변수를 갖는 생성자로 변경
    public Phone(String model, String color){
//        부모의 필드를 초기화하는 코드기 때문에 부모클래스에 넣어주는 것이 좋다
        this.model=model;
        this.color=color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }

    //메소드 선언
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    public void sendVoice(String message){
        System.out.println("자기: "+message);
    }
    public void receiveVoice(String message){
        System.out.println("상대방: "+message);
    }
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
