package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Customer;
import model.locations;
import entity.Location;
import entity.Homestay;
import java.util.ArrayList;
import DAO.DAO;

public final class ManagerAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/fonts/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/owl-carousel/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/owl-carousel/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/base.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/responsive.css\">\n");
      out.write("        <title>TineBNB</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"app__content\">\n");
      out.write("                <div class=\"grid wide\">\n");
      out.write("                    <!-- ===============================Content============================== -->\n");
      out.write("                    <div class=\"manager__content\">\n");
      out.write("                        <a class=\"manager__content-btnadd manager-btn\" href=\"sign-up\">Thêm tài khoản mới</a>\n");
      out.write("                        <form >\n");
      out.write("                            <table class=\"manager__content-list\">\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"height: 70px\">ID</td>\n");
      out.write("                                    <td style=\"height: 70px\">Username</td>\n");
      out.write("                                    <td style=\"height: 70px\">PhoneNumber</td>\n");
      out.write("                                    <td style=\"height: 70px\">Email</td>\n");
      out.write("                                    <td style=\"height: 70px\">Password</td>\n");
      out.write("                                    <td style=\"height: 70px\">Cập nhật</td>\n");
      out.write("                                    <td style=\"height: 70px\">Xóa</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                ");
  DAO dao = new DAO();
                                    ArrayList<Customer> list = dao.getAllCustomer();
                                    if (request.getAttribute("listSearch") != null) {
                                        list = (ArrayList<Customer>) request.getAttribute("listSearch");
                                    } else {
                                        list = dao.getAllCustomer();
                                    }
                                    int index = 0;
                                    int size = list.size();
                                    // dang o trang nao
                                    int curPage = 0;
                                    // so san phan tren 1 trang
                                    int pPerPage = 4;
                                
      out.write("\n");
      out.write("                                ");

                                    try {
                                        curPage = Integer.parseInt(request.getParameter("page"));

                                    } catch (NumberFormatException e) {
                                        curPage = 0;
                                    }
                                    if (curPage == 0) {
                                        // so trang danh tu 1
                                        curPage = 1;

                                    }
                                    index = (curPage - 1) * pPerPage; // lat trang de ve phan tu dau
                                    int counter = 0;  // torng 1 trang 0 

                                    while ((counter < pPerPage) && index < size) {
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"height: 70px\">");
      out.print(list.get(index).getCustomerID());
      out.write("</td>\n");
      out.write("                                    <td style=\"height: 70px\">");
      out.print(list.get(index).getUsername());
      out.write("</td>\n");
      out.write("                                    <td style=\"height: 70px\">");
      out.print(list.get(index).getPhoneNumber());
      out.write("</td>\n");
      out.write("                                    <td style=\"height: 70px\">");
      out.print(list.get(index).getEmail());
      out.write("</td>\n");
      out.write("                                    <td style=\"height: 70px\"><input type=\"password\" readonly value=\"");
      out.print(list.get(index).getPassword());
      out.write("\"</td>\n");
      out.write("                                    <td style=\"height: 70px\"><a class=\"manager-btn\" href=\"updateCustomer?id=");
      out.print(list.get(index).getCustomerID());
      out.write("\">Cập nhật</a></td>\n");
      out.write("                                    <td style=\"height: 70px\"><a class=\"manager-btn\" href=\"deleteLocation?id=");
      out.print(list.get(index).getCustomerID());
      out.write("\" onclick=\"return confirm('Bạn có muốn xóa tài khoản này không?')\">Xóa </a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    index++;
                                    counter++;
                                    if (counter >= pPerPage) {
                                        break;
                                    }
                                
      out.write("\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <div class=\"pagi\">\n");
      out.write("                            ");

                                String afileName = "customerManager";
                                if (index == 0) {
                                    out.print("No Location");
                                } else {
                                    if (curPage == 1) {
                                        out.print("<button><a href=#> Previous </a></button>");
                                    } else {
                                        out.print("<button><a href=" + afileName + "?page=" + (curPage - 1) + " onclick='doColor(this)' onblur='removeColor(this)'>Previous</a></button>");
                                    }
                                }
                                int indexpage = 1;
                                int numpage;
                                if (size % pPerPage == 0) {
                                    numpage = size / pPerPage;
                                } else {
                                    numpage = size / pPerPage + 1;
                                }
                                while (indexpage <= numpage) {
                                    out.print("<button style=" + "min-width:30px;" + "><a href=" + afileName + "?page=" + indexpage + ">" + indexpage + "</a></button>");
                                    indexpage++;
                                }
                                if (curPage == numpage) {
                                    out.print("<button ><a href=#> Next </a></button> ");
                                } else {
                                    out.print("<button><a href=" + afileName + "?page=" + (curPage + 1) + "> Next </a></button>");
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"ring\">\n");
      out.write("                    <div class=\"coccoc-alo-phone coccoc-alo-green coccoc-alo-show\">\n");
      out.write("                        <div class=\"coccoc-alo-ph-circle\"></div>\n");
      out.write("                        <div class=\"coccoc-alo-ph-circle-fill\"></div>\n");
      out.write("                        <div class=\"coccoc-alo-ph-img-circle\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\n");
      out.write("        <script src=\"./assets/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/main.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                        function doColor(var i) {\n");
      out.write("                                            document.getElementById();\n");
      out.write("                                        }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
