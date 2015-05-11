<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML >
<html>
<head>
<title>sshe demo</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript"
	src="jslib/jquery-easyui-1.4.2/jquery.min.js"></script>
<script type="text/javascript"
	src="jslib/jquery-easyui-1.4.2/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jslib/jquery-easyui-1.4.2/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css"
	href="jslib/jquery-easyui-1.4.2/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="jslib/jquery-easyui-1.4.2/themes/icon.css" />
<script type="text/javascript" src="jslib/util/util.js"></script>
</head>
<body class="easyui-layout">

	<div data-options="region:'north',title:'',split:true,collapsible:true"
		style="height:50px;background-color:#cdf;padding:10px;">
		<span class="systemtitle" style="font-size:16px;">手机新闻管理系统</span>
		<span class="copyright" style="float:right;">by me.jason</span>
	</div>

	<div data-options="region:'south',title:'',split:true"
		style="height:50px;"></div>

	<div data-options="region:'west',title:'',split:true"
		style="width:200px;">
		<jsp:include page="layout/west.jsp"></jsp:include>
	</div>

	<div
		data-options="region:'east',iconCls:'icon-reload',title:'East',split:true"
		style="width:200px;"></div>

	<div data-options="region:'center',title:'欢迎使用手机新闻管理系统'"
		style="overflow:hidden;">
		<jsp:include page="layout/center.jsp"></jsp:include>
	</div>

	<jsp:include page="user/login.jsp"></jsp:include>
	<jsp:include page="user/reg.jsp"></jsp:include>
</body>
</html>
