<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Book Creation</title>
    </head>
    <body>
        <header>
            <h1>User Creation</h1>
        </header>
        <main>
            <form action="saveUser" method="post">

                <div>
                    <label for="UserName">UserName : </label>
                    <input type="text" id="UserName" name="UserName">
                </div>
                <div>
                    <label for="Password"> Password : </label>
            	     <input type="Password" id="Password" name="Password" >
                </div>
                <div>
                     <label for="Email"> Email : </label>
                     <input type="text" id="Email" name="Email" >
                </div>
                      <label for="Address"> Address : </label>
                      <input type="text" id="Address" name="Address" >
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="booksList">Users List</a>
        </footer>
    </body>
</html>

