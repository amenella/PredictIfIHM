/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMClient;

import METIER_MODELE.*;
import Servlet.Action;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADRIEN
 */
public class CreerClientAction  extends Action{

    @Override
    public void execute(HttpServletRequest request) {
        // Create a session object if it is already not  created.
        HttpSession session = request.getSession(true);
        
        String civilite = (String) session.getAttribute("civilite");
        String nom = (String) session.getAttribute("nom");
        String prenom = (String) session.getAttribute("prenom");
        String ddn = (String) session.getAttribute("ddn");
        String adresse = (String) session.getAttribute("adresse");
        String mail = (String) session.getAttribute("mail");
        String telephone = (String) session.getAttribute("telephone");
        
        System.out.println("CREATION CLIENT");
        
        System.out.println(civilite + " " +nom+" "+prenom+" "+ddn+ " "+adresse+" "+mail+" " +telephone);
        
        Client newClient = new Client(civilite,nom,prenom,ddn,adresse,mail,telephone);
        
        this.serviceMedium.creerClient(newClient);
        
        String [] selectedIdMedium = (String[]) session.getAttribute("selectedIdMedium");
        
        for (int i=0; i < selectedIdMedium.length; i++ ){
            
            
        Medium medium = this.serviceMedium.getMediumById( Integer.parseInt(selectedIdMedium[i]) );
        this.serviceMedium.addMediumToClient(newClient, medium);
        
        
        }
        
        
        
    }
                
    
}

