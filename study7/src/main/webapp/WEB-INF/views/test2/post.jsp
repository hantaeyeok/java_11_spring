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
<title>Post 전송</title>
<script src="https://code.jquery.com/jquery-1.11.0.js"></script>
</head>
<body>
	<h2>Post 테스트1 - @RequestParam</h2>
	<hr>
	<div class="test">
		<form action="${path2 }/test2/post1.do" name="post1" method="post">
			<input type="number" name="num" id="num1" placeholder="숫자 입력" requrired‎><br><br>
			<input type="text" name="title" id="title1" placeholder="제목 입력"requrired‎><br><br>
			<button type="submit" >post1전송</button>
		</form>
	</div>
	<h2>Post 테스트2 - @Object</h2>
	<hr>
	<div class="test">
		<form action="${path2 }/test2/post2.do" name="post2" method="post">
			<input type="number" name="num" id="num2" placeholder="숫자 입력" requrired‎><br><br>
			<input type="text" name="title" id="title2" placeholder="제목 입력" requrired‎><br><br>
			<button type="submit" >post2전송</button>
		</form>
	</div>
	<h2>Post 테스트3 - @ModelAttribute</h2>
	<hr>
	<div class="test">
		<form action="${path2 }/test2/post3.do" name="post3" method="post">
			<input type="number" name="num" id="num3" placeholder="숫자 입력" requrired‎><br><br>
			<input type="text" name="title" id="title3" placeholder="제목 입력" requrired‎><br><br>
			<button type="submit" >post3전송</button>
		</form>
	</div>
	<h2>Post 테스트4 - @PathVariable</h2>
	<hr>
	<div class="test">
		<form action="" name="post4" method="get">
			<input type="number" name="num" id="num4" placeholder="숫자 입력" requrired‎><br><br>
			<input type="text" name="title" id="title4" placeholder="제목 입력" requrired‎><br><br>
			<button type="button" onclick="fnc1()">post4 전송</button>
		</form>
	</div>
	<script>
	function fnc1() {
		if($("#num4").val()=="" || $("#title4").val()==""){
			alert("값이 비어있어요");
			return;
		}
		var num = parseInt($("#num4").val());
		var title = $("#title4").val();
		location.href ="${path2 }/test2/post4.do/"+num+"/"+title;
	}
	</script>
	<h2>Post 테스트5 - ModelAndView</h2>
	<hr>
	<div class="test">
		<form action="${path2 }/test2/post5.do" name="post5" method="post">
			<input type="number" name="num" id="num5" placeholder="숫자 입력" requrired‎><br><br>
			<input type="text" name="title" id="title5" placeholder="제목 입력" requrired‎><br><br>
			<button type="submit" >post5전송</button>
		</form>
	</div>
	
	<hr><br>
	<a href="${path2 }">홈으로</a><br>
	
</body>
</html>