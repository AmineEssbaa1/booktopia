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
                    <label for="title">Title : </label>
                    <input type="text" id="title" name="title">
                </div>

                <div>
                    <label for="isbn">ISBN : </label>
                    <input type="text" id="isbn" name="isbn">
                </div>

                <div>
                    <label for="publisher">Publisher : </label>
                    <input type="text" id="publisher" name="publisher">
                </div>

                <div>
                    <label for="designationBook">Designation : </label>
                    <input type="text" id="designationBook" name="designationBook">
                </div>
                <div>
                    <label for="author"> Author : </label>
            	     <input type="text" id="author" name="author" >
                </div>
                 <div>
                      <label for="datePublishing"> Date Publishing : </label>
                      <input type="date" id="datePublishing" name="dateJsp" value="${now}" >
                </div>
                <div>
                     <label for="review"> Review : </label>
                     <input type="text" id="review" name="review" >
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="booksList">Books List</a>
        </footer>
    </body>
</html>

