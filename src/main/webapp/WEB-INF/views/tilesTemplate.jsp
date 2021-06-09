<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>${requestScope.title}</title>
</head>
<body>
    <div id="container">
        <tiles:insertAttribute name="header" /> /<!--외부파일 임포트 or <header>-->
        <section>
            <tiles:insertAttribute name="content" />
        </section>
        <footer>
            Copyright 2021.
        </footer>
    </div>
</body>
</html>
