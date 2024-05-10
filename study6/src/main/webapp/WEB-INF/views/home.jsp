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
		<li><a href="${path2 }/api/api1.do">API1 테스트</a></li>
		<li><a href="${path2 }/api/api2.do">API2 테스트</a></li>
		<li><a href="${path2 }/api/api3.do">API3 테스트</a></li>	
		<li><a href="${path2 }/api/api4.do">API4 테스트</a></li>
		<li><a href="${path2 }/api/sub/api5">API5 테스트</a></li>
		<li><a href="${path2 }/api/sub/api6">API6 테스트</a></li>
		<li><a href="${path2 }/api/sub/api7">API7 테스트</a></li>
		<li><a href="${path2 }/api/sub/api8">API8 테스트</a></li>
		<li><a href="${path2 }/api/sub/api9">API9 테스트</a></li>
		<li><a href="${path2 }/api/sub/api10">API10 테스트</a></li>
	</ul>
	<br>
</body>
</html>
