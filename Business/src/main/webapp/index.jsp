
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ include file="/WEB-INF/include/taglib.jsp"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<%String path=request.getContextPath(); %>
<body>
<div>
<form action="user/login.shtml" method="post">
用户名：<input type="text" name="userCode"/>
密码：<input type="text" name="userPsw"/>
<input type="submit" value="提交"/>
</form>
<p align="center"> 请您选择需要上传的文件</p>
   <form id="importFileForm" action="<%=path %>/import/importImage.shtml"  method="post" enctype="multipart/form-data">
		  <input type="file"   id="importFile"  name="importFile"  >
		   <input type="submit" id="importExecl"  value="导入"/>
   </form>
</div>
</body>
  <script type="text/javascript">
  </script>
</html>
