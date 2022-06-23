<%@ page import="org.chengshuo.Web_App_01.pojo.Shoptype" %>
<%@ page import="java.util.List" %>
<%@ page import="org.chengshuo.Web_App_01.pojo.Supplier" %>
<%@ page import="org.chengshuo.Web_App_01.pojo.Shop" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/22
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <script src="js/jquery-3.6.0.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/popper.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
    <style>
        .row{
            margin:15px;
        }
    </style>
</head>
<body>
<div class="container-lg">
    <div class="row justify-content-center">
        <div class="col-2">
            <span style="font-size: 25px; font-weight: bold;">商品修改</span>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-7">
            <form action="ShopUpdateServlet" method="post">
                <%-- 首先拿到Shop对象 获取sid   --%>
                <%Shop shop = (Shop)request.getAttribute("shop");%>
                <%--隐藏域【不显示】--%>
                <input type="hidden" name="page" value="<%=request.getAttribute("page")%>"/>
                <input type="hidden" name="sid" value="<%=shop.getSid()%>"/>

                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">商品名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="spname" value="<%=shop.getSname()%>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">商品价格</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="spprice" value="<%=shop.getSprice()%>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">库存量</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="snum" value="<%=shop.getSnum()%>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">商品类别</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="stid">
                            <%  List<Shoptype> shoptypes= (List<Shoptype>) request.getAttribute("shoptypeList");
                                for (Shoptype shoptype: shoptypes) {
                                    if(shoptype.getStid().equals(shop.getStid())){%>
                                        <option value="<%=shoptype.getStid()%>" selected><%=shoptype.getStname()%></option>
                                    <%}else {%>
                                        <option value="<%=shoptype.getStid()%>"><%=shoptype.getStname()%></option>
                            <% }
                            }%>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">供货商</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="suid">
                            <%  List<Supplier> suppliers= (List<Supplier>) request.getAttribute("supplierList");
                                for (Supplier supplier: suppliers) {
                                    if(supplier.getSuid().equals(shop.getSuid())){%>
                            <option value="<%=supplier.getSuid()%>" selected><%=supplier.getSuname()%></option>
                            <%}else {%>
                            <option value="<%=supplier.getSuid()%>"><%=supplier.getSuname()%></option>
                            <% }
                            }%>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">修改</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

</div>
</body>
</html>
