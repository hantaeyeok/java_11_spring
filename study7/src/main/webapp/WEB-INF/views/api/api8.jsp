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
<title>학생객체(컬렉션 포함)전송</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>

</head>
<body>
	<input type="text" name="part" id="part"  placeholder="반 이름 입력" ><br>
	<input type="number" name="classNum"  id="classNum" placeholder="반 번호 입력" ><br>
	<div class="form">
		<input type="number" name="stdNumber1" class="num" placeholder="번호 입력" ><br>
		<input type="text" name="name1" class="name" placeholder="학생명 입력" ><br>
		<input type="number" name="age1" class="age" placeholder="나이 입력" ><br>
	</div>
	<div class="form">
		<input type="number" name="stdNumber2" class="num" placeholder="번호 입력" ><br>
		<input type="text" name="name2" class="name" placeholder="학생명 입력" ><br>
		<input type="number" name="age2" class="age" placeholder="나이 입력" ><br>
	</div>
	<div class="form">
		<input type="number" name="stdNumber3" class="num" placeholder="번호 입력" ><br>
		<input type="text" name="name3" class="name" placeholder="학생명 입력" ><br>
		<input type="number" name="age3" class="age" placeholder="나이 입력" ><br>
	</div>
	<button type="button" id="btn1">등록</button>
	<script>
	$(document).ready(function(){
		$("#btn1").click(function(){
			 var student = {stdNumber:0, name:"아무개", age:0 };
			 var students = [student, student, student];
			 var team = {part:$("#part").val(), classNum:parseInt($("#classNum")).val()),students:students}
			 $.each($(".form"), function(index, value){
				 var num = $(this).find(".num").val();
				 var name = $(this).find(".name").val();
				 var age = $(this).find(".age").val();
		
				 student = {stdNumber:num, name:name, age:age};
				 stds[index] = student;
			 });
			 $.ajax({
				type:"post",
				url:"${path2}/api/api8.do",
				data:JSON.stringify(team),
				datatype:"json",
				contentType:'application/json; charset=utf-8',
				success:function(data){}
			});
		});
	});
	
	</script>
	<!-- console.log(data);
					var tbody = $("#tbody").html();
					var conData = "<tr><td>"+data.num+"</td><td>"+data.name+"</td><td>"+data.age+"</td></tr>";
					$("#tbody").html(tbody+conData); -->
</body>
</html>