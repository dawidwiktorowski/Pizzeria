
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Zamówienia</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css">
    <link href="${pageContext.request.contextPath}/styles/itemCss.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="jumbotron home-jumbo">
        <div class="container text-center text-white jumbo-container">
            <h1 class="display-3">Pizzeria pepperoni</h1>
            <p>Witaj w naszej pizzerii. Zamawiaj co chcesz i ile chcesz, a my przygotujemy to dla Ciebie.</p>
        </div>
    </div>

    <div class="media col-6 offset-3">
            <i class="fas fa-utensils fa-4x"></i>
            <div class="media-body">
                <a href="${pageContext.request.contextPath}/danie" class=>
                    <h5>Pizza Margherita (22.00 zł)</h5>
                </a>
                <p>Krótki opis pizzy margherita, pysznej klasyki na cienkim cieście i rozpływającym się serem.</p>
            </div>
    </div>
    <div class="media col-6 offset-3">
        <i class="fas fa-utensils fa-4x"></i>
        <div class="media-body">
            <a href="#">
                <h5>Pizza Capriciosa (26zł)</h5>
            </a>
            <p>Krótki opis pizzy margherita, pysznej klasyki na cienkim cieście i rozpływającym się serem.</p>
        </div>
    </div>
    <div class="media col-6 offset-3">
        <i class="fas fa-utensils fa-4x"></i>
        <div class="media-body">
            <a href="#">
                <h5>Pizza Mafioso (27zł)</h5>
            </a>
            <p>Krótki opis pizzy margherita, pysznej klasyki na cienkim cieście i rozpływającym się serem.</p>
        </div>
    </div>
</div>
</body>
</html>