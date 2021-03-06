<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml";>
<head>
<title>OA管理系统</title>

<style type="text/css">
html {
	height: 100%;
	max-height: 100%;
	padding: 0;
	margin: 0;
	border: 0;
	background: #eef0ef;
	font-size: 76%;
	overflow: hidden;
}

body {
	height: 100%;
	max-height: 100%;
	border: 0;
	overflow: hidden;
	background: #fff;
	padding: 0;
}
/*lay
--------------*/
#content {
	position: absolute;
	overflow: hidden;
	z-index: 3;
	top: 106px;
	left: 0;
	width: 100%;
	bottom: 28px;
	bottom: 28px\9;
	background: #FFF;
}

* html #content {
	top: 0;
	height: 100%;
	max-height: 100%;
	width: 100%;
	overflow: hidden;
	position: absolute;
	z-index: 3;
	border-top: 106px solid #fff;
	border-bottom: 28px solid #fff;
}

#header {
	position: absolute;
	margin: 0;
	top: 0;
	left: 0;
	display: block;
	width: 100%;
	height: 106px;
	line-height: 106px;
	background: #333;
	z-index: 5;
	overflow: hidden;
	color: #fff;
	text-align: center;
}

#footer {
	position: absolute;
	margin: 0;
	bottom: 0;
	left: 0;
	display: block;
	width: 100%;
	height: 28px;
	line-height: 28px;
	text-align: center;
	z-index: 5;
	overflow: hidden;
	color: #fff;
	background: #333;
}

/*中间表格*/
.main_tab {
	width: 100%;
	height: 100%;
}

.main_tab td {
	padding: 0px;
	margin: 0px;
	vertical-align: top;
	height: 100%;
	max-height: 100%;
}

.main_tab td.td_left {
	width: 181px;
	background: #00CCFF;
}

.main_tab td.td_close {
	padding: 0px;
	width: 8px;
	vertical-align: middle;
	background: #ff0000;
	font-size: 12px;
	overflow: hidden;
}
</style>
<style>
*,body,ul,li,h1,h2 {
	margin: 0;
	padding: 0;
	list-style: none;
}

body {
	font: 12px "宋体";
	padding-top: 20px;
}

#menu {
	width: 200px;
	margin: auto;
}

#menu h1 {
	cursor: pointer;
	color: #FFF;
	font-size: 12px;
	padding: 5px 0 3px 10px;
	border: #C60 1px solid;
	margin-top: 1px;
	background-color: #F93;
}

#menu h2 {
	cursor: pointer;
	color: #777;
	font-size: 12px;
	padding: 5px 0 3px 10px;
	border: #E7E7E7 1px solid;
	border-top-color: #FFF;
	background-color: #F4F4F4;
}

#menu ul {
	padding-left: 15px;
	height: 100px;
	border: #E7E7E7 1px solid;
	border-top: none;
	overflow: auto;
}

#menu ul li {
	padding: 5px 0 3px 10px;
	color: #777;
	font-size: 12px;
}

.no {
	display: none;
}
</style>
<script language="JavaScript">
	function ShowMenu(obj, noid) {
		var block = document.getElementById(noid);
		var n = noid.substr(noid.length - 1);
		if (noid.length == 4) {
			var ul = document.getElementById(noid.substring(0, 3))
					.getElementsByTagName("ul");
			var h2 = document.getElementById(noid.substring(0, 3))
					.getElementsByTagName("h2");
			for (var i = 0; i < h2.length; i++) {
				h2[i].innerHTML = h2[i].innerHTML.replace("+", "-");
				h2[i].style.color = "";
			}
			obj.style.color = "#FF0000";
			for (var i = 0; i < ul.length; i++) {
				if (i != n) {
					ul[i].className = "no";
				}
			}
		} else {
			var span = document.getElementById("menu").getElementsByTagName(
					"span");
			var h1 = document.getElementById("menu").getElementsByTagName("h1");
			for (var i = 0; i < h1.length; i++) {
				h1[i].innerHTML = h1[i].innerHTML.replace("+", "-");
				h1[i].style.color = "";
			}
			obj.style.color = "#0000FF";
			for (var i = 0; i < span.length; i++) {
				if (i != n) {
					span[i].className = "no";
				}
			}
		}
		if (block.className == "no") {
			block.className = "";
			obj.innerHTML = obj.innerHTML.replace("-", "+");
		} else {
			block.className = "no";
			obj.style.color = "";
		}
	}
