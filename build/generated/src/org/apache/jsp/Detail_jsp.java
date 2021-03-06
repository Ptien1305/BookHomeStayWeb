package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/fonts/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/owl-carousel/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/owl-carousel/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/grid.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/base.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/responsive.css\">\n");
      out.write("    <title>TineBNB</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"slider\">\n");
      out.write("            <div class=\"grid\">\n");
      out.write("                <div class=\"owl-carousel owl-theme\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"app__content\">\n");
      out.write("            <div class=\"grid wide\">\n");
      out.write("                <!-- ===============================Content============================== -->\n");
      out.write("                <div class=\"detail__content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col c-8 detail__content-description\">\n");
      out.write("                            \n");
      out.write("                                <div class=\"content-description--name\">\n");
      out.write("                                <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"content-desciption--about\">\n");
      out.write("                                <h3>T??m t???t v??? ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                                <p>?? V??? tr?? r???t ?????p v?? thu???n ti???n</p>\n");
      out.write("                                <p>?? M??i tr?????ng ngo??i tr???i y??n t??nh</p>\n");
      out.write("                                <p>?? B???n ho??n to??n c?? th??? tr???i nghi???m nh???ng d???ch v??? cao c???p t???i ????y V??? kh??ng gian</p>\n");
      out.write("                                <p>?? C??n h??? ???????c thi???t k??? v???i nhi???u l???a ch???n b??? tr?? h???p l?? v?? ???????c trang b??? theo ti??u chu???n cao c???p 4 sao v???i ban c??ng ri??ng v?? c???nh quan ?????p</p>\n");
      out.write("                                <p>?? C?? nhi???u d???ch v??? t???i ch??? kh??c nhau nh?? gi???t ???i, d???ch v??? v??? sinh, Wi-Fi mi???n ph?? t???c ????? cao, an ninh 24/7</p>\n");
      out.write("                                <p>?? D???ch v??? kh??ch h??ng ?????c bi???t ???????c cung c???p</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"content-description--convenient\">\n");
      out.write("                                <h3>Ti???n nghi ch??? ???</h3>\n");
      out.write("                                <span>Gi???i thi???u v??? c??c ti???n nghi v?? d???ch v??? t???i n??i l??u tr??</span>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-wifi\"></i> Wifi </div>\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-tv\"></i> TV </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-biking\"></i> Thu?? xe </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-wind\"></i> ??I???u h??a </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-bath\"></i> B???n t???m </div>\n");
      out.write(" \n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-hdd\"></i> Internet </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fab fa-playstation\"></i> PlayStation-4 </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-first-aid\"></i> H???p thu???c s?? c???u </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content-description--rule\">\n");
      out.write("                                <h3>L??u ?? ?????c bi???t</h3>\n");
      out.write("                                <div class=\"rule\">\n");
      out.write("                                    <p>- Kh??ng h??t thu???c trong c??n h???</p>\n");
      out.write("                                    <p>- Kh??ng s??? d???ng ch???t k??ch th??ch</p>\n");
      out.write("                                    <p>- Kh??ng m??? ti???c trong c??n h???</p>\n");
      out.write("                                    <p>- Kh??ng mang theo v???t nu??i</p>\n");
      out.write("                                    <p>- Vui l??ng gi??? im l???ng sau 22h</p>\n");
      out.write("                                    <p>- Vui l??ng t???t c??c thi???t b??? khi b???n ra kh???i ph??ng</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col c-3 detail__content-booking\">\n");
      out.write("                            <div class=\"booking\">\n");
      out.write("                                <div class=\"booking-price\">\n");
      out.write("                                    <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("???/????m</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"date\" class=\"booking-date\" placeholder=\"dd//mm/yyyy\">\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"date\" class=\"booking-date\" placeholder=\"dd//mm/yyyy\">\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"text\" class=\"booking-quantity\" placeholder=\"1 kh??ch\">\n");
      out.write("                                <br>\n");
      out.write("                                <button class=\"booking-book\">?????t ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"support\">\n");
      out.write("                                <div class=\"support-content\">\n");
      out.write("                                    <h3>T?? v???n t??? TineBNB</h3>\n");
      out.write("                                    <p>Vui l??ng cung c???p s??? ??i???n tho???i ????? ???????c nh???n t?? v???n cho chuy???n ??i c???a b???n</p>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" class=\"customer-name\" placeholder=\"T??n kh??ch h??ng\">\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"text\" class=\"customer-phone\" placeholder=\"S??? ??i???n tho???i\">\n");
      out.write("                                <br>\n");
      out.write("                                <button class=\"send-support\">Nh???n t?? v???n mi???n ph??</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- ===============================BEGIN SUGGEST============================== -->\n");
      out.write("                <div class=\"content-section\">\n");
      out.write("                    <div class=\"lux-stay-suggest\">\n");
      out.write("                        <h3 class=\"content__heading mb-16\">Ch??? ??? t????ng t???</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"suggest\">\n");
      out.write("                            <div class=\"owl-carousel owl-theme\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ===============================END SUGGEST============================== -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"ring\">\n");
      out.write("                <div class=\"coccoc-alo-phone coccoc-alo-green coccoc-alo-show\">\n");
      out.write("                    <div class=\"coccoc-alo-ph-circle\"></div>\n");
      out.write("                    <div class=\"coccoc-alo-ph-circle-fill\"></div>\n");
      out.write("                    <div class=\"coccoc-alo-ph-img-circle\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\n");
      out.write("    <script src=\"./assets/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${image}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <a href=\"\">\n");
          out.write("                        <div class=\"tour__item\">\n");
          out.write("                            <img class=\"homestay__detail-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                    </a>\n");
          out.write("                    ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestaytop}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <a href=\"homestay?hid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <div class=\"suggest__item\">\n");
          out.write("                                        <img class=\"suggest__img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                        <div class=\"suggest__info\">\n");
          out.write("                                            <p class=\"suggest__heading\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            <p class=\"suggest__desc\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.desciption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </a>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
