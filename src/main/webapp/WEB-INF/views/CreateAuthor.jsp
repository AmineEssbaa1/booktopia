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
                     <label hidden for="idAuthor">Id: </label>
                     <input hidden type="text" id="idAuthor" name="idAuthor">
                </div>
                <div>
                    <label for="name">Name: </label>
                    <input type="text" id="name" name="name">
                </div>

                <div>
                    <label for="biography">Biography: </label>
                    <textarea id="biography" name="biography"></textarea>
                </div>

                <div>
                    <label for="nationality">Nationality: </label>
                    <input type="text" id="nationality" name="nationality">
                </div>

                <div>
                    <label for="dateBirth">Date of Birth: </label>
                    <input type="date" id="dateBirth" name="dateBirth" value="${now}">
                </div>

                <div>
                    <label for="dateDeath">Date of Death: </label>
                    <input type="date" id="dateDeath" name="dateDeath" value="${now}">
                </div>

                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="authorsList">Authors List</a>
        </footer>
    </body>
</html>
