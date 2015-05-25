/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMClient;

import METIER_MODELE.Medium;
import Servlet.Action;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADRIEN
 */
public class ValiderSelectionMediumsAction extends Action{

    @Override
    public void execute(HttpServletRequest request) {
        // Create a session object if it is already not  created.
        HttpSession session = request.getSession(true);
        
        String [] selectedIdMedium = request.getParameterValues("choixMedium");
        if(selectedIdMedium.length==0 || selectedIdMedium==null){
            //par défaut on attribut un medium
            String defaultIdMedium [] = {"0"};
            selectedIdMedium = defaultIdMedium;
        }
        session.setAttribute("selectedIdMedium", selectedIdMedium);
        /*
        for (int i=0; i < selectedIdMedium.length; i++ ){
            
            
        Medium medium = this.serviceMedium.getMediumById( Integer.parseInt(selectedIdMedium[i]) );
        //session.setAttribute("medium"+i, medium);
//        System.out.println("medium n°" + i + " : " + medium.getNom() );
        
        }
        
        String civilite = (String) session.getAttribute("civilite");
        String nom = (String) session.getAttribute("nom");
        String prenom = (String) session.getAttribute("prenom");
        Date ddn = (Date) session.getAttribute("ddn");
        String adresse = (String) session.getAttribute("adresse");
        String mail = (String) session.getAttribute("mail");
        String telephone = (String) session.getAttribute("telephone");
        
        List <Medium> listeMediums;
        listeMediums = this.serviceMedium.getListAllMedium();
        request.setAttribute("listeMediums", listeMediums);
    */
        
        
    }
                
    
}
