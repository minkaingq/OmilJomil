/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-11-15 02:40:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.member;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/member/../common/header.jsp", Long.valueOf(1636801378234L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.member");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("	.member {\r\n");
      out.write(" font-size: 50px;\r\n");
      out.write(" text-shadow: 0 0 10px #666;\r\n");
      out.write(" color: #fff;\r\n");
      out.write(" margin: 0 auto;\r\n");
      out.write(" text-align: center;\r\n");
      out.write(" text-transform: capitalize;\r\n");
      out.write(" font-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".form {\r\n");
      out.write(" width: 498px;\r\n");
      out.write(" height: 400px;\r\n");
      out.write(" border-radius: 10px;\r\n");
      out.write(" border: 2px solid #909090;\r\n");
      out.write(" margin: 0 auto;\r\n");
      out.write(" margin-top: 100px;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form2 {\r\n");
      out.write(" width: 450px;\r\n");
      out.write(" min-width: 320px;\r\n");
      out.write(" height: 200px;\r\n");
      out.write(" margin: 60px auto;\r\n");
      out.write(" margin-left:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form3 {\r\n");
      out.write(" float: left;\r\n");
      out.write(" /*   background:#f00;  */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form3 label {\r\n");
      out.write(" width: 100px;\r\n");
      out.write(" height: 20px;\r\n");
      out.write(" /*  display: block; */\r\n");
      out.write(" float: left;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#wrap {\r\n");
      out.write(" width: 600px;\r\n");
      out.write(" height: 500px;\r\n");
      out.write(" margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("	.weblogin{\r\n");
      out.write("	width: 450px;\r\n");
      out.write("	text-align : center;\r\n");
      out.write("	}\r\n");
      out.write("	.weblogin img{\r\n");
      out.write("	padding-bottom: 12px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write(".clear {\r\n");
      out.write(" clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginsub {\r\n");
      out.write(" \r\n");
      out.write(" height: 65px;\r\n");
      out.write(" background: #1d2327;\r\n");
      out.write(" color:white;\r\n");
      out.write(" border-radius: 5px;\r\n");
      out.write(" border: none;\r\n");
      out.write("  margin-left: 10px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginsub:hover{\r\n");
      out.write("\r\n");
      out.write("	 font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("input[type=\"button\"] {\r\n");
      out.write(" 	height: 30px;\r\n");
      out.write("	background : white;\r\n");
      out.write("	border : none;\r\n");
      out.write("	 margin-top:10px;\r\n");
      out.write("	margin-right:20px;\r\n");
      out.write("}\r\n");
      out.write("input[type=\"checkbox\"] {\r\n");
      out.write(" margin-top:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#userPwd{\r\n");
      out.write("	margin-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#member_join{\r\n");
      out.write("	\r\n");
      out.write("	margin-left : 60px;\r\n");
      out.write("	background: #1d2327;\r\n");
      out.write("	color:white;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("#member_join:hover{\r\n");
      out.write("\r\n");
      out.write("	 font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".join_login{\r\n");
      out.write("	border-top: 1px solid #909090;\r\n");
      out.write("}\r\n");
      out.write("#idSave{\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("	margin-left: 100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--  헤더 부분 -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("    ");

    member loginUser = (member)session.getAttribute("loginUser");
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\">\r\n");
      out.write("<style>\r\n");
      out.write("	\r\n");
      out.write("	*{\r\n");
      out.write("		box-sizing: border-box;\r\n");
      out.write("		margin: 0;\r\n");
      out.write("		padding: 0;\r\n");
      out.write("		font-family: 'poppins', snas-serif;\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	.links{\r\n");
      out.write("		max-width : 1000px;\r\n");
      out.write("		height: 100%;\r\n");
      out.write("		margin: 0 auto;\r\n");
      out.write("		display: flex;\r\n");
      out.write("		justify-content: space-between;\r\n");
      out.write("		margin-top: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	.leftlinks>a{\r\n");
      out.write("	margin-left: 20px;\r\n");
      out.write("	font-size: 12px;\r\n");
      out.write("	}\r\n");
      out.write("	header a{\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color:#606060;\r\n");
      out.write("	}\r\n");
      out.write("	header a:hover{\r\n");
      out.write("	color:yellowgreen;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	ul{\r\n");
      out.write("		list-style: none;\r\n");
      out.write("	}\r\n");
      out.write("	.logo{\r\n");
      out.write("	max-width: 1000px;\r\n");
      out.write("	height: 150px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.nav_items{\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	line-height: 40px;\r\n");
      out.write("	}\r\n");
      out.write("	.nav_items .categorymenu{\r\n");
      out.write("	width: 1024px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	justify-content: flex-start;\r\n");
      out.write("	}\r\n");
      out.write("	.nav_items .categorymenu .category{\r\n");
      out.write("	display: flex;\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	}\r\n");
      out.write("	.nav_items .categorymenu .category>li{\r\n");
      out.write("		position: relative;\r\n");
      out.write("		display: flex;\r\n");
      out.write("		align-content : center;\r\n");
      out.write("		padding: 0 15px;\r\n");
      out.write("		width: 150px;\r\n");
      out.write("		justify-content: center;\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.nav_items .categorymenu .category .sub-menu{\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	top : 40px;\r\n");
      out.write("	line-height: 40px;\r\n");
      out.write("	width : 150px;\r\n");
      out.write("	box-shadow: 0 1px 2px rgba(0,0,0,0.2);\r\n");
      out.write("	padding-left: 0;\r\n");
      out.write("	display: none;\r\n");
      out.write("	z-index: 10;\r\n");
      out.write("	background-color : rgba(255,255,255,0.5);\r\n");
      out.write("	padding-bottom: 30px;\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.sub-menu>li{\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	.sub-menu>li:hover{\r\n");
      out.write("	background-color: #ddd;\r\n");
      out.write("	}\r\n");
      out.write("	.sub-menu>li:hover a{\r\n");
      out.write("	color : black;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	font-size: 21px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.category>li>a::before {\r\n");
      out.write("  content: '';\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  bottom: 0%;\r\n");
      out.write("  left: 0px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 2px;\r\n");
      out.write("  background: yellowgreen;\r\n");
      out.write("  display: block;\r\n");
      out.write("  -webkit-transform-origin: right top;\r\n");
      out.write("  -ms-transform-origin: right top;\r\n");
      out.write("  transform-origin: right top;\r\n");
      out.write("  -webkit-transform: scale(0, 1);\r\n");
      out.write("  -ms-transform: scale(0, 1);\r\n");
      out.write("  transform: scale(0, 1);\r\n");
      out.write("  -webkit-transition: transform 0.4s cubic-bezier(1, 0, 0, 1);\r\n");
      out.write("  transition: transform 0.4s cubic-bezier(1, 0, 0, 1);\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".category>li>a:hover::before {\r\n");
      out.write("  -webkit-transform-origin: left top;\r\n");
      out.write("  -ms-transform-origin: left top;\r\n");
      out.write("  transform-origin: left top;\r\n");
      out.write("  -webkit-transform: scale(1, 1);\r\n");
      out.write("  -ms-transform: scale(1, 1);\r\n");
      out.write("  transform: scale(1, 1)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#adminPage:hover{\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("	\r\n");
      out.write("/* 헤더 부분 */\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"#headmain\">\r\n");
      out.write("	<header>\r\n");
      out.write("	<!-- 좌측 상단  -->\r\n");
      out.write("		<div class=\"links\">\r\n");
      out.write("		<div class=leftlinks>\r\n");
      out.write("		");
if(loginUser==null){ 
      out.write(" \r\n");
      out.write("				<a href=\"");
      out.print(request.getContextPath() );
      out.write("/loginForm.me\" class=\"link_text\">LOGIN</a>\r\n");
      out.write("				<a href=\"");
      out.print(request.getContextPath() );
      out.write("/joinForm.me\" class=\"link_text\">JOIN</a>\r\n");
      out.write("				");
}else{
      out.write("\r\n");
      out.write("				<label for=\"\">");
      out.print( loginUser.getUserName() );
      out.write("(님)</label>\r\n");
      out.write("				<a href=\"");
      out.print(request.getContextPath() );
      out.write("/loginOutFormServlet.me\" class=\"link_text\">LOGOUT</a>\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("				<a href=\"#\" class=\"link_text\">MYPAGE</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		<!-- 우측 상단 -->\r\n");
      out.write("		<div class=rightlinks>\r\n");
      out.write("				<input type=\"text\" maxlength=\"225\" tabindex=\"1\"/>\r\n");
      out.write("				<i class=\"bi bi-search\"></i>\r\n");
      out.write("				<a href=\"#\"><i class=\"bi bi-basket2-fill\"></i></a>\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- img -->\r\n");
      out.write("		<div class=\"logo\">\r\n");
      out.write("		<a href=\"");
      out.print( request.getContextPath() );
      out.write("\" ><img src=\"");
      out.print(request.getContextPath() );
      out.write("/img/logo.png\" /></a>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("	<!--  nav -->\r\n");
      out.write("		<nav>\r\n");
      out.write("			<div class=\"nav_items\">\r\n");
      out.write("					<div class=\"categorymenu\">\r\n");
      out.write("					<ul class=\"category\">\r\n");
      out.write("					<li class=\"fir\">\r\n");
      out.write("						<a href=\"#\" id=\"ca\"><i class=\"bi bi-list\"></i>카테고리</a>\r\n");
      out.write("						<ul class=\"sub-menu\">\r\n");
      out.write("							<li><a href=\"#\">비건</a></li>\r\n");
      out.write("							<li><a href=\"#\">락토</a></li>\r\n");
      out.write("							<li><a href=\"#\">오보</a></li>\r\n");
      out.write("							<li><a href=\"#\">락토오보</a></li>\r\n");
      out.write("							<li><a href=\"#\">폴로</a></li>\r\n");
      out.write("							<li><a href=\"#\">페스코</a></li>\r\n");
      out.write("							<li><a href=\"#\">플렉시테리안</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						\r\n");
      out.write("					</li>\r\n");
      out.write("					\r\n");
      out.write("						\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					<li><a href=\"#\" >신상품</a></li>\r\n");
      out.write("					<li><a href=\"#\" >베스트상품</a></li>\r\n");
      out.write("					<li><a href=\"#\" >커뮤니티</a></li>\r\n");
      out.write("					<li><form id=\"adminPage\" >상품관리</form></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		</header>\r\n");
      out.write("		</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("	$('.fir').mouseover(function(){\r\n");
      out.write("		$(this).find('.sub-menu').stop().slideDown(500);\r\n");
      out.write("	}).mouseout(function(){\r\n");
      out.write("		$(this).find('.sub-menu').stop().slideUp(500);\r\n");
      out.write("	});\r\n");
      out.write("	$('#adminPage').click(function(){\r\n");
      out.write("		$('#adminPage').attr('action', 'ManagerProductList.pr');\r\n");
      out.write("		$('#adminPage').submit();\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!--  메인 페이지  -->\r\n");
      out.write("		<form id=\"loginForm\" action=\"");
      out.print( request.getContextPath());
      out.write("/LoginMemberServlet.me\" method=\"post\">\r\n");
      out.write("		  <div id=\"wrap\">\r\n");
      out.write("		   <div class=\"form\">\r\n");
      out.write("		    <div class=\"form2\">\r\n");
      out.write("		     <div class=\"form3\">\r\n");
      out.write("		      <label for=\"user\">아이디</label><input type=\"text\" id=\"userId\" name=\"userId\">\r\n");
      out.write("		      <div class=\"clear\"></div>\r\n");
      out.write("		      <label for=\"user\">비밀번호</label><input type=\"password\" id=\"userPwd\"name=\"userPwd\">\r\n");
      out.write("		     </div>\r\n");
      out.write("		    \r\n");
      out.write("		     <button type=\"submit\" value=\"login\" class=\"loginsub\">로그인</button>\r\n");
      out.write("		     <div class=\"clear\"></div>\r\n");
      out.write("		     <div class=\"form4\">\r\n");
      out.write("		      <label id=\"idSave\"><input type=\"checkbox\">아이디저장</label>\r\n");
      out.write("		      <div class=\"weblogin\"><a href=\"javascript:kakaoLogout();\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/img/login/btnG_완성형.png\" alt=\"\" width=\"250px\" height=\"57px\"/></a></div>\r\n");
      out.write("		       <div class=\"weblogin\"><a href=\"javascript:kakaoLogin();\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/img/login/kakao_login_medium_wide.png\" alt=\"\" /></a></div>\r\n");
      out.write("		       \r\n");
      out.write("		      <div class=\"clear\" ></div>\r\n");
      out.write("		     \r\n");
      out.write("		      <div class=\"join_login\">\r\n");
      out.write("		      <label><a href=\"");
      out.print(request.getContextPath() );
      out.write("/joinForm.me\"><input type=\"button\" value=\"회원가입\" id=\"member_join\"></a></label> \r\n");
      out.write("		      <label><a href=\"idSearch.jsp\"><input type=\"button\" value=\"아이디 찾기\"></a></label>\r\n");
      out.write("		      <label><a href=\"pwdSearch.jsp\"><input type=\"button\" value=\"비밀번호찾기\"/></a></label>\r\n");
      out.write("		      \r\n");
      out.write("		      </div>\r\n");
      out.write("		     </div>\r\n");
      out.write("		    </div>\r\n");
      out.write("		   </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 카카오 스크립트 -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://developers.kakao.com/sdk/js/kakao.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("Kakao.init('ab925eb57ff8165bf0a37748b3215aeb'); //발급받은 키 중 javascript키를 사용해준다.\r\n");
      out.write("console.log(Kakao.isInitialized()); // sdk초기화여부판단\r\n");
      out.write("//카카오로그인\r\n");
      out.write("function kakaoLogin() {\r\n");
      out.write("    Kakao.Auth.login({\r\n");
      out.write("      success: function (response) {\r\n");
      out.write("        Kakao.API.request({\r\n");
      out.write("          url: '/v2/user/me',\r\n");
      out.write("          success: function (response) {\r\n");
      out.write("        	  console.log(response)\r\n");
      out.write("          },\r\n");
      out.write("          fail: function (error) {\r\n");
      out.write("            console.log(error)\r\n");
      out.write("          },\r\n");
      out.write("        })\r\n");
      out.write("      },\r\n");
      out.write("      fail: function (error) {\r\n");
      out.write("        console.log(error)\r\n");
      out.write("      },\r\n");
      out.write("    })\r\n");
      out.write("  }\r\n");
      out.write("//카카오로그아웃  \r\n");
      out.write("function kakaoLogout() {\r\n");
      out.write("    if (Kakao.Auth.getAccessToken()) {\r\n");
      out.write("      Kakao.API.request({\r\n");
      out.write("        url: '/v1/user/unlink',\r\n");
      out.write("        success: function (response) {\r\n");
      out.write("        	console.log(response)\r\n");
      out.write("        },\r\n");
      out.write("        fail: function (error) {\r\n");
      out.write("          console.log(error)\r\n");
      out.write("        },\r\n");
      out.write("      })\r\n");
      out.write("      Kakao.Auth.setAccessToken(undefined)\r\n");
      out.write("    }\r\n");
      out.write("  }  \r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
