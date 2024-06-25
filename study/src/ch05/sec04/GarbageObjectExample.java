package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
//        "여행"에 해당하는 String 객체를 아무도 가리키지 않으므로 쓰레기 객체가 된다
//        이런 쓰레기 객체들은 주기적으로 가비지 컬렉터가 회수한다
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
//        "자동차"에 해당하는 String은 kind2도 가리키고 있으므로 쓰레기 객체가 아니다
        kind1 = null;
        System.out.println("kine2: "+kind2);
    }
}
