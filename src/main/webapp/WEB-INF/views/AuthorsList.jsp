<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Authors List</title>
</head>
<body>
<header>
    <h1>Author List</h1>
</header>
<main>
    <table>
        <tr>
            <th>Author ID</th>
            <th>Name</th>
            <th>Nationality</th>
            <th>Biography</th>
        </tr>
        <c:forEach items="${authorsJsp}" var="author">
            <tr>
                <td>${author.idAuthor}</td>
                <td>${author.name}</td>
                <td>${author.nationality}</td>
                <td>${author.biography}</td>
                <td><a onClick="return confirm('Are you sure you want to delete this item?')" href="deleteAuthor?id=${author.idAuthor}">DELETE</a></td>
                <td><a onClick="return confirm('Are you sure you want to update this item?')" href="showAuthor?id=${author.idAuthor}">Update</a></td>
            </tr>
        </c:forEach>
    </table>
</main>
<footer>
    <a href="createAuthor">Author Creation</a>
</footer>
</body>
</html>
