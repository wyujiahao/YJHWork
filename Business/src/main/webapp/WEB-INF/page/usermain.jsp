
<%@page import="com.neusoft.domain.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/include/taglib.jsp"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>  
</head> 
<body>
<input type="text" name="userCode" value="${userAAA.userCode}"/>
<%=((User)request.getAttribute("userAAA")).getUserCode() %>
${userAAA.userCode}
${pageContext.request.contextPath}

</body>
</html>
