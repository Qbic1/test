<html>
<head>
    <title>Library Info System</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>

<body>

<div class="form-style-2">
    <div class="form-style-2-heading">
        List of readers
    </div>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
        </tr>
    <#list readersFromServer as reader>
        <tr>
            <td>${reader.firstName}</td>
            <td>${reader.lastName}</td>
            <td>${reader.age}</td>
        </tr>
    </#list>
    </table>
    <form method="post" action="/library">
        <label for="firstName">First Name
            <input class="input-field" type="text" id="firstName" name="firstName">
        </label>
        <label for="lastName">Last Name
            <input class="input-field" type="text" id="lastName" name="lastName">
        </label>
        <label for="age">Age
            <input class="input-field" type="number" id="age" name="age">
        </label>
        <input type="submit" value="Add reader">
    </form>
</div>

<div class="form-style-2">
    <div class="form-style-2-heading">
        List of books
    </div>
    <table>
        <tr>
            <th>Title</th>
            <th>Author</th>
        </tr>
    <#list booksFromServer as book>
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
        </tr>
    </#list>
    </table>
    <form method="post" action="/library">
        <label for="title">Title
            <input class="input-field" type="text" id="title" name="title">
        </label>
        <label for="author">Author
            <input class="input-field" type="text" id="author" name="author">
        </label>
        <input type="submit" value="Add book">
    </form>
</div>

<div class="form-style-2">
    <div class="form-style-2-heading">
        List of cards
    </div>
    <table>
        <tr>
            <th>Reader</th>
            <th>Book</th>
        </tr>
    <#list cardsFromServer as card>
        <tr>
            <td>${card.reader}</td>
            <td>${card.book}</td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>