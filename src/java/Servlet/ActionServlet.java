package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import IHMEmploye.ActionAuthEmp;
import IHMEmploye.ActionAuthEmp;
import IHMEmploye.ActionConsultHoroscope;
import IHMEmploye.ActionConsultHoroscope;
import IHMEmploye.ActionConsultHoroscopeClient;
import IHMEmploye.ActionConsultHoroscopeClient;
import IHMEmploye.ActionCreateHoroscope;
import IHMEmploye.ActionCreateHoroscope;
import IHMEmploye.ActionPredictionSelect;
import IHMEmploye.ActionPredictionSelect;
import IHMEmploye.RetoursansSelect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import METIER_SERVICE.*;
import Servlet.Action;
import Servlet.SelectionAction;

/**
 *
 * @author ADRIEN
 */
@WebServlet(name = "ActionServlet", urlPatterns = {"/ActionServlet"})
public class ActionServlet extends HttpServlet {
    
    private Services serviceMedium;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ActionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet ActionServlet at " + request.getContextPath() + "</h1>");
            out.println("<p>" + request.getContextPath() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
   public Services getServiceMetier(){
       if(serviceMedium == null){
           serviceMedium = new Services();
       }
       return serviceMedium;
   }    
   
    @Override
   protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       String tache = request.getParameter("todo");
       Action action = this.getAction(tache);
       action.setServiceMetier(this.getServiceMetier());
       action.execute(request);
       String vue = this.setVue(tache);
       request.getRequestDispatcher(vue).forward(request, response);
   }
   
   private Action getAction(String todo){
       Action action = null;
       switch(todo){
           
           
            case "IHM Employe" : {
               action = new SelectionAction();
               break;
           }
            
            case "Connexion" : {
               action = new ActionAuthEmp();
               break;
           }
            
            case "ConsulterHoroscopesClient" : {
               action = new ActionConsultHoroscopeClient();
               break;
           }
            
            case "ConsulterHoroscope" : {
               action = new ActionConsultHoroscope();
               break;
           }
            
            case "RetourAcceuil" : {
               action = new ActionAuthEmp();
               break;
           }
            
             case "RetourConsultation" : {
               action = new ActionConsultHoroscopeClient();
               break;
           }
             
             case "Creer" : {
               action = new ActionCreateHoroscope();
               break;
           }
             
             case "Selectionner" : {
               action = new ActionPredictionSelect();
               break;
           }
             
             case "PredictionSlectionnee" : {
               action = new ActionCreateHoroscope();
               break;
           }
             
             case "RetourSansSelection" : {
               action = new ActionCreateHoroscope();
               break;
           }
      
       }
        return action;
   }
       
       private String setVue(String todo) {
           String vue = null;
           switch(todo) {
               
               
               case "IHM Employe" : {
                    vue = "AuthEmp.jsp";
                    break;
                }
               
               case "Connexion" : {
                    vue = "AcceuilEmp.jsp";
                    break;
                }
               
               case "ConsulterHoroscopesClient" : {
                    vue = "ConsultationHoroscopeClient.jsp";
                    break;
                }
               
               case "ConsulterHoroscope" : {
                    vue = "ConsultationHoroscope.jsp";
                    break;
                }
               
               case "RetourAcceuil" : {
                    vue = "AcceuilEmp.jsp";
                    break;
                }
               
               case "RetourConsultation" : {
                    vue = "ConsultationHoroscopeClient.jsp";
                    break;
                }
               
               case "Creer" : {
                    vue = "CreationHoroscope.jsp";
                    break;
                }
               
               case "Selectionner" : {
                    vue = "PredictionSelect.jsp";
                    break;
                }
               
               case "PredictionSlectionnee" : {
                    vue = "CreationHoroscope.jsp";
                    break;
                }
               
               case "RetourSansSelection" : {
                    vue = "CreationHoroscope.jsp";
                    break;
                }
           }  
           return vue;
       }
       
       
       
   
   
   
}
