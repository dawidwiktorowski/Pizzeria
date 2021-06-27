
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title >${item.name}</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css">
    <link href="../static/css/main.css" th:href="@{/css/main.css}" rel="stylesheet">
</head>
<body>
<div class="container">
    <c:forEach var="item" items="${requestScope.items}">
    <div class="col-lg-8 offset-lg-2">
        <img src="${pageContext.request.contextPath}${item.imgUrl}" class="img-fluid" alt="Pizza margherita" />
        <div class="shadow-lg p-3 mb-5 bg-white rounded">
            <h1 class="text-center" >${item.name}</h1>
            <h3 class="text-center" >Cena ${item.price}zł</h3>
            <p class="text-justify" >${item.description}</p>
            <a href="${pageContext.request.contextPath}/zamowienie/dodaj" class="btn btn-primary d-block">
                Dodaj do zamówienia
            </a>
        </div>
    </div>
    </c:forEach>
</div>
</body>
</html>