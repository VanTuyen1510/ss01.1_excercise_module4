
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate to Vietnamese</title>
</head>
<body>
<form method="post"action="/trans">
    <fieldset>
        <legend>Translate Vietnamese</legend>
        <table>
            <tr>
                <td>Enter English world:</td>
                <td><input type="text"name="world"placeholder="English"></td>
                <td><input type="submit"value="translate"></td>
            </tr>
            <tr><td>${result}</td></tr>
        </table>
    </fieldset>
</form>
</body>
</html>
