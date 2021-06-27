<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Twoje Zamówienie</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css">
    <link href="../static/css/main.css" rel="stylesheet">
    <style>
        .form-control1{
            display: none;
        }

    </style>
</head>
<body>
<div class="container">
    <div class="jumbotron home-jumbo">
        <div class="container text-center text-white jumbo-container">
            <h1 class="display-3">Twoje zamówienie</h1>
            <a>Strona główna</a>
        </div>
    </div>
    <div class="col-6 offset-3">
        <form action="${pageContext.request.contextPath}/zamowienie/dodaj" method="post">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nazwa</th>
                    <th scope="col">Cena</th>
                </tr>
                </thead>

                <tbody>
                <tr>
                    <c:forEach var="order" items="${requestScope.order}">
                    <th scope="row" name="id">${order.id}</th>
                    <td>${order.price}</td>
                    <td>${order.name}</td>

                </tr>
                </tbody>
            </table>
            <div class="text-right">
                <h5>Do zapłaty: ${order.price} zł</h5>
            </div>
            </c:forEach>

            <div class="form-group">
                <c:forEach var="order" items="${requestScope.order}">
                    <input type="text" class="form-control1" id="addressInput2" name="id"
                           value="${order.id+1}">

                    <input type="text" class="form-control1" id="addressInput2" name="price"
                           value="${order.price}">

                    <input type="text" class="form-control1" id="addressInput2" name="name"
                           value="${order.name}">
                    <input type="text" class="form-control1" id="addressInput2" name="goodsId"
                           value="${order.id}">

                    <input type="text" class="form-control1" id="addressInput2" name="condition"
                           value="${order.id}">
                </c:forEach>
                <label for="addressInput">Adres</label>
                <input type="text" class="form-control" id="addressInput" name="address"
                       placeholder="ul. Sienkiewicza 15, 50-230 Lodz">
            </div>
            <div class="form-group">
                <label for="telephoneInput">Telephone</label>
                <input type="text" class="form-control" id="telephoneInput" name="telephone" placeholder="111-222-333">
            </div>
            <div class="text-center">
                <button class="btn btn-primary">Zamów</button>
            </div>
        </form>

    </div>

</div>
</body>
</html>