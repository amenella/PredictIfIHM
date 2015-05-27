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
        <h1>Prédiction selectionnée: ${horoscopeId}</h1>
        
               
        
        <form name="HoroscopeList" id="formulaire" method="post" action="./ActionServlet">  
            
                <textarea id="horoscope" rows="25" cols="100">
                    ${horoscopeMail}
                </textarea>
                
                <input id="acceuilbutton" type ="submit" name="todo" value="Creer">
            
                <input type ="hidden" name="todo" value="RetourConsultation">
            
                <input id="acceuilbutton" type ="submit" name="Retour" value="Retour">
           
                
        </form>
        
    </body>
</html>
