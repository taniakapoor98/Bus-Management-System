package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author amrik
 */
public class login extends HttpServlet {

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
    String nuser = request.getParameter("nuser");
    String npass=request.getParameter("npass");
      PrintWriter out = response.getWriter();
    User u=new User();
      Configuration cf=null;
   SessionFactory sf=null;
   Session session=null;
   List<User> list=null;
   try{
   cf=new Configuration();
   cf.configure();
   sf=cf.buildSessionFactory();
   session=sf.openSession();
   Transaction tx=session.beginTransaction();
    list =session.createQuery("from User where uname = :nuser and pwd = :npass").setParameter("npass", npass).setParameter("nuser", nuser).list();
    tx.commit();
     if(list!=null)
  {
     for(User i :list)
     {
         String f=i.getField();
          if(f.equals("admin"))
              response.sendRedirect("admin.html");
           if(f.equals("staff"))
              response.sendRedirect("staff.jsp");
            if(f.equals("student"))
              response.sendRedirect("my.html");
     }
   }
  else
     {
     out.println("Login failed!");
     
     }
  
  
   

   }catch(Exception ee){
   System.out.println(ee);
           ee.printStackTrace();
   }
   finally{
            session.close();
            sf.close();
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

}
