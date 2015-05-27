/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lingfan
 */
public class SelectionAction extends Action {

    @Override
    public void execute(HttpServletRequest request) {
        
        HttpSession session = request.getSession(false);
        if (session!=null) {
            session.invalidate();
        }
        
    }
    
}
