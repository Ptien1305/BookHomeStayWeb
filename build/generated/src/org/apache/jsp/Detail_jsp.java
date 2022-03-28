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
      out.write("                                <h3>Tóm tắt về ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homestay.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                                <p>· Vị trí rất đẹp và thuận tiện</p>\n");
      out.write("                                <p>· Môi trường ngoài trời yên tĩnh</p>\n");
      out.write("                                <p>· Bạn hoàn toàn có thể trải nghiệm những dịch vụ cao cấp tại đây Về không gian</p>\n");
      out.write("                                <p>· Căn hộ được thiết kế với nhiều lựa chọn bố trí hợp lý và được trang bị theo tiêu chuẩn cao cấp 4 sao với ban công riêng và cảnh quan đẹp</p>\n");
      out.write("                                <p>· Có nhiều dịch vụ tại chỗ khác nhau như giặt ủi, dịch vụ vệ sinh, Wi-Fi miễn phí tốc độ cao, an ninh 24/7</p>\n");
      out.write("                                <p>· Dịch vụ khách hàng đặc biệt được cung cấp</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"content-description--convenient\">\n");
      out.write("                                <h3>Tiện nghi chỗ ở</h3>\n");
      out.write("                                <span>Giới thiệu về các tiện nghi và dịch vụ tại nơi lưu trú</span>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-wifi\"></i> Wifi </div>\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-tv\"></i> TV </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-biking\"></i> Thuê xe </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-wind\"></i> ĐIều hòa </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-bath\"></i> Bồn tắm </div>\n");
      out.write(" \n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-hdd\"></i> Internet </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fab fa-playstation\"></i> PlayStation-4 </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col c-3 convenient \"><i class=\"fas fa-first-aid\"></i> Hộp thuốc sơ cứu </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content-description--rule\">\n");
      out.write("                                <h3>Lưu ý đặc biệt</h3>\n");
      out.write("                                <div class=\"rule\">\n");
      out.write("                                    <p>- Không hút thuốc trong căn hộ</p>\n");
      out.write("                                    <p>- Không sử dụng chất kích thích</p>\n");
      out.write("                                    <p>- Không mở tiệc trong căn hộ</p>\n");
      out.write("                                    <p>- Không mang theo vật nuôi</p>\n");
      out.write("                                    <p>- Vui lòng giữ im lặng sau 22h</p>\n");
      out.write("                                    <p>- Vui lòng tắt các thiết bị khi bạn ra khỏi phòng</p>\n");
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
      out.write("₫/đêm</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"date\" class=\"booking-date\" placeholder=\"dd//mm/yyyy\">\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"date\" class=\"booking-date\" placeholder=\"dd//mm/yyyy\">\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"text\" class=\"booking-quantity\" placeholder=\"1 khách\">\n");
      out.write("                                <br>\n");
      out.write("                                <button class=\"booking-book\">Đặt ngay</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"support\">\n");
      out.write("                                <div class=\"support-content\">\n");
      out.write("                                    <h3>Tư vấn từ TineBNB</h3>\n");
      out.write("                                    <p>Vui lòng cung cấp số điện thoại để được nhận tư vấn cho chuyến đi của bạn</p>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" class=\"customer-name\" placeholder=\"Tên khách hàng\">\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"text\" class=\"customer-phone\" placeholder=\"Số điện thoại\">\n");
      out.write("                                <br>\n");
      out.write("                                <button class=\"send-support\">Nhận tư vấn miễn phí</button>\n");
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
      out.write("                        <h3 class=\"content__heading mb-16\">Chỗ ở tương tự</h3>\n");
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
