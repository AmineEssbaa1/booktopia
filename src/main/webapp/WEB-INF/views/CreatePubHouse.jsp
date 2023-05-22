<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Publishing House Creation</title>
    </head>
    <body>
        <header>
            <h1>Publishing House Creation</h1>
        </header>
        <main>
            <form action="savePubHouse" method="post">

                <div>
                    <label hidden for="idPubHouse">Id : </label>
                    <input hidden type="text" id="idPubHouse" name="idPubHouse">
                </div>
                <div>
                    <label for="namePubHouse">Name : </label>
                    <input type="text" id="namePubHouse" name="namePubHouse">
                </div>

                <div>
                     <label for="emailPubHouse"> Email : </label>
                     <input type="email" id="emailPubHouse" name="emailPubHouse" >
                </div>
                <div>
                     <label for="addressPubHouse"> Address : </label>
                     <input type="text" id="addressPubHouse" name="addressPubHouse" >
                </div>

                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
            ${messageJsp}
        </main>
        <footer>
            <a href="pubHousesList">Publishing House List </a>
        </footer>
    </body>
</html>

