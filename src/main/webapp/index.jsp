<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
	<link rel="stylesheet" href="/resources/css/TodoList.css">
</head>
<body>



<main>
    
   		 <c:choose>
		<c:when test="${empty sessionScope.login}">
     <header>투두리스트 로그인</header>
    	<br><br>
        <form action="/member/login" method="post">
        <fieldset>
          <section id="input">
                <section>
                    <div>아이디</div>
                    <input type="text" name="inputId">
                </section>
                <section>
                    <div>패스워드</div>
                    <input type="text" name="inputPw">
                </section>
                <button>로그인</button>
            </section>
        </fieldset>
    </form>
        <section id="signup">
                <a href="/signup">회원가입</a>
            </section>
             
            
            </c:when>
            
            <c:otherwise>
            	  <section>의 투두 리스트</section>
				    <section>
				        <section></section>
				        <section>
				            <button>등록하기</button>
				            <button>로그아웃</button>
				        </section>
				    </section>
            
     
            </c:otherwise>

         </c:choose> 
            
    </main>
	
	<c:if test="${not empty sessionScope.message }">
	<script>
		alert('${message}')
	</script>
	</c:if>
	<c:remove var="message" scope="session"/>

</body>
</html>