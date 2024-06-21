package ch08.sec08;

//인터페이스는 다중상속 가능
public class SmartTelevision implements RemoteControl,Searchable{

    // RemoteControl의 turnOn(), turnOff() 구현
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    // Searchable의 search() 구현
    @Override
    public void search(String url) {
        System.out.println(url+ "을 검색합니다.");
    }
}
