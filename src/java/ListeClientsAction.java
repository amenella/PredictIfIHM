

import METIER_MODELE.Client;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADRIEN
 */
public class ListeClientsAction extends Action{

    @Override
    public void execute(HttpServletRequest request) {
        
        List <Client> clients;
        clients = this.serviceMedium.getListAllClients();
        request.setAttribute("clients", clients);
    }
    
}
