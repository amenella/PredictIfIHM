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
    </head>
    <body>
        <div>
            <h1>Predict'IF</h1>
            <p>
            <form name="AuthEmp" id="AuthEmp" method="post" action="./AuthEmpAction">
                Identifiant:<br>
                <input type="text" name="ID" value="Identifiant"><br>
                Mot de Passe:<br>
                <input type="text" name="MdP" value="Mot de Passe"><br>
                
            </form>
                
            </p>
        </div> 
    </body>
</html>
