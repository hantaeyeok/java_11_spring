<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<html>
<head>
	<title>Home</title> 
</head>
<body>
<h2>Form 검증</h2>
	<ul>
		<li><a href="${path2 }/check/check1.do">Check 폼 검증 TEST1</a></li>
		<li><a href="${path2 }/check/check2.do">Check 폼 검증 TEST2</a></li>
		<li><a href="${path2 }/check/check3.do">Check 폼 검증 TEST3</a></li>
		<li><a href="${path2 }/check/check4.do">Check 폼 검증 TEST4</a></li>
		<li><a href="${path2 }/check/check5.do">Check 폼 검증 TEST5</a></li>
		<li><a href="${path2 }/check/check6.do">Check 폼 검증 TEST6</a></li>
	</ul>
	<br>
</body>
</html>
