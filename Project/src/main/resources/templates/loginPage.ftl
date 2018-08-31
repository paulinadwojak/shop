<#import "spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<h1>Welcome, please login:</h1>

<div id="login-box-bottom">
    <div id="username">
        <label for="email">Email:</label> </br>
        <input type="text" placeholder="Email" name="email" required> </div>

    <div id="password">
        <label for="password">Password:</label></br>
        <input type="password" placeholder="Password" name="password" required> </div>

    <div id="login-button">
        <button type="submit">Login</button>
    </div>

    <div id="password-forgotten">
        <a href="<@spring.url '/registrationForm'/>">Register</a> | <a href="#">I forgot my password </a></div>
</div>
</body>
</html>