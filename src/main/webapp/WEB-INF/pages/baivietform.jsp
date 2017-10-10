<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BaiViet Form</title>
<link rel="stylesheet" href="<c:url value="/static/css/style.css" />" />
</head>
<body>
	<h1>BaiViet Form</h1>
	<c:url var="action" value="/baiviet/save" />
	<form:form action="${action}" method="POST" modelAttribute="baiviet">
		MaBV : <form:input path="maBV" /><br />
		Tieu De : <form:input path="tieuDe" /><br />
		Danh Muc : <form:input path="danhMuc" /><br />
		Chi Tiet : <form:input path="chiTiet" /><br />
		Lich Dang : <form:input path="lichDang" /> <br />
		Trang Thai : <form:input path="trangThai" /><br />
		Nhan : <form:input path="nhan" /><br />
		<button type="submit" >Save</button>
	</form:form>
</body>
</html>