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
        
             
        
        <form name="TravailForm" id="formulaire" method="post" action="./ActionServlet">                
                
                <label>
                    <input type="text" name="travailId" value="${predictionTravail.getId()}" readonly>
                    <input type="text" name="travailIntensite" value="${predictionTravail.getIntensite()}" readonly>
                    <input type="text" name="travailCorps" value="${predictionTravail.getCorps()}" readonly>
                    <input type="hidden" name="travailSelect" value="foo">
                    <input type ="submit" name="todo" value="Selectionner">
                </label>
        
        </form>
        <form name="SanteForm" id="formulaire" method="post" action="./ActionServlet">
            
                <label>
                    <input type="text" name="santeId" value="${predictionSante.getId()}" readonly>
                    <input type="text" name="santeIntensite" value="${predictionSante.getIntensite()}" readonly>
                    <input type="text" name="santeCorps" value="${predictionSante.getCorps()}" readonly>
                    <input type="hidden" name="santeSelect" value="foo">
                    <input type ="submit" name="todo" value="Selectionner">
                </label>
        </form>
                    
        <form name="AmourForm" id="formulaire" method="post" action="./ActionServlet">
                    
                <label>
                    <input type="text" name="amourId" value="${predictionAmour.getId()}" readonly>
                    <input type="text" name="amourIntensite" value="${predictionAmour.getIntensite()}" readonly>
                    <input type="text" name="amourCorps" value="${predictionAmour.getCorps()}" readonly>
                    <input type="hidden" name="amourSelect" value="foo">
                    <input type ="submit" name="todo" value="Selectionner">
                </label>
           
                
        </form>
                    
        <form name="HoroscopeSubmit" id="formulaire" method="post" action="./ActionServlet">
            <input type ="submit" name="todo" value="Envoyer">
        </form>
        
    </body>
</html>
