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

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    <body>
        <h1>Predict'IF</h1> 
        <h1>Client: ${clientName}</h1>
       
        
        <form name="HoroscopeList" id="formulaire" method="post" action="./ActionServlet">
           
            <select name="predictionChoisi" size="5 "> 
                <c:forEach items="${Liste}" var="c" >
                    
                    <option value="${c.getId()}">
                        <c:out value="${c.getId()} ${c.getIntensite()} ${c.getCorps()}"/>
                    </option>
                </c:forEach>
                
                
            </select>
                <input type ="hidden" name="todo" value="PredictionSlectionnee">    
            
                <label>
                    <input type ="submit" name="Selectionner" value="Selectionner">
                </label>
        </form>
        
        <form name="RetourSansSelection" id="formulaire" method="post" action="./ActionServlet">
            <label>
                    <input type ="hidden" name="todo" value="RetourSansSelection">    
                    <input type ="submit" name="Retour" value="Retour">
            </label>
            
        </form>
        
                
        
       
        
    </body>
</html>
