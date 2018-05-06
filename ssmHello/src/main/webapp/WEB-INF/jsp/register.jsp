<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>爱芳网</title>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath} /js/jquery-3.3.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <style type="text/css">  
        *{margin: 0;padding: 0;}  
        body  
        {  
			 background-image: url("${pageContext.request.contextPath}/img/333.jpg");      
        	 background-size:cover;  
            font-size: 12px; 
         
        }  
        a  
        {  
            text-decoration: none;  
            color: #2647CB;  
        }  
        a:hover  
        {  
            text-decoration: underline;  
            color: red;  
        }  
        .wrap  
        {  
            width: 390px;  
            height: 450px;  
            margin: 50px auto;  
            border: 1px solid #8A8989;  
            position: relative;  
        }  
        .main  
        {  
            width: 350px;  
            height: 400px;  
            margin: 0 auto;  
        }  
        .header  
        {  
            width: 100%;  
            height: 50px;  
              
            line-height: 50px;  
            background-image: url(images/foot.png);  
            background-color: rgb(247,247,247);  
            background-repeat: no-repeat;  
        }  
        .header h3  
        {  
            /* display: inline-block;   */
            line-height: 50px;  
            margin-left: 150px;  
        }  
        .header span  
        {  
            display: inline-block;  
            float: right;  
            margin: auto 15px;  
            font-size: 30px;  
        }  
  
        .inputDiv  
        {  
            display: block;  
            width: 350px;  
            height: 40px;  
            margin: 10px auto;  
        }  
  
        .phoneIn  
        {  
            display: inline-block;  
            float: right;  
            font-size: 14px;  
            background-image: url(images/phone.png);  
            background-repeat: no-repeat;  
            margin: 30px 0px 10px 0px;  
        }  
        .smBtn  
        {  
            background: #2066C5;  
            color: white;  
            font-size: 18px;  
            font-weight: bold;  
            height: 50px;  
            border-radius: 4px;  
        }  
        .smBtn:hover  
        {  
            background: #4067EE;  
        }  
        .pull-right  
        {  
            display: inline-block;  
       		float:right;
                  
        }  
        .other  
        {  
            width: 350px;  
            padding-top: 50px;  
            margin: 0 auto;  
        }  
  
  
        .toggleDiv  
        {  
              
            position: absolute;  
            right: 0;  
            bottom: 0;  
              
            z-index: 1000;  
        }  
  
        .weima  
        {  
            text-align: center;  
            padding-top: 50px;  
            width: 390px;  
            height: 400px;  
        }  
        .weima p   
        {  
            line-height: 50px;  
        }  
  
  
     .demok3_input {
       display: block;  
    transition: all 0.30s ease-in-out;
    -webkit-transition: all 0.30s ease-in-out;
    -moz-transition: all 0.30s ease-in-out;
    border: #35a5e5 1px solid;
    border-radius: 10px;
    outline: none;
}

.demok3_input:focus {
    box-shadow: 0 0 5px rgba(81, 203, 238, 1);
    -webkit-box-shadow: 0 0 5px rgba(81, 203, 238, 1);
    -moz-box-shadow: 0 0 5px rgba(81, 203, 238, 1);
}

.demok3_a {
    text-decoration: none;
    -webkit-transition: all linear 0.30s;
    -moz-transition: all linear 0.30s;
    transition: all linear 0.30s;
    background: rgba(81, 203, 238, 1);
    color: white;
    padding: 6px 25px 6px 25px;
    font: 12px '微软雅黑';
    border-radius: 3px;
}

.demok3_a:hover {
    background: rgba(39, 154, 187, 1);
}
    </style>  
</head>  
<body>  

    <div class="wrap">  
        <div class="header">  
              
            <h3>注册爱芳网</h3>  
           
        </div>  
        <div class="main">  
         
                <input type="text" id="userName" name="userName"  class="demok3_input" placeholder="请输入用户名" style="height: 35px;width: 200px;margin-bottom: 30px;margin-top: 30px;margin-left: 23%;"/>  
                <input type="password" id="pwd"  name="pwd"  class="demok3_input" placeholder="请输入密码"  style="height: 35px;width: 200px;margin-bottom: 30px;margin-left: 23%;"/>  
                 <input type="password" id="pwd1"  name="pwd1"  class="demok3_input" placeholder="请输入确认密码"  style="height: 35px;width: 200px;margin-bottom: 30px;margin-left: 23%;"/>  
                <input type="submit" id="zhuce" value="注册"  class="demok3_a" style="height: 32px;width: 100px;margin-left:35%;"/>  
          
        </div>  
  
    </div>  

</body><span style="color:#ffffff;">  
<script>

$(document).ready(function(){
	
	
	$("#zhuce").click(function(){
		var userName = $("#userName").val();
		var pwd = $("#pwd").val();
		var pwd1 = $("#pwd1").val();
		if(userName == null || userName == undefined || userName == ""){
			alert("请输入用户名");
			return;
		}
		if(pwd == null || pwd == undefined || pwd == ""){
			alert("请输入密码");
			return;
		}
		if(pwd1 == null || pwd1 == undefined || pwd1 == ""){
			alert("请输入确认密码");
			return;
		}

		if(pwd != pwd1){
			alert("密码不一致");
			return;
		}


		$.ajax({  
            type:"post",  
            url: "${pageContext.request.contextPath}/register",
            async: false,
            data:{
				userName:userName,
				password:pwd
             },  
            success:function(data){ 
            	
            	if(data == "success"){
            		  window.location.href = "${pageContext.request.contextPath}/success.htm?userName="+userName;  
            	}else{
            		alert(data);
            	}
            }  
        });  

	});
});

</script>
</html></span> 