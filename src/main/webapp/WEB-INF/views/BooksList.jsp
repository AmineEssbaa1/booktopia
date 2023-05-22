<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Books List</title>
    </head>
    <body>
        <header>
            <h1>Books List</h1>
        </header>
        <main>
            <table>
                <tr>
                    <th>Book Id</th><th>Title</th><th>ISBN</th><th>Publisher</th><th>Designation</th><th>Author</th><th>Date Publishing</th><th>Review</th>
                </tr>
                <c:forEach items="${booksJsp}" var="book">
                <tr>
                <td>${book.idBook}</td>
                <td>${book.title}</td>
                <td>${book.isbn}</td>
                <td>${book.publisher}</td>
                <td>${book.designationBook}</td>
                <td>${book.author}</td>
                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${book.datePublishing}" /></td>
                <td>${book.review}</td>

                <td><a href="showBook?id=${book.idBook}"
                    >Edit</a></td>

                <td><a onClick="return confirm('Are you sure to delete this item?')" href="deleteBook?id=${book.idBook}"
                    >Delete</a></td>
                </tr>
                </c:forEach>
            </table>
        </main>
        <footer>
            <a href = "createBook"> Book Creation</a>
        </footer>
    </body>
</html>