package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.Transaction;
import newpackage.Bus_sch;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public final class Change_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     Bus_sch b=new Bus_sch();
      List<Bus_sch> list=null;
       Configuration cf=null;
   SessionFactory sf=null;
  
       cf=new Configuration();
   cf.configure();
   sf=cf.buildSessionFactory();
  Session sess=sf.openSession();
   Transaction tx=sess.beginTransaction();
    list =sess.createQuery("from Bus_sch ").list();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <link rel=\"shortcut icon\" href=\"./myproject/assets/img/download.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("  \n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("  <title>\n");
      out.write(" Change Schedule\n");
      out.write("  </title>\n");
      out.write("  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("  <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"./myproject/css/style_drop.css\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"./myproject/assets/css/newCss.css\" />\n");
      out.write("  <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css' />\n");
      out.write("<script type=\"text/javascript\" src=\"./myproject/js/modernizr.custom.79639.js\"></script>\n");
      out.write("<noscript><link rel=\"stylesheet\" type=\"text/css\" href=\"./myproject/css/noJS.css\" /></noscript> \n");
      out.write("  <link rel=\"stylesheet\" href=\"F:\\New folder\\html\\html_project\\myproject\\assets\\css\\new.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("  <link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link href=\"./myproject/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"./myproject/assets/css/now-ui-kit.css?v=1.2.0\" rel=\"stylesheet\" />\n");
      out.write("  \n");
      out.write("  <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("  <link href=\"./myproject/assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"./myproject/assets/css/style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\".\\myproject\\assets\\css\\slider_staff.css\">\n");
      out.write("  \n");
      out.write("</head> \n");
      out.write("\n");
      out.write("\n");
      out.write("<body class=\"index-page sidebar-collapse\">\n");
      out.write("        <div class=\"page-header clear-filter\" filter-color=\"orange\">\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                <div class=\"page-header-image\" data-parallax=\"true\" style=\"background-image:url('./myproject/assets/img/bg11.jpg');  background-repeat: no-repeat; background-size: cover; \"></div>\n");
      out.write("                \n");
      out.write("                <div class=\"container\">\n");
      out.write("                        \n");
      out.write("                          \n");
      out.write("                          <h1 class=\"h1-seo\" style=\"margin: 0 auto;\">CHANGE ROUTES</h1>\n");
      out.write("                         \n");
      out.write("                <div>\n");
      out.write("                    <ul id=\"hl\">\n");
      out.write("                        <li>\n");
      out.write("                            <div class=\"routes\" style=\"align-self: center;z-index: 1000;\">\n");
      out.write("                                    <img class=\"rounded-circle img-raised\" src=\"./myproject/assets/img/1.jpg\" alt=\"\">\n");
      out.write("                                    <div style=\"z-index:1000; position: absolute;top:48%;left:27%;color:rgb(4, 4, 68);font-size: 20px; transform: translate(-50%, -50%);\">\n");
      out.write("                                     Mohali\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                                \n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                                <div class=\"routes\" style=\"align-self: center;z-index: 1000;\">\n");
      out.write("                                        <img class=\"rounded-circle img-raised\" src=\"./myproject/assets/img/1.jpg\" alt=\"\">\n");
      out.write("                                        <div style=\"z-index:1000; position: absolute;top:48%;left:50%;color:rgb(4, 4, 68);font-size: 20px; transform: translate(-50%, -50%);\">Chandigarh</div>\n");
      out.write("                                </div>\n");
      out.write("                                    \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                    <div class=\"routes\" style=\"align-self: center;z-index: 1000;\">\n");
      out.write("                                            <img class=\"rounded-circle img-raised\" src=\"./myproject/assets/img/1.jpg\" alt=\"\">\n");
      out.write("                                            <div style=\"z-index:1000; position: absolute;top:48%; left:73%;color:rgb(4, 4, 68);font-size: 20px; transform: translate(-50%, -50%);\">Panchkula</div>\n");
      out.write("                                    </div>\n");
      out.write("                                        \n");
      out.write("                                </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"view_table\">\n");
      out.write("                  \n");
      out.write("                    <!-- <button id=\"ajax_btn\">Mohali</button> -->\n");
      out.write("                  <table class=\"table\" >\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                        <th>S.no.</th>\n");
      out.write("                        <th>bus no.</th>\n");
      out.write("                        <th>route no.</th>\n");
      out.write("                        <th>Driver name</th>\n");
      out.write("                        <th>City</th>\n");
      out.write("                        <th>route </th>\n");
      out.write("                        <th>Delete</th>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody id=\"tab_moh\">\n");
      out.write("                          ");

                            int x=0;
                        for( Bus_sch i:list){
                            
                        
                    
      out.write("\n");
      out.write("                      <tr>\n");
      out.write("                        <td>");
      out.print(i.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(i.getBus_no());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(i.getRoute_no());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(i.getDname());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(i.getCity());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(i.getRoute());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                                <a  data-toggle=\"modal\" href=\"#my_mod5\" >\n");
      out.write("                                    <button type=\"button\" class=\"delete\" onclick=\"function('");
      out.print(i.getId());
      out.write("'){\n");
      out.write("                                        ");
x=i.getId();
      out.write("\n");
      out.write("                                     //document.forms['change']['coll'].value=");
      out.print(x);
      out.write(";\n");
      out.write("                                }\">Change</fbutton></a></td>\n");
      out.write("                      </tr>\n");
      out.write("                      ");

                                        
                        }
                         
                      
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                     \n");
      out.write("                  </table>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("  <!-- Navbar -->\n");
      out.write("\n");
      out.write("  <nav class=\"navbar navbar-expand-lg bg-primary fixed-top navbar-transparent \" color-on-scroll=\"400\">\n");
      out.write("      <span class=\"open-slide\">\n");
      out.write("          <a href=\"#\" onclick=\"openSlideMenu()\">\n");
      out.write("            <svg width=\"30\" height=\"30\">\n");
      out.write("                <path d=\"M0,5 30,5\" stroke=\"#fff\" stroke-width=\"2\"/>\n");
      out.write("                <path d=\"M0,14 30,14\" stroke=\"#fff\" stroke-width=\"2\"/>\n");
      out.write("                <path d=\"M0,23 30,23\" stroke=\"#fff\" stroke-width=\"2\"/>\n");
      out.write("            </svg>\n");
      out.write("          </a>\n");
      out.write("        </span>\n");
      out.write("        <div id=\"side-menu\" class=\"side-nav\">\n");
      out.write("          <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\n");
      out.write("          <a href=\"./myproject/my.html\">Home</a>\n");
      out.write("          <a href=\"./myproject/about.html\">About</a>\n");
      out.write("          <a href=\"./myproject/services.html#\">Services</a>\n");
      out.write("          <a href=\"./myproject/contact.html#\">Contact</a>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-translate\">\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        <a class=\"navbar-brand\" href=\"./myproject/about.html\" rel=\"tooltip\"  data-placement=\"bottom\" target=\"_blank\" style=\"font-size: 15px;\">\n");
      out.write("           About Us\n");
      out.write("        </a>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <button class=\"navbar-toggler navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-bar top-bar\"></span>\n");
      out.write("          <span class=\"navbar-toggler-bar middle-bar\"></span>\n");
      out.write("          <span class=\"navbar-toggler-bar bottom-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("         \n");
      out.write("      <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\" data-nav-image=\"./myproject/assets/img/blurred-image-1.jpg\">\n");
      out.write("        \n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("          \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link \" data-toggle=\"modal\" href=\"#my_mod2\">\n");
      out.write("      \n");
      out.write("            <p style=\"font-size: 15px;\">SIGN UP</p>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("            <a href=\"#\" class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink1\" data-toggle=\"dropdown\">\n");
      out.write("            \n");
      out.write("              <p style=\"font-size: 15px;\">Routes</p>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink1\">\n");
      out.write("              <a class=\"dropdown-item\" target=\"_top\" href=\"./myproject/mohali.html\">\n");
      out.write("                <i class=\"now-ui-icons design_bullet-list-67\"></i> Mohali\n");
      out.write("              </a>\n");
      out.write("              <a class=\"dropdown-item\" target=\"_top\" href=\"./myproject/pkl.html\">\n");
      out.write("                <i class=\"now-ui-icons design_bullet-list-67\"></i> Punchkula\n");
      out.write("              </a>\n");
      out.write("              <a class=\"dropdown-item\" target=\"_blank\" href=\"./myproject/chd.html\" target=\"_top\">\n");
      out.write("                <i class=\"now-ui-icons design_bullet-list-67\"></i> Chandigarh\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("         \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" rel=\"tooltip\" title=\"Follow us on Twitter\" data-placement=\"bottom\" href=\"https://twitter.com\" target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-twitter\" sizes=\"16x16\"></i>\n");
      out.write("              <p class=\"d-lg-none d-xl-none\" >Twitter</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" rel=\"tooltip\" title=\"Like us on Facebook\" data-placement=\"bottom\" href=\"https://www.facebook.com\" target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-facebook-square\"></i>\n");
      out.write("              <p class=\"d-lg-none d-xl-none\">Facebook</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" rel=\"tooltip\" title=\"Follow us on Instagram\" data-placement=\"bottom\" href=\"https://www.instagram.com/kapoortania00\" target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-instagram\"></i>\n");
      out.write("              <p class=\"d-lg-none d-xl-none\">Instagram</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <!--nav ends-->\n");
      out.write("   <!-- modal for change.jsp -->\n");
      out.write("      <div class=\"modal fade\" style=\"background-blend-mode: luminosity;\" id=\"my_mod5\" role=\"dialog\">\n");
      out.write("        \n");
      out.write("            <div class=\"modal-dialog\" >\n");
      out.write("               \n");
      out.write("              <!-- Modal content-->\n");
      out.write("              <div class=\"modal-content\"style=\"background-color:whitesmoke; opacity:.99;\">\n");
      out.write("                \n");
      out.write("                <div class=\"modal-header\" >   \n");
      out.write("                    <button type=\"button\" class=\"title-up\" id=\"close_1\" style=\"align-content: right;align-items: right;\" data-dismiss=\"modal\">&times;</button>        \n");
      out.write("                </div>\n");
      out.write("                <div >\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("             \n");
      out.write("                        <form id=\"change\" class=\"form\" method=\"get\" action=\"Change\">\n");
      out.write("                            <div class=\" text-center\">\n");
      out.write("                               \n");
      out.write("                              <h3 class=\"card-title title-up\" style=\"color:black\">Update</h3>\n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"input-group no-border\">\n");
      out.write("                                 \n");
      out.write("                               <select class=\"input-group no-border\" name=\"field\" default=\"Select field\">\n");
      out.write("                                   <option value=\"select\">--Select field--</option>\n");
      out.write("                                    <option value=\"bus_no\">Bus no.</option>\n");
      out.write("                                    <option value=\"route_no\">Route no.</option>\n");
      out.write("                                    <option value=\"dname\">Driver's name</option>\n");
      out.write("                                    <option value=\"city\">City</option>\n");
      out.write("                                     <option value=\"route\">Route</option>\n");
      out.write("                                  </select>\n");
      out.write("                                \n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"input-group no-border\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                  \n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" name=\"new_val\" placeholder=\"Enter new value\" class=\"form-control\" required/>\n");
      out.write("                              </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("              <input  type=\"text\" name=\"coll\" value=\"");
      out.print(x);
      out.write("\" hidden/>\n");
      out.write("                            <div class=\"card-footer text-center\" style=\"background-color:rgb(191, 228, 243);\">\n");
      out.write("                              <input type=\"submit\" value=\"change\" class=\"btn btn-neutral btn-round btn-lg\"  />\n");
      out.write("                       \n");
      out.write("                            \n");
      out.write("                            </div>\n");
      out.write("              </form></div></div></div>\n");
      out.write("              \n");
      out.write("                     \n");
      out.write("                 ");
 tx.commit();
                            sess.close();
                           sf.close();
      out.write("\n");
      out.write("   <!-- Modal -->\n");
      out.write("   <div class=\"modal fade\" style=\"background-blend-mode: luminosity;\" id=\"my_mod2\" role=\"dialog\">\n");
      out.write("        \n");
      out.write("    <div class=\"modal-dialog\" >\n");
      out.write("       \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\"style=\"background-color:lightpink; opacity:.99;\">\n");
      out.write("        \n");
      out.write("        <div class=\"modal-header\" >   \n");
      out.write("            <button type=\"button\" class=\"title-up\" id=\"close_1\" style=\"align-content: right;align-items: right;\" data-dismiss=\"modal\">&times;</button>        \n");
      out.write("        </div>\n");
      out.write("        <div >\n");
      out.write("          \n");
      out.write("       \n");
      out.write("     \n");
      out.write("                <form class=\"form\" method=\"\" action=\"file:///F:/New%20folder/html/html_project/myproject/my.html#pablo\">\n");
      out.write("                    <div class=\" text-center\">\n");
      out.write("                       \n");
      out.write("                      <h3 class=\"card-title title-up\" style=\"color:black\">Sign Up</h3>\n");
      out.write("                      <div class=\"social-line\">\n");
      out.write("                        <a href=\"#pablo\" class=\"btn btn-neutral btn-facebook btn-icon btn-round\">\n");
      out.write("                          <i class=\"fab fa-facebook-square\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#pablo\" class=\"btn btn-neutral btn-twitter btn-icon btn-lg btn-round\">\n");
      out.write("                          <i class=\"fab fa-twitter\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#pablo\" class=\"btn btn-neutral btn-google btn-icon btn-round\">\n");
      out.write("                          <i class=\"fab fa-google-plus\"></i>\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <div class=\"input-group no-border\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                          <span class=\"input-group-text\">\n");
      out.write("                            <i class=\"now-ui-icons users_circle-08\"></i>\n");
      out.write("                          </span>\n");
      out.write("                        </div> \n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Username...\" required>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"input-group no-border\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                          <span class=\"input-group-text\">\n");
      out.write("                            <i class=\"now-ui-icons ui-1_email-85\" style=\"font-size:16px;\"></i>\n");
      out.write("                          </span>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"text\" placeholder=\"Email\" class=\"form-control\" required/>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"input-group no-border\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                          <span class=\"input-group-text\">\n");
      out.write("                            <i class=\"fa fa-lock \"></i>\n");
      out.write("                          </span>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"input-group no-border\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                          <span class=\"input-group-text\">\n");
      out.write("                            <i class=\"material-icons\" style=\"font-size:16px;\">format_list_bulleted</i>\n");
      out.write("                          </span>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("          \n");
      out.write("            \n");
      out.write("                            <div id=\"dd\" class=\"wrapper-dropdown-2\" style=\"background-color: rgb(240, 238, 238);width:92%;\" tabindex=\"1\">\n");
      out.write("                              <span>Login as</span>\n");
      out.write("                              <ul class=\" dropdown\">\n");
      out.write("                                <li><a href=\"#\" id=\"m1\" style=\"color:black;\" onhover=\"drop_col()\">Student</a></li>\n");
      out.write("                                <li><a href=\"#\" style=\"color:black;\">Staff</a></li>\n");
      out.write("                                <li><a href=\"#\" style=\"color:black;\">Admin</a></li>\n");
      out.write("                              </ul>\n");
      out.write("                            </div>\n");
      out.write("                       \n");
      out.write("                    \n");
      out.write("      \n");
      out.write("                      </div>\n");
      out.write("                      <!-- <div class=\"checkbox\">\n");
      out.write("                    <input id=\"checkboxSignup\" type=\"checkbox\">\n");
      out.write("                      <label for=\"checkboxSignup\">\n");
      out.write("                      Unchecked\n");
      out.write("                      </label>\n");
      out.write("                    </div> -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer text-center\" style=\"background-color:rgb(191, 228, 243);\">\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-neutral btn-round btn-lg\"  />\n");
      out.write("                    </div>\n");
      out.write("                  </form>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"./myproject/assets/js/core/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"./myproject/assets/js/core/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"./myproject/assets/js/core/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->\n");
      out.write("    <script src=\"./myproject/assets/js/plugins/bootstrap-switch.js\"></script>\n");
      out.write("    <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->\n");
      out.write("    <script src=\"./myproject/assets/js/plugins/nouislider.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--  Plugin for the DatePicker, full documentation here: https://github.com/uxsolutions/bootstrap-datepicker -->\n");
      out.write("    <script src=\"./myproject/assets/js/plugins/bootstrap-datepicker.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--  Google Maps Plugin    -->\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("    <!-- Control Center for Now Ui Kit: parallax effects, scripts for the example pages etc -->\n");
      out.write("    <script src=\"./myproject/assets/js/now-ui-kit.js?v=1.2.0\" type=\"text/javascript\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\".\\myproject\\assets\\js\\particles.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\".\\myproject\\assets\\js\\app.js\"></script>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("        // the body of this function is in assets/js/now-ui-kit.js\n");
      out.write("        nowuiKit.initSliders();\n");
      out.write("      });\n");
      out.write("  \n");
      out.write("      function scrollToSign() {\n");
      out.write("  \n");
      out.write("        if ($('.section-signup').length != 0) {\n");
      out.write("          $(\"html, body\").animate({\n");
      out.write("            scrollTop: $('.section-signup').offset().top\n");
      out.write("          }, 1000);\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("  \n");
      out.write("      $(document).ready(function(){\n");
      out.write("          openLoginModal();\n");
      out.write("      });\n");
      out.write("      function closeSlideMenu(){\n");
      out.write("        document.getElementById('side-menu').style.width = '0px';\n");
      out.write("        \n");
      out.write("      }\n");
      out.write("      function openSlideMenu(){\n");
      out.write("        document.getElementById('side-menu').style.width = '200px';\n");
      out.write("       /* document.getElementById('main').style.marginLeft = '200px';*/\n");
      out.write("      }\n");
      out.write("      function DropDown(el) {\n");
      out.write("\t\t\t\tthis.dd = el;\n");
      out.write("\t\t\t\tthis.placeholder = this.dd.children('span');\n");
      out.write("\t\t\t\tthis.opts = this.dd.find('ul.dropdown > li');\n");
      out.write("\t\t\t\tthis.val = '';\n");
      out.write("\t\t\t\tthis.index = -1;\n");
      out.write("\t\t\t\tthis.initEvents();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tDropDown.prototype = {\n");
      out.write("\t\t\t\tinitEvents : function() {\n");
      out.write("\t\t\t\t\tvar obj = this;\n");
      out.write("\n");
      out.write("\t\t\t\t\tobj.dd.on('click', function(event){\n");
      out.write("\t\t\t\t\t\t$(this).toggleClass('active');\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\tobj.opts.on('click',function(){\n");
      out.write("\t\t\t\t\t\tvar opt = $(this);\n");
      out.write("\t\t\t\t\t\tobj.val = opt.text();\n");
      out.write("\t\t\t\t\t\tobj.index = opt.index();\n");
      out.write("\t\t\t\t\t\tobj.placeholder.text(obj.val);\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tgetValue : function() {\n");
      out.write("\t\t\t\t\treturn this.val;\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tgetIndex : function() {\n");
      out.write("\t\t\t\t\treturn this.index;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\n");
      out.write("\t\t\t\tvar dd = new DropDown( $('#dd') );\n");
      out.write("\n");
      out.write("\t\t\t\t$(document).click(function() {\n");
      out.write("\t\t\t\t\t// all dropdowns\n");
      out.write("\t\t\t\t\t$('.wrapper-dropdown-2').removeClass('active');\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("      });\n");
      out.write("    \n");
      out.write("       function accType(name){\n");
      out.write("          document.forms['login']['type'].value=name;\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("  \n");
      out.write("  </html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
