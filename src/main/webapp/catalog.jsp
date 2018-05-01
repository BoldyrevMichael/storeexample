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
                <jsp:useBean id="productDAO" class="ru.boldyrev.ma.storeexample.dao.ProductDAO" scope="application"/>
                <jsp:useBean id="categoryDAO" class="ru.boldyrev.ma.storeexample.dao.CategoryDAO" scope="application"/>
                <c:if test="${(categoryDAO.categories != null)&&(categoryDAO.categories.size()!=0)}">
                <c:forEach items="${categoryDAO.categories}" var="category">
                <c:forEach items="${productDAO.getProductById(category.id)}" var="product">
                <h3>${category.caption}</h3>
                <div class="product">
                    <a href="goods/${product.id}"><img
                            src="products/product${product.id}/${productDAO.getImgNameSmall(product)}"
                            alt="${product.name}, фото"><br>${product.caption}</a>
                </div>
                </c:forEach>
                </c:forEach>
                </c:if>
                <c:if test="${(categoryDAO.categories == null)||(categoryDAO.categories.size()==0)}">
                <c:forEach items="${productDAO.products}" var="product">
                <div class="product">
                    <a href="goods/${product.id}"><img
                            src="products/product${product.id}/${productDAO.getImgNameSmall(product)}"
                            alt="${product.name}, фото"><br>${product.caption}</a>
                </div>
                </c:forEach>
                </c:if>
        </main>
    </div>
    <%@include file="/blocks/footer.jsp" %>
</div>
</body>

</html>
