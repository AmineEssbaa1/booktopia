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
    <link rel="stylesheet" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
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

    <main class="container mt-4">
        <form action="updateUser" method="post">
            <div class="mb-3">
                <input hidden type="text" id="idUser" name="idUser" value="${userJsp.idUser}">
            </div>
            <div class="mb-3">
                <label for="userName" class="form-label">Name:</label>
                <input type="text" id="userName" name="userName" value="${userJsp.userName}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" id="email" name="email" value="${userJsp.email}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password:</label>
                <input type="password" id="password" name="password" value="${userJsp.password}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="address" class="form-label">Address:</label>
                <input type="text" id="address" name="address" value="${userJsp.address}" class="form-control">
            </div>
            <div class="mb-3">
                <input type="submit" value="Update" class="btn btn-primary">
                                <a href="usersList" class="btn btn-secondary">Users List</a>

            </div>
        </form>
    </main>

    <footer class="bg-dark text-white text-center py-3">
        <p>&copy; 2023 BookTopia. All rights reserved.</p>
    </footer>

    <script src="webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
