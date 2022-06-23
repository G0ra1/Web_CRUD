package org.chengshuo.Web_App_01.servlet;

import org.chengshuo.Web_App_01.pojo.Shop;
import org.chengshuo.Web_App_01.pojo.Shoptype;
import org.chengshuo.Web_App_01.pojo.Supplier;
import org.chengshuo.Web_App_01.service.ShopService;
import org.chengshuo.Web_App_01.service.ShopTypeService;
import org.chengshuo.Web_App_01.service.SupplierService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(value = {"/ShopUpdateBeforServlet"})
public class ShopUpdateBeforServlet  extends HttpServlet {
    private static final long serialVersionUID = -5643650207837518924L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* 前端传入sid 后端获取 sid  */
        Integer sid = Integer.valueOf(req.getParameter("sid"));
        /* 通过 sid 查询商品  */
        ShopService service = new ShopService();
        Shop shop = service.selectByid(sid);

        /* 查询分类 + 供应商*/
        ShopTypeService shopTypeService = new ShopTypeService();
        List<Shoptype> shoptypeList = shopTypeService.showAll();
        /* 供应商  */
        SupplierService supplierService = new SupplierService();
        List<Supplier> supplierList = supplierService.showAll();

        /*
        * 处理的结果传给前端
        *
        * */

        req.setAttribute("page",req.getParameter("page"));
        req.setAttribute("shoptypeList",shoptypeList);
        req.setAttribute("supplierList",supplierList);
        req.setAttribute("shop",shop);
        /*
        * 转发
        * */
        req.getRequestDispatcher("shop_update.jsp").forward(req,resp);
    }
}
