<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Pizzeria pepperoni - rejestracja</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/styles/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/styles/log.css" type="text/css" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="col-sm-6 col-md-4 col-md-offset-4">
        <form class="form-signin" method="post" action="#">
            <h2 class="form-signin-heading">Zarejestruj się</h2>
            <input name="email" type="email" class="form-control" placeholder="Email" required autofocus/>
            <input name="username" type="text"  class="form-control"
                   placeholder="Nazwa użytkownika" required autofocus/>
            <input name="password" type="password" class="form-control" placeholder="Hasło" required/>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Zarejestruj</button>
        </form>
    </div>
</div>


<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/WEB-INF/js/bootstrap.js"></script>
</body>
</html>