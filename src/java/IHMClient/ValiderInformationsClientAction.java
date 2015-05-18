/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMClient;

import METIER_MODELE.*;
import Servlet.Action;
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
    }
    
}
