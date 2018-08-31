<#import "spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<form action="saveUser"  method="POST">

<div id="login-box-bottom">
    <div id="name">
        <label for="name">Name:</label>
        <input type="text" placeholder="Name" name="name" required> </div>

    <div id="surname">
        <label for="surname">Surname:</label>
        <input type="text" placeholder="Surname" name="surname" required> </div>

    <div id="email">
        <label for="email">Email:</label>
        <input type="text" placeholder="Email" name="email" required> </div>

    <div id="password">
        <label for="password">Password:</label>
        <input type="password" placeholder="Password" name="password" required> </div>

    <input type="submit" value="register" class="save"/>

</form>

</body>
</html>