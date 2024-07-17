package ui;

import basic.Input;
import command.Command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menus;

//    List는 인터페이스기 때문에 실제 객체 생성은 ArrayList로 해준다
//    ArrayList는 크기를 미리 지정해줄 필요가 없다
    public Menu() {
        menus = new ArrayList<>();
    }

//    ArrayList는 add를 통해서 가장 마지막 부분에 요소 추가가 가능하다
    public void add(MenuItem item) {
        menus.add(item);
    }

    public void printMenu(){
        System.out.println("-------------------------------------------------------");
//        배열의 length 대신 ArrayList의 size()를 사용 가능
        for(int i = 0; i < menus.size(); i++){
//            배열의 menus[i] 대신 ArrayList의 get(i) 사용 가능
            System.out.printf("%d.%s | ", i+1, menus.get(i).getTitle());
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }

    public Command getSelect(){
//        사용자가 입력한 숫자를 받아서 selectNo에 저장
        int selectNo = Input.getInt("선택> ");
        // index로 접근해야 되기 때문에 -1을 해줌
//            배열의 menus[i] 대신 ArrayList의 get(i) 사용 가능
        return menus.get(selectNo-1).getCommand();
    }
}
