package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author amrik
 */
public class signup extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String name=request.getParameter("uname");
        String email=request.getParameter("email");
        String pass=request.getParameter("pass");
        String field=request.getParameter("type");
        
          User u=new User();
        
        u.setEmail(email);
        u.setUname(name);
        u.setPwd(pass);
        u.setField(field);
         Configuration cf=new Configuration();
        cf.configure();
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
       /* for(int i=0;i<=5;i++)
        {
            s=new Student("L"+i,i*10);
            session.save(s);
        }*/
       /* session.save(s);*///session.save(add) not applicable since @Embeddable cannot be stored separately
       /* session.save(c);*/
        
        session.save(u);
        tx.commit();
        session.close();
        sf.close();
    
        if(field.equals("staff"))
        {
            response.sendRedirect("staff.jsp");
        }
         if(field.equals("student"))
        {
            response.sendRedirect("my.html");
        }
          if(field.equals("admin"))
        {
            response.sendRedirect("admin.html");
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
