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
    <link rel="stylesheet" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container">
                    <a class="navbar-brand" href="#">Author</a>
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
        <form action="updateAuthor" method="post">
            <div class="mb-3">
                <input hidden type="text" id="idAuthor" name="idAuthor" value="${authorJsp.idAuthor}">
            </div>
            <div class="mb-3">
                <label for="name" class="form-label">Name:</label>
                <input type="text" id="name" name="name" value="${authorJsp.name}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="biography" class="form-label">Biography:</label>
                <textarea id="biography" name="biography" class="form-control">${authorJsp.biography}</textarea>
            </div>
            <div class="mb-3">
                <label for="nationality" class="form-label">Nationality:</label>
                <input type="text" id="nationality" name="nationality" value="${authorJsp.nationality}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="dateBirth" class="form-label">Date of Birth:</label>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${authorJsp.dateBirth}" var="formatDate"/>
                <input type="date" id="dateBirth" name="dateBirth" value="${formatDate}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="dateDeath" class="form-label">Date of Death:</label>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${authorJsp.dateDeath}" var="formatDate"/>
                <input type="date" id="dateDeath" name="dateDeath" value="${formatDate}" class="form-control">
            </div>
            <div class="mb-3">
                <input type="submit" value="Update" class="btn btn-primary">
                <a href="authorsList" class="btn btn-secondary">Authors List</a>
            </div>
        </form>
    </main>

    <footer class="bg-dark text-white text-center py-3">
        <p>&copy; 2023 BookTopia. All rights reserved.</p>
    </footer>

    <script src="webjars/bootstrap/5.2.0/css/bootstrap.min.css"></script>
</body>
</html>
