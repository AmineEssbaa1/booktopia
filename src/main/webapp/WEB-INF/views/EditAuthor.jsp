<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Author Edition</title>
    </head>
    <body>
        <header>
            <h1>Author Edition</h1>
        </header>
        <main>
            <form action="updateAuthor" method="post">
                <div>
                    <!-- Add a hidden field for the author ID -->
                    <label hidden for="idAuthor">ID: </label>
                    <input hidden type="text" id="idAuthor" name="idAuthor" value="${authorJsp.idAuthor}">
                </div>
                <div>
                    <label for="name">Name: </label>
                    <input type="text" id="name" name="name" value="${authorJsp.name}">
                </div>
                <div>
                    <label for="biography">Biography : </label>
                    <textarea id="biography" name="biography">${authorJsp.biography}</textarea>
                </div>
                <div>
                    <label for="nationality">Nationality : </label>
                    <input type="text" id="nationality" name="nationality" value="${authorJsp.nationality}">
                </div>
                <div>
                    <label for="dateBirth">Date of Birth : </label>
                    <fmt:formatDate pattern="yyyy-MM-dd" value="${authorJsp.dateBirth}" var="formatDate"/>
                    <input type="date" id="dateBirth" name="dateBirth" value="${formatDate}>
                </div>
                <div>
                    <label for="dateDeath">Date of Death : </label>
                    <fmt:formatDate pattern="yyyy-MM-dd" value="${authorJsp.dateDeath}" var="formatDate"/>
                    <input type="date" id="dateDeath" name="dateDeath" value="${formatDate}">
                </div>
                <div>
                    <input type="submit" value="update">
                </div>
            </form>
        </main>
        <footer>
            <a href="authorsList">Authors List</a>
        </footer>
    </body>
</html>
