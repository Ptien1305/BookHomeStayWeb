package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;

public final class Update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <div class=\"update__content\">\n");
      out.write("                        <h1>C???p nh???t Homestay</h1>\n");
      out.write("\n");
      out.write("                        <form action=\"edit\" method=\"post\">\n");
      out.write("                            <table class=\"update__content-list\">\n");
      out.write("\n");
      out.write("                                ");

                                    SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
                                    if (request.getAttribute("error") != null) {
                                        String re = request.getAttribute("error").toString();
                                
      out.write("\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <p>ID</p>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" readonly name=\"id\" placeholder=\"id\" >\n");
      out.write("                                    <p>?????a ??i???m</p>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.locationID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required type=\"text\" name=\"locationID\" placeholder=\"?????a ??i???m\" >\n");
      out.write("                                    <p>T??n Homestay</p>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required type=\"text\" name=\"name\" placeholder=\"T??n Homestay\" >\n");
      out.write("                                    <p>Gi??</p>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required type=\"text\" name=\"price\" placeholder=\"Gi??\" >\n");
      out.write("                                    </br>\n");
      out.write("                                    <p>Mi??u t???</p>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.desciption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required type=\"text\" name=\"desciption\" placeholder=\"Mi??u t???\" >\n");
      out.write("                                </td>\n");
      out.write("                                <td style=\"padding-left: 58px\">\n");
      out.write("                                    <p>S??? ng?????i t???i ??a</p>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.maxPeople}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required type=\"text\" name=\"maxPeople\" placeholder=\"S??? ng?????i t???i ??a\" >\n");
      out.write("                                    <p>???nh</p>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required type=\"text\" name=\"img\">\n");
      out.write("                                    <p>Ng??y th??m</p>\n");
      out.write("                                    <input value=\"");
      out.print(date.format(new java.util.Date()));
      out.write("\" readonly type=\"text\" name=\"addDate\" placeholder=\"adddate\">\n");
      out.write("                                    </br>\n");
      out.write("                                    </br>\n");
      out.write("                                    <input class=\"btn\" type=\"reset\" name=\"clear\" value=\"X??a\">\n");
      out.write("                                    <input class=\"btn\" type=\"submit\" name=\"submit\" value=\"Ho??n th??nh\" onclick=\"return confirm('X??c nh???n c???p nh???t Homestay?')\">\n");
      out.write("                                </td>\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
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
