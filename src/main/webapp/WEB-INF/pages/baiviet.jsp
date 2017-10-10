<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BaiViet List</title>
<link rel="stylesheet" href="<c:url value="/static/css/style.css" />" />
</head>
<body>
	<h1>BaiViet List</h1>
	<table border="1">
		<tr>
			<th>MaBV</th>
			<th>Tieu De</th>
			<th>Danh Muc</th>
			<th>Chi Tiet</th>
			<th>Lich Dang</th>
			<th>Trang Thai</th>
			<th>Nhan</th>
			<th>Thao Tac</th>
		</tr>
		<c:forEach items="${listBaiViet}" var="baiviet">
			<tr>
				<td><c:out value="${baiviet.maBV}" /></td>
				<td><c:out value="${baiviet.tieuDe}" /></td>
				<td><c:out value="${baiviet.danhMuc}" /></td>
				<td><c:out value="${baiviet.chiTiet}" /></td>
				<td><fmt:formatDate pattern="dd-MM-yyyy HH:mm:ss" value="${baiviet.lichDang}" /></td>
				<td><c:out value="${baiviet.trangThai}" /></td>
				<td><c:out value="${baiviet.nhan}" /></td>
				<td>
					<a href="<c:url value="/baiviet/update?maBV=${baiviet.maBV}" />">Edit</a>
					<a href="<c:url value="/baiviet/delete?maBV=${baiviet.maBV}" />">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<h4>
		New BaiViet Register <a href="<c:url value="/baiviet/create" />">here</a>
	</h4>
</body>
</html>