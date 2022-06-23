package org.chengshuo.Web_App_01.servlet;

import org.chengshuo.Web_App_01.pojo.Shop;
import org.chengshuo.Web_App_01.service.ShopService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(value = {"/showshop"})
public class ShopServlet extends HttpServlet {
    private static final long serialVersionUID = 5651795968767886043L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer page = Integer.valueOf(req.getParameter("page"));
        Integer pagesize = Integer.valueOf(req.getParameter("pagesize"));
        Map map = new ShopService().selectAll(page, pagesize);
        /*
        *
        * 跳转  --- index.jsp
        * */
        req.setAttribute("aaaa", map);
         req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
