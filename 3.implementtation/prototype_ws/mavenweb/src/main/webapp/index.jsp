<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml";>
<head>
<title>自适应</title>

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
}

.no {
	display: none;
}
</style>
<script language="JavaScript">
<!--//
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
//-->
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
		<h1>顶部</h1>
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
									<h1 onClick="javascript:ShowMenu(this,'NO0')">- 一级菜单A</h1>
									<span id="NO0" class="no">
										<h2 onClick="javascript:ShowMenu(this,'NO00')">- 一级菜单A_1</h2>
										<ul id="NO00" class="no">
											<li>一级菜单A_0</li>
											<li>一级菜单A_1</li>
											<li>一级菜单A_2</li>
											<li>一级菜单A_3</li>
											<li>一级菜单A_4</li>
											<li>一级菜单A_5</li>

										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO01')">- 一级菜单A_2</h2>
										<ul id="NO01" class="no">
											<li>一级菜单A_0</li>
											<li>一级菜单A_1</li>
											<li>一级菜单A_2</li>
											<li>一级菜单A_3</li>
											<li>一级菜单A_4</li>

										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO02')">- 一级菜单A_3</h2>
										<ul id="NO02" class="no">
											<li>一级菜单A_0</li>
											<li>一级菜单A_1</li>
											<li>一级菜单A_2</li>
											<li>一级菜单A_3</li>
											<li>一级菜单A_4</li>
											<li>一级菜单A_5</li>
											<li>一级菜单A_6</li>
										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO03')">- 一级菜单A_4</h2>
										<ul id="NO03" class="no">
											<li>一级菜单A_0</li>
											<li>一级菜单A_1</li>
											<li>一级菜单A_2</li>
											<li>一级菜单A_3</li>
											<li>一级菜单A_4</li>
											<li>一级菜单A_5</li>
											<li>一级菜单A_6</li>
											<li>一级菜单A_7</li>

										</ul>
									</span>

									<h1 onClick="javascript:ShowMenu(this,'NO1')">- 二级菜单B</h1>
									<span id="NO1" class="no">
										<h2 onClick="javascript:ShowMenu(this,'NO10')">- 二级菜单B_1</h2>
										<ul id="NO10" class="no">
											<li>二级菜单B_0</li>
											<li>二级菜单B_1</li>
											<li>二级菜单B_2</li>
											<li>二级菜单B_3</li>
											<li>二级菜单B_4</li>
											<li>二级菜单B_5</li>
											<li>二级菜单B_6</li>
											<li>二级菜单B_7</li>
										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO11')">- 二级菜单B_2</h2>
										<ul id="NO11" class="no">
											<li>二级菜单B_0</li>
											<li>二级菜单B_1</li>
											<li>二级菜单B_2</li>
											<li>二级菜单B_3</li>
											<li>二级菜单B_4</li>
											<li>二级菜单B_5</li>
											<li>二级菜单B_6</li>
											<li>二级菜单B_7</li>
										</ul>
									</span>

									<h1 onClick="javascript:ShowMenu(this,'NO2')">- 三级菜单C</h1>
									<span id="NO2" class="no">
										<h2 onClick="javascript:ShowMenu(this,'NO20')">- 三级菜单C_1</h2>
										<ul id="NO20" class="no">
											<li>三级菜单C_0</li>
											<li>三级菜单C_1</li>
											<li>三级菜单C_2</li>
											<li>三级菜单C_3</li>
											<li>三级菜单C_4</li>
											<li>三级菜单C_5</li>
											<li>三级菜单C_6</li>
											<li>三级菜单C_7</li>
											<li>三级菜单C_8</li>
											<li>三级菜单C_9</li>
										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO21')">- 三级菜单C_2</h2>
										<ul id="NO21" class="no">
											<li>三级菜单C_0</li>
											<li>三级菜单C_1</li>
											<li>三级菜单C_2</li>
											<li>三级菜单C_3</li>
											<li>三级菜单C_4</li>

										</ul>
									</span>

									<h1 onClick="javascript:ShowMenu(this,'NO3')">- 四级菜单D</h1>
									<span id="NO3" class="no">
										<h2 onClick="javascript:ShowMenu(this,'NO30')">- 四级菜单D_1</h2>
										<ul id="NO30" class="no">
											<li>四级菜单D_0</li>
											<li>四级菜单D_1</li>
											<li>四级菜单D_2</li>
											<li>四级菜单D_3</li>
										</ul>
										<h2 onClick="javascript:ShowMenu(this,'NO31')">- 四级菜单D_2</h2>
										<ul id="NO31" class="no">
											<li>四级菜单D_0</li>
											<li>四级菜单D_1</li>
											<li>四级菜单D_2</li>
											<li>四级菜单D_3</li>
											<li>四级菜单D_4</li>
											<li>四级菜单D_5</li>
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
						<iframe src="content.jsp" frameborder=0 width="100%" height="1000"></iframe>

					</div>
				</td>
			</tr>
		</table>
	</div>
	<div id="footer">底部</div>
</body>
</html>