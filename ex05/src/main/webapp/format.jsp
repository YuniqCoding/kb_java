<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    ${today} <br>
<%--    날짜만 출력--%>
    <fmt:formatDate value="${today}" type="date"/> <br>
<%--    시간만 출력--%>
    <fmt:formatDate value="${today}" type="time"/> <br>
<%--    날짜&시간 모두 출력--%>
    <fmt:formatDate value="${today}" type="both"/> <br>
<%--    dateStyle과 timeStyle로 날짜와 시간 포매팅을 각각 설정 가능--%>
    <fmt:formatDate value="${today}" type="both" dateStyle="short" timeStyle="long"/> <br>
    <fmt:formatDate value="${today}" type="both" dateStyle="long" timeStyle="short"/> <br>
    <fmt:formatDate value="${today}" pattern="YYYY-MM-dd HH:mm:ss"/> <br>
    <fmt:formatDate value="${today}" pattern="YYYY-MM-dd a hh:mm:ss"/> <br>
</body>
</html>
