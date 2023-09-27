<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>


main{

display: flex;
align-items: center;
flex-direction: column;

}


fieldset{

border: none;
height: 600px;
display: flex;
flex-direction: column;

}

fieldset section{
   
    flex: 1;
 

}

fieldset>section:nth-child(5){
    display: flex;
    justify-content: center;

}

button{

    width: 100%;
    height: 30%;
    background-color: aquamarine;
    border: none;
    

}

input{
    width: 100%;

}




 </style>
</head>
<body>
 <main>
 
  <c:choose>
		<c:when test="${empty sessionScope.signup}">
        <h2>회원가입</h2><br><br>
        <form action="/signup" method="post">
            <fieldset>
                <section>
                    <div>아이디</div>
                    <input type="text" name=inputId>
                    <div>영어 대/소문자, 숫자, 특수문자 포함 6~14글자</div>
                </section>
                <section>
                    <div>비밀번호</div>
                    <input type="password" name=inputPw>
                </section>
                <section>
                    <div>닉네임 </div>
                    <input type="text" name=inputNickname>
                </section>
                <section>
                    <button>가입하기</button>
                </section>
            </fieldset>
        </form>
        
         </c:when>
            
            <c:otherwise>
              <section>의 투두 리스트</section>
				    <section>
				        <section></section>
				        <section>
					        <form action="/insert" method="post">
					            <button>등록하기</button>
				            </form>
				            <form>
					            <button>로그아웃</button>
				            </form>
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