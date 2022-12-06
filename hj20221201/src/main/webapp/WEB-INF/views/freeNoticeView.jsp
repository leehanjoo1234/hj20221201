<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>자유게시판 미리보기</h1>
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
               <td>Tiger Nixon</td>
               <td>System Architect</td>
               <td>Edinburgh</td>
               <td>61</td>
               <td>2011/04/25</td>
               <td>$320,800</td>
             </tr>
             </c:forEach>
        </table>
   </div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>