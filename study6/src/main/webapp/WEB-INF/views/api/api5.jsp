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
<title>상점등록</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>

</head>
<body>
<div>
	<form name="ins" action="" method="post">
		<input type="number" name="storeNum" id="storeNum" placeholder="번호 입력" ><br>
		<input type="text" name="storeName" id="storeName" placeholder="상점명 입력" ><br>
		<button type="button" id="btn1">보내기</button>
	</form>
</div>	

<table>
	<tbody id="tbody">
	
	</tbody>
</table>
	<script>
	$(document).ready(function(){
		$("#btn1").click(function(){
			var store = {storeNum : parseInt($("#storeNum").val()), storeName : $("#storeName").val()}
			$.ajax({
				type : "post",
				url : "${path2}/api/api5.do",
				data : JSON.stringify(store),
				dataType : "json",
				contentType : "application/json; charset=utf-8",
				success : function(data) {
					console.log(data);
					var tbody =$("#tbody").html();
					var conData = "<tr><td>"+data.storeNum+"</td><td>"+data.storeName+"</td></tr>";
					$("#tbody").html(tbody+conData);
					console.log(data.storeNum);
					console.log(data.storeName);
				}
			});
		});
	});
	</script>
	
</body>
</html>