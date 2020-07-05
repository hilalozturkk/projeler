package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class response_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <script src=\"template/js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <link href=\"template/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"template/bootstrap/css/bootstrap-reboot.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"template/bootstrap/css/bootstrap-grid.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("        .a1{\n");
      out.write("            text-align: justify;\n");
      out.write("        }\n");
      out.write("        .container{\n");
      out.write("            background-color:  #c67d87 ;\n");
      out.write("            margin : 7rem ;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            background-color:  #c66370;\n");
      out.write("                   }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h1 style=\"margin: 3rem; text-align: center ; color: #7a545a ; \">HOŞGELDİNİZ</h1>\n");
      out.write("<div class=\"row\" style=\"background-color: #bfabae ;\">\n");
      out.write("    <div class=\"col-5  col-sm-5 col-md-3 col-lg-3 col-xl-3\" style=\"font-size:20px;\">\n");
      out.write("        \n");
      out.write("        ");
      veri.Kisi ilk = null;
      synchronized (session) {
        ilk = (veri.Kisi) _jspx_page_context.getAttribute("ilk", PageContext.SESSION_SCOPE);
        if (ilk == null){
          ilk = new veri.Kisi();
          _jspx_page_context.setAttribute("ilk", ilk, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("ilk"), "isim", request.getParameter("isim"), request, "isim", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("ilk"), "sifre", request.getParameter("sifre"), request, "sifre", false);
      out.write("\n");
      out.write("        Merhaba;\n");
      out.write("\n");
      out.write("        ");

            if (ilk.sifreKontrol()) {
                out.println(" sisteme hoşgeldiniz");
            } else {
                out.println(" şifre hatalı ");
            }
        
      out.write("  <br>\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((veri.Kisi)_jspx_page_context.findAttribute("ilk")).getIsim())));
      out.write("\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((veri.Kisi)_jspx_page_context.findAttribute("ilk")).getSifre())));
      out.write("<br>\n");
      out.write("        Sisteme hoşgeldin.</div>\n");
      out.write("    <div class=\"col-7 col-sm-7 col-md-9 col-lg-9 col-xl-9\">\n");
      out.write("\n");
      out.write("        <p id=\"a1\">\n");
      out.write("            Bu kurs web tasarım konusuna merakı olan, bu konuda kendini geliştirmek isteyen bireylere eğitici bir çalışma kaynağı oluşturmak amacıyla hazırlanmıştır. \n");
      out.write("\n");
      out.write("            Konu anlatımı bütünden parçalara bölünerek videoların süreleri azaltılmış, konunun daha anlaşılır ve net olması hedeflenmiştir. Böylelikle aradığınız konuları kısa videolar içinde kolaylıkla bulabileceksiniz. \n");
      out.write("\n");
      out.write("            Kursumuzda sesli anlatımın yanı sıra altyazı seçenekleri de bulunmaktadır. Bazı sorunlardan dolayı sesi açamadığınızda ya da işitmede sorun yaşadığınızda altyazı seçeneğini açarak derslerimizi izleyebilirsiniz.\n");
      out.write("\n");
      out.write("            Öğrenecekleriniz\n");
      out.write("            Bootstrap 4'ün tüm özelliklerini öğrenmiş olacaksınız.\n");
      out.write("            Ekran boyutuna duyarlı (Responsive) web sayfaları oluşturabileceksiniz.\n");
      out.write("            Tüm platformlarla ve güncel tarayıcılarla uyumlu web sayfaları oluşturabileceksiniz.\n");
      out.write("            Hayalinizdeki web sayfası tasarımını Bootstrap 4 ile hayata geçirebileceksiniz.\n");
      out.write("            Bootstrap 4'ü kendi ihtiyaçlarınıza göre özelleştirebileceksiniz.\n");
      out.write("            Kurs gereksinimleri veya ön koşulları var mı?\n");
      out.write("            Temel seviyede HTML, CSS ve JavaScript bilginizin olması önerilir.\n");
      out.write("            Bootstrap hakkında herhangi bir bilginizin olmasına gerek YOKTUR.\n");
      out.write("            Bu kurs kimler için uygun:\n");
      out.write("            Web tasarım alanında kendini geliştirmek isteyen, bu alana ilgi duyan ya da bu sektörde kariyer planlayan herkes\n");
      out.write("            Bootstrap 4'ü tüm hatlarıyla öğrenerek profesyonel web sayfaları oluşturmak isteyen herkes</p>\n");
      out.write("    </div></div></div>\n");
      out.write("</body>\n");
      out.write("<script src=\"template/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"template/bootstrap/js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>\n");
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
