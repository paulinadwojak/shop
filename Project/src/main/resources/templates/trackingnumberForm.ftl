<#import "spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<form action="checkStatus"  method="POST">

  <label>Tracking number:</label>
  <input type="text" name="trackingNumber" />

  <input type="submit" value="check status" class="save"/>
</form>

  <label>Tracking number status:</label>
  <input type="text" name="trackingNumberStatus"/>

</body>
</html>