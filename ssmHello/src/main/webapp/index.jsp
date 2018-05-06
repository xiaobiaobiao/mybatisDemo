<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <script src="https://code.jquery.com/jquery.js"></script>
 <script src="${pageContext.request.contextPath}/js/boostrap/bootstrap.min.js"></script>
<html>
<head>
<title>爱芳网</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 引入 Bootstrap -->
<link href="${pageContext.request.contextPath}/css/boostrap/bootstrap.min.css" rel="stylesheet">
<style text="text/css">
body {
	background:url(${pageContext.request.contextPath}/img/333.jpg);
 	background-size:cover;        
}
.mycenter{
    margin-top: 100px;
    margin-left: auto;
    margin-right: auto;
    height: 350px;
    width:500px;
    padding: 5%;
    padding-left: 5%;
    padding-right: 5%;
}
.mycenter mysign{
    width: 440px;
}
.mycenter input,checkbox,button{
    margin-top:2%;
    margin-left: 10%;
    margin-right: 10%;
}
.mycheckbox{
    margin-top:10px;
    margin-left: 40px;
    margin-bottom: 10px;
    height: 10px;
}
</style>

   </head>
   <body>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <div class="mycenter">
            <div class="mysign">
                <div class="col-lg-10 text-center text-info" style="margin-left:8%;">
                  	 <h3> 登录爱芳网</h3> <br/><a href="${pageContext.request.contextPath}/register.htm" style="color:red;">立即注册</a>
                </div>
                
                <div class="col-lg-10" style="margin-top: 10px;">
                    <input  class="form-control" name="userName" placeholder="请输入账户名" required autofocus/>
                </div>
                <div class="col-lg-10"></div>
                <div class="col-lg-10" style="margin-bottom: 10px;margin-top: 20px;" > 
                    <input type="password" class="form-control" name="pwd" placeholder="请输入密码" required autofocus/>
                </div>
                <div class="col-lg-10"></div>
               
                <div class="col-lg-10"></div>
                <div class="col-lg-10" style="margin-top: 10px;" >
                    <button type="submit" class="btn btn-success col-lg-12">登录</button>
                </div>
            </div>
        </div>
        </form>
   
   </body>
</html>
