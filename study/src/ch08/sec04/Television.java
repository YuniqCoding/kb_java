package ch08.sec04;

//인터페이스 상속 시에는 implements 키워드 사용
public class Television implements RemoteControl {
    // 필드
    private int volume;
    
    // 인터페이스 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        // 최대값 10, 최소값 0을 벗어나면 벗어나지 않게 위의 if문에서 처리해줌
        // 범위 내의 값이 제대로 들어가면 volume에 반영
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume =RemoteControl.MAX_VOLUME;
        }else if(volume<RemoteControl.MIN_VOLUME){
            this.volume =RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : "+this.volume);
    }
}
