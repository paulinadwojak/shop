<#import "spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="resources/style.css">
    <title>Add product</title>
</head>
<body>
<div id="addProduct"><p>Add product:</p></div><br>

<form action="saveProduct"  method="POST">
    <input type="hidden" name="productId" value="${product.productId}">

    <tr>
        <td><label>Product name:</label></td>
        <th><input type="text" name="productName"/></th>
    </tr><br>
    <tr>
        <td><label>Product price</label></td>
        <th><input type="text" name="price"></th>
    </tr><br>
    <tr>
        <td><label>Product description</label></td>
        <th><input type="text" name="description"></th>
    </tr><br><br>

    <tr>
        <td><input type="submit" value="save" class="save"/></td>
    </tr>
</form>

</body>
</html>