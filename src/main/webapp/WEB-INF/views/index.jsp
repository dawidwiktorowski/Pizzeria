<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Pizzeria Pepperoni</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Saira+Condensed:400,700|Saira:300,400&amp;subset=latin-ext"
          rel="stylesheet">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.12/css/all.css"
          integrity="sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9" crossorigin="anonymous">

    <link href="${pageContext.request.contextPath}/styles/main.css" type="text/css" rel="stylesheet">

</head>

<body>
<header>

    <hgroup class="welcome">
        <h1>Pizzeria Pepperoni</h1>
        <h2><span>Najlepsza pizza</span>
            w mieście</h2>

    </hgroup>

    <button><a href="#onas">Zobacz naszą pizzerie</a></button>
    <c:choose>
        <c:when test="${empty pageContext.request.userPrincipal}">
            <button class="button1"><a href="${pageContext.request.contextPath}/login" class="login-button">Zaloguj</a>
            </button>
        </c:when>
        <c:when test="${not empty pageContext.request.userPrincipal}">
            <button class="button1"><a href="${pageContext.request.contextPath}/logout" class="login-button">Wyloguj</a>
            </button>
        </c:when>
    </c:choose>
    <div class="img"></div>


    <div class="burger">
        <i class="fas fa-bars show active "></i>
        <i class="fas fa-times active"></i>
    </div>


    <aside class="active">
        <nav>Menu</nav>
        <ul>
            <li>
                <a href="#onas">
                    O nas
                </a>
            </li>
            <li>
                <a href="#uslugi">
                    Menu
                </a>
            </li>
            <li>
                <a href="#promocja">
                    Promocyjne dni
                </a>
            </li>
            <li>
                <a href="#cenniki">
                    Cennik
                </a>
            </li>
            <li>
                <a href="#galeria">
                    Galeria
                </a>
            </li>
            <li>
                <a href="#con">
                    Kontakt
                </a>
            </li>
            <c:choose>
                <c:when test="${not empty pageContext.request.userPrincipal}">
                    <li><a href="${pageContext.request.contextPath}/order" class="login-button">Zamów</a></li>
                </c:when>
            </c:choose>
            <c:choose>
                <c:when test="${empty pageContext.request.userPrincipal}">
                    <li><a href="${pageContext.request.contextPath}/login" class="login-button">Zaloguj</a></li>
                </c:when>
                <c:when test="${not empty pageContext.request.userPrincipal}">
                    <li><a href="${pageContext.request.contextPath}/logout" class="login-button">Wyloguj</a></li>
                </c:when>
            </c:choose>
        </ul>
    </aside>
</header>

<section id="onas">
    <section class="features clearfix">
        <div class="feature">
            <img src="img/sosy.jpg" alt="Oferta salonu kosmetycznego">
            <h2>Sosy gratis</h2>
            <p class="description">Do każdej pizzy dwa sosy gratis</p>
        </div>

        <div class="feature">
            <img src="img/spec oferta.png" alt="Oferta salonu kosmetycznego">
            <h2>Rabat 5 zł !</h2>
            <p class="description">Do drugiego zamówienia</p>
        </div>

        <div class="feature">
            <img src="img/lojal.png">
            <h2>Program lojalnościowy</h2>
            <p class="description">Zbierz 10 pieczątek, dostaniesz rabat 10,00 zł !</p>
        </div>
    </section>

</section>
<section id="uslugi" class="portfolio">
    <h1>Menu jakie oferujemy</h1>
    <div class="project clearfix">
        <div class="web">
            <img src="img/Pizza na grubym.jpg" alt="portfolio przykład 1">
        </div>
        <div class="about">
            <h2>Pizza na grubym cieście</h2>
            <p>- margherita</p>
            <p>- capriciosa</p>
            <p>- Sonoforeza</p>
            <p>- Prosciutto </p>
            <p>- Funghi </p>
            <p>- Verdura </p>
            <p>- Bella Cosa </p>
        </div>
    </div>
    <div class="project clearfix">
        <div class="web">
            <img src="img/pizza włoska.jpg" alt="portfolio przykład 2">
        </div>
        <div class="about">
            <h2>Pizza włoska</h2>
            <p>- Sycylijska</p>
            <p>- Bianca</p>
            <p>- Lazio</p>
            <p>- Marinara</p>
        </div>
    </div>
    <div class="project clearfix">
        <div class="web">
            <img src="img/shoarma.jpg" alt="portfolio przykład 3">
        </div>
        <div class="about">
            <h2>Shoarma</h2>
            <p>- wegetariańska</p>
            <p>- drobiowa</p>
            <p>- wołowa</p>
        </div>
    </div>
    <div class="project clearfix">
        <div class="web">
            <img src="img/zapiekanka.jpg" alt="portfolio przykład 4">
        </div>
        <div class="about">
            <h2>Zapiekanki</h2>
            <p>- z szpinakiem</p>
            <p>- z serem i szynką</p>
            <p>- makaronowa z warzywami</p>
            <p>- z kaszy gryczanej</p>
            <p>- naleśnikowa</p>

        </div>
    </div>
</section>

<section id="galeria" class="galeria clearfix">
    <h1>W naszej pizzerii:</h1>
    <div class="item">
        <p>Pizza wypiekana w piecu opalanym drewnem</p>
    </div>
    <div class="item">
        <p>Kochamy to co robimy</p>
    </div>
    <div class="item">
        <p>Jest prawdziwa włoska pizza</p>
    </div>
    <div class="item">
        <p>Najwyższej jakości składniki</p>
    </div>
</section>

<section id="con" class="contact">
    <h1>Skontaktuj się z nami</h1>
    <div class="wrap clearfix">

        <form>
            <iframe
                    src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d153.8662849124095!2d21.61014577138472!3d51.90000876568122!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4718c62a35ad9919%3A0xa382726ae52b93a4!2sPizzeria%20Pepperoni!5e0!3m2!1spl!2spl!4v1623510343946!5m2!1spl!2spl"
                    width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
        </form>
        <div class="socials">
            <div class="social clearfix"><img src="img/contact1.png"
                                              alt="kontakt"><span>pizzeria-pepperoni@pizzeria.pl</span></div>
            <div class="social clearfix"><img src="img/contact2.png" alt="kontakt"><span>123 456 789</span></div>
            <div class="social clearfix"><img src="img/contact3.png" alt="kontakt"><span>Pizzeria
                        pepperoni</span></div>


        </div>

    </div>

</section>
<footer>Pizzeria pepperoni, project Dawid Wiktorowski &copy;</footer>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
        integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script>
    const burger = document.querySelector(".burger");
    const activeElement = document.querySelectorAll(".active");

    burger.addEventListener("click", function () {
        for (let i = 0; i < activeElement.length; i++) {
            activeElement[i].classList.toggle("show")
        }
    })
</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</body>

</html>