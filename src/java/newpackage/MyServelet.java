package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amrik
 */
//    public class MyServelet extends HttpServlet {
////        User u =new User();
//
//        /**
////         * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
////         * methods.
////         *
////         * @param request servlet request
////         * @param response servlet response
////         * @throws ServletException if a servlet-specific error occurs
////         * @throws IOException if an I/O error occurs
////         */
////        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
////                throws ServletException, IOException {
////            response.setContentType("text/html;charset=UTF-8");
////            try (PrintWriter out = response.getWriter()) {
////
////                String user_name = request.getParameter("uname");
////                String email=request.getParameter("email");
////                String pass=request.getParameter("pass");
////                String field=
////                /* TODO output your page here. You may use following sample code. */
////             Class.forName("com.mysql.cj.jdbc.Driver");//class' fully qualified name
////             String url="jdbc:mysql://localhost:3306/app1";// protocol:vendor's name//
////             String uname="root";
////             String pwd="August#1998";
////
////         Connection con=DriverManager.getConnection(url,uname,pwd);//uses factory design pattern
////            Statement stmt=con.createStatement();
////            String qr="insert into user(name,email,pwd,field) values('"+u.getUname()+"','"+u.getEmail()+"','"+u.getPwd()+"','"+u.getField()+"')";
////            int i=stmt.executeUpdate(qr);
////            con.close();
////            }
////            catch(Exception e){
////             e.printStackTrace();
////         }
////        }
//
//        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//        /**
//         * Handles the HTTP <code>GET</code> method.
//         *
//         * @param request servlet request
//         * @param response servlet response
//         * @throws ServletException if a servlet-specific error occurs
//         * @throws IOException if an I/O error occurs
//         */
//        @Override
//        protected void doGet(HttpServletRequest request, HttpServletResponse response)
//                throws ServletException, IOException {
//            processRequest(request, response);
//        }
//
//        /**
//         * Handles the HTTP <code>POST</code> method.
//         *
//         * @param request servlet request
//         * @param response servlet response
//         * @throws ServletException if a servlet-specific error occurs
//         * @throws IOException if an I/O error occurs
//         */
//        @Override
//        protected void doPost(HttpServletRequest request, HttpServletResponse response)
//                throws ServletException, IOException {
//            processRequest(request, response);
//        }
//
//        /**
//         * Returns a short description of the servlet.
//         *
//         * @return a String containing servlet description
//         */
//        @Override
//        public String getServletInfo() {
//            return "Short description";
//        }// </editor-fold>
//
//    }
