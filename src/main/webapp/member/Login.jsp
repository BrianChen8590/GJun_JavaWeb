<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/st1.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="header"><jsp:include page="../title.jsp" /></div>
	<div class="navigater"><jsp:include page="../navigater.jsp" /></div>
	<div class="content">
		<form action="../LoginController" method="post">
			<table width=300 align=center border=1>
				<tr>
					<td colspan=2 align=center>會員登入
				<tr>
					<td width=100>帳號
					<td><input type="text" name="username">
				<tr>
					<td width=100>密碼
					<td><input type="password" name="password">
				<tr>
					<td colspan=2 align=center><input type="submit" value="ok">
			</table>

		</form>

	</div>
	<div class="footer"><jsp:include page="../end.jsp" /></div>
</body>
</html>