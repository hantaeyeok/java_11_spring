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
	<br>
	<ul>
		<li><a href="${path2 }/test2/get1.do?num=1&title='getTest1 입니다.'">GETTEST1</a></li>
		<li><a href="${path2 }/test2/get2.do?num=2&title='getTest2 입니다.'">GETTEST2</a></li>
		<li><a href="${path2 }/test2/get3.do?num=3&title='getTest3 입니다.'">GETTEST3</a></li>
		<li><a href="${path2 }/test2/get4.do/4/getTest4입니다.">GETTEST4</a></li>
		<li><a href="${path2 }/test2/get5.do?num=5&title='getTest5 입니다.'">GETTEST5</a></li>
	</ul>
	<hr>
	<br>
	<ul>
		<li><a href="${path2 }/test2/post.do">POSTTEST</a></li>
	</ul>
</body>
</html>
