package org.scoula.ex05;

import org.scoula.ex05.dto.LoginDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        getParameter 내에 있는 이름은 input의 name과 같은지 확인할것
        String userid = request.getParameter("userid");
        String password = request.getParameter("passwd");

        LoginDTO loginDTO = new LoginDTO(userid, password);

//        위에서 만들어진 변수 정보를 request 내에 세팅한다
        request.setAttribute("userid", userid);
        request.setAttribute("passwd", password);
        request.setAttribute("login",loginDTO);

//        설정한 request를 login.jsp로 보내서 화면을 띄워준다
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
