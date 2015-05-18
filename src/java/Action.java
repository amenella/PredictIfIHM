
import METIER_SERVICE.Services;
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
    
    Services serviceMedium;
    public abstract void execute(HttpServletRequest request);
    
    public void setServiceMetier(Services serviceMedium){
        this.serviceMedium = serviceMedium;        
    }
    
    
}
