<%--
  Created by IntelliJ IDEA.
  User: ankit
  Date: 27/2/18
  Time: 11:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      form{
        margin: 10%;
        border: solid 1px black;
        padding: 20px;
        height: 20%;
        align-content: center;
        width: 50%;
      }

      #loginid{
        margin: 20px;
      }

      #submitbtn{
        align-content: center;
        margin-left: 30%;
      }

      #loginpwd{
        margin: 20px;
      }


    </style>
  </head>
  <body style="background-color: blanchedalmond">

  <form action="logpage">
    Login ID : <input type="text" name="username" id="loginid"></br>
    Password : <input type="text" name="password" id="loginpwd"></br>
      <input type="submit" value="login" id="submitbtn">

  </form>


  </body>
</html>
