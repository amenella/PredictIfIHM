<%-- 
    Document   : AuthEmp
    Created on : 18-May-2015, 14:31:22
    Author     : Lingfan
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
        <div>
            <h1 align="center">Predict'IF</h1>
            <p>
            <form name="AuthEmp" id="formulaire" method="post" action="./ActionServlet">
                
                <label id="loginlabel" for="logintext">Identifiant:</label>                    
                <input id="logintext" type="text" name="ID">
                
                <label id="loginlabel" for="logintext">Mot de passe:</label>
                <input id="logintext" type="text" name="MdP"><br>

                
                <input id="loginbutton" type="submit" name="todo" value="Connexion"><br>
                

            </form>

        </p>
    </div> 
</body>
</html>
