<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax Test2</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
	<h2>02_Post 전송</h2>
	<hr>
	<ul>
		<li><a href="${path2}/ajax/">HOME</a></li>
	</ul>
	<button type="button" id="btn2">Post 전송</button>
	<script>
	$(document).ready(function(){
		var res = {"res":"POST 전송"} 
		var fn2 = () => $.ajax({
			type:"post",
			url:"${path2}/ajax/ajax2pro.do",
			data:res,
			dataType:"json",
		    contentType: 'application/json; charset=utf-8', 
			success:function(rep){ console.log("성공",rep);},
			error:function(err){ console.log("실패",err);}
		});
		$("#btn2").on("click",function(){ fn2();});
	});
	</script>
</body>
</html>