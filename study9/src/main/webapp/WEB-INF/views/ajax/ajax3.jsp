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
<title>Ajax Test3</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
	<h2>03_Get 전송</h2>
	<hr>
	<ul>
		<li><a href="${path2}/ajax/">HOME</a></li>
	</ul>
	<button type="button" id="btn3">Post 전송</button>
	<script>
	$(document).ready(function(){
		var fn3 = () => $.ajax({
			type:"get",
			url:"${path2}/ajax/ajax3pro.do?msg=파라미터 Get 전송",
			success:function(rep){ console.log("성공",rep);},
			error:function(err){ console.log("실패",err);}
		});
		$("#btn3").on("click",function(){ fn3();});
	});
	</script>
</body>
</html>