<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title th:text="${item.name}">Pizza Margherita</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css">
    <link href="${pageContext.request.contextPath}/styles/itemCss.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="col-lg-8 offset-lg-2">
        <img src="${item.imgUrl}" class="img-fluid" alt="Pizza margherita" />
        <div class="shadow-lg p-3 mb-5 bg-white rounded">
            <h1 class="text-center" >${item.name}</h1>
            <h3 class="text-center">Cena ${item.price} zł</h3>
            <p class="text-justify" >${item.description}</p>
        </div>
    </div>
</div>
</body>
</html>