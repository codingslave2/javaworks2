/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-08-04 07:30:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model_p.BoardDTO;

public final class BDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model_p.BoardDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	BoardDTO dto = (BoardDTO)request.getAttribute("mainData");

      out.write("    \r\n");
      out.write("<table border=\"\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td width=\"200px\">id</td><td width=\"700px\">");
      out.print(dto.getId() );
      out.write("</td>\r\n");
      out.write("	</tr><tr>	\r\n");
      out.write("		<td >제목</td><td>");
      out.print(dto.getTitle() );
      out.write("</td>\r\n");
      out.write("	</tr><tr>\r\n");
      out.write("		<td >작성자</td><td>");
      out.print(dto.getPname() );
      out.write("</td>\r\n");
      out.write("	</tr><tr>\r\n");
      out.write("		<td >작성일</td><td>");
      out.print(dto.getReg_dateStr() );
      out.write("</td>\r\n");
      out.write("	</tr><tr>\r\n");
      out.write("		<td >조회수</td><td>");
      out.print(dto.getCnt() );
      out.write("</td>\r\n");
      out.write("	");
 if(!dto.getUpfile().equals("")) {
      out.write("	\r\n");
      out.write("	</tr><tr>\r\n");
      out.write("		<td >파일</td><td>\r\n");
      out.write("		");
 if(dto.isImg()) {
      out.write("\r\n");
      out.write("		 	<img width=\"500px\" src=\"/mvcProj/up/");
      out.print(dto.getUpfile() );
      out.write("\" alt=\"\" /> \r\n");
      out.write("		");
} else { 
      out.write("\r\n");
      out.write("		 	<a href=\"/mvcProj/noneJsp/FileDown?fName=");
      out.print(dto.getUpfile() );
      out.write('"');
      out.write('>');
      out.print(dto.getUpfile() );
      out.write("</a> \r\n");
      out.write("		");
} 
      out.write("\r\n");
      out.write("		</td>\r\n");
      out.write("	");
} 
      out.write("\r\n");
      out.write("	</tr><tr>\r\n");
      out.write("		<td >내용</td><td>");
      out.print(dto.getContentBr() );
      out.write("</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"2\"  align=\"right\">\r\n");
      out.write("			<a href=\"BList\">목록으로</a>\r\n");
      out.write("			<a href=\"BDeleteForm?id=");
      out.print(dto.getId());
      out.write("\">삭제</a>\r\n");
      out.write("			<a href=\"BModifyForm?id=");
      out.print(dto.getId());
      out.write("\">수정</a>\r\n");
      out.write("			<a href=\"BReplyForm?id=");
      out.print(dto.getId());
      out.write("\">답변</a>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}