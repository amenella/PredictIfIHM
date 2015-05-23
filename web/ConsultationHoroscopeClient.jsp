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
        <h1>Nom CLient: ${nomClient}</h1>
       
        
        <form name="HoroscopeList" id="formulaire" method="post" action="./ActionServlet">
           
            <select name="horoscopeChoisi" size="5 "> 
                <c:forEach items="${ListeHoroscopes}" var="c" >
                    
                    <option value="${c.getId()}">
                        <c:out value="${c.getId()} ${c.getDate()}"/>
                    </option>
                </c:forEach>
                
                
            </select>
                
                <label>
                    <input type ="submit" name="todo" value="ConsulterHoroscope">
                </label>
                
                <label>
                    <input type ="submit" name="todo" value="Créer">
                </label>
            
                <label>
                    <input type ="submit" name="todo" value="RetourAcceuil">
                </label>
           
                
        </form>
        
    </body>
</html>
