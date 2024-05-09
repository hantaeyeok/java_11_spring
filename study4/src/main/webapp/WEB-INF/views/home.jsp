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
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  The time on the locale is ${locale}. </P>

<a href="${path2 }/sample/list.do">샘플 목록</a>	
<ul>
	<li><a href="${path2 }/test/testList.do"></a>테스트 목록</li>
	<li><a href="${path2 }/test/testList2.do"></a>테스트 목록</li>
	
</ul>
</body>
</html>
