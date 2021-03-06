package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sign_002din_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"grid\">\n");
      out.write("                    <div class=\"container__header\">\n");
      out.write("                        <div class=\"container__header-notice\">\n");
      out.write("                            <h1>????ng k?? li???n tay nh???n ngay qu?? hot</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"app__content\">\n");
      out.write("                <div class=\"grid wide\">\n");
      out.write("                    <!-- ===============================Content============================== -->\n");
      out.write("                    <div class=\"login__content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col c-8 login__content-description\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col c-6 login__content-about\">\n");
      out.write("                                        <img src=\"./assets/img/coins@2x.png\" alt=\"\">\n");
      out.write("                                        <h3>T??ch ??i???m nhanh ch??ng</h3>\n");
      out.write("                                        <p>\n");
      out.write("                                            T??ch ??i???m ?????i v???i m???i l?????t ?????t ch??? th??nh c??ng. Quy ?????i th??nh BNB Credit ????? du l???ch nhi???u h??n n???a.\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col c-6 login__content-about\">\n");
      out.write("                                        <img src=\"./assets/img/top-sales@2x.png\" alt=\"\">\n");
      out.write("                                        <h3>T??ch ??i???m nhanh ch??ng</h3>\n");
      out.write("                                        <p>\n");
      out.write("                                            T??ch ??i???m ?????i v???i m???i l?????t ?????t ch??? th??nh c??ng. Quy ?????i th??nh BNB Credit ????? du l???ch nhi???u h??n n???a.\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col c-6 login__content-about\">\n");
      out.write("                                        <img src=\"./assets/img/wallet@2x.png\" alt=\"\">\n");
      out.write("                                        <h3>T??ch ??i???m nhanh ch??ng</h3>\n");
      out.write("                                        <p>\n");
      out.write("                                            T??ch ??i???m ?????i v???i m???i l?????t ?????t ch??? th??nh c??ng. Quy ?????i th??nh BNB Credit ????? du l???ch nhi???u h??n n???a.\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col c-6 login__content-about\">\n");
      out.write("                                        <img src=\"./assets/img/backpack@2x.png\" alt=\"\">\n");
      out.write("                                        <h3>T??ch ??i???m nhanh ch??ng</h3>\n");
      out.write("                                        <p>\n");
      out.write("                                            T??ch ??i???m ?????i v???i m???i l?????t ?????t ch??? th??nh c??ng. Quy ?????i th??nh BNB Credit ????? du l???ch nhi???u h??n n???a.\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col c-4 login__content-form\">\n");
      out.write("                                <form action=\"sign-in\" method=\"post\">\n");
      out.write("                                    <div class=\"login__form\">\n");
      out.write("                                        <div class=\"login__form-heading\">\n");
      out.write("                                            <h2>????ng nh???p</h2>\n");
      out.write("                                            <h3>????ng nh???p ????? tr???i nghi???m</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"login__form-email\">\n");
      out.write("                                            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\" type=\"email\" class=\"\" placeholder=\"?????a ch??? email\">\n");
      out.write("                                            <div><i class=\"far fa-envelope\"></i></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"login__form-password\">\n");
      out.write("                                            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"password\" type=\"password\" class=\"\" placeholder=\"M???t kh???u\">\n");
      out.write("                                            <div><img src=\"./assets/img/locked.svg\" alt=\"\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"alert-error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        <div class=\"login__form-remmeber\">\n");
      out.write("                                            <input name=\"remember\" value=\"1\" type=\"checkbox\" name=\"\" id=\"\">\n");
      out.write("                                            <p>L??u m???t kh???u</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" class=\"login__form-button\">????ng nh???p</button>\n");
      out.write("                                        <div class=\"login__form-notice\">B???n ch??a c?? t??i kho???n? <a href=\"sign-up\">????ng k??</a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form> \n");
      out.write("                            </div>\n");
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
