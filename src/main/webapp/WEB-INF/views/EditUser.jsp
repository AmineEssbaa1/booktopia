<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Edition</title>
    </head>
    <body>
        <header>
            <h1>User Edition</h1>
        </header>
        <main>
            <form action="updateUser" method="post">
                <div>
                    <!--on peut ajouter un parametre au id: hidden -->
                    <label hidden for="idUser">Id: </label>
                    <input hidden type="text" id="idUser" name="idUser" value="${userJsp.idUser}">
                </div>
                <div>
                    <label for="userName">Name: </label>
                    <input type="text" id="userName" name="userName" value="${userJsp.userName}">
                </div>
                <div>
                     <label for="email">Email: </label>
                     <input type="email" id="email" name="email" value="${userJsp.email}">
                </div>
                <div>
                    <label for="password">Password: </label>
                    <input type="password" id="password" name="password" value="${userJso.password}">
                </div>

                <div>
                    <label for="address">Address: </label>
                    <input type="text" id="address" name="address" value="${userJsp.address}">
                </div>
                <div>
                    <input type="submit" value="update">
                </div>
            </form>
        </main>
        <footer>
            <a href="usersList">Users List</a>
        </footer>
    </body>
</html>
