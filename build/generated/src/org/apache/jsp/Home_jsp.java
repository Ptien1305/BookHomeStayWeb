package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Hashtable;
import java.util.Set;
import java.util.ArrayList;
import entity.Location;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/owl-carousel/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/owl-carousel/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/base.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/responsive.css\">\n");
      out.write("        <title>TineBNB</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        Hashtable<Location, String> locations = (Hashtable<Location, String>) request.getAttribute("location");
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"slider\">\n");
      out.write("                <div class=\"grid wide\">\n");
      out.write("                    <div class=\"owl-carousel owl-theme\">\n");
      out.write("                        <a href=\"#\" class=\"item\">\n");
      out.write("                            <img src=\"assets/img/slider1.png\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"item\">\n");
      out.write("                            <img src=\"assets/img/slider2.png\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"app__content\">\n");
      out.write("                <div class=\"grid wide\">\n");
      out.write("                    <!-- ===============================WELCOM============================== -->\n");
      out.write("                    <div class=\"content-section\">\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                         ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ===============================TOUR SLIDER============================== -->\n");
      out.write("                    <div class=\"content-section\">\n");
      out.write("                        <div class=\"lux-stay-tour\">\n");
      out.write("                            <h3 class=\"content__heading mb-16\">Địa điểm nổi bật</h3>\n");
      out.write("                            <p class=\"content__sub mb-20\">Cùng TineBNB bắt đầu chuyến hành trình chinh phục thế giới của bạn\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tour\">\n");
      out.write("                            <div class=\"owl-carousel owl-theme\">\n");
      out.write("\n");
      out.write("                                ");
 Set<Location> setOfLocations = locations.keySet();
                                    for (Location location : setOfLocations) {
                                
      out.write("\n");
      out.write("                                <a href=\"location?lid=");
      out.print(location.getId());
      out.write("\">\n");
      out.write("                                    <div class=\"tour__item\">\n");
      out.write("                                        <img class=\"tour__img\" src=\"");
      out.print(location.getImage());
      out.write("\" alt=\"\">\n");
      out.write("                                        <div class=\"tour__info\">\n");
      out.write("                                            <h4 class=\"tour__name\">");
      out.print(location.getName());
      out.write("</h4>\n");
      out.write("                                            <p class=\"tour__quantity\">");
      out.print(locations.get(location));
      out.write(" <span>chỗ ở</span></p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- ===============================OFFER============================== -->\n");
      out.write("                    <div class=\"content-section\">\n");
      out.write("                        <div class=\"lux-stay-offer\">\n");
      out.write("                            <h3 class=\"content__heading mb-16\">Ưu đãi độc quyền</h3>\n");
      out.write("                            <p class=\"content__sub mb-20\">\n");
      out.write("                                Chỉ có tại TineBNB, hấp dẫn và hữu hạn, book ngay!\n");
      out.write("                                <a class=\"offer-more hide-on-mobile\" href=\"\">Xem thêm</a>\n");
      out.write("                            </p>\n");
      out.write("                            <div class=\"row hide-on-tablet-mobile\">\n");
      out.write("                                <div class=\"col l-4 m-6 c-0\">\n");
      out.write("                                    <a href=\"\">\n");
      out.write("                                        <img src=\"./assets/img/offer1.jpg\" alt=\"\" class=\"offer__img\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col l-4 m-6 c-0\">\n");
      out.write("                                    <a href=\"\">\n");
      out.write("                                        <img src=\"./assets/img/offer2.jpg\" alt=\"\" class=\"offer__img\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col l-4 m-6 c-0\">\n");
      out.write("                                    <a href=\"\">\n");
      out.write("                                        <img src=\"./assets/img/offer3.jpg\" alt=\"\" class=\"offer__img\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"list-offer-on-tablet-mobile\">\n");
      out.write("                                    <div class=\"col l-4 m-6 c-11\">\n");
      out.write("                                        <a href=\"\">\n");
      out.write("                                            <img src=\"./assets/img/offer1.jpg\" alt=\"\" class=\"offer__img\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col l-4 m-6 c-11\">\n");
      out.write("                                        <a href=\"\">\n");
      out.write("                                            <img src=\"./assets/img/offer2.jpg\" alt=\"\" class=\"offer__img\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col l-4 m-6 c-11\">\n");
      out.write("                                        <a href=\"\">\n");
      out.write("                                            <img src=\"./assets/img/offer3.jpg\" alt=\"\" class=\"offer__img\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ===============================BEGIN SUGGEST============================== -->\n");
      out.write("                    <div class=\"content-section\">\n");
      out.write("                        <div class=\"lux-stay-suggest\">\n");
      out.write("                            <h3 class=\"content__heading mb-16\">Gợi ý từ TineBNB</h3>\n");
      out.write("                            <p class=\"content__sub mb-20\">\n");
      out.write("                                Những địa điểm thường đến mà TineBNB gợi ý dành cho bạn\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <div class=\"suggest\">\n");
      out.write("                                <div class=\"owl-carousel owl-theme\">\n");
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ===============================END SUGGEST============================== -->\n");
      out.write("\n");
      out.write("                    <!-- ===============================BEGIN DOWNLOAD============================== -->\n");
      out.write("\n");
      out.write("                    <div class=\"content-section\">\n");
      out.write("                        <div class=\"lux-stay-download\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col l-6\">\n");
      out.write("                                    <div class=\"lux-stay-logo\">\n");
      out.write("\n");
      out.write("                                        <img src=\"./assets/img/logo2.png\" class=\"mb--18 mb--18 logo2\" alt=\"\">\n");
      out.write("                                        <h2 class=\"download__heading\">TÌM KIẾM CHỖ Ở GIÁ TỐT NHẤT</h2>\n");
      out.write("                                        <p class=\"download__desc\">TineBNB hiện là nền tảng đặt phòng trực tuyến #1 Việt Nam. Đồng hành cùng chúng tôi, bạn có những chuyến đi mang đầy trải nghiệm. Với TineBNB, việc đặt chỗ ở, biệt thự nghỉ dưỡng, khách sạn, nhà riêng, chung cư... trở\n");
      out.write("                                            nên nhanh chóng, thuận tiện và dễ dàng.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"download__list\">\n");
      out.write("                                        <div class=\"row sm-mb-30\">\n");
      out.write("                                            <div class=\"col l-4 m-0 c-0\">\n");
      out.write("                                                <div class=\"download__qr-code\">\n");
      out.write("                                                    <img class=\"qr-code__img\" src=\"./assets/img/qr-code.png\" alt=\"\" class=\"qr__img\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col l-4 m-o-1 m-5 c-12\">\n");
      out.write("                                                <a href=\"\" class=\"download__link mt-20\">\n");
      out.write("                                                    <img src=\"./assets/img/apple-store.svg\" alt=\"\">\n");
      out.write("                                                </a>\n");
      out.write("                                                <a href=\"\" class=\"download__link mt-24\">\n");
      out.write("                                                    <img src=\"./assets/img/google-play.svg\" alt=\"\">\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col l-6\">\n");
      out.write("                                    <img class=\"app-img\" src=\"./assets/img/app.png\" alt=\"\" class=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ===============================END DOWNLOAD============================== -->\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"lux-stay-welcome\">\n");
        out.write("                                <h3 class=\"content__heading mb-16\">Chào mừng đến với TineBNB !</h3>\n");
        out.write("                                <p class=\"content__sub mb-8\">Đặt chỗ ở, homestay, cho thuê xe, trải nghiệm và nhiều hơn nữa trên TineBNB\n");
        out.write("                                </p>\n");
        out.write("                                <p class=\"content__sub\"> <a href=\"sign-in\">Đăng nhập</a> hoặc <a href=\"sign-up\">Đăng ký</a> để trải nghiệm !\n");
        out.write("                                </p>\n");
        out.write("                            </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"lux-stay-welcome\">\n");
        out.write("                                <h3 class=\"content__heading mb-16\">Chào mừng đến với TineBNB, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" !</h3>\n");
        out.write("                                <p class=\"content__sub mb-8\">Đặt chỗ ở, homestay, cho thuê xe, trải nghiệm và nhiều hơn nữa trên TineBNB\n");
        out.write("                                </p>\n");
        out.write("                            </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestaytop}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <a href=\"homestay?hid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <div class=\"suggest__item\">\n");
          out.write("                                                <img class=\"suggest__img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                                <div class=\"suggest__info\">\n");
          out.write("                                                    <p class=\"suggest__heading\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    <p class=\"suggest__desc\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.desciption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </a>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
