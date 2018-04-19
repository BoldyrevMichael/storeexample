<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Каталог</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
<div class="container">
    <div class="content">
        <%@include file="/blocks/header.jsp" %>
        <main class="main">
            <h2>Каталог</h2>
            <div class="catalog">
                <jsp:useBean id="productDAO" class="ru.boldyrev_ma.storeexample.dao.ProductDAO" scope="application"/>
                <c:forEach items="${productDAO.products}" var="product">
                <div class="product">
                    <a href="goods/${product.id}"><img
                            src="products/product${product.id}/${product.smallImgName}"
                            alt="${product.name}, фото"><br>${product.imgCaption}</a>
                </div>
                </c:forEach>
        </main>
    </div>
    <%@include file="/blocks/footer.jsp" %>
</div>
</body>

</html>
