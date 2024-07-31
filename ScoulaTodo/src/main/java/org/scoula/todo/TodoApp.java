package org.scoula.todo;

import org.scoula.lib.cli.App;
import org.scoula.lib.cli.ui.Input;
import org.scoula.lib.cli.ui.Menu;
import org.scoula.lib.cli.ui.MenuItem;
import org.scoula.todo.context.Context;
import org.scoula.todo.exception.LoginFailException;
import org.scoula.todo.service.AccountService;
import org.scoula.todo.service.LoginService;

import javax.security.auth.login.LoginException;
import java.sql.SQLException;

public class TodoApp extends App {
//    로그인한 상태의 메뉴
    Menu userMenu;
//    로그아웃한 상태의 메뉴
    Menu anonymousMenu;
    AccountService accountService = new AccountService();
    LoginService loginService = new LoginService();

    @Override
    public void init() {
//        메소드 참조를 통해서 메뉴 생성
        anonymousMenu = new Menu();
        anonymousMenu.add(new MenuItem("로그인",this::login));
        anonymousMenu.add(new MenuItem("가입",accountService::join));
        anonymousMenu.add(new MenuItem("종료",this::exit));
        
        userMenu = new Menu();
        userMenu.add(new MenuItem("로그아웃", this::logout));
        userMenu.add(new MenuItem("종료",this::exit));
        
        // 처음에는 로그아웃한 상태로 메뉴 보여주기
        setMenu(anonymousMenu);
    }

    private void logout() {
//        사용자가 y와 n을 입력함에 따라 true/false 반환
        if(Input.confirm("로그아웃 할까요?")){
//            기존 로그인된 사용자 정보를 null로 변경
            Context.getContext().setUser(null);
//            사용자가 y를 입력할시 로그아웃되면서 메뉴 교체
            setMenu(anonymousMenu);
        }
    }

    private void exit() {
    }

    private void join() {
    }

    private void login() {
        try{
//            예외 처리를 해야하기 때문에 한번더 login() 메소드를 연결해줌
            loginService.login();
//        로그인 후에는 메뉴 교체
            setMenu(userMenu);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }catch (LoginFailException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
//        변경할 수 없도록 final 선언
        final TodoApp app = new TodoApp();
        app.run();
    }
}
