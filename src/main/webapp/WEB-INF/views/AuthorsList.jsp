<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Authors List</title>
    </head>
    <body>
        <header>
            <h1>Authors List</h1>
        </header>
        <main>
            <table>
                <tr>
                    <th>Author ID</th>
                    <th>Name</th>
                    <th>Biography</th>
                    <th>Nationality</th>
                    <th>Date of Birth</th>
                    <th>Date of Death</th>
                </tr>
                <c:forEach items="${authorsJsp}" var="author">
                    <tr>
                        <td>${author.idAuthor}</td>
                        <td>${author.name}</td>
                        <td>${author.biography}</td>
                        <td>${author.nationality}</td>
                        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${author.dateBirth}" /></td>
                        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${author.dateDeath}" /></td>
                        <td><a href="showAuthor?id=${author.idAuthor}">Edit</a></td>
                        <td><a onClick="return confirm('Are you sure you want to delete this author?')"
                               href="deleteAuthor?id=${author.idAuthor}">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </main>
        <footer>
            <a href="createAuthor">Author Creation</a>
        </footer>
    </body>
</html>
