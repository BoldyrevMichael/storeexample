<%@ page import="javax.ws.rs.ForbiddenException" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Подарочная коробка</title>
    <link rel="stylesheet" href="../style.css">
</head>

<body class="present-box">
<div class="container">
    <div class="content">
        <%@include file="/blocks/header.jsp" %>
        <main class="main">
            <c:set scope="page" value="<%= (String) request.getAttribute(\"idProduct\") %>" var="idProduct"/>
            <jsp:useBean id="productDAO" class="ru.boldyrev_ma.storeexample.dao.ProductDAO" scope="application"/>
            <% if (productDAO.getIndexOfProduct((String) request.getAttribute("idProduct")) < 0) {
                request.getRequestDispatcher("/errors/error404").forward(request, response);
            }%>
            <h2>${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).imgCaption.replaceAll("<br>"," ")}</h2>
            <div class="about-product">
                <a href="../products/product${idProduct}/${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).imgName}"
                   target="_blank"><img
                        src="../products/product${idProduct}/${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).imgName}"
                        alt="${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).imgCaption.replaceAll("<br>"," ")}, фото"></a>
                <div class="description-and-buy">
                    <h3>Описание товара</h3>
                    <p>${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).description}</p>
                    <h3>Характеристики товара</h3>
                    <!--<table>
                    <tr>
                    <td>Вес:</td>
                    <td colspan="2">400 г</td>
                    </tr>
                    <tr>
                    <td rowspan="3">Размер:</td>
                    <td>ширина</td>
                    <td>20 см</td>
                    </tr>
                    <tr>
                    <td>длина</td>
                    <td>20 см</td>
                    </tr>
                    <tr>
                    <td>высота</td>
                    <td>10 см</td>
                    </tr>
                    </table>-->
                    <ul class="characteristics">
                        <li>Вес: ${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).weight} г,</li>
                        <li>Размер:
                            <ul>
                                <li>длина
                                    &mdash; ${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).length}
                                    см,
                                </li>
                                <li>ширина
                                    &mdash; ${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).width}
                                    см,
                                </li>
                                <li>высота
                                    &mdash; ${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).height}
                                    см.
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <h3>Подробное описание товара</h3>
                    <p>${productDAO.products.get(productDAO.getIndexOfProduct(idProduct)).detailedDescription}</p>
                    <button type="submit">Добавить в корзину</button>
                </div>
            </div>
        </main>
    </div>
    <%@include file="/blocks/footer.jsp" %>
</div>
</body>

</html>
