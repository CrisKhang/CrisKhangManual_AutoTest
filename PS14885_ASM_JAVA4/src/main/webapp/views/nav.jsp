<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
	<c:url var="url" value="/logout"></c:url>
	<!-- Tag nav -->
	<nav class="navbar navbar-expand-sm navbar-light sticky-top">
		<a class="navbar-brand" href="#"> <img src="/PS14885_ASM_JAVA4/fileImg1/Diamond.png"
			height="55">
		</a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/PS14885_ASM_JAVA4/index">Trang
						chủ</a></li>
				<li class="navbar-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> Thể loại </a>
					<div class="dropdown-menu">
						
						<c:forEach var="item" items="${nav}">
							<a class="dropdown-item" href="/PS14885_ASM_JAVA4/page/item/${item.getMaTheLoai()}">${item.getTenTheLoai()}</a>
						</c:forEach>

					</div></li>
				<li class="navbar-item"><a class="nav-link" href="/PS14885_ASM_JAVA4/page/item/1">Phim
						chiếu rạp</a></li>
				<li class="navbar-item"><a class="nav-link" href="/PS14885_ASM_JAVA4/page/item/0">Phim
						hoạt hình</a></li>

				<li class="navbar-item"><a class="nav-link" onclick="find()">Tìm
						kiếm</a> <!-- <a class="nav-link" href="#">Tìm kiếm</a> --></li>
			</ul>

			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link" href="#"><i
						class="fas fa-globe-asia"></i> VietNam</a></li>

				<c:if test="${empty sessionScope.taiKhoan}">

					<li class="nav-item dropdown" id="NotLogin"><a
						class="nav-link dropdown-toggle" href="#" id="navdrop"
						data-toggle="dropdown"> <i class="fas fa-sign-in-alt"></i>
							Đăng nhập / Đăng ký
					</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="/PS14885_ASM_JAVA4/login">Đăng nhập</a>
							<hr>
							<a class="dropdown-item" href="/PS14885_ASM_JAVA4/register">Đăng ký</a>
						</div></li>
				</c:if>

				<c:if test="${!empty sessionScope.taiKhoan}">
					<li class="nav-item dropdown" id="Login"><a style="width: 180px;"
						class="nav-link dropdown-toggle" href="#" id="navdrop"
						data-toggle="dropdown"> <i class="fas fa-user-circle"></i>
							${sessionScope.taiKhoan}
					</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="/PS14885_ASM_JAVA4/page/profile/index">Thông tin</a> <a
								class="dropdown-item" href="/PS14885_ASM_JAVA4/page/favorite/index">Yêu thích</a>
							<hr>
							<a class="dropdown-item" href="${url}">Đăng xuất</a>
						</div></li>
				</c:if>

			</ul>
		</div>
	</nav>
	<!-- Thẻ Nav -->
</body>
</html>