<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head><title>Simple View 1</title></head>
    <body>
        <ul>
            <c:forEach var="entry" items="${env}">
                <li><b><c:out value="${entry.key}"/></b>: <c:out value="${entry.value}"/></li>
            </c:forEach>
        </ul>
    </body>
</html>