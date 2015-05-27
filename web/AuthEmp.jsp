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
            <h1>Predict'IF</h1>
            <p>
            <form name="AuthEmp" id="formulaire" method="post" action="./ActionServlet">
                <label>
                    <span>Identifiant:</span>
                    <input type="text" name="ID" value="Identifiant">
                </label>

                <label>
                    <span>Mot de Passe:</span>
                    <input type="text" name="MdP" value="Mot de Passe"><br>
                </label>

                <label>
                    <input class="button" type="submit" name="todo" value="Connexion"><br>
                </label>

            </form>

        </p>
    </div> 
</body>
</html>
