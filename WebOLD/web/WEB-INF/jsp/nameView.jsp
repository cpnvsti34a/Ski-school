<%-- 
    Document   : nameView
    Created on : 29 nov. 2011, 14:31:16
    Author     : Lionel.MARMIER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>From</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <spring:nestedPath path="name">
            <form action="" method="post">
                Name: 
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.value}" />
                </spring:bind>
                <input type="submit" value="OK">
            </form>
        </spring:nestedPath>
    </body>
</html>
