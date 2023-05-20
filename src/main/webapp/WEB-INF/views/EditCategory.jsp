<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product Creation</title>
    </head>
    <body>
        <header>
            <h1>Category Edition</h1>
        </header>
        <main>
            <form action="updateCategory" method="post">
                <div>
                    <label hidden for="idCategory">Categorie Id : </label>
                    <input hidden type="text" id="idCategory" name="idCategory" value="${categoryJsp.idCategory}">
                </div>
                <div>
                    <label for="description_category">description_category : </label>
                    <input type="text" id="description_category" name="description_category"
                    value="${categoryJsp.description_category}">
                </div>
                <div>
                    <label for="label">label : </label>
                    <input type="text" id="label" name="label" value="${categoryJsp.label}">
                </div>
                <div>
                    <input type="submit" value="update">
                </div>
            </form>
        </main>
        <footer>
            <a href="CategoriesList">Categories List</a>
        </footer>
    </body>
</html>

