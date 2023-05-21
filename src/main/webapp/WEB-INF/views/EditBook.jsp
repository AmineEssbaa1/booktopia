<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Book Edition</title>
    </head>
    <body>
        <header>
            <h1>Book Edition</h1>
        </header>
        <main>
            <form action="updateBook" method="post">
                <div>
                    <!--on peut ajouter un parametre au id: hidden -->
                    <label hidden for="idBook">Book Id: </label>
                    <input hidden type="text" id="idBook" name="idBook" value="${bookJsp.idBook}">
                </div>
                <div>
                    <label for="title">Book Title: </label>
                    <input type="text" id="title" name="title" value="${bookJsp.title}">
                </div>
                <div>
                    <label for="isbn">ISBN: </label>
                    <input type="text" id="isbn" name="isbn" value="${bookJsp.isbn}">
                </div>
                <div>
                    <label for="publisher">Publisher: </label>
                    <input type="text" id="publisher" name="publisher" value="${bookJsp.publisher}">
                </div>
                <div>
                    <label for="designationBook">Designation: </label>
                    <input type="text" id="designationBook" name="designationBook" value="${bookJsp.designationBook}">
                </div>
                <div>
                     <label for="author">Author: </label>
                     <input type="text" id="author" name="author" value="${bookJsp.author}">
                </div>
                <div>
                    <label for="datePublishing"> Date Publishing : </label>
                    <fmt:formatDate pattern="yyyy-MM-dd" value="${bookJsp.datePublishing}" var="formatDate"/>
                    <input type="date" id="datePublishing" name="dateJsp" value="${formatDate}" >
                </div>
                <div>
                    <label for="review">Review: </label>
                    <input type="text" id="review" name="review" value="${bookJsp.review}">
                </div>
                <div>
                    <input type="submit" value="update">
                </div>
            </form>
        </main>
        <footer>
            <a href="booksList">Books List</a>
        </footer>
    </body>
</html>
