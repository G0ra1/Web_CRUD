<%@ page import="java.util.List" %>
<%--<%@ page import="org.cskj.webapp02.pojo.Shop" %>--%>
<%@ page import="org.chengshuo.Web_App_01.pojo.Shop" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <script src="js/jquery-3.6.0.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/popper.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
    <style type="text/css">
        .row {
            margin: 15px;
        }
    </style>


    <%--引入分页依赖--%>
    <link rel="stylesheet" href="css/index.css">
    <script src="js/index.js"></script>



</head>
<body>
<!-- container栅格容器 -->
<div class="container-lg">
    <div class="row justify-content-center">
        <div class="col-2">
            <span style="font-size: 25px; font-weight: bold;">商品查询</span>
        </div>
    </div>
    <div class="row">
        <div class="col-1">
            <button type="button" class="btn btn-primary insert" onclick="insert()">添加</button>
        </div>
    </div>
    <div class="row">
        <div class="col-12">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">商品名</th>
                    <th scope="col">商品价格</th>
                    <th scope="col">商品类别</th>
                    <th scope="col">供应商</th>
                    <th scope="col">操作</th>
                </tr>
                </thead>
                <tbody id="tbody">
                <%Map map = (Map)request.getAttribute("aaaa");
                    List<Shop> list = (List<Shop>) map.get("data");
                    for (Shop shop:list) {%>
                    <tr>
                        <th><%=shop.getSid() %></th>
                        <td><%=shop.getSname()%></td>
                        <td><%=shop.getSprice()%></td>
                        <td><%=shop.getSt().getStname()%></td>
                        <td><%=shop.getSp().getSuname()%></td>
                        <td>
                            <button type="button"
                                    class="btn btn-success update" onclick="update(<%=shop.getSid()%>)">修改</button>
                            <button type="button"
                                    class="btn btn-danger delete" onclick="deleteby(<%=shop.getSid()%>)">删除</button>
                        </td>
                    </tr>
                <%} %>
                </tbody>
            </table>
            <div class="paging"></div>
        </div>
    </div>
</div>


<script type="text/javascript">
    let paging = new Paging({
        total:<%=map.get("total") %>,//总条数
        current:<%=map.get("page") %>,//当前页数
        PageSize:<%=map.get("pagesize") %>//每页显示条数
    },function(page){
        console.log("当前第"+page);
        //发出请求
        window.location.href="showshop?page="+page+"&pagesize=10";
    })
    function insert() {
        window.location.href="ShopInsertBeforServlet?page="+<%=map.get("page")%>;
    }
    function update(sid){
        window.location.href="ShopUpdateBeforServlet?sid="+sid+"&page="+<%=map.get("page")%>;
    }
    function deleteby(sid){
        window.location.href="ShopDeleteServlet?sid="+sid+"&page="+<%=map.get("page")%>
    }
</script>
</body>
</html>
