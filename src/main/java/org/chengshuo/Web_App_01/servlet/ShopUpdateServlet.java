package org.chengshuo.Web_App_01.servlet;

import org.chengshuo.Web_App_01.pojo.Shop;
import org.chengshuo.Web_App_01.service.ShopService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = {"/ShopUpdateServlet"})
public class ShopUpdateServlet extends HttpServlet {

    private static final long serialVersionUID = -3853073594874685684L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {




        /*  将数据请求过做处理     将数据转发回去    */
        req.setCharacterEncoding("UTF-8");

        Shop shop = new Shop();
        shop.setSname(req.getParameter("spname"));
        shop.setSnum(Integer.valueOf(req.getParameter("snum")));
        shop.setStid(Integer.valueOf(req.getParameter("stid")));
        shop.setSuid(Integer.valueOf(req.getParameter("suid")));
        shop.setSprice(Double.valueOf(req.getParameter("spprice")));
        shop.setSid(Integer.valueOf(req.getParameter("sid")));
        ShopService service = new ShopService();
        int i = service.update(shop);
        resp.sendRedirect("showshop?page="+req.getParameter("page")+"&pagesize=10");
    }

}
