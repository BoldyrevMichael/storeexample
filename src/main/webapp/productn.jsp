<%@ page import="javax.ws.rs.ForbiddenException" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<c:set scope="page" value="<%= Long.valueOf((String) request.getAttribute(\"idProduct\")) %>" var="idProduct"/>
<jsp:useBean id="productDAO" class="ru.boldyrev.ma.storeexample.dao.ProductDAO" scope="application"/>

<head>
    <meta charset="UTF-8">
    <title>${productDAO.getProductById(idProduct).caption.replaceAll("<br>"," ")}</title>
    <link rel="stylesheet" href="../style.css">
</head>

<body class="present-box">
<div class="container">
    <div class="content">
        <%@include file="/blocks/header.jsp" %>
        <main class="main">
            <% if (Long.valueOf((String) request.getAttribute("idProduct")) < 0) {
                request.getRequestDispatcher("/errors/error404").forward(request, response);
            }%>
            <h2>${productDAO.getProductById(idProduct).caption.replaceAll("<br>"," ")}</h2>
            <div class="about-product">
                <a href="../products/product${idProduct}/${productDAO.getImgName(productDAO.getProductById(idProduct))}"
                   target="_blank"><img
                        src="../products/product${idProduct}/${productDAO.getImgName(productDAO.getProductById(idProduct))}"
                        alt="${productDAO.getProductById(idProduct).caption.replaceAll("<br>"," ")}, фото"></a>
                <div class="description-and-buy">
                    <h3>Описание товара</h3>
                    <p>${productDAO.getProductById(idProduct).description}</p>
                    <h3>Характеристики товара</h3>
                    <ul class="characteristics">
                        <li>Вес: ${productDAO.getProductById(idProduct).weight} г,</li>
                        <li>Размер:
                            <ul>
                                <li>длина
                                    &mdash; ${productDAO.getProductById(idProduct).length}
                                    см,
                                </li>
                                <li>ширина
                                    &mdash; ${productDAO.getProductById(idProduct).width}
                                    см,
                                </li>
                                <li>высота
                                    &mdash; ${productDAO.getProductById(idProduct).height}
                                    см.
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <h3>Подробное описание товара</h3>
                    <p>${productDAO.getProductById(idProduct).detailedDescription}</p>
                    <button type="submit">Добавить в корзину</button>
                </div>
            </div>
        </main>
    </div>
    <%@include file="/blocks/footer.jsp" %>
</div>
</body>

</html>
