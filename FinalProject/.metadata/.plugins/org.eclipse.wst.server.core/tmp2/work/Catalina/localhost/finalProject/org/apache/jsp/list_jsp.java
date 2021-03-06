/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.40
 * Generated at: 2020-11-24 08:32:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import backfile.BoardBean;
import java.util.Vector;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("backfile.BoardBean");
    _jspx_imports_classes.add("java.util.Vector");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      backfile.BoardMgr bMgr = null;
      bMgr = (backfile.BoardMgr) _jspx_page_context.getAttribute("bMgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (bMgr == null){
        bMgr = new backfile.BoardMgr();
        _jspx_page_context.setAttribute("bMgr", bMgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
	
	  request.setCharacterEncoding("utf-8");
	  
      int totalRecord=0; //??????????????????
	  int numPerPage=10; // ???????????? ????????? ??? 
	  int pagePerBlock=15; //????????? ???????????? 
	  
	  int totalPage=0; //?????? ????????? ???
	  int totalBlock=0;  //?????? ????????? 

	  int nowPage=1; // ???????????????
	  int nowBlock=1;  //????????????
	  
	  int start=0; //????????? select ????????????
	  int end=10; //??????????????? ?????? ????????? select ??????
	  
	  int listSize=0; //?????? ????????? ???????????? ???

	String keyWord = "", keyField = "";
	Vector<BoardBean> vlist = null;
	if (request.getParameter("keyWord") != null) {
		keyWord = request.getParameter("keyWord");
		keyField = request.getParameter("keyField");
	}
	if (request.getParameter("reload") != null){
		if(request.getParameter("reload").equals("true")) {
			keyWord = "";
			keyField = "";
		}
	}
	
	if (request.getParameter("nowPage") != null) {
		nowPage = Integer.parseInt(request.getParameter("nowPage"));
	}
	 start = (nowPage * numPerPage)-numPerPage;
	 end = numPerPage;
	 
	totalRecord = bMgr.getTotalCount(keyField, keyWord);
	totalPage = (int)Math.ceil((double)totalRecord / numPerPage);  //??????????????????
	nowBlock = (int)Math.ceil((double)nowPage/pagePerBlock); //???????????? ??????
	  
	totalBlock = (int)Math.ceil((double)totalPage / pagePerBlock);  //??????????????????

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>JSP Board</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction list() {\r\n");
      out.write("\t\tdocument.listFrm.action = \"list.jsp\";\r\n");
      out.write("\t\tdocument.listFrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction pageing(page) {\r\n");
      out.write("\t\tdocument.readFrm.nowPage.value = page;\r\n");
      out.write("\t\tdocument.readFrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction block(value){\r\n");
      out.write("\t\t document.readFrm.nowPage.value=");
      out.print(pagePerBlock);
      out.write("*(value-1)+1;\r\n");
      out.write("\t\t document.readFrm.submit();\r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("\tfunction read(num){\r\n");
      out.write("\t\tdocument.readFrm.num.value=num;\r\n");
      out.write("\t\tdocument.readFrm.action=\"read.jsp\";\r\n");
      out.write("\t\tdocument.readFrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction check() {\r\n");
      out.write("\t     if (document.searchFrm.keyWord.value == \"\") {\r\n");
      out.write("\t   alert(\"???????????? ???????????????.\");\r\n");
      out.write("\t   document.searchFrm.keyWord.focus();\r\n");
      out.write("\t   return;\r\n");
      out.write("\t     }\r\n");
      out.write("\t  document.searchFrm.submit();\r\n");
      out.write("\t }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#FFFFCC\">\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<h2>JSPBoard</h2>\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<table align=\"center\" width=\"600\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Total : ");
      out.print(totalRecord);
      out.write("Articles(<font color=\"red\">\r\n");
      out.write("\t\t\t\t");
      out.print(nowPage);
      out.write('/');
      out.print(totalPage);
      out.write("Pages</font>)</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table align=\"center\" width=\"600\" cellpadding=\"3\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t");

				  vlist = bMgr.getBoardList(keyField, keyWord, start, end);
				  listSize = vlist.size();//???????????? ????????? ????????? ???????????????
				  if (vlist.isEmpty()) {
					out.println("????????? ???????????? ????????????.");
				  } else {
			
      out.write("\r\n");
      out.write("\t\t\t\t  <table width=\"100%\" cellpadding=\"2\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr align=\"center\" bgcolor=\"#D0D0D0\" height=\"120%\">\r\n");
      out.write("\t\t\t\t\t\t<td>??? ???</td>\r\n");
      out.write("\t\t\t\t\t\t<td>??? ???</td>\r\n");
      out.write("\t\t\t\t\t\t<td>??? ???</td>\r\n");
      out.write("\t\t\t\t\t\t<td>??? ???</td>\r\n");
      out.write("\t\t\t\t\t\t<td>?????????</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						  for (int i = 0;i<numPerPage; i++) {
							if (i == listSize) break;
							BoardBean bean = vlist.get(i);
							int num = bean.getNum();
							String name = bean.getName();
							String subject = bean.getSubject();
							String regdate = bean.getRegdate();
							int depth = bean.getDepth();
							int count = bean.getCount();
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(totalRecord-((nowPage-1)*numPerPage)-i);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");

							  if(depth>0){
								for(int j=0;j<depth;j++){
									out.println("&nbsp;&nbsp;");
									}
								}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  <a href=\"javascript:read('");
      out.print(num);
      out.write("')\">");
      out.print(subject);
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">");
      out.print(name);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">");
      out.print(regdate);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">");
      out.print(count);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
}//for
      out.write("\r\n");
      out.write("\t\t\t\t</table> ");

 			}//if
 		
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\"><br /><br /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<!-- ????????? ??? ?????? ?????? Start--> \r\n");
      out.write("\t\t\t");

   				  int pageStart = (nowBlock -1)*pagePerBlock + 1 ; //?????? ????????? ????????????
   				  int pageEnd = ((pageStart + pagePerBlock ) <= totalPage) ?  (pageStart + pagePerBlock): totalPage+1; 
   				  //?????? ????????? ?????????
   				  if(totalPage !=0){
    			  	if (nowBlock > 1) {
      out.write("\r\n");
      out.write("    \t\t\t  \t\t<a href=\"javascript:block('");
      out.print(nowBlock-1);
      out.write("')\">prev...</a>");
}
      out.write("&nbsp; \r\n");
      out.write("    \t\t\t  \t\t");
for ( ; pageStart < pageEnd; pageStart++){
      out.write("\r\n");
      out.write("     \t\t\t     \t<a href=\"javascript:pageing('");
      out.print(pageStart );
      out.write("')\"> \r\n");
      out.write("     \t\t\t\t\t");
if(pageStart==nowPage) {
      out.write("<font color=\"blue\"> ");
}
      out.write("\r\n");
      out.write("     \t\t\t\t\t[");
      out.print(pageStart );
      out.write("] \r\n");
      out.write("     \t\t\t\t\t");
if(pageStart==nowPage) {
      out.write("</font> ");
}
      out.write("</a> \r\n");
      out.write("    \t\t\t\t\t");
}//for
      out.write("&nbsp; \r\n");
      out.write("    \t\t\t\t\t");
if (totalBlock > nowBlock ) {
      out.write("\r\n");
      out.write("    \t\t\t\t\t<a href=\"javascript:block('");
      out.print(nowBlock+1);
      out.write("')\">.....next</a>\r\n");
      out.write("    \t\t\t\t");
}
      out.write("&nbsp;  \r\n");
      out.write("   \t\t\t\t");
}
      out.write("\r\n");
      out.write(" \t\t\t\t<!-- ????????? ??? ?????? ?????? End-->\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t\t<a href=\"post.jsp\">[?????????]</a> \r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:list()\">[????????????]</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t<hr width=\"600\"/>\r\n");
      out.write("\t<form  name=\"searchFrm\"  method=\"get\" action=\"list.jsp\">\r\n");
      out.write("\t<table width=\"600\" cellpadding=\"4\" cellspacing=\"0\">\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write("  \t\t\t<td align=\"center\" valign=\"bottom\">\r\n");
      out.write("   \t\t\t\t<select name=\"keyField\" size=\"1\" >\r\n");
      out.write("    \t\t\t\t<option value=\"name\"> ??? ???</option>\r\n");
      out.write("    \t\t\t\t<option value=\"subject\"> ??? ???</option>\r\n");
      out.write("    \t\t\t\t<option value=\"content\"> ??? ???</option>\r\n");
      out.write("   \t\t\t\t</select>\r\n");
      out.write("   \t\t\t\t<input size=\"16\" name=\"keyWord\">\r\n");
      out.write("   \t\t\t\t<input type=\"button\"  value=\"??????\" onClick=\"javascript:check()\">\r\n");
      out.write("   \t\t\t\t<input type=\"hidden\" name=\"nowPage\" value=\"1\">\r\n");
      out.write("  \t\t\t</td>\r\n");
      out.write(" \t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<form name=\"listFrm\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"reload\" value=\"true\"> \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"nowPage\" value=\"1\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<form name=\"readFrm\" method=\"get\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"num\"> \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"nowPage\" value=\"");
      out.print(nowPage);
      out.write("\"> \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"keyField\" value=\"");
      out.print(keyField);
      out.write("\"> \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"keyWord\" value=\"");
      out.print(keyWord);
      out.write("\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
