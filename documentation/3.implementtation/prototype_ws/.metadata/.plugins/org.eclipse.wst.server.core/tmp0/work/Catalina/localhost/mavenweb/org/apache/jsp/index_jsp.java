/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-09-27 14:13:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\";>\n");
      out.write("<head>\n");
      out.write("<title>OA管理系统</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("html {\n");
      out.write("\theight: 100%;\n");
      out.write("\tmax-height: 100%;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tborder: 0;\n");
      out.write("\tbackground: #eef0ef;\n");
      out.write("\tfont-size: 76%;\n");
      out.write("\toverflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\theight: 100%;\n");
      out.write("\tmax-height: 100%;\n");
      out.write("\tborder: 0;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("/*lay\n");
      out.write("--------------*/\n");
      out.write("#content {\n");
      out.write("\tposition: absolute;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tz-index: 3;\n");
      out.write("\ttop: 106px;\n");
      out.write("\tleft: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tbottom: 28px;\n");
      out.write("\tbottom: 28px\\9;\n");
      out.write("\tbackground: #FFF;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* html #content {\n");
      out.write("\ttop: 0;\n");
      out.write("\theight: 100%;\n");
      out.write("\tmax-height: 100%;\n");
      out.write("\twidth: 100%;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tz-index: 3;\n");
      out.write("\tborder-top: 106px solid #fff;\n");
      out.write("\tborder-bottom: 28px solid #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#header {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tmargin: 0;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 106px;\n");
      out.write("\tline-height: 106px;\n");
      out.write("\tbackground: #333;\n");
      out.write("\tz-index: 5;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tbottom: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 28px;\n");
      out.write("\tline-height: 28px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tz-index: 5;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*中间表格*/\n");
      out.write(".main_tab {\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main_tab td {\n");
      out.write("\tpadding: 0px;\n");
      out.write("\tmargin: 0px;\n");
      out.write("\tvertical-align: top;\n");
      out.write("\theight: 100%;\n");
      out.write("\tmax-height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main_tab td.td_left {\n");
      out.write("\twidth: 181px;\n");
      out.write("\tbackground: #00CCFF;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main_tab td.td_close {\n");
      out.write("\tpadding: 0px;\n");
      out.write("\twidth: 8px;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("\tbackground: #ff0000;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\toverflow: hidden;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<style>\n");
      out.write("*,body,ul,li,h1,h2 {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tfont: 12px \"宋体\";\n");
      out.write("\tpadding-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu {\n");
      out.write("\twidth: 200px;\n");
      out.write("\tmargin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu h1 {\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tcolor: #FFF;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tpadding: 5px 0 3px 10px;\n");
      out.write("\tborder: #C60 1px solid;\n");
      out.write("\tmargin-top: 1px;\n");
      out.write("\tbackground-color: #F93;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu h2 {\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tcolor: #777;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tpadding: 5px 0 3px 10px;\n");
      out.write("\tborder: #E7E7E7 1px solid;\n");
      out.write("\tborder-top-color: #FFF;\n");
      out.write("\tbackground-color: #F4F4F4;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu ul {\n");
      out.write("\tpadding-left: 15px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tborder: #E7E7E7 1px solid;\n");
      out.write("\tborder-top: none;\n");
      out.write("\toverflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu ul li {\n");
      out.write("\tpadding: 5px 0 3px 10px;\n");
      out.write("\tcolor: #777;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".no {\n");
      out.write("\tdisplay: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("\tfunction ShowMenu(obj, noid) {\n");
      out.write("\t\tvar block = document.getElementById(noid);\n");
      out.write("\t\tvar n = noid.substr(noid.length - 1);\n");
      out.write("\t\tif (noid.length == 4) {\n");
      out.write("\t\t\tvar ul = document.getElementById(noid.substring(0, 3))\n");
      out.write("\t\t\t\t\t.getElementsByTagName(\"ul\");\n");
      out.write("\t\t\tvar h2 = document.getElementById(noid.substring(0, 3))\n");
      out.write("\t\t\t\t\t.getElementsByTagName(\"h2\");\n");
      out.write("\t\t\tfor (var i = 0; i < h2.length; i++) {\n");
      out.write("\t\t\t\th2[i].innerHTML = h2[i].innerHTML.replace(\"+\", \"-\");\n");
      out.write("\t\t\t\th2[i].style.color = \"\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tobj.style.color = \"#FF0000\";\n");
      out.write("\t\t\tfor (var i = 0; i < ul.length; i++) {\n");
      out.write("\t\t\t\tif (i != n) {\n");
      out.write("\t\t\t\t\tul[i].className = \"no\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tvar span = document.getElementById(\"menu\").getElementsByTagName(\n");
      out.write("\t\t\t\t\t\"span\");\n");
      out.write("\t\t\tvar h1 = document.getElementById(\"menu\").getElementsByTagName(\"h1\");\n");
      out.write("\t\t\tfor (var i = 0; i < h1.length; i++) {\n");
      out.write("\t\t\t\th1[i].innerHTML = h1[i].innerHTML.replace(\"+\", \"-\");\n");
      out.write("\t\t\t\th1[i].style.color = \"\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tobj.style.color = \"#0000FF\";\n");
      out.write("\t\t\tfor (var i = 0; i < span.length; i++) {\n");
      out.write("\t\t\t\tif (i != n) {\n");
      out.write("\t\t\t\t\tspan[i].className = \"no\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tif (block.className == \"no\") {\n");
      out.write("\t\t\tblock.className = \"\";\n");
      out.write("\t\t\tobj.innerHTML = obj.innerHTML.replace(\"-\", \"+\");\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tblock.className = \"no\";\n");
      out.write("\t\t\tobj.style.color = \"\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction show() {\n");
      out.write("\t\tif (document.getElementById(\"left\").style.display == 'none') { //判断目前左边栏的状态（显示、隐藏）\n");
      out.write("\t\t\tdocument.getElementById(\"left\").style.display = 'block'; //显示左边栏\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tdocument.getElementById(\"left\").style.display = 'none'; //隐藏左边栏\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<h1>OA管理系统</h1>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t<table cellpadding=\"0\" cellpadding=\"0\" border=\"0\" class=\"main_tab\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"td_left\" id=\"left\">\n");
      out.write("\t\t\t\t\t<div class=\"menu_column\">\n");
      out.write("\t\t\t\t\t\t<div class=\"title\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"menu_con\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"lef_nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 onClick=\"javascript:ShowMenu(this,'NO0')\">- 用户管理</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"NO0\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO00')\">- 基本信息管理</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul id=\"NO00\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>用户信息修改</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>密码修改</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>离职申请</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO01')\">- 通讯录</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul id=\"NO01\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/users/register.jsp\" target=\"contentframe\">添加用户</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/users/search.jsp\" target=\"contentframe\">查询用户</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/users/search.jsp\" target=\"contentframe\">修改用户</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/users/search.jsp\" target=\"contentframe\">删除用户</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 onClick=\"javascript:ShowMenu(this,'NO1')\">- 文档管理</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"NO1\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO10')\">- 上传文档</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO11')\">- 查询文档</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO11')\">- 文档批处理</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul id=\"NO11\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>文档导入</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>文档导出</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 onClick=\"javascript:ShowMenu(this,'NO2')\">- 系统管理</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"NO2\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO20')\">- 类别管理</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul id=\"NO20\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>用户类别</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>部门类别关系管理</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>文档类别</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>活动类别</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>笔记类别</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>会议类别</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO21')\">- 菜单管理</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul id=\"NO21\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>主菜单大类管理</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>一级菜单管理</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>二级菜单管理</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>三级菜单管理</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 onClick=\"javascript:ShowMenu(this,'NO3')\">- 工作任务</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"NO3\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO30')\">- 任务管理</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul id=\"NO30\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>添加任务</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>查询任务</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>修改任务</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>删除任务</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 onClick=\"javascript:ShowMenu(this,'NO31')\">- 工作日志管理</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul id=\"NO31\" class=\"no\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>添加日志</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>查询日志</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>修改日志</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>删除日志</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> <!--左边菜单 end-->\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<!-- 点击缩进 -->\n");
      out.write("\t\t\t\t<td class=\"td_close\" onclick=\"show();\">▶</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<div id=\"contenct\">\n");
      out.write("\t\t\t\t\t\t<iframe src=\"content.jsp\" frameborder=0 width=\"100%\" height=\"1000\" name=\"contentframe\"></iframe>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"footer\">底部</div>\n");
      out.write("</body>\n");
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