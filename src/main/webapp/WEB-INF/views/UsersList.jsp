<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Users List</title>
    </head>
    <body>
        <header>
            <h1>Users List</h1>
        </header>
        <main>
            <table>
                <tr>
                    <th>Id</th><th>User Name</th><th>Email</th><th>Address</th>
                </tr>
                <c:forEach items="${usersJsp}" var="user">
                <tr>
                    <td>${user.idUser}</td>
                    <td>${user.userName}</td>
                    <td>${user.email}</td>
                    <td>${user.address}</td>

                    <td><a href="showUser?id=${user.idUser}">Edit</a></td>

                    <td><a onClick="return confirm('Are you sure to delete this item?')" href="deleteUser?id=${user.idUser}">Delete</a></td>
                </tr>
                </c:forEach>
            </table>
        </main>
        <footer>
            <a href="createUser">User Creation</a>
        </footer>
    </body>
</html>
