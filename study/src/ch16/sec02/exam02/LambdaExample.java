package ch16.sec02.exam02;

public class LambdaExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        // Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
//        ClickListener 내의 onClick 부분을 람다식이 채워줌
//        매개변수가 없는 람다식
        btnOk.setClickListener(()->{
            System.out.println("OK 버튼을 클릭했습니다.");
        });

        // click 메소드 내에서 onClick 호출 -> 람다식 호출
        btnOk.click(); // Ok 버튼 클릭하기

        Button btnCancel = new Button();

        btnCancel.setClickListener(()->{
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });

        btnCancel.click(); // Cancel 버튼 클릭하기
    }
}
