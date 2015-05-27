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
import java.util.Date;
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
        Employe e = null;
        if(session.getAttribute("employe")==null){
            String id = request.getParameter("ID");
            String mdp = request.getParameter("MdP");
            e = this.serviceMedium.checkLoginEmploye(Integer.parseInt(id), mdp);
            session.setAttribute("employe", id);
        }else{
            String id =(String) session.getAttribute("employe");
            e = this.serviceMedium.getEmployeById(Integer.parseInt(id));
        }
        
        List<Client> c = this.serviceMedium.getListClientsFromEmploye(e);
        List<Date> derniersDates = new ArrayList<Date>();
        
            
            //remplir la liste des derniers horoscopes des clie ts
            for(int i=0;i<c.size();i++){
                
                
                System.out.println(c.get(i));
                Date date = this.serviceMedium.getLastHoroscopeFromClient(c.get(i)).getDate();
                derniersDates.add(date);
            }
            
            request.setAttribute("ListeClients",c);
            
            request.setAttribute("ListeDates",derniersDates);
            
        
        
        
    }
    
}
