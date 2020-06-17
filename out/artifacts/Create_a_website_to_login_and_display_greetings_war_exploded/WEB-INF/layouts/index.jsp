<%--
  Created by IntelliJ IDEA.
  User: toanv
  Date: 17/06/2020
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8"/>
    <title>LOGIN</title>
    <style>
      html, body {
        background: #f6f6f6;
      }

      form {
        max-width: 800px;
        margin: 20px auto;
        padding: 20px;
        background: #fff;
        box-shadow: 0px 1px 4px 0px #ccc;
      }


    </style>
  </head>
  <body>
  <form method="POST">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="username" size="30"  placeholder="username" />
      <input type="password" name="password" size="30" placeholder="password" />
      <input type="submit" value="Sign in"/>
    </div>
  </form>
  </body>
</html>
