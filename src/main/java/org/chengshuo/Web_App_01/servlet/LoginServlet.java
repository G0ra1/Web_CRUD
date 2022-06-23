package org.chengshuo.Web_App_01.servlet;

import org.chengshuo.Web_App_01.pojo.User;
import org.chengshuo.Web_App_01.service.SigUpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = {"/longin.do"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        *
        * 创建一个对象 用来存储用户名与密码 便于 判断
        *
        * */
        User user = new User();
        user.setUsname(req.getParameter("usname"));
        user.setUspass(req.getParameter("uspass"));
        SigUpService sig = new SigUpService();
        User user1 = sig.SigUp(user);
        if(user1 == null ){
            resp.sendRedirect("login.jsp");
        }else {
            resp.sendRedirect("showshop?page=1&pagesize=10");
        }
    }
}
