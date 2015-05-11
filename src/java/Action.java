
import METIER_SERVICE.Service;
import javax.servlet.http.HttpServletRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADRIEN
 */
public abstract class Action {
    
    Service serviceMedium;
    public abstract void execute(HttpServletRequest request);
    
    public void setServiceMetier(Service serviceMedium){
        this.serviceMedium = serviceMedium;        
    }
    
    
}
