/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMEmploye;

import METIER_MODELE.Client;
import METIER_MODELE.Horoscope;
import Servlet.Action;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lingfan
 */
public class ActionConsultHoroscopeClient extends Action {

    @Override
    public void execute(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Client c = null;
        if(session.getAttribute("client")==null){
            String id = (String) request.getParameter("clientChoisi");
            c = this.serviceMedium.getClientById(Integer.parseInt(id));
            session.setAttribute("client", id);
        }else{
            String id = (String) session.getAttribute("client");
            c = this.serviceMedium.getClientById(Integer.parseInt(id));
        }
        List<Horoscope> ListeHoroscopes = (List<Horoscope>)this.serviceMedium.getListHoroscopeFromClient(c);
        String nomClient = c.getPrenom() +" "+ c.getNom();
        request.setAttribute("nomClient", nomClient);
        request.setAttribute("ListeHoroscopes",ListeHoroscopes);
        
        
    }
    
    
}
