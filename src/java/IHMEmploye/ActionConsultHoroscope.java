/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMEmploye;

import METIER_MODELE.Client;
import METIER_MODELE.Horoscope;
import Servlet.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lingfan
 */
public class ActionConsultHoroscope extends Action{

    @Override
    public void execute(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String idString = request.getParameter("horoscopeChoisi");
        int id = Integer.parseInt(idString);
        Horoscope h = this.serviceMedium.getHoroscopeById(id);
        int idClient = ((Integer.parseInt((String)session.getAttribute("client"))));
        Client c = this.serviceMedium.getClientById(idClient);
        String mail = this.serviceMedium.getMailHoroscope(h, c);
        request.setAttribute("horoscopeMail", mail);
        request.setAttribute("horoscopeId", h.getId());
    }
    
}
