package ui;

import basic.Input;
import command.Command;

public class Menu {
//    메뉴들을 MenuItem 객체로 만들어서 관리해줌
    MenuItem[] menus;

//    메뉴의 개수를 받아와서 메뉴 리스트를 초기화해줌
    public Menu(int size) {
        menus = new MenuItem[size];
    }

//    메뉴 항목 주입
    public void add(int ix, MenuItem item) {
        menus[ix] = item;
    }

    public void printMenu(){
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < menus.length; i++){
//            menus[i]는 MenuItem의 객체이므로 title만 가져와서 출력
            System.out.printf("%d.%s | ", i+1, menus[i].getTitle());
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }

    public Command getSelect(){
//        사용자가 입력한 숫자를 받아서 selectNo에 저장
        int selectNo = Input.getInt("선택> ");
        // index로 접근해야 되기 때문에 -1을 해줌
        // menus에서 MenuItem 객체 하나를 접근해서 Command만 가져온다.
        return menus[selectNo-1].getCommand();
    }
}
