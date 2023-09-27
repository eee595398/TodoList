<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <style>
        fieldset{
            display: flex;
            flex-direction: column;
            align-items: center;
            border: none;
         
        }

        #de{
            height: 100px;
            width: 300px;
        }


    </style>
</head>
<body>
   <form>
    <fieldset>
    <h1>to do 등록하기</h1>
   제목 <input type="text">
   내용  <input type="text" id="de">
    <button>등록</button> 
    </fieldset> 
    </form>
</body>
</html>