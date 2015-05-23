/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMEmploye;

import METIER_MODELE.Client;
import METIER_MODELE.Prediction;
import Servlet.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lingfan
 */
public class ActionCreateHoroscope extends Action {

    @Override
    public void execute(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Client c = null;
        
       
        
        if(session.getAttribute("client") != null){
            c = this.serviceMedium.getClientById(Integer.parseInt((String)session.getAttribute("client")));
        }else{
            String clientId = request.getParameter("clientChoisi");
            c = this.serviceMedium.getClientById(Integer.parseInt(clientId));
            session.setAttribute("client",clientId );
        }
        
        request.setAttribute("clientName", c.getPrenom()+" "+c.getNom());
        if(session.getAttribute("travail") != null){
            String travailId = (String)session.getAttribute("travail");
            Prediction travail = this.serviceMedium.getPredictionById(Integer.parseInt(travailId));
            request.setAttribute("predictionTravail", travail);
        }
        
        if(request.getParameter("Retour") == null){
            if( session.getAttribute("travail fait") != null){
                String travailId = (String)request.getParameter("predictionChoisi");
                Prediction travail = this.serviceMedium.getPredictionById(Integer.parseInt(travailId));
                request.setAttribute("predictionTravail", travail);
                session.setAttribute("travail", travailId);
                session.removeAttribute("travail fait");
            }
        }
        
        
        if(session.getAttribute("sante") != null){
            String santeId = (String)session.getAttribute("sante");
            Prediction sante = this.serviceMedium.getPredictionById(Integer.parseInt(santeId));
            request.setAttribute("predictionSante", sante);
        }
        
        
        if(request.getParameter("Retour") == null){
            if( session.getAttribute("sante fait") != null ){
                String santeId = (String)request.getParameter("predictionChoisi");
                Prediction sante = this.serviceMedium.getPredictionById(Integer.parseInt(santeId));
                request.setAttribute("predictionSante", sante);
                session.setAttribute("sante", santeId);
                session.removeAttribute("sante fait");
            }
        }
        
           
        if(session.getAttribute("amour") != null){
            String amourId = (String)session.getAttribute("amour");
            Prediction amour = this.serviceMedium.getPredictionById(Integer.parseInt(amourId));
            request.setAttribute("predictionAmour", amour);
        }
        
        if(request.getParameter("Retour") == null){ 
            if(session.getAttribute("amour fait") != null){
                String amourId = (String)request.getParameter("predictionChoisi");
                Prediction amour = this.serviceMedium.getPredictionById(Integer.parseInt(amourId));
                request.setAttribute("predictionAmour", amour);
                session.setAttribute("amour", amourId);
                session.removeAttribute("amour fait");

            }
        }
        
       
        
    }
    
}
