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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
           
            <select name="clientChoisi" size="5" dir="rtl"> 
                <c:forEach items="${ListeClients}" var="c" varStatus="status" >
                    
                    <option  value="${c.getId()}">
                        <fmt:formatDate pattern="yyyy-MM-dd" value="${ListeDates[status.index]}" />
                        <c:out value="${c.getPrenom()}"/>
                        
                    </option>
                </c:forEach>
                
                
            </select>
                
                <label>
                    <input type ="submit" name="todo" value="ConsulterHoroscopesClient">
                </label>
                
                <label>
                    <input type ="submit" name="todo" value="Creer">
                </label>
           
                
        </form>
        
    </body>
</html>
