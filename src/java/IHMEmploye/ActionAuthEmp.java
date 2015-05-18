/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMEmploye;

import Servlet.Action;
import javax.servlet.http.HttpServletRequest;
import METIER_MODELE.Employe;



/**
 *
 * @author Lingfan
 */
public class ActionAuthEmp extends Action {

    @Override
    public void execute(HttpServletRequest request) {
        String id = request.getParameter("ID");
        String mdp = request.getParameter("MdP");
        Employe e = this.serviceMedium.checkLoginEmploye(Integer.parseInt(id), mdp);
        if(e != null) request.setAttribute("employe", e);
        
    }
    
}
