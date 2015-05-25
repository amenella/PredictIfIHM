<%-- 
    Document   : VueInfosCB
    Created on : 25 mai 2015, 11:36:38
    Author     : ADRIEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Infos CB</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    <body>
        <div class="wrapper">  
            <div id="formulaire">
                <form name="form1" id="formulairecontent" method="post" action="./ActionServlet">
                    <h1 class='titre'>Prédict'If</h1>
                    <h2>Finalisez votre inscription.</h2>
                    <p>Nous vous rappelons que l'inscription réclame un virement de 15€/mois.
                    Veuillez entrez vos coordonnées bancaires :</p>
                    
                    <label>
                        <span>Type de carte</span>
                        <SELECT name="typeCB" id="typeCB" size="1" required>
                            <OPTION>Carte Bleue
                            <OPTION>VISA
                            <OPTION>American Express
                            <OPTION>Mastercard
                            <OPTION>Electron
                        </SELECT>
                    </label>

                    <label>
                        <span>Numéro de la carte</span>
                        <input type="text"  name="numCB" id="numCB" required autofocus>
                    </label>

                    <label>
                        <span>Cryptogramme visuel</span>    
                        <input type="text" name="cryptoCB" id="cryptoCB" required>
                    </label>

                    <label>
                        <span>Date d'expiration</span>
                        <SELECT name="mois" size="1" required>
                            <OPTION>01
                            <OPTION>02
                            <OPTION>03
                            <OPTION>04
                            <OPTION>05
                            <OPTION>06
                            <OPTION>07
                            <OPTION>08
                            <OPTION>09
                            <OPTION>10
                            <OPTION>11
                            <OPTION>12
                        </SELECT>
                        <SELECT name="année" size="1" required>
                            <OPTION>2015
                            <OPTION>2016
                            <OPTION>2017
                            <OPTION>2018
                            <OPTION>2019
                            <OPTION>2020
                            <OPTION>2021
                        </SELECT>
                    </label>
                    <label>
                    <input class="checkbox" type="checkbox" name="cgu" required><p class="cgu">J'ai lu et j'accepte les CGU</p>
                    </label>
                    <input type="hidden" name="todo" value="creerClient">
                    <input class="button" type="submit" name="valider1" value="Valider">
                </form>
            </div>
        </div>
    </body>
</html>
