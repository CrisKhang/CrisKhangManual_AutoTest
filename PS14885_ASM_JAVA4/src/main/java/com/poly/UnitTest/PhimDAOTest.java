package com.poly.UnitTest;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.poly.DAO.PhimDAO;

import com.poly.Entity.Phims;


public class PhimDAOTest {
	private EntityManagerFactory emf;
	private EntityManager em;
	@Before
	public void initTest( ) {
		emf = Persistence.createEntityManagerFactory("ASM_JAVA4_PS14885");
		em = emf.createEntityManager();
	}
	
	
	@Test(expected = Exception.class)
	public void createTest2() {
		String maPhim = "ALC2017";
	    String Title = "Alien: Covenant";
	    String noiDung = "<b>Alien: Covenant</b> lấy bối cảnh hơn 10 năm sau các sự kiện xảy ra trong Prometheus, tập trung khám phá số phận của những thành viên tàu Prometheus còn sống sót, đồng th�?i lý giải cho câu h�?i muôn thuở chưa có l�?i đáp: quái vật ngoài hành tinh được tạo ra khi nào, như thế nào và bởi ai?\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Quái vật không gian bị... đẩy xuống vai phụ</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Ridley Scott là “cha đẻ�? của series Alien, là ngư�?i thực hiện phần phim đầu tiên ra mắt vào năm 1979. Ông cũng chính là đạo diễn của phần mới nhất này. Ở đoạn đầu tác phẩm, ông khiến khán giả sống dậy cảm giác khi xem Alien vào 38 năm v�? trước. Công cuộc khám phá hành tinh bí ẩn cùng sự trỗi dậy của loài sinh vật khủng khiếp luôn hấp dẫn, kịch tính và rùng rợn.\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Nhưng mạch phim sau đó bị kèo chùng xuống hoàn toàn, đồng th�?i từ một phim đấu tranh sinh tồn gay cấn, phim rẽ hướng sang một tác phẩm như-nghệ-thuật với những câu thoại khó hiểu, những diễn biến tâm lý có phần phức tạp, điên rồ và những cảnh phim gây sốc. Vai trò của các quái vật không gian bị giảm bớt bởi kẻ đã tạo ra/ cải tiến nó. \r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Kinh tởm hơn là kinh dị</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong Alien: Covenant, khán giả bắt gặp 2 loài quái vật không gian: Xenomorph đã gieo rắc nỗi ám ảnh kinh hoàng suốt 3 thập kỷ qua và loài mới Neomorph. Xenomorph trải qua 4 giai đoạn phát triển: Ovomorph (trứng) > Facehugger (sinh vật chui ra từ trứng, bám vào vật chủ và đẻ trứng lên lên vật chủ) > Chestbuster (quái vật “sơ sinh�? chui ra từ cơ thể vật bị ký sinh) > Xenomorph (quái vật không gian trưởng thành).\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong khi đó, các bào tử từ trứng của Neomorph với kích thước siêu vi có khả năng phát tán trong không khí khi bị tác động và chủ động chui vào vật chủ để ký sinh. Sau đó, nó hút chất dinh dưỡng từ cơ thể vật chủ và phát triển thành Neomorph. Chính việc tạo ra loài mới để tránh khiến khán giả nhàm chán mà “đất diễn�? phải chia đ�?u cho cả 2 loài.\r\n"
	    		+ "";
	    String doPhanGiai = "HD";
		String daoDien = "Ridley Scott";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "2017-05-04";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "Tiếng Việt";
		    int luotXem = 0;
		    String Trailer = "svnAD0TApb8";
			String Link = "pf3bYk73vbY";
		    String Poster = "alienposter.png";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "alienhinh3.jpg";
		    String Hinh4 = "alienhinh4.jpg";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setTitle(Title);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest3() {
		String maPhim = "ALC2017";
	    String Title = "Alien: Covenant";
	    String noiDung = "";
	    String doPhanGiai = "HD";
		String daoDien = "Ridley Scott";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "2017-05-04";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "Tiếng Việt";
		    int luotXem = 0;
		    String Trailer = "svnAD0TApb8";
			String Link = "pf3bYk73vbY";
		    String Poster = "alienposter.png";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "alienhinh3.jpg";
		    String Hinh4 = "alienhinh4.jpg";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setTitle(Title);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest4() {
		String maPhim = "ALC2017";
	    String Title = "";
	    String noiDung = "<b>Alien: Covenant</b> lấy bối cảnh hơn 10 năm sau các sự kiện xảy ra trong Prometheus, tập trung khám phá số phận của những thành viên tàu Prometheus còn sống sót, đồng th�?i lý giải cho câu h�?i muôn thuở chưa có l�?i đáp: quái vật ngoài hành tinh được tạo ra khi nào, như thế nào và bởi ai?\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Quái vật không gian bị... đẩy xuống vai phụ</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Ridley Scott là “cha đẻ�? của series Alien, là ngư�?i thực hiện phần phim đầu tiên ra mắt vào năm 1979. Ông cũng chính là đạo diễn của phần mới nhất này. Ở đoạn đầu tác phẩm, ông khiến khán giả sống dậy cảm giác khi xem Alien vào 38 năm v�? trước. Công cuộc khám phá hành tinh bí ẩn cùng sự trỗi dậy của loài sinh vật khủng khiếp luôn hấp dẫn, kịch tính và rùng rợn.\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Nhưng mạch phim sau đó bị kèo chùng xuống hoàn toàn, đồng th�?i từ một phim đấu tranh sinh tồn gay cấn, phim rẽ hướng sang một tác phẩm như-nghệ-thuật với những câu thoại khó hiểu, những diễn biến tâm lý có phần phức tạp, điên rồ và những cảnh phim gây sốc. Vai trò của các quái vật không gian bị giảm bớt bởi kẻ đã tạo ra/ cải tiến nó. \r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Kinh tởm hơn là kinh dị</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong Alien: Covenant, khán giả bắt gặp 2 loài quái vật không gian: Xenomorph đã gieo rắc nỗi ám ảnh kinh hoàng suốt 3 thập kỷ qua và loài mới Neomorph. Xenomorph trải qua 4 giai đoạn phát triển: Ovomorph (trứng) > Facehugger (sinh vật chui ra từ trứng, bám vào vật chủ và đẻ trứng lên lên vật chủ) > Chestbuster (quái vật “sơ sinh�? chui ra từ cơ thể vật bị ký sinh) > Xenomorph (quái vật không gian trưởng thành).\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong khi đó, các bào tử từ trứng của Neomorph với kích thước siêu vi có khả năng phát tán trong không khí khi bị tác động và chủ động chui vào vật chủ để ký sinh. Sau đó, nó hút chất dinh dưỡng từ cơ thể vật chủ và phát triển thành Neomorph. Chính việc tạo ra loài mới để tránh khiến khán giả nhàm chán mà “đất diễn�? phải chia đ�?u cho cả 2 loài.\r\n"
	    		+ "";
	    String doPhanGiai = "HD";
		String daoDien = "Ridley Scott";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "2017-05-04";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "Tiếng Việt";
		    int luotXem = 0;
		    String Trailer = "svnAD0TApb8";
			String Link = "pf3bYk73vbY";
		    String Poster = "alienposter.png";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "alienhinh3.jpg";
		    String Hinh4 = "alienhinh4.jpg";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setTitle(Title);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	@Test(expected = Exception.class)
	public void createTest5() {
		String maPhim = "ALC2017";
	    String noiDung = "<b>Alien: Covenant</b> lấy bối cảnh hơn 10 năm sau các sự kiện xảy ra trong Prometheus, tập trung khám phá số phận của những thành viên tàu Prometheus còn sống sót, đồng th�?i lý giải cho câu h�?i muôn thuở chưa có l�?i đáp: quái vật ngoài hành tinh được tạo ra khi nào, như thế nào và bởi ai?\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Quái vật không gian bị... đẩy xuống vai phụ</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Ridley Scott là “cha đẻ�? của series Alien, là ngư�?i thực hiện phần phim đầu tiên ra mắt vào năm 1979. Ông cũng chính là đạo diễn của phần mới nhất này. Ở đoạn đầu tác phẩm, ông khiến khán giả sống dậy cảm giác khi xem Alien vào 38 năm v�? trước. Công cuộc khám phá hành tinh bí ẩn cùng sự trỗi dậy của loài sinh vật khủng khiếp luôn hấp dẫn, kịch tính và rùng rợn.\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Nhưng mạch phim sau đó bị kèo chùng xuống hoàn toàn, đồng th�?i từ một phim đấu tranh sinh tồn gay cấn, phim rẽ hướng sang một tác phẩm như-nghệ-thuật với những câu thoại khó hiểu, những diễn biến tâm lý có phần phức tạp, điên rồ và những cảnh phim gây sốc. Vai trò của các quái vật không gian bị giảm bớt bởi kẻ đã tạo ra/ cải tiến nó. \r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Kinh tởm hơn là kinh dị</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong Alien: Covenant, khán giả bắt gặp 2 loài quái vật không gian: Xenomorph đã gieo rắc nỗi ám ảnh kinh hoàng suốt 3 thập kỷ qua và loài mới Neomorph. Xenomorph trải qua 4 giai đoạn phát triển: Ovomorph (trứng) > Facehugger (sinh vật chui ra từ trứng, bám vào vật chủ và đẻ trứng lên lên vật chủ) > Chestbuster (quái vật “sơ sinh�? chui ra từ cơ thể vật bị ký sinh) > Xenomorph (quái vật không gian trưởng thành).\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong khi đó, các bào tử từ trứng của Neomorph với kích thước siêu vi có khả năng phát tán trong không khí khi bị tác động và chủ động chui vào vật chủ để ký sinh. Sau đó, nó hút chất dinh dưỡng từ cơ thể vật chủ và phát triển thành Neomorph. Chính việc tạo ra loài mới để tránh khiến khán giả nhàm chán mà “đất diễn�? phải chia đ�?u cho cả 2 loài.\r\n"
	    		+ "";
	    String doPhanGiai = "HD";
		String daoDien = "Ridley Scott";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "2017-05-04";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "";
		    int luotXem = 0;
		    String Trailer = "svnAD0TApb8";
			String Link = "pf3bYk73vbY";
		    String Poster = "alienposter.png";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "alienhinh3.jpg";
		    String Hinh4 = "alienhinh4.jpg";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest6() {
		String maPhim = "ALC2017";
	    String Title = "Alien: Covenant";
	    String noiDung = "<b>Alien: Covenant</b> lấy bối cảnh hơn 10 năm sau các sự kiện xảy ra trong Prometheus, tập trung khám phá số phận của những thành viên tàu Prometheus còn sống sót, đồng th�?i lý giải cho câu h�?i muôn thuở chưa có l�?i đáp: quái vật ngoài hành tinh được tạo ra khi nào, như thế nào và bởi ai?\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Quái vật không gian bị... đẩy xuống vai phụ</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Ridley Scott là “cha đẻ�? của series Alien, là ngư�?i thực hiện phần phim đầu tiên ra mắt vào năm 1979. Ông cũng chính là đạo diễn của phần mới nhất này. Ở đoạn đầu tác phẩm, ông khiến khán giả sống dậy cảm giác khi xem Alien vào 38 năm v�? trước. Công cuộc khám phá hành tinh bí ẩn cùng sự trỗi dậy của loài sinh vật khủng khiếp luôn hấp dẫn, kịch tính và rùng rợn.\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Nhưng mạch phim sau đó bị kèo chùng xuống hoàn toàn, đồng th�?i từ một phim đấu tranh sinh tồn gay cấn, phim rẽ hướng sang một tác phẩm như-nghệ-thuật với những câu thoại khó hiểu, những diễn biến tâm lý có phần phức tạp, điên rồ và những cảnh phim gây sốc. Vai trò của các quái vật không gian bị giảm bớt bởi kẻ đã tạo ra/ cải tiến nó. \r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Kinh tởm hơn là kinh dị</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong Alien: Covenant, khán giả bắt gặp 2 loài quái vật không gian: Xenomorph đã gieo rắc nỗi ám ảnh kinh hoàng suốt 3 thập kỷ qua và loài mới Neomorph. Xenomorph trải qua 4 giai đoạn phát triển: Ovomorph (trứng) > Facehugger (sinh vật chui ra từ trứng, bám vào vật chủ và đẻ trứng lên lên vật chủ) > Chestbuster (quái vật “sơ sinh�? chui ra từ cơ thể vật bị ký sinh) > Xenomorph (quái vật không gian trưởng thành).\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong khi đó, các bào tử từ trứng của Neomorph với kích thước siêu vi có khả năng phát tán trong không khí khi bị tác động và chủ động chui vào vật chủ để ký sinh. Sau đó, nó hút chất dinh dưỡng từ cơ thể vật chủ và phát triển thành Neomorph. Chính việc tạo ra loài mới để tránh khiến khán giả nhàm chán mà “đất diễn�? phải chia đ�?u cho cả 2 loài.\r\n"
	    		+ "";
	    String doPhanGiai = "HD";
		String daoDien = "Ridley Scott";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "Tiếng Việt";
		    int luotXem = 0;
		    String Trailer = "svnAD0TApb8";
			String Link = "pf3bYk73vbY";
		    String Poster = "alienposter.png";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "alienhinh3.jpg";
		    String Hinh4 = "alienhinh4.jpg";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setTitle(Title);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest7() {
		String maPhim = "ALC2017";
	    String Title = "Alien: Covenant";
	    String noiDung = "<b>Alien: Covenant</b> lấy bối cảnh hơn 10 năm sau các sự kiện xảy ra trong Prometheus, tập trung khám phá số phận của những thành viên tàu Prometheus còn sống sót, đồng th�?i lý giải cho câu h�?i muôn thuở chưa có l�?i đáp: quái vật ngoài hành tinh được tạo ra khi nào, như thế nào và bởi ai?\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Quái vật không gian bị... đẩy xuống vai phụ</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Ridley Scott là “cha đẻ�? của series Alien, là ngư�?i thực hiện phần phim đầu tiên ra mắt vào năm 1979. Ông cũng chính là đạo diễn của phần mới nhất này. Ở đoạn đầu tác phẩm, ông khiến khán giả sống dậy cảm giác khi xem Alien vào 38 năm v�? trước. Công cuộc khám phá hành tinh bí ẩn cùng sự trỗi dậy của loài sinh vật khủng khiếp luôn hấp dẫn, kịch tính và rùng rợn.\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Nhưng mạch phim sau đó bị kèo chùng xuống hoàn toàn, đồng th�?i từ một phim đấu tranh sinh tồn gay cấn, phim rẽ hướng sang một tác phẩm như-nghệ-thuật với những câu thoại khó hiểu, những diễn biến tâm lý có phần phức tạp, điên rồ và những cảnh phim gây sốc. Vai trò của các quái vật không gian bị giảm bớt bởi kẻ đã tạo ra/ cải tiến nó. \r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Kinh tởm hơn là kinh dị</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong Alien: Covenant, khán giả bắt gặp 2 loài quái vật không gian: Xenomorph đã gieo rắc nỗi ám ảnh kinh hoàng suốt 3 thập kỷ qua và loài mới Neomorph. Xenomorph trải qua 4 giai đoạn phát triển: Ovomorph (trứng) > Facehugger (sinh vật chui ra từ trứng, bám vào vật chủ và đẻ trứng lên lên vật chủ) > Chestbuster (quái vật “sơ sinh�? chui ra từ cơ thể vật bị ký sinh) > Xenomorph (quái vật không gian trưởng thành).\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong khi đó, các bào tử từ trứng của Neomorph với kích thước siêu vi có khả năng phát tán trong không khí khi bị tác động và chủ động chui vào vật chủ để ký sinh. Sau đó, nó hút chất dinh dưỡng từ cơ thể vật chủ và phát triển thành Neomorph. Chính việc tạo ra loài mới để tránh khiến khán giả nhàm chán mà “đất diễn�? phải chia đ�?u cho cả 2 loài.\r\n"
	    		+ "";
	    String doPhanGiai = "HD";
		String daoDien = "Ridley Scott";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "2017-05-04";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "Tiếng Việt";
		    int luotXem = 0;
		    String Trailer = "svnAD0TApb8";
			String Link = "pf3bYk73vbY";
		    String Poster = "";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "alienhinh3.jpg";
		    String Hinh4 = "alienhinh4.jpg";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setTitle(Title);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest8() {
		String maPhim = "ALC2017";
	    String Title = "Alien: Covenant";
	    String noiDung = "<b>Alien: Covenant</b> lấy bối cảnh hơn 10 năm sau các sự kiện xảy ra trong Prometheus, tập trung khám phá số phận của những thành viên tàu Prometheus còn sống sót, đồng th�?i lý giải cho câu h�?i muôn thuở chưa có l�?i đáp: quái vật ngoài hành tinh được tạo ra khi nào, như thế nào và bởi ai?\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Quái vật không gian bị... đẩy xuống vai phụ</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Ridley Scott là “cha đẻ�? của series Alien, là ngư�?i thực hiện phần phim đầu tiên ra mắt vào năm 1979. Ông cũng chính là đạo diễn của phần mới nhất này. Ở đoạn đầu tác phẩm, ông khiến khán giả sống dậy cảm giác khi xem Alien vào 38 năm v�? trước. Công cuộc khám phá hành tinh bí ẩn cùng sự trỗi dậy của loài sinh vật khủng khiếp luôn hấp dẫn, kịch tính và rùng rợn.\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Nhưng mạch phim sau đó bị kèo chùng xuống hoàn toàn, đồng th�?i từ một phim đấu tranh sinh tồn gay cấn, phim rẽ hướng sang một tác phẩm như-nghệ-thuật với những câu thoại khó hiểu, những diễn biến tâm lý có phần phức tạp, điên rồ và những cảnh phim gây sốc. Vai trò của các quái vật không gian bị giảm bớt bởi kẻ đã tạo ra/ cải tiến nó. \r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Kinh tởm hơn là kinh dị</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong Alien: Covenant, khán giả bắt gặp 2 loài quái vật không gian: Xenomorph đã gieo rắc nỗi ám ảnh kinh hoàng suốt 3 thập kỷ qua và loài mới Neomorph. Xenomorph trải qua 4 giai đoạn phát triển: Ovomorph (trứng) > Facehugger (sinh vật chui ra từ trứng, bám vào vật chủ và đẻ trứng lên lên vật chủ) > Chestbuster (quái vật “sơ sinh�? chui ra từ cơ thể vật bị ký sinh) > Xenomorph (quái vật không gian trưởng thành).\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong khi đó, các bào tử từ trứng của Neomorph với kích thước siêu vi có khả năng phát tán trong không khí khi bị tác động và chủ động chui vào vật chủ để ký sinh. Sau đó, nó hút chất dinh dưỡng từ cơ thể vật chủ và phát triển thành Neomorph. Chính việc tạo ra loài mới để tránh khiến khán giả nhàm chán mà “đất diễn�? phải chia đ�?u cho cả 2 loài.\r\n"
	    		+ "";
	    String doPhanGiai = "HD";
		String daoDien = "Ridley Scott";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "2017-05-04";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "Tiếng Việt";
		    int luotXem = 0;
		    String Trailer = "svnAD0TApb8";
			String Link = "pf3bYk73vbY";
		    String Poster = "alienposter.png";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "alienhinh3.jpg";
		    String Hinh4 = "";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setTitle(Title);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest9() {
		String maPhim = "ALC2017";
	    String Title = "Alien: Covenant";
	    String noiDung = "<b>Alien: Covenant</b> lấy bối cảnh hơn 10 năm sau các sự kiện xảy ra trong Prometheus, tập trung khám phá số phận của những thành viên tàu Prometheus còn sống sót, đồng th�?i lý giải cho câu h�?i muôn thuở chưa có l�?i đáp: quái vật ngoài hành tinh được tạo ra khi nào, như thế nào và bởi ai?\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Quái vật không gian bị... đẩy xuống vai phụ</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Ridley Scott là “cha đẻ�? của series Alien, là ngư�?i thực hiện phần phim đầu tiên ra mắt vào năm 1979. Ông cũng chính là đạo diễn của phần mới nhất này. Ở đoạn đầu tác phẩm, ông khiến khán giả sống dậy cảm giác khi xem Alien vào 38 năm v�? trước. Công cuộc khám phá hành tinh bí ẩn cùng sự trỗi dậy của loài sinh vật khủng khiếp luôn hấp dẫn, kịch tính và rùng rợn.\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Nhưng mạch phim sau đó bị kèo chùng xuống hoàn toàn, đồng th�?i từ một phim đấu tranh sinh tồn gay cấn, phim rẽ hướng sang một tác phẩm như-nghệ-thuật với những câu thoại khó hiểu, những diễn biến tâm lý có phần phức tạp, điên rồ và những cảnh phim gây sốc. Vai trò của các quái vật không gian bị giảm bớt bởi kẻ đã tạo ra/ cải tiến nó. \r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Kinh tởm hơn là kinh dị</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong Alien: Covenant, khán giả bắt gặp 2 loài quái vật không gian: Xenomorph đã gieo rắc nỗi ám ảnh kinh hoàng suốt 3 thập kỷ qua và loài mới Neomorph. Xenomorph trải qua 4 giai đoạn phát triển: Ovomorph (trứng) > Facehugger (sinh vật chui ra từ trứng, bám vào vật chủ và đẻ trứng lên lên vật chủ) > Chestbuster (quái vật “sơ sinh�? chui ra từ cơ thể vật bị ký sinh) > Xenomorph (quái vật không gian trưởng thành).\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong khi đó, các bào tử từ trứng của Neomorph với kích thước siêu vi có khả năng phát tán trong không khí khi bị tác động và chủ động chui vào vật chủ để ký sinh. Sau đó, nó hút chất dinh dưỡng từ cơ thể vật chủ và phát triển thành Neomorph. Chính việc tạo ra loài mới để tránh khiến khán giả nhàm chán mà “đất diễn�? phải chia đ�?u cho cả 2 loài.\r\n"
	    		+ "";
	    String doPhanGiai = "HD";
		String daoDien = "";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "2017-05-04";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "Tiếng Việt";
		    int luotXem = 0;
		    String Trailer = "svnAD0TApb8";
			String Link = "pf3bYk73vbY";
		    String Poster = "alienposter.png";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "alienhinh3.jpg";
		    String Hinh4 = "alienhinh4.jpg";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setTitle(Title);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest10() {
		String maPhim = "";
	    String Title = "Alien: Covenant";
	    String noiDung = "<b>Alien: Covenant</b> lấy bối cảnh hơn 10 năm sau các sự kiện xảy ra trong Prometheus, tập trung khám phá số phận của những thành viên tàu Prometheus còn sống sót, đồng th�?i lý giải cho câu h�?i muôn thuở chưa có l�?i đáp: quái vật ngoài hành tinh được tạo ra khi nào, như thế nào và bởi ai?\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Quái vật không gian bị... đẩy xuống vai phụ</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Ridley Scott là “cha đẻ�? của series Alien, là ngư�?i thực hiện phần phim đầu tiên ra mắt vào năm 1979. Ông cũng chính là đạo diễn của phần mới nhất này. Ở đoạn đầu tác phẩm, ông khiến khán giả sống dậy cảm giác khi xem Alien vào 38 năm v�? trước. Công cuộc khám phá hành tinh bí ẩn cùng sự trỗi dậy của loài sinh vật khủng khiếp luôn hấp dẫn, kịch tính và rùng rợn.\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Nhưng mạch phim sau đó bị kèo chùng xuống hoàn toàn, đồng th�?i từ một phim đấu tranh sinh tồn gay cấn, phim rẽ hướng sang một tác phẩm như-nghệ-thuật với những câu thoại khó hiểu, những diễn biến tâm lý có phần phức tạp, điên rồ và những cảnh phim gây sốc. Vai trò của các quái vật không gian bị giảm bớt bởi kẻ đã tạo ra/ cải tiến nó. \r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "<b>Kinh tởm hơn là kinh dị</b>\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong Alien: Covenant, khán giả bắt gặp 2 loài quái vật không gian: Xenomorph đã gieo rắc nỗi ám ảnh kinh hoàng suốt 3 thập kỷ qua và loài mới Neomorph. Xenomorph trải qua 4 giai đoạn phát triển: Ovomorph (trứng) > Facehugger (sinh vật chui ra từ trứng, bám vào vật chủ và đẻ trứng lên lên vật chủ) > Chestbuster (quái vật “sơ sinh�? chui ra từ cơ thể vật bị ký sinh) > Xenomorph (quái vật không gian trưởng thành).\r\n"
	    		+ "<br>\r\n"
	    		+ "<br>\r\n"
	    		+ "Trong khi đó, các bào tử từ trứng của Neomorph với kích thước siêu vi có khả năng phát tán trong không khí khi bị tác động và chủ động chui vào vật chủ để ký sinh. Sau đó, nó hút chất dinh dưỡng từ cơ thể vật chủ và phát triển thành Neomorph. Chính việc tạo ra loài mới để tránh khiến khán giả nhàm chán mà “đất diễn�? phải chia đ�?u cho cả 2 loài.\r\n"
	    		+ "";
	    String doPhanGiai = "HD";
		String daoDien = "Ridley Scott";
		  //  @Temporal(TemporalType.DATE)
			String sDate = "2017-05-04";
			Date date = (Date) parse(sDate);
		    int thoiLuong = 123;
		    String phuDe = "Tiếng Việt";
		    int luotXem = 0;
		    String Trailer = "";
			String Link = "";
		    String Poster = "alienposter.png";
		    String Hinh1 = "alienhinh1.jpg";
		    String Hinh2 = "alienhinh2.jpg";
		    String Hinh3 = "";
		    String Hinh4 = "alienhinh4.jpg";
		    boolean hieuLuc = true;
		
		Phims phims = new Phims();
		
		PhimDAO phimDAO = new PhimDAO();
		
		phims.setMaPhim(maPhim);
		phims.setTitle(Title);
		phims.setNoiDung(noiDung);
		phims.setDoPhanGiai(doPhanGiai);
		phims.setDaoDien(daoDien);
		phims.setNgayCongChieu(date);
		phims.setThoiLuong(thoiLuong);
		phims.setPhuDe(phuDe);
		phims.setLuotXem(luotXem);
		phims.setTrailer(Trailer);
		phims.setLink(Link);
		phims.setPoster(Poster);
		phims.setHinh1(Hinh1);
		phims.setHinh2(Hinh2);
		phims.setHinh3(Hinh3);
		phims.setHinh4(Hinh4);
		phims.setHieuLuc(hieuLuc);

		phimDAO.create(phims);
	}
	
	private Date parse(String sDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//TestCase Create()
	
	//TestCase Delete()
	@Test(expected = Exception.class)
	public void deleteTest1() {
		String maPhim = "ALC2017";
		PhimDAO phimDAO = new PhimDAO();
		phimDAO.delete(maPhim);
	}
	
	@Test(expected = Exception.class)
	public void deleteTest2() {
		String maPhim = "ALC2017";
		PhimDAO phimDAO = new PhimDAO();
		phimDAO.delete(maPhim);
	}
	//TestCase Delete()
	@After
	public void tearDownTest() {
		em.close();
		emf.close();
	}
}
