<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>${requestScope.data.title}</title>
    <link rel="stylesheet" href="/res/css/boardDetail.css">
    <script defer src="/res/js/boardDetail.js"></script>
</head>
<body>
    <div><a href="#" onclick="goBack();">돌아가기</a></div>
    <h1>${requestScope.data.title}</h1>
    <div>글번호 : ${requestScope.data.iboard}</div>
    <div>작성자 : <c:out value="${requestScope.data.writerNm}"/> | 작성일 : ${requestScope.data.regdt}</div>
    <div><c:out value="${requestScope.data.ctnt}"/></div>

    <c:if test="${not empty sessionScope.loginUser}">
        <div>
            <form id="cmtFrm" onsubmit="return false;">
                <input type="text" id="cmt" placeholder="댓글">
                <input type="button" value="댓글달기" onclick="regCmt();">
            </form>
        </div>
    </c:if>
    <div id="cmtList" data-login-user-pk="${sessionScope.loginUser.iuser}" data-iboard="${param.iboard}"></div>
</body>
</html>