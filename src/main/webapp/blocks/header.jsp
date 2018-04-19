<%@page pageEncoding="UTF-8" %>
<header class="header">
    <a class="logo" href=<%= (request.getRequestURI().contains("productn") ? "../main" : "main") %>>
        <!-- <img src="GoodMood.png" alt=""> -->
        <h1>GoodMood</h1>
    </a>
    <nav class="nav">
        <ul>
            <li><a href=<%= (request.getRequestURI().contains("productn") ? "../main" : "main") %>>Главная</a></li>
            <li><a href=<%= (request.getRequestURI().contains("productn") ? "../catalog" : "catalog") %>>Каталог</a></li>
            <li><a href=<%= (request.getRequestURI().contains("productn") ? "../basket" : "basket") %>>Корзина</a></li>
            <li><a href=<%= (request.getRequestURI().contains("productn") ? "../contacts" : "contacts") %>>Контакты</a></li>
        </ul>
    </nav>
</header>