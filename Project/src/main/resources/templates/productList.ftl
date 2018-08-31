<#import "spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="resources/style.css">
    <link href="https://fonts.googleapis.com/css?family=Pacifico|Sacramento" rel="stylesheet"></head>


    <#assign header = "header.ftl"/>
    <#include "${header}"/>
</head>
<body>

<div id="menu">
    <ol>
        <li><a href="#">Home</a></li>
        <li><a href="#">Products</a></li>
        <li><a href="<@spring.url '/loginPage'/>">Your account</a></li>
        <li><a href="#">Contact</a></li>
    </ol>
</div>

<h1 class="hello-title">Products list: </h1>

<div id="productList">
<table>
    <tr>
        <th>name</th>
        <th>price</th>
        <th>description</th>
        <th>delete</th>
        <th>update</th>
    </tr>
    <#list productList as product>
        <tr>
            <td>${product.productName}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>
                <form action="deleteProduct" method="POST">
                    <input type="hidden" name="productId" value="${product.productId}">
                    <input type="submit" value="delete" class="delete" />
                </form>
            </td>
            <td>
                <form action="updateProduct" method="Get">
                    <input type="hidden" name="productId" value="${product.productId}">
                    <input type="submit" value="update" class="update"/>
                </form>
            </td>
        </tr>
    </#list>
</table>
</div>
<br>
<a href="<@spring.url '/addProductForm'/>"/>
<input type="button" value="add product"/>
</a>


<br><br><br><br>
<#assign footer = "footer.ftl"/>
<#include "${footer}"/>

</body>
</html>
