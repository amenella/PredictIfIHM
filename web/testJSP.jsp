<%-- 
    Document   : testJSP
    Created on : 11-May-2015, 16:23:38
    Author     : Lingfan
--%>

<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="METIER_MODELE.Prediction" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Page</title>
    </head>
    <body>
        <h1>Liste d'Amour</h1>
         <% List<Prediction> listeAmour =
                    (List<Prediction>) request.getAttribute("listeAmour");
            %>
        <ul>
           
            
            <c:forEach var="Predic" items="${listeAmour}">
                <li>
                    <span>${Predic.getCorps()}</span>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
