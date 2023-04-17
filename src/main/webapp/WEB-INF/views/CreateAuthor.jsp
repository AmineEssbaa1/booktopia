<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Author Creation</title>
    </head>
    <body>
        <header>
            <h1>Author Creation</h1>
        </header>
        <main>
            <form action="saveAuthor" method="post">

                <div>
                    <label for="name">User Name : </label>
                    <input type="text" id="name" name="name">
                </div>
                <div>
                    <label for="biography"> Biography : </label>
            	     <input type="biography" id="biography" name="biography" >
                </div>
                <div>
                     <label for="nationality"> Nationality : </label>
                     <input type="nationality" id="nationality" name="nationality" >
                </div>

                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="AuthorsList">Autohrs List</a>
        </footer>
    </body>
</html>

