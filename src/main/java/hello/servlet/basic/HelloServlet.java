package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
// /hello로 오면 이클래스가 실행
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request); //was 서버들이 서블릿 표준스펙을 구현한 구현체가 출력됨
        System.out.println("response = " + response);
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + username);


    }
    // 서블릿이 호출되면 서비스 메소드가 호출됨
}
