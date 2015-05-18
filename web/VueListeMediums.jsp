<%-- 
    Document   : VueListeClients
    Created on : 11 mai 2015, 17:05:18
    Author     : ADRIEN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page import="METIER_MODELE.Medium" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste Mediums</title>
    </head>
    <body>
        <h1>Predict'If</h1>
        <p>Sélectionnez vos mediums :</p>

        <%
            List<Medium> listeMediums = (List<Medium>) request.getAttribute("listeMediums");
        %>

        <ul>
            <c:forEach var="medium" items="${listeMediums}">
                    <table width=100%>
                        <tr>
                            <td rowspan="2" width=30%>photo</td>
                            <td width=60%>${medium.getNom()}</td>
                            <td rowspan="2" width=10%><INPUT type="checkbox" name="choix1" value="${medium.getId()}"></td> 
                       
                        </tr>
                        <tr>
                            <td width=60%>${medium.getBio()}</td>
                        </tr>
                    </table>
                    <br>
            </c:forEach>
        </ul>

    </body>
</html>
