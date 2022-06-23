<%@ page import="org.chengshuo.Web_App_01.pojo.Shoptype" %>
<%@ page import="java.util.List" %>
<%@ page import="org.chengshuo.Web_App_01.pojo.Supplier" %><%--
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
            <span style="font-size: 25px; font-weight: bold;">商品添加</span>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-7">
            <form action="ShopInsertServlet" method="post">
                <%--隐藏域【不显示】--%>
                    <input type="hidden" name="page" value="<%=request.getAttribute("page")%>"/>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">商品名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="spname">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">商品价格</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="spprice">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">库存量</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="snum">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">商品类别</label>
                    <div class="col-sm-10">
                       <select class="form-control" name="stid">
                           <%  List<Shoptype> shoptypes= (List<Shoptype>) request.getAttribute("shoptypes");
                               for (Shoptype shoptype: shoptypes) {%>
                           <option value="<%=shoptype.getStid()%>"><%=shoptype.getStname()%></option>
                           <% }%>
                       </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">供货商</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="suid">
                                <% List<Supplier> supplierList=(List<Supplier>) request.getAttribute("suppliers");
                               for (Supplier supplier : supplierList) {%>
                            <option value="<%=supplier.getSuid()%>"><%=supplier.getSuname()%></option>
                                <% }%>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">添加</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

</div>
</body>
</html>
