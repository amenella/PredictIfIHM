<%-- 
    Document   : AcceuilEmp
    Created on : 18-May-2015, 16:35:39
    Author     : Lingfan
--%>

<%@page import="METIER_MODELE.Horoscope"%>
<%@page import="METIER_MODELE.Client"%>
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="METIER_MODELE.Prediction" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    <body>
        <h1>Predict'IF</h1> 
        <h1>Liste de Clients</h1>
        <form name="ClientList" id="formulaire" method="post" action="./ActionServlet">
            <select name="ListeClients"> 
                <% List<Client> listeClients =
                    (List<Client>) request.getAttribute("listeClients");
                   List<String> ListeDates = (List<String>) request.getAttribute("listeDates");
                %>
                
                <c:forEach var="i" begin="0" end="${ListeClients.size()}">
                    <option name="Client" value="${ListeClients.get(i).getId()}"> <span>${ListeClients.get(i).getPrenom()} ${ListeClients.get(i).getNom()}
                        ${ListeDates.get(i)}
                    </span>
                    </option>
                        
                </c:forEach>
            </select>
                
                <label>
                    <input type ="submit" name="todo" value="Consulter">
                </label>
                
                <label>
                    <input type ="submit" name="todo" value="Créer">
                </label>
           
                
        </form>
        
    </body>
</html>
