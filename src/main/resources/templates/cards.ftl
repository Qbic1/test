<html>
<head>
    <title>Library Info System</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>

<body>

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