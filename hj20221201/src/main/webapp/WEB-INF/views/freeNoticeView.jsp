<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>자유게시판 미리보기</h1>
	<input type="button" value="글쓰기" onclick="location.href='/freeNoteCreForm'" >
	<form action="">
	<div class="table-responsive">
        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
           <thead>
             <tr>
               <th>글번호</th>
               <th>제목</th>
               <th>작성자</th>
               <th>작성일</th>
               <th>추천수</th>
               <th>조회수</th>
              </tr>
           </thead>
           <tbody>
             <c:forEach var="note" items="${noteList}">
             <tr>
               <td>${note.notNum}</td>
               <td>${note.title}</td>
               <td>${note.id}</td>
               <td>${note.notDate}</td>
               <td>${note.notView}</td>
               <td>${note.notHit}</td>
             </tr>
             </c:forEach>
            </tbody>
        </table>
   </div>
   </form>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>