<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="/PS14885_ASM_JAVA4/js/Jquery.js"></script>
<script type="text/javascript" src="/PS14885_ASM_JAVA4/js/lightslider.js"></script> -->
</head>
<body>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
	
	<!-- Tag Phim đề cử -->
	<div class="container-fluid pt-3">
		<div class="row welcome text-center">
			<div class="col-12">
				<h1>PHIM ĐỀ CỬ</h1>
			</div>
			<hr class="line">
		</div>
	</div>
	<ul id="autoWidth" class="cs-hidden">
	<c:forEach var="item" items="${list}">
		
			<li class="item-a">
				<!-- box-slider -->
				<div class="box">
					<!-- img-box -->
					<div class="slide-img">
						<img src="/PS14885_ASM_JAVA4/fileImg1/${item.getPoster()}" alt="1">
						<!-- overlayer -->
						<div class="overlay">
							<!-- buy-btn -->
							<a href="/PS14885_ASM_JAVA4/page/detail/${item.getMaPhim()}" class="buy-btn">▶</a>
						</div>
					</div>
					<!-- detail-box -->
					<div class="detail-box">
						<div class="type">
							<a href="/PS14885_ASM_JAVA4/page/detail/${item.getMaPhim()}">${item.getTitle()}</a> <span>${item.getThoiLuong()}
								phút</span>
						</div>

						<a href="#" class="price">${item.getDoPhanGiai().equals('Full HD')?'FHD':item.getDoPhanGiai()}</a>
					</div>
					<!-- type -->

				</div>
			</li>
		
	</c:forEach>
	</ul>
</body>
</html>