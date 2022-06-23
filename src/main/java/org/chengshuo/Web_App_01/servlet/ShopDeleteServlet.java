package org.chengshuo.Web_App_01.servlet;

import org.chengshuo.Web_App_01.service.ShopService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = {"/ShopDeleteServlet"})
public class ShopDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer sid = Integer.valueOf(req.getParameter("sid"));
        ShopService service = new ShopService();
        int delete = service.delete(sid);

        //计算页码
        int count = service.count();
        int pagemax=count%10==0?count/10:(count/10)+1;
        Integer page = Integer.valueOf(req.getParameter("page"));
        resp.sendRedirect("showshop?page="+(page>pagemax?pagemax:page)+"&pagesize=10");
    }
}
