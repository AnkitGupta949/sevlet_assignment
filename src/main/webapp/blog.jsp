<%--
  Created by IntelliJ IDEA.
  User: ankit
  Date: 28/2/18
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
<style>
    form{
    margin: 10%;
    border: solid 1px black;
    padding: 20px;
    height: 40%;
    align-content: center;
    width: 50%;
    }

    input{
        margin: 20px;
    }
    textarea{
        margin: 20px;
    }
</style>
</head>
<body style="background-color: burlywood">
<p>this is blog page</p>


<form action="saveserv">
     Blog Id :  <input type='number' name='blogid'></br>"
    Blog Content:</br>
    <textarea name="blogdata" rows="6" cols="40"></textarea></br>
    <input type="submit" value="save">
</form>
</body>
</html>
