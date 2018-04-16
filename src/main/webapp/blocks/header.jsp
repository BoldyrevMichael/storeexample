<%@page pageEncoding="UTF-8" %>
<header class="header">
    <a class="logo" href=<%= (request.getRequestURI().contains("products") ? "../../main" : "main") %>>
        <!-- <img src="GoodMood.png" alt=""> -->
        <h1>GoodMood</h1>
    </a>
    <nav class="nav">
        <ul>
            <li><a href=<%= (request.getRequestURI().contains("products") ? "../../main" : "main") %>>Главная</a></li>
            <li><a href=<%= (request.getRequestURI().contains("products") ? "../../catalog" : "catalog") %>>Каталог</a></li>
            <li><a href=<%= (request.getRequestURI().contains("products") ? "../../basket" : "basket") %>>Корзина</a></li>
            <li><a href=<%= (request.getRequestURI().contains("products") ? "../../contacts" : "contacts") %>>Контакты</a></li>
        </ul>
    </nav>
</header>