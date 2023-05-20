<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Create Review</title>
</head>
<body>
<header>
    <h1>Create Review</h1>
</header>
<main>
    <form action="saveReview" method="post">
        <label for="idReader">Reader ID:</label>
        <input type="text" id="idReader" name="idReader"><br><br>

        <label for="idBook">Book ID:</label>
        <input type="text" id="idBook" name="idBook"><br><br>

        <label for="dateReview">Review Date:</label>
        <input type="text" id="dateReview" name="dateReview"><br><br>

        <label for="rating">Rating:</label>
        <input type="text" id="rating" name="rating"><br><br>

        <label for="reviewComments">Review Comments:</label>
        <textarea id="reviewComments" name="reviewComments"></textarea><br><br>

        <input type="submit" value="Save Review">
    </form>
</main>
<footer>
    <a href="reviewsList">View Reviews</a>
</footer>
</body>
</html>
