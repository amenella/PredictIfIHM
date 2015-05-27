<%-- 
    Document   : VueValidationCreationClient
    Created on : 25 mai 2015, 13:47:45
    Author     : ADRIEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    <body>
        
        <div class="wrapper">  
            <div id="formulaire">
                <form name="form1" id="formulairecontent" method="post" action="./ActionServlet">
                    <p>Félicitations ! Vous vous êtes bien inscrits au service Prédict'If ! </p>
                    <input type="hidden" name="todo" value="validerSelectionMediums">
                    <input class="button" type="submit" name="valider2" value="Retour Accueil">
                </form>
            </div>
        </div>
    </body>
</html>
