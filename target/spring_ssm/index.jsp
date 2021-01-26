<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>F6系统</title>
    <link rel="stylesheet" href="all/css/layout.css"/>
</head>
<body>
<div class="background">
    <div class="_up">
        <h1>F6系统</h1>
    </div>
    <div class="_left">
    </div>
    <div class="_right">
        <form action="/myWeb/account/login.do">
            <table border="1">
                <tr>
                    <td>用户:</td>
                    <td>
                        <input type="text" name="user">
                    </td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="登录"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>

</body>
</html>
