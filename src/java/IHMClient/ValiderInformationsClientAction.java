/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMClient;

import METIER_MODELE.*;
import Servlet.Action;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADRIEN
 */
public class ValiderInformationsClientAction extends Action{

    @Override
    public void execute(HttpServletRequest request) {
        // Create a session object if it is already not  created.
        HttpSession session = request.getSession(true);
        
        
        String civilite = (String) request.getParameter("civilite");
        String nom = (String) request.getParameter("nom");
        String prenom = (String) request.getParameter("prenom");
        String ddn = (String) request.getParameter("ddn"); // chercher to parse string in date format
        String adresse = (String) request.getParameter("adresse");
        String mail = (String) request.getParameter("mail");
        String telephone = (String) request.getParameter("telephone");
        
        String naissance = "01/01/2000";
        
        //on change le format de la date
        try {
            SimpleDateFormat tmpFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date tmpDate = tmpFormat.parse(ddn);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            naissance = sdf.format(tmpDate);
        } catch (Exception e) {
            
        }
        
        session.setAttribute("civilite",civilite);
        session.setAttribute("nom",nom);
        session.setAttribute("prenom",prenom);
        session.setAttribute("ddn",naissance);
        session.setAttribute("adresse",adresse);
        session.setAttribute("mail",mail);
        session.setAttribute("telephone",telephone);
        
        List <Medium> listeMediums;
        listeMediums = this.serviceMedium.getListAllMedium();
        request.setAttribute("listeMediums", listeMediums);
        
    }
    
}
