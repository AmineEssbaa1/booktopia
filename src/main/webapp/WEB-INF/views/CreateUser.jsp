<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Creation</title>
    </head>
    <body>
        <header>
            <h1>User Creation</h1>
        </header>
        <main>
            <form action="saveUser" method="post">

                <div>
                    <label hidden for="idUser">Id : </label>
                    <input hidden type="text" id="idUser" name="idUser">
                </div>
                <div>
                    <label for="userName">User Name : </label>
            	     <input type="text" id="userName" name="userName" >
                </div>
                <div>
                     <label for="email">Email : </label>
                     <input type="email" id="email" name="email" >
                </div>
                <div>
                      <label for="password">Password : </label>
                      <input type="password" id="password" name="password" >
                </div>
                <div>
                       <label for="address">Address : </label>
                       <input type="text" id="address" name="address" >
                                </div>
                </div>
                </div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="usersList">Users List</a>
        </footer>
    </body>
</html>

