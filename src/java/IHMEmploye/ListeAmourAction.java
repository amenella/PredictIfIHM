package IHMEmploye;

import Servlet.Action;
import METIER_MODELE.Prediction;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lingfan
 */
public class ListeAmourAction extends Action {

    @Override
    public void execute(HttpServletRequest request) {
        List<Prediction> listeAmour;
        listeAmour = this.serviceMedium.getListAllAmour();
        request.setAttribute("listeAmour", listeAmour);
        
    }
    
}
