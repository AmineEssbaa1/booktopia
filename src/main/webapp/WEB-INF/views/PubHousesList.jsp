<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Publishing Houses List</title>
    </head>
    <body>
        <header>
            <h1>Publishing Houses List</h1>
        </header>
        <main>
            <table>
                <tr>
                    <th>Id</th><th>Name</th><th>Email</th><th>Address</th>
                </tr>
                <c:forEach items="${pubHousesJsp}" var="pubHouse">
                <tr>
                <td>${pubHouse.idPubHouse}</td>
                <td>${pubHouse.namePubHouse}</td>
                <td>${pubHouse.emailPubHouse}</td>
                <td>${pubHouse.addressPubHouse}</td>


                <td><a href="showPubHouse?id=${pubHouse.idPubHouse}"
                    >Edit</a></td>

                <td><a onClick="return confirm('Are you sure to delete this item?')" href="deletePubHouse?id=${pubHouse.idPubHouse}"
                    >Delete</a></td>
                </tr>
                </c:forEach>
            </table>
        </main>
        <footer>
            <a href = "createPubHouse"> Publishing House Creation</a>
        </footer>
    </body>
</html>