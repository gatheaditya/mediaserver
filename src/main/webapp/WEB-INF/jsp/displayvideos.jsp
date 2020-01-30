<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
           <c:forEach var="video" items="${list}">
            <video width="320" height="240" controls>
                 <source src="${video}" type="video/mp4">
                 Your browser does not support the video tag.
               </video>
               </c:forEach>
</body>
</html>