package org.chengshuo.Web_App_01.servlet;

import org.chengshuo.Web_App_01.pojo.Shoptype;
import org.chengshuo.Web_App_01.pojo.Supplier;
import org.chengshuo.Web_App_01.service.ShopTypeService;
import org.chengshuo.Web_App_01.service.SupplierService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = {"/ShopInsertBeforServlet"})
public class ShopInsertBeforServlet extends HttpServlet {
    private static final long serialVersionUID = 7669573046347710884L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = Integer.valueOf(req.getParameter("page"));
        List<Shoptype> shoptypes = new ShopTypeService().showAll();
        List<Supplier> suppliers = new SupplierService().showAll();
        req.setAttribute("page",page);
        req.setAttribute("shoptypes",shoptypes);
        req.setAttribute("suppliers",suppliers);
        req.getRequestDispatcher("shop_add.jsp").forward(req,resp);
    }

}
