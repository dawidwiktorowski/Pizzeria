<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Pizzeria pepperoni - logowanie</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/styles/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/styles/log.css" type="text/css" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="col-sm-6 col-md-4 col-md-offset-4">
        <form class="form-signin" action="j_security_check" method="post">
            <h2 class="form-signin-heading">Zaloguj się</h2>
            <input name="j_username" type="text" class="form-control" placeholder="Nazwa uzytkownika" required autofocus>
            <input name="j_password" type="password" class="form-control" placeholder="Hasło" required>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Zaloguj</button>
            <p>Nie masz konta? <a href="${pageContext.request.contextPath}/signup">Zarejestruj się</a></p>
        </form>
    </div>
</div>

<footer class="footer">
        <p>Pizzeria pepperoni - developed by Dawid Wiktorowski</p>
</footer>

<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/WEB-INF/js/bootstrap.js"></script>
</body>
</html>