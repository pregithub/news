<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	$(function() {
		var remembered = $("#user_login_loginDialog .rememberMe")
				.is(":checked");

		$('#user_login_loginForm').form({
			url : '${pageContext.request.contextPath}/userAction!login.action',
			success : function(data) {
				var obj = jQuery.parseJSON(data);
				if (obj.success) {
					if (remembered) {
						setCookie("name", obj.name, 30);
					}else{
						setCookie("name", "", 0);
					}
					$('#user_login_loginDialog').dialog('close');

				}
				$.messager.show({
					title : '提示',
					msg : obj.msg,
				});
			}
		});

		$("#user_login_loginForm input").bind('keyup', function(event) {
			if (event.keyCode == '13') {
				$('#user_login_loginForm').submit();
			}
		});
		window.setTimeout(function() {
			$('#user_login_loginForm input[name=name]').focus();
		}, 0);

	});
</script>

<div id="user_login_loginDialog" class="easyui-dialog"
	data-options="title:'登录',modal:true,closable:false,buttons:[{
				text:'注册',
				iconCls:'icon-edit',
				handler:function(){
					$('#user_reg_regForm input').val('');
					$('#user_reg_regDialog').dialog('open');
				}
			},{
				text:'登录',
				iconCls:'icon-help',
				handler:function(){
					$('#user_login_loginForm').submit();
				}
			}]">
	<form id="user_login_loginForm" method="post">
		<table>
			<tr>
				<th>账户</th>
				<td><input value="admin" name="name" class="easyui-validatebox"
					data-options="required:true,missingMessage:'账户名称必填'" /></td>
			</tr>
			<tr>
				<th>密码</th>
				<td><input value="admin" name="pwd" type="password"
					class="easyui-validatebox"
					data-options="required:true,missingMessage:'密码为必填项	'" /></td>
			</tr>
			<tr>
				<th><input class="rememberMe" name="rememberMe" type="checkbox" /></th>
				<td>在一个月内记住我的登录信息</td>
			</tr>
		</table>
	</form>
</div>
