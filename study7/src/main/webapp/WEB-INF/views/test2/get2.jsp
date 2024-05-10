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
<title>테스트 상세보기</title>
</head>
<body>
	<h2>Get 테스트 - Object</h2>
	<hr>
	<div class="test2">
		<p>번호 : ${test2.num }</p>
		<p>제목 : ${test2.title }</p>
	</div>
	<hr><br>
	<a href="${path2 }">홈으로</a><br>
	
</body>
</html>