package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<header class=\"header-wrapper\">\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <div class=\"grid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Header with search -->\n");
      out.write("                <div class=\"col l-6 m-5 c-12\">\n");
      out.write("                    <div class=\"header-left\">\n");
      out.write("                        <a href=\"home\" class=\"header__logo hide-on-mobile\">\n");
      out.write("                            <!-- <svg version=\"1.1\" viewBox=\"0 0 50 50\" class=\"svg-icon svg-fill\" style=\"width: 50px; height: 50px;\">\n");
      out.write("                                <path pid=\"0\"\n");
      out.write("                                    d=\"M25.093 0c13.781.06 24.94 11.317 24.882 25.106C49.917 38.894 38.663 50.058 24.88 50 11.1 49.942-.059 38.683.001 24.894.057 11.106 11.31-.058 25.092 0zm11.801 31.9L14.398 16.053c.241-.26.48-.518.74-.777 2.7-2.687 5.971-4.031 9.775-4.015 3.804.015 7.064 1.388 9.741 4.098.238.241.476.482.694.743l-5.951 4.133 2.381 1.688 5.153-3.576v.02L39.33 16.7c-.692-1.203-1.584-2.325-2.616-3.39-3.231-3.292-7.167-4.947-11.788-4.967-4.6-.019-8.53 1.603-11.809 4.867a17.806 17.806 0 00-2.682 3.408l1.429 1.004 23.429 16.51c-.24.26-.48.518-.74.777-2.7 2.687-5.971 4.011-9.775 3.996-3.803-.016-7.063-1.37-9.74-4.08-.258-.26-.496-.521-.734-.782l6.111-4.251-.139-.181-2.183-1.528-5.373 3.735v-.021l-2.377 1.65a17.824 17.824 0 002.654 3.43c3.253 3.291 7.169 4.946 11.769 4.965 4.62.021 8.549-1.602 11.83-4.866 1.06-1.075 1.96-2.21 2.682-3.406l-2.383-1.67z\">\n");
      out.write("                                </path>\n");
      out.write("                            </svg> -->\n");
      out.write("                            <img src=\"./assets/img/logo.png\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <div class=\"search__wrapper\">\n");
      out.write("                            <div class=\"search__box\">\n");
      out.write("                                <div class=\"search__location search__box--separate\">\n");
      out.write("                                    <div class=\"search__location-icon\">\n");
      out.write("                                        <i class=\"ri-search-line\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"text\" class=\"search__location-input\" placeholder=\"Tìm kiếm\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"search__date search__box--separate hide-on-mobile\">\n");
      out.write("                                    <svg version=\"1.1\" viewBox=\"0 0 14 16\" class=\"mr--12 svg-icon svg-fill\" style=\"width: 14px; height: 16px;\">\n");
      out.write("                                    <path pid=\"0\"\n");
      out.write("                                          d=\"M9 2V1a1 1 0 112 0v1a3 3 0 013 3v8a3 3 0 01-3 3H3a3 3 0 01-3-3V5a3 3 0 013-3V1a1 1 0 112 0v1h4zM2 7v6a1 1 0 001 1h8a1 1 0 001-1V7H2z\"\n");
      out.write("                                          fill=\"#666\" fill-rule=\"evenodd\"></path>\n");
      out.write("                                    </svg>\n");
      out.write("                                    <span class=\"search__date-text\">Ngày</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"search__guest hide-on-mobile\">\n");
      out.write("                                    <svg version=\"1.1\" viewBox=\"0 0 16 16\" class=\"mr--12 svg-icon svg-fill\" style=\"width: 14px; height: 14px;\">\n");
      out.write("                                    <path pid=\"0\"\n");
      out.write("                                          d=\"M8 8a4 4 0 110-8 4 4 0 010 8zm0 1c4.926 0 7.59 1.966 7.995 5.898A1.002 1.002 0 0114.994 16H1.006a1.003 1.003 0 01-1-1.102C.408 10.966 3.073 9 8 9z\"\n");
      out.write("                                          fill=\"#666\" fill-rule=\"evenodd\"></path>\n");
      out.write("                                    </svg>\n");
      out.write("                                    <span class=\"search__guest-text\">Số Khách</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <button class=\"search__btn hide-on-mobile\">\n");
      out.write("                                <i class=\"search__btn-icon ri-search-line\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"menu-on-tablet-mobile\">\n");
      out.write("                    <div class=\"menu-btn\">\n");
      out.write("                        <i class=\"menu-icon ri-menu-line\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col l-4 l-o-2 hide-on-tablet-mobile hide-low-pc\">\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li class=\"menu__item\">\n");
      out.write("                            <a href=\"\" class=\"menu__link\">Guide</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu__item\">\n");
      out.write("                            <a href=\"\" class=\"menu__link\">Host</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu__item\">\n");
      out.write("                            <a href=\"Sign-up.jsp\" class=\"menu__link\">Đăng ký</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu__item\">\n");
      out.write("                            <a href=\"\" class=\"menu__link\">Đăng nhập</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu__item\">\n");
      out.write("                            <a href=\"\" class=\"menu__link\">\n");
      out.write("                                <div class=\"menu__btn\">\n");
      out.write("                                    <img src=\"./assets/img/vi.svg\" alt=\"\" class=\"menu__icon\">\n");
      out.write("                                    <span>VND</span>\n");
      out.write("                                    <i class=\"menu__icon-down ri-arrow-down-s-fill\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"menu-select\">\n");
      out.write("                                <div class=\"select-language\">\n");
      out.write("                                    <ul class=\"language-list\">\n");
      out.write("                                        <li class=\"language-item\">\n");
      out.write("                                            <img src=\"./assets/img/vi.svg\" alt=\"\" class=\"language-country\">\n");
      out.write("                                            <span>Tiếng Việt</span>\n");
      out.write("                                            <i class=\"select__icon-check ri-check-line\"></i>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"language-item\">\n");
      out.write("                                            <img src=\"./assets/img/en.svg\" alt=\"\" class=\"language-country\">\n");
      out.write("                                            <span>England</span>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"select-unit\">\n");
      out.write("                                    <ul class=\"language-list\">\n");
      out.write("                                        <li class=\"language-item\">\n");
      out.write("                                            <b>vnd</b>\n");
      out.write("                                            <span>việt nam đồng</span>\n");
      out.write("                                            <i class=\"select__icon-check ri-check-line\"></i>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"language-item\">\n");
      out.write("                                            <b>usd</b>\n");
      out.write("                                            <span>united states dollars</span>\n");
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
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
