<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
	.navbar {
	background-image: linear-gradient(-90deg, #d38312, #a83279);

}

.nav-link {
  font-size: 16px;
  margin: 3px;
  color: #fff!important;
  font-weight: 500;
}
</style>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
	<c:url var="urlLO" value="/logout" />
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
				<li class="nav-item"><a class="nav-link" href="/PS14885_ASM_JAVA4/manager/editUser/index">Người
						dùng</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> Phim </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="/PS14885_ASM_JAVA4/manager/editPage/index">Tạo phim</a> 
						<a class="dropdown-item" href="/PS14885_ASM_JAVA4/manager/editTL/index">Thể loại</a>
						<a class="dropdown-item" href="/PS14885_ASM_JAVA4/manager/editPTH/index">Tổng hợp phim</a>
					</div></li>
				<li class="navbar-item"><a class="nav-link" href="#">Bình
						luận</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> Thống kê </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="#">Yêu thích</a> <a
							class="dropdown-item" href="#">Người dùng yêu thích</a> <a
							class="dropdown-item" href="#">Chia sẻ</a>
					</div></li>


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
					<li class="nav-item dropdown" id="Login"><a
						style="width: 180px;" class="nav-link dropdown-toggle" href="#"
						id="navdrop" data-toggle="dropdown"> <i
							class="fas fa-user-circle"></i> ${sessionScope.taiKhoan}
					</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#">Thông tin</a>
							<hr>
							<a class="dropdown-item" href="${urlLO}">Đăng xuất</a>
						</div></li>
				</c:if>

			</ul>
		</div>
	</nav>
	<!-- Thẻ Nav -->
</body>
</html>