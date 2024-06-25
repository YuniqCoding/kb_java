package ch09.sec07.exam03;

public class Button {
    // 정적 멤버 인터페이스
    public static interface ClickListener{
        // 추상 메소드
        void onClick();
    }
    // 필드
//    Button 클래스에서 ClickListener 인터페이스를 필드로 가지고 있다
    private ClickListener clickListener;

    // 메소드
//    set 메소드에서는 ClickListener를 받아온 값으로 변경해준다 (DI)
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

//    받아온 객체의 onClick을 호출
    public void click(){
        this.clickListener.onClick();
    }
}
