package cli;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

//    매개변수 title 을 출력하고 줄바꿈하지 않음
//    사용자가 입력한 문자열을 리턴함
    public static String read(String title){
        System.out.print(title);
        return sc.nextLine();
    }

//    매개변수 title(defaultValue)를 출력하고 줄바꿈하지 않음
//    사용자가 입력한 문자열을 리턴함 ,
//    그냥 엔터를 치면 defaultValue 를 리턴
    public static String read(String title, String defaultValue){
        System.out.printf("%s(%s): ", title, defaultValue);
        String answer = sc.nextLine();

//        입력값이 비어있는지 확인하고 비어있으면 defaultValue, 안 비어있으면 answer 리턴
        return answer.isEmpty() ? defaultValue : answer;
    }

//    매개변수 title 을 출력하고 줄바꿈하지 않음
//    사용자가 입력한 문자열을 정수로 변환 후 리턴함
    public static int readInt (String title){
        System.out.print(title);
        int answer = sc.nextInt();
        sc.nextLine(); //엔터 제거용
        return answer;
    }

//    매개변수 title (Y/n) 을 출력하고 줄바꿈하지 않음,
//    defaultValue 가 true 이면 (Y/n), false 이면 (y/N) 을 출력
//    입력 없이 엔터를 친 경우 기본값 리턴
    public static boolean confirm(String title, boolean defaultValue){
//        defaultValue 가 true면 (Y/n), false면 (y/N) 을 yesNo에 저장
//        defaultValue == true 는 defaultValue 로 줄여쓸수 있다
        String yesNo = defaultValue? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s: ",title,yesNo);

        String answer = sc.nextLine();
//        answer가 비어있는 경우 기본값 리턴
        if(answer.isEmpty()) return defaultValue;

//        answer 값이 Y나 y라면 true 반환
        return answer.equalsIgnoreCase("y");
    }

    public static boolean confirm(String title){
//        위에 있는 confirm 메소드 호출
        return confirm(title, true);
    }

}
