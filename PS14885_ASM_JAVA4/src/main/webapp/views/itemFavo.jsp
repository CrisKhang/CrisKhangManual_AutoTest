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
	<div class="container container-2">
		<h1 class="text-center">${path.toUpperCase()}</h1>
		<hr class="line">
		<div class="row">
			<c:forEach var="item" items="${listItem}">
				<div class="col-md-4 product-grid">
					<div class="image">
						<a href="/PS14885_ASM_JAVA4/page/detail/${item.getMaPhim()}"> <img src="/PS14885_ASM_JAVA4/fileImg1/${item.getPoster()}" class="w-100">
							<div class="overlay2">
								<div class="detail">Xem chi tiết</div>
							</div>
						</a>
					</div>
					<h5 class="text-center">
						<a href="/PS14885_ASM_JAVA4/page/detail/${item.getMaPhim()}" data-toggle="tooltip" data-placement="top"
							title="${item.getTitle()}">${item.getTitle()}</a>
					</h5>
					<h5 class="text-center">Thời lượng: ${item.getThoiLuong()} phút</h5>
					<button formaction="/PS14885_ASM_JAVA4/page/favorite/dislike/${item.getMaPhim()}" class="btn btn-primary btn-block btn-flat">Bỏ thích</button>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>