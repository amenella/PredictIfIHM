/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHMEmploye;

import METIER_MODELE.Client;
import Servlet.Action;
import javax.servlet.http.HttpServletRequest;
import METIER_MODELE.Employe;
import METIER_MODELE.Horoscope;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;



/**
 *
 * @author Lingfan
 */
public class ActionAuthEmp extends Action {

    @Override
    public void execute(HttpServletRequest request) {
        HttpSession session = request.getSession();
        
        String id = request.getParameter("ID");
        String mdp = request.getParameter("MdP");
        Employe e = this.serviceMedium.checkLoginEmploye(Integer.parseInt(id), mdp);
        List<Client> c = this.serviceMedium.getListClientsFromEmploye(e);
        List<String> derniersDates = new ArrayList<String>();
        if(e != null) {
            
            //remplir la liste des derniers horoscopes des clie ts
            for(int i=0;i<c.size();i++){
                String date = ""+this.serviceMedium.getLastHoroscopeFromClient(c.get(i)).getDate().getMonth();
                date = date+"/"+this.serviceMedium.getLastHoroscopeFromClient(c.get(i)).getDate().getDate();
                date = date+"/"+this.serviceMedium.getLastHoroscopeFromClient(c.get(i)).getDate().getYear();
                derniersDates.add(date);
            }
            
            request.setAttribute("ListeCLients",c);
            request.setAttribute("ListeDates",derniersDates);
            session.setAttribute("employe", e.getId());
        }
        
        
    }
    
}
