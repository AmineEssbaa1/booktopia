<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Creation</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
</head>
<body>
<header>
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
</header>
<main class="container mt-4">
    <form action="saveUser" method="post">
        <div class="mb-3">
            <label hidden for="idUser">Id:</label>
            <input hidden type="text" id="idUser" name="idUser" class="form-control">
        </div>
        <div class="mb-3">
            <label for="userName">User Name:</label>
            <input type="text" id="userName" name="userName" class="form-control">
        </div>
        <div class="mb-3">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" class="form-control">
        </div>
        <div class="mb-3">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" class="form-control">
        </div>
        <div class="mb-3">
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" class="form-control">
        </div>
        <button type="submit" class="btn btn-primary">Save</button>
                        <a href="usersList" class="btn btn-secondary">Users List</a>

    </form>
    ${messageJsp}
</main>

<footer class="bg-dark text-white text-center py-3">
        <p>&copy; 2023 BookTopia. All rights reserved.</p>
    </footer>

<script src="webjars/bootstrap/5.2.0/js/bootstrap.min.js"></script>
</body>
</html>
