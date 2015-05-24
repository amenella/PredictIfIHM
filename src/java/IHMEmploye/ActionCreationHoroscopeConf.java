/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMEmploye;

import METIER_MODELE.Client;
import METIER_MODELE.Horoscope;
import METIER_MODELE.Medium;
import METIER_MODELE.Prediction;
import Servlet.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



/**
 *
 * @author Lingfan
 */
public class ActionCreationHoroscopeConf extends Action{

    @Override
    public void execute(HttpServletRequest request) {
        HttpSession session = request.getSession();
        
        
        String clientId = (String) session.getAttribute("client");
        String travailId = (String) session.getAttribute("travail");
        String santeId = (String) session.getAttribute("sante");
        String amourId = (String) session.getAttribute("amour");
        String mediumId = (String) request.getParameter("mediumChoisi");
        
        
        Prediction travail = this.serviceMedium.getPredictionById(Integer.parseInt(travailId));
        Prediction sante = this.serviceMedium.getPredictionById(Integer.parseInt(santeId));
        Prediction amour = this.serviceMedium.getPredictionById(Integer.parseInt(amourId));
        Medium medium = this.serviceMedium.getMediumById(Integer.parseInt(mediumId));
        Client client = this.serviceMedium.getClientById(Integer.parseInt(clientId));
        
        Horoscope horoscope = new Horoscope(amour,travail,sante,medium);
        this.serviceMedium.creerHoroscope(horoscope);
        this.serviceMedium.addHoroscopeToClient(client, horoscope);
        String mail = this.serviceMedium.getMailHoroscope(horoscope, client);
        
        request.setAttribute("mail", mail);
    
    }
}
