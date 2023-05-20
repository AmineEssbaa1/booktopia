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
            <h1>Category Creation</h1>
        </header>
        <main>
            <form action="saveCategory" method="post">

                <div>
                    <label for="description_category">description_category : </label>
                    <input type="text" id="description_category" name="description_category">
                </div>

                <div>
                     <label for="label"> label : </label>
                     <input type="text" id="label" name="label" >
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="CategoriesList">Category List </a>
        </footer>
    </body>
</html>

