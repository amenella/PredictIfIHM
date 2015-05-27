<%-- 
    Document   : VueListeClients
    Created on : 11 mai 2015, 17:05:18
    Author     : ADRIEN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page import="METIER_MODELE.Client" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste Clients</title>
    </head>
    <body>
        <h1>Liste des clients</h1>
        
        <%
            List <Client> clients = (List <Client>) request.getAttribute("clients");
        %>
        
        <ul>
            <c:forEach var="client" items="${clients}">
                <li>
                    client : ${client.getCiv()} ${client.getNom()} ${client.getPrenom()}
                </li>
            </c:forEach>
        </ul>
        
    </body>
</html>
