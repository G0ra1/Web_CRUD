
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <style>
        html,body,.divbody,.row{
            height: 100%;
        }
        .divbody{
            background-image: linear-gradient(to right bottom,#3065a9,#2362af,#6d8bbf);
        }
        .logindiv{
            padding: 20px;
            border-radius: 20px;
            border: 1px solid black;
            background-color: white;
        }
    </style>
</head>
<body>
<div class="container-fluid divbody">
    <div class="row justify-content-center align-items-center">
        <div class="col-3 logindiv">
            <form action="./longin.do" method="post">
                <div class="form-group">
                    <h3 class="text-center">后台登录</h3>
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">用户名</label>
                    <input type="text" class="form-control" name="usname" aria-describedby="emailHelp">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label>
                    <input type="password" class="form-control" name="uspass">
                </div>
                <div class="form-group form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>
                <button type="submit" class="btn btn-primary w-100">登录</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
