/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMEmploye;

import METIER_MODELE.Client;
import METIER_MODELE.Prediction;
import Servlet.Action;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lingfan
 */
public class ActionPredictionSelect extends Action {

    @Override
    public void execute(HttpServletRequest request) {
        HttpSession session = request.getSession();
        
        Client c = this.serviceMedium.getClientById(Integer.parseInt((String)session.getAttribute("client")));
        request.setAttribute("clientName", c.getPrenom()+" "+c.getNom());
        
        
        if(request.getParameter("travailSelect") != null){  
            
            List<Prediction> listeTravail = this.serviceMedium.getListAllTravail();
            session.setAttribute("travail fait", "");
            request.setAttribute("Liste", listeTravail);
        }
        
         if(request.getParameter("santeSelect") != null){       
             
             List<Prediction> listeSante = this.serviceMedium.getListAllSante();
             session.setAttribute("sante fait", "");
             request.setAttribute("Liste", listeSante);
        }
         
          if(request.getParameter("amourSelect") != null){   
              
              List<Prediction> listeAmour = this.serviceMedium.getListAllAmour();
              request.setAttribute("Liste", listeAmour);
              session.setAttribute("amour fait", "");
        }
          
          
          
          
    }
    
}
