<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <form action="survey" method="post">
        <p>Your Name: <input type="text" name="name"></p>
        <p>Dojo Location: 
            <select name="dojo">
                <option value="Seattle">Seattle</option>
                <option value="San Fran">San Fran</option>
                <option value="Dallas">Dallas</option>
            </select>
        </p> 
        <p>Favorite Language: 
            <select name="lang">
                <option value="Java">Java</option>
                <option value="JavaScript">JavaScript</option>
                <option value="Python">Python</option>
            </select>
        </p>
        <textarea name="comment" cols="30" rows="10"></textarea>
        <input type="submit" value="submit">
    </form>
</body>
</html>