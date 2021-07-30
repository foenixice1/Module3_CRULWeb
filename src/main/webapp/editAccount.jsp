<%--
  Created by IntelliJ IDEA.
  User: iU LOVE
  Date: 7/30/2021
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EditAccount</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>EDIT Khách Hàng</h2>
    <form  method="post">
        <table class="table">
            <tbody>
            <tr>
                <td><input placeholder="id" name="id" value="${list.id}" readonly></td>
                <td><input placeholder="use" name="use" value="${list.use}"></td>
                <td><input placeholder="passWord" name="passWord" value="${list.passWord}"></td>
                <td><input placeholder="gmail" name="gmail" value="${list.gmail}"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="btn btn-success">Edit</button>

    </form>
</div>
</body>
</html>
