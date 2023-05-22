<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" />
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Author Creation</title>
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

    <main class="container">
        <header class="my-4 text-center">
            <h1>Author Creation</h1>
        </header>
        <form action="saveAuthor" method="post">
            <div class="mb-3">
                <label hidden for="idAuthor">Id:</label>
                <input hidden type="text" id="idAuthor" name="idAuthor" class="form-control">
            </div>
            <div class="mb-3">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" class="form-control">
            </div>
            <div class="mb-3">
                <label for="biography">Biography:</label>
                <textarea id="biography" name="biography" class="form-control"></textarea>
            </div>
            <div class="mb-3">
                <label for="nationality">Nationality:</label>
                <input type="text" id="nationality" name="nationality" class="form-control">
            </div>
            <div class="mb-3">
                <label for="dateBirth">Date of Birth:</label>
                <input type="date" id="dateBirth" name="dateBirth" value="${now}" class="form-control">
            </div>
            <div class="mb-3">
                <label for="dateDeath">Date of Death:</label>
                <input type="date" id="dateDeath" name="dateDeath" value="${now}" class="form-control">
            </div>
            <div class="mb-3">
                <input type="submit" value="Save" class="btn btn-primary">
                <a href="authorsList" class="btn btn-secondary">Authors List</a>
            </div>
        </form>
        ${messageJsp}
    </main>

    <footer class="bg-dark text-white text-center py-3">
        <p>&copy; 2023 BookTopia. All rights reserved.</p>
    </footer>

    <script src="webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js
