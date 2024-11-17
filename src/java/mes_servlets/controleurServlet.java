/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mes_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


     
@WebServlet(urlPatterns={"/controleurServlet"})
public class controleurServlet extends HttpServlet {
            private ICcreditMetier metier;
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
              request.setAttribute("creditModel", new creditModel());
              request.getRequestDispatcher("vue.jsp").forward(request,response);
    }
    


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        // Retrieve parameters from the request
        String montantstr = request.getParameter("montant");
        String tauxstr = request.getParameter("taux");
        String dureestr = request.getParameter("duree");
        //
        // Convert parameters to double double montant = Double.parseDouble(montantStr); double taux = Double.parseDouble(tauxStr); double duree =
              
        double montant=Double.parseDouble(tauxstr);
        double taux =Double.parseDouble(tauxstr);
        int duree=Integer.parseInt(dureestr);
        // Get the response writer
        PrintWriter out = response.getWriter();
        PrintWriter out2=response.getWriter();
       
        out2.println("<html><body>");
        out2.println("<h1>"+montant +"DH"+"</h1>");
        out2.print("</body></html>");
       
       creditModel model=new creditModel();
       model.setmontant(montant);
       model.setduree(duree);
       model.settaux(taux);
       
       metier=new creditmetierImpl();
      double result2 =metier.calculerMesuablilite(montant, taux,duree);
      model.setmensualite(result2);
      //stocker les donnees a l objet request:

    request.setAttribute("creditModel", model);
      request.getRequestDispatcher("vue.jsp").forward(request, response);
      
        // Close the writer
        out.close();
    }

}
    

