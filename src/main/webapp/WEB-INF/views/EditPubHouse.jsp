<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Publishing House Edition</title>
    </head>
    <body>
        <header>
            <h1>Publishing House Edition</h1>
        </header>
        <main>
            <form action="updatePubHouse" method="post">
                <div>
                    <!--on peut ajouter un parametre au id: hidden -->
                    <label hidden for="idPubHouse">Id: </label>
                    <input hidden type="text" id="idPubHouse" name="idPubHouse" value="${pubHouseJsp.idPubHouse}">
                </div>
                <div>
                    <label for="namePubHouse">Name : </label>
                    <input type="text" id="namePubHouse" name="namePubHouse" value="${pubHouseJsp.namePubHouse}">
                </div>
                <div>
                    <label for="emailPubHouse">Email: </label>
                    <input type="email" id="emailPubHouse" name="emailPubHouse" value="${pubHouseJsp.emailPubHouse}">
                </div>
                <div>
                    <label for="addressPubHouse">Address: </label>
                    <input type="text" id="addressPubHouse" name="addressPubHouse" value="${pubHouseJsp.addressPubHouse}">
                </div>
                <div>
                    <input type="submit" value="update">
                </div>
            </form>
        </main>
        <footer>
            <a href="pubHousesList">Publishing Houses List</a>
        </footer>
    </body>
</html>
