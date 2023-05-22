<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Users List</title>
        <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" />
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    <div class="container">
                        <a class="navbar-brand" href="#">User</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="booksList">Book</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="pubHousesList">Publishing House</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="authorsList">Author</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

        <main class="container">
            <header class="my-4 text-center">
                <h1>Users List</h1>
            </header>
            <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>User Name</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${usersJsp}" var="user">
                        <tr>
                            <td>${user.idUser}</td>
                            <td>${user.userName}</td>
                            <td>${user.email}</td>
                            <td>${user.address}</td>
                            <td><a href="showUser?id=${user.idUser}" class="btn btn-primary">Edit</a></td>
                            <td><a onClick="return confirm('Are you sure you want to delete this item?')"
                                href="deleteUser?id=${user.idUser}" class="btn btn-danger">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="mb-3">
                            <a href="createUser" class="btn btn-secondary">Create User</a>
            </div>
        </main>

        <footer class="bg-dark text-white text-center py-3">
            <p>&copy; 2023 BookTopia. All rights reserved.</p>
        </footer>

        <script src="webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
