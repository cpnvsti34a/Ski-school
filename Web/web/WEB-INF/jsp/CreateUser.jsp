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
        <spring:nestedPath path="user">
            <form action="" method="post">
                Nom d'utilisateur: 
                <spring:bind path="userName">
                    <input type="text" name="${status.expression}" value="${userName}" />
                </spring:bind>
                    <br />Mot de passe: 
                <spring:bind path="password">
                    <input type="text" name="${status.expression}" value="${password}" />
                </spring:bind>
                    <br />Nom: 
                <spring:bind path="name">
                    <input type="text" name="${status.expression}" value="${name}" />
                </spring:bind>
                    <br />Prénom: 
                <spring:bind path="lastName">
                    <input type="text" name="${status.expression}" value="${lastName}" />
                </spring:bind>
                    <br />NPA: 
                <spring:bind path="zip">
                    <input type="text" name="${status.expression}" value="${zip}" />
                </spring:bind>
                    <br />City: 
                <spring:bind path="city">
                    <input type="text" name="${status.expression}" value="${city}" />
                </spring:bind>
                    <br />Country: 
                <spring:bind path="country">
                    <input type="text" name="${status.expression}" value="${country}" />
                </spring:bind>
                <input type="submit" value="OK">
            </form>
        </spring:nestedPath>
    </body>
</html>
