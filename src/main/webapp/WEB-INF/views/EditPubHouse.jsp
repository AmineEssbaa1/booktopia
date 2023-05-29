<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Publishing House</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Publishing House</a>
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
        <form action="updatePubHouse" method="post">
            <div class="mb-3">
                <input hidden type="text" id="idPubHouse" name="idPubHouse" value="${pubHouseJsp.idPubHouse}">
            </div>
            <div class="mb-3">
                <label for="namePubHouse" class="form-label">Name:</label>
                <input type="text" id="namePubHouse" name="namePubHouse" value="${pubHouseJsp.namePubHouse}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="emailPubHouse" class="form-label">Email:</label>
                <input type="email" id="emailPubHouse" name="emailPubHouse" value="${pubHouseJsp.emailPubHouse}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="addressPubHouse" class="form-label">Address:</label>
                <input type="text" id="addressPubHouse" name="addressPubHouse" value="${pubHouseJsp.addressPubHouse}" class="form-control">
            </div>
            <div class="mb-3">
                <input type="submit" value="Update" class="btn btn-primary">
                <a href="pubHousesList" class="btn btn-secondary">Publishing Houses List</a>
            </div>
        </form>
    </main>

    <footer class="bg-dark text-white text-center py-3">
        <p>&copy; 2023 BookTopia. All rights reserved.</p>
    </footer>

    <script src="webjars/bootstrap/5.2.0/css/bootstrap.min.css"></script>
</body>
</html>
