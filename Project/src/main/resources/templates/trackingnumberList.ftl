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

<h1 class="hello-title">Tracking numbers list: </h1>

<div id="trackingNumberList">
    <table>
        <tr>
            <th>Tracking number:</th>
        </tr>
    <#list trackingNumbersList as numbers>
        <tr>
            <td>${product.productName}</td>
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
