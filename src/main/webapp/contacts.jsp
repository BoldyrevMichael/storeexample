<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Контакты</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
<div class="container">
    <div class="content">
        <%@include file="/blocks/header.jsp" %>
        <main class="main">
            <h2>Контакты</h2>
            <div class="contacts">
                <h3>Адрес</h3>
                <ul>
                    <li>Телефон: телефон</li>
                    <li>Адрес: адрес</li>
                    <li>Email: email</li>
                </ul>
                <h3>Напишите нам</h3>
                <form class="form" action="#">
                    <ul>
                        <li>
                            <label for="form-name">Имя:</label>
                            <input type="text" id="form-name" placeholder="Имя">
                        </li>
                        <li>
                            <label for="form-email">Почта:</label>
                            <input type="email" id="form-email" placeholder="example@mail.com">
                        </li>
                        <li>
                            <label for="form-theme">Тема:</label>
                            <input type="text" id="form-theme">
                        </li>
                        <li>
                            <label for="form-massage">Сообщение:</label>
                            <textarea id="form-massage"></textarea>
                        </li>
                    </ul>
                    <button type="submit">Отправить</button>
                    <button type="reset">Очистить форму</button>
                </form>
                <script async
                        src="https://api-maps.yandex.ru/services/constructor/1.0/js/?um=constructor%3A262860c97100a7cf10a614f1dbd4a5118fca9d79cf43b726f560aa0e89e429ff&amp;width=100%25&amp;height=450&amp;lang=ru_RU&amp;scroll=true"></script>
            </div>
        </main>
    </div>
    <%@include file="/blocks/footer.jsp" %>
</div>
</body>

</html>
