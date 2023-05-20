<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reviews List</title>
</head>
<body>
<header>
    <h1>Reviews List</h1>
</header>
<main>
    <table>
        <tr>
            <th>Review ID</th>
            <th>Reader ID</th>
            <th>Book ID</th>
            <th>Date</th>
            <th>Rating</th>
            <th>Comments</th>
        </tr>
        <c:forEach items="${reviewsJsp}" var="review">
            <tr>
                <td>${review.idReview}</td>
                <td>${review.idReader}</td>
                <td>${review.idBook}</td>
                <td>
                    <fmt:formatDate value="${review.dateReview}" pattern="yyyy-MM-dd" />
                </td>
                <td>${review.rating}</td>
                <td>${review.reviewComments}</td>
            </tr>
        </c:forEach>
    </table>
</main>
<footer>
    <a href="createReview">Create Review</a>
</footer>
</body>
</html>
