package org.scoula.todo.service;

import org.scoula.lib.cli.ui.Input;
import org.scoula.todo.context.Context;
import org.scoula.todo.dao.UserDao;
import org.scoula.todo.dao.UserDaoImpl;
import org.scoula.todo.domain.UserVO;
import org.scoula.todo.exception.LoginFailException;

import java.sql.SQLException;

public class LoginService {
    UserDao dao = new UserDaoImpl();

    public void login() throws SQLException, LoginFailException {
        String username = Input.getLine("사용자 ID: ");
        String password = Input.getLine("비밀번호: ");
//        SELECT문 이용해서 해당 이름의 사용자 정보 가져오기, 해당하는 정보 없을시 예외 던지기
        UserVO user = dao.get(username).orElseThrow(LoginFailException::new);
//        비밀번호 제대로 입력했을 시 현재 사용자 정보를 로그인한 사용자 정보로 변경
        if(user.getPassword().equals(password)) {
            Context ctx = Context.getContext();
            ctx.setUser(user);
        }else{
//            비밀번호 틀릴 경우 예외 던지기
            throw new LoginFailException();
        }
    }
}
