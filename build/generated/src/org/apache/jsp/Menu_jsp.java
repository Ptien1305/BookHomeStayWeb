package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"modal-menu\">\n");
      out.write("    <div class=\"modal-menu-container\">\n");
      out.write("        <div class=\"modal-menu__top\">\n");
      out.write("            <a href=\"\">\n");
      out.write("                <svg version=\"1.1\" viewBox=\"0 0 244 50\" class=\"modal-menu__logo-img svg-icon svg-fill\">\n");
      out.write("                <path pid=\"0\"\n");
      out.write("                      d=\"M25.093 0c13.781.06 24.94 11.317 24.882 25.106C49.917 38.894 38.663 50.058 24.88 50 11.1 49.942-.059 38.683.001 24.894.057 11.106 11.31-.058 25.092 0zm11.801 31.9L14.398 16.053c.241-.26.48-.518.74-.777 2.7-2.687 5.971-4.031 9.775-4.015 3.804.015 7.064 1.388 9.741 4.098.238.241.476.482.694.743l-5.951 4.133 2.381 1.688 5.153-3.576v.02L39.33 16.7c-.692-1.203-1.584-2.325-2.616-3.39-3.231-3.292-7.167-4.947-11.788-4.967-4.6-.019-8.53 1.603-11.809 4.867a17.806 17.806 0 00-2.682 3.408l1.429 1.004 23.429 16.51c-.24.26-.48.518-.74.777-2.7 2.687-5.971 4.011-9.775 3.996-3.803-.016-7.063-1.37-9.74-4.08-.258-.26-.496-.521-.734-.782l6.111-4.251-.139-.181-2.183-1.528-5.373 3.735v-.021l-2.377 1.65a17.824 17.824 0 002.654 3.43c3.253 3.291 7.169 4.946 11.769 4.965 4.62.021 8.549-1.602 11.83-4.866 1.06-1.075 1.96-2.21 2.682-3.406l-2.383-1.67zm45.839 2.652l-12.45-.05.096-21.789a.957.957 0 00-.965-.945l-.678-.003a.96.96 0 00-.974.939v.047c-.048.095-.05.236-.05.33l-.098 22.636a1.337 1.337 0 001.351 1.326l13.805.056a.958.958 0 00.973-.938l.003-.662a1.037 1.037 0 00-1.013-.946v-.001zm27.64-22.67l-.871-.003c-.563-.003-1.027.42-1.027.937l-.075 15.878c-.014 3.157-3.252 5.735-7.197 5.72-3.943-.014-7.158-2.618-7.144-5.775l.123-15.5.052-.282a.957.957 0 00-.201-.756 1.128 1.128 0 00-.767-.332l-.87-.004c-.513-.002-.924.326-1.028.75a.857.857 0 00-.156.47l-.073 15.69c-.02 4.616 4.47 8.402 9.95 8.424 5.48.022 10.004-3.73 10.025-8.3l.122-15.5.054-.282a.952.952 0 00-.203-.755c-.152-.189-.458-.379-.714-.38zm48.638 11.226c-3.275-1.249-6.696-2.496-6.688-4.393.01-2.42 2.721-4.401 6.05-4.387 3.331.014 6.025 2.017 6.014 4.436l-.002.38a.96.96 0 00.961.953l.675.003a.96.96 0 00.971-.945v-.38c.009-1.66-.709-3.276-2.006-4.515-1.635-1.618-4.092-2.532-6.65-2.494-4.873-.02-8.698 3.047-8.715 6.938.03 3.748 4.416 5.38 8.656 6.962 3.324 1.247 6.795 2.495 6.785 4.487-.01 2.372-3.155 4.399-6.775 4.385-3.668-.016-6.747-2.07-6.737-4.44l.001-.38a.961.961 0 00-.96-.954l-.676-.002a.96.96 0 00-.97.945v.38c-.018 3.843 4.215 6.991 9.38 7.012 5.163.022 9.423-3.092 9.44-6.934-.033-3.796-4.464-5.427-8.754-7.057zM193.66 11.84l-18.844-.076c-.547-.003-.996.42-.999.94l-.002.66c-.002.52.443.946.99.949l8.103.032-.095 21.802c-.003.52.443.947.99.949l.696.002c.546.003.996-.42 1-.94l.095-21.802 8.055.031c.547.003.996-.42.999-.94l.003-.66c.003-.52-.443-.946-.99-.947zm49.264.515c-.144-.33-.481-.52-.867-.52l-.87-.005a.963.963 0 00-.677.28l-.145.14-.147.142-6.609 9.677-6.72-9.734c-.048-.046-.096-.094-.096-.14l-.143-.143a.97.97 0 00-.675-.285l-.774-.003a1.021 1.021 0 00-.872.515 1.03 1.03 0 00.045.988l7.966 11.576-.049 11.307c.006.527.437.95.964.946l.675.002a.957.957 0 00.97-.937l.049-11.308 7.923-11.509c.194-.329.243-.705.052-.989zm-37.898 12.047l3.75-7.994 3.728 8.023-7.478-.03zm15.615 10.954v-.047l-10.5-22.733c-.15-.425-.549-.71-1.102-.807-.603-.049-1.156.231-1.41.703v.046l-10.705 22.697v.047l-.204.471c-.095.283-.06.595.097.849.188.258.483.416.802.428l.854.004c.453.001.806-.282.958-.657l.05-.141 4.314-9.277 9.95.04 4.28 9.31.049.14c.15.38.5.664.952.667l.854.002c.352.002.654-.139.806-.422.152-.281.254-.563.104-.847l-.149-.473zm-86.008-15.15l.817.003a.963.963 0 00.729-.347l4.755-6.218.412-.478a.763.763 0 00.095-.915c-.135-.306-.453-.482-.816-.483l-.863-.004a.929.929 0 00-.868.608l-4.983 6.522a.94.94 0 00-.096.915c.135.22.453.394.816.397h.002zm-6.998 8.45l-.819-.002a.96.96 0 00-.728.347l-4.755 6.207-.413.48a.77.77 0 00-.094.92c.135.309.452.485.816.488l.864.002a.91.91 0 00.82-.478l5.03-6.601a.949.949 0 00.095-.92 1.027 1.027 0 00-.816-.443zm8.019-.453l.148.14 5.55 7.248c.248.284.246.662.095.99-.15.332-.5.519-.9.517l-.896-.004a1.013 1.013 0 01-.697-.286l-.149-.14c-.03-.002-.042-.02-.059-.044a.212.212 0 00-.04-.052l-5.501-7.151a1.005 1.005 0 01-.15-.237l-11.694-15.39-.446-.521c-.248-.285-.246-.662-.096-.993.15-.33.501-.518.9-.516l.897.004a.99.99 0 01.845.428l.15.19 11.992 15.721s.05.048.05.096z\">\n");
      out.write("                </path>\n");
      out.write("                </svg>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"modal-menu__close\">\n");
      out.write("                <i class=\"modal-menu__close-icon ri-close-line\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <ul class=\"modal-menu__list\">\n");
      out.write("            <li class=\"modal-menu__item\">\n");
      out.write("                <a href=\"https://travel.luxstay.com\" class=\"modal-menu__link\">Guide</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"modal-menu__item\">\n");
      out.write("                <a href=\"https://travel.luxstay.com\" class=\"modal-menu__link\">Host</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"modal-menu__item\">\n");
      out.write("                <a href=\"\" class=\"modal-menu__link\">Đăng ký</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"modal-menu__item\">\n");
      out.write("                <a href=\"\" class=\"modal-menu__link\">Đăng nhập</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"modal-menu__item\">\n");
      out.write("                <div class=\"modal-account__btn\">\n");
      out.write("                    <img src=\"./assets/img/backpack@2x.png\" alt=\"\" class=\"modal-menu__icon\">\n");
      out.write("                    <span>Phan Tiến</span>\n");
      out.write("                    <i class=\"modal-menu__icon-down ri-arrow-down-s-fill\"></i>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"modal-menu__item\">\n");
      out.write("                <div class=\"modal-menu__btn js-modal-menu__btn\">\n");
      out.write("                    <img src=\"./assets/img/vi.svg\" alt=\"\" class=\"modal-menu__icon\">\n");
      out.write("                    <span>VND</span>\n");
      out.write("                    <i class=\"modal-menu__icon-down ri-arrow-down-s-fill\"></i>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"select-on-mobile-tablet js-select-on-mobile-tablet\">\n");
      out.write("                    <ul class=\"select-list\">\n");
      out.write("                        <li class=\"language-item\">\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <img src=\"./assets/img/vi.svg\" alt=\"\" class=\"language-country\">\n");
      out.write("                                <span>Tiếng Việt</span>\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <i class=\"select__icon-check ri-check-line\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"language-item\">\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <img src=\"./assets/img/en.svg\" alt=\"\" class=\"language-country\">\n");
      out.write("                                <span>England</span>\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"language-item\">\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <b>vnd</b>\n");
      out.write("                                <span>việt nam đồng</span>\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <i class=\"select__icon-check ri-check-line\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"language-item\">\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <b>usd</b>\n");
      out.write("                                <span>united states dollars</span>\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu__mask\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