</script>

<script type="text/javascript">
	function show() {
		if (document.getElementById("left").style.display == 'none') { //判断目前左边栏的状态（显示、隐藏）
			document.getElementById("left").style.display = 'block'; //显示左边栏
		} else {
			document.getElementById("left").style.display = 'none'; //隐藏左边栏
		}
	}
</script>
</head>
<body>
	<div id="header">
		<h1>OA管理系统</h1>
	</div>
	<div id="content">
		<table cellpadding="0" cellpadding="0" border="0" class="main_tab">
			<tr>
				<td class="td_left" id="left">
					<div class="menu_column">
						<div class="title"></div>
						<div class="menu_con">
							<div class="lef_nav">


								<div id="menu">
									<h1 onClick="javascript:ShowMenu(this,'NO0')">- 用户管理</h1>
									<span id="NO0" class="no">
										<h2 onClick="javascript:ShowMenu(this,'NO00')">- 基本信息管理</h2>
										<ul id="NO00" class="no">
											<li>用户信息修改</li>
											<li>密码修改</li>
											<li>离职申请</li>
										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO01')">- 通讯录</h2>
										<ul id="NO01" class="no">
											<li><a href="<%=request.getContextPath()%>/users/register.jsp" target="contentframe">添加用户</a></li>
											<li><a href="<%=request.getContextPath()%>/users/search.jsp" target="contentframe">查询用户</a></li>
											<li><a href="<%=request.getContextPath()%>/users/search.jsp" target="contentframe">修改用户</a></li>
											<li><a href="<%=request.getContextPath()%>/users/search.jsp" target="contentframe">删除用户</a></li>

										</ul>
									</span>

									<h1 onClick="javascript:ShowMenu(this,'NO1')">- 文档管理</h1>
									<span id="NO1" class="no">
										<h2 onClick="javascript:ShowMenu(this,'NO10')">- 上传文档</h2>
										<h2 onClick="javascript:ShowMenu(this,'NO11')">- 查询文档</h2>
										<h2 onClick="javascript:ShowMenu(this,'NO11')">- 文档批处理</h2>
										<ul id="NO11" class="no">
											<li>文档导入</li>
											<li>文档导出</li>
										</ul>
									</span>

									<h1 onClick="javascript:ShowMenu(this,'NO2')">- 系统管理</h1>
									<span id="NO2" class="no">
										<h2 onClick="javascript:ShowMenu(this,'NO20')">- 类别管理</h2>
										<ul id="NO20" class="no">
											<li>用户类别</li>
											<li>部门类别关系管理</li>
											<li>文档类别</li>
											<li>活动类别</li>
											<li>笔记类别</li>
											<li>会议类别</li>
										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO21')">- 菜单管理</h2>
										<ul id="NO21" class="no">
											<li>主菜单大类管理</li>
											<li>一级菜单管理</li>
											<li>二级菜单管理</li>
											<li>三级菜单管理</li>

										</ul>
									</span>

									<h1 onClick="javascript:ShowMenu(this,'NO3')">- 工作任务</h1>
									<span id="NO3" class="no">
										<h2 onClick="javascript:ShowMenu(this,'NO30')">- 任务管理</h2>
										<ul id="NO30" class="no">
											<li>添加任务</li>
											<li>查询任务</li>
											<li>修改任务</li>
											<li>删除任务</li>
										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO31')">- 工作日志管理</h2>
										<ul id="NO31" class="no">
											<li>添加日志</li>
											<li>查询日志</li>
											<li>修改日志</li>
											<li>删除日志</li>
										</ul>
									</span>
								</div>



							</div>
						</div>
					</div> <!--左边菜单 end-->
				</td>
				<!-- 点击缩进 -->
				<td class="td_close" onclick="show();">▶</td>
				<td>
					<div id="contenct">
						<iframe src="content.jsp" frameborder=0 width="100%" height="1000" name="contentframe"></iframe>

					</div>
				</td>
			</tr>
		</table>
	</div>
	<div id="footer">底部</div>
</body>
</html>