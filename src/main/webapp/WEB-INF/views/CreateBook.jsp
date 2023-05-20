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
            <h1>Book Creation</h1>
        </header>
        <main>
            <form action="saveBook" method="post">

                <div>
                    <label for="designationBook">designationBook : </label>
                    <input type="text" id="designationBook" name="designationBook">
                </div>
                <div>
                    <label for="Author"> Author : </label>
            	     <input type="text" id="Author" name="Author" >
                </div>
                <div>
                     <label for="Review"> Review : </label>
                     <input type="text" id="Review" name="Review" >
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="BooksList">Books List</a>
        </footer>
    </body>
</html>

