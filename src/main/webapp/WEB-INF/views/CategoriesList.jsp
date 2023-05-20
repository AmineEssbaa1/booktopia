<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Category List</title>
    </head>
    <body>
        <header>
            <h1>Category List</h1>
        </header>
        <main>
              <table >
                <tr>
                  <th>Category Id</th><th>description_category</th><th>Label</th>
                </tr>
                   <c:forEach items="${categoriesJsp}" var="category">
                   <tr>
                        <td>${category.idCategory}</td>
                        <td>${category.description_category}</td>
                        <td>${category.label}</td>
                        <td><a onClick="return confirm('Are you delete this item')" href="deleteCategory?id=${category.idCategory}">DELETE </a></td>
                     <td><a onClick="return confirm('Are you sure you want to update this item?')" href="showCategory?id=${category.idCategory}">Update</a></td>

                   </tr>
                   </c:forEach>
              </table>
        </main>
        <footer>
            <a href="createCategory">Category Creation</a>
        </footer>
    </body>
</html>



