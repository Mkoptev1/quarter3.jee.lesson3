<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"/>

<body>
    <div class="container">
        <jsp:include page="navmenu.jsp"/>
        <br>
        <h1>Каталог товаров</h1>
        <br>
        <table>
            <tr>
                <th>ID товара</th>
                <th>Наименование товара</th>
                <th>Цена товара</th>
                <th></th>
            </tr>
            <c:forEach var="crsProducts" items="${products}">
                <tr>
                    <td>${crsProducts.id}</td>
                    <td>${crsProducts.title}</td>
                    <td>${crsProducts.price}</td>
                    <td>
                       <span><button type="button">Добавить в корзину</button></span>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>