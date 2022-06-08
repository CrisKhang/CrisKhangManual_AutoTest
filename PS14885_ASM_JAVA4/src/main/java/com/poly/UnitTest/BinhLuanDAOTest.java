package com.poly.UnitTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.poly.DAO.BinhLuanDAO;
import com.poly.DAO.NguoiDungDAO;
import com.poly.DAO.PhimDAO;
import com.poly.DAO.PhimTHDAO;
import com.poly.DAO.TheLoaiDAO;
import com.poly.Entity.BinhLuans;
import com.poly.Entity.PhimTHs;

public class BinhLuanDAOTest {
	private EntityManagerFactory emf;
	private EntityManager em;
	@Before
	public void initTest( ) {
		emf = Persistence.createEntityManagerFactory("ASM_JAVA4_PS14885");
		em = emf.createEntityManager();
	}
	//TestCase Create()
	@Ignore
	@Test(expected = Exception.class)
	public void createTest1() {
		//Dữ liệu mẫu
		String maPhim = "FZ2";
		String tenDN = "datvan123";
		//Dữ liệu mẫu
		
		//DAO và Model cần thiết để set dữ liệu vào Model cần kiểm thử
		BinhLuans binhluans = new BinhLuans();
		BinhLuanDAO binhluanDAO = new BinhLuanDAO();
		PhimDAO phimDAO = new PhimDAO();
		NguoiDungDAO nguoidungDAO = new NguoiDungDAO();
		binhluans.setPhims(phimDAO.findById(maPhim));
		binhluans.setNguoidungs(nguoidungDAO.findById(tenDN));
		//DAO và Model cần thiết để set dữ liệu vào Model cần kiểm thử
		
		//Hàm này cần kiểm thử 
		binhluanDAO.create(binhluans);
	}
	
	//b�? trống mã phim
	@Ignore
	@Test(expected = Exception.class)
	public void createTest2() {
		String maPhim = "";
		String tenDN = "datvan123";
		
		BinhLuans binhluans = new BinhLuans();
		BinhLuanDAO binhluanDAO = new BinhLuanDAO();
		PhimDAO phimDAO = new PhimDAO();
		NguoiDungDAO nguoidungDAO = new NguoiDungDAO();
		binhluans.setPhims(phimDAO.findById(maPhim));
		binhluans.setNguoidungs(nguoidungDAO.findById(tenDN));
		
		binhluanDAO.create(binhluans);
	}
	
	// b�? trống tên đăng nhập
	@Ignore
	@Test(expected = Exception.class)
	public void createTest3() {
		String maPhim = "FZ2";
		String tenDN = "";
		
		BinhLuans binhluans = new BinhLuans();
		BinhLuanDAO binhluanDAO = new BinhLuanDAO();
		PhimDAO phimDAO = new PhimDAO();
		NguoiDungDAO nguoidungDAO = new NguoiDungDAO();
		binhluans.setPhims(phimDAO.findById(maPhim));
		binhluans.setNguoidungs(nguoidungDAO.findById(tenDN));
		
		binhluanDAO.create(binhluans);
	}
	
	// b�? trống mã phim và tên đăng nhập
	@Ignore
	@Test(expected = Exception.class)
	public void createTest4() {
		String maPhim = "";
		String tenDN = "";
		
		BinhLuans binhluans = new BinhLuans();
		BinhLuanDAO binhluanDAO = new BinhLuanDAO();
		PhimDAO phimDAO = new PhimDAO();
		NguoiDungDAO nguoidungDAO = new NguoiDungDAO();
		binhluans.setPhims(phimDAO.findById(maPhim));
		binhluans.setNguoidungs(nguoidungDAO.findById(tenDN));
		
		binhluanDAO.create(binhluans);
	}
	
	// nhập thêm dữ liệu vào mã phim
	@Ignore
	@Test(expected = Exception.class)
	public void createTest5() {
		String maPhim = "FZ220";
		String tenDN = "datvan123";
		
		BinhLuans binhluans = new BinhLuans();
		BinhLuanDAO binhluanDAO = new BinhLuanDAO();
		PhimDAO phimDAO = new PhimDAO();
		NguoiDungDAO nguoidungDAO = new NguoiDungDAO();
		binhluans.setPhims(phimDAO.findById(maPhim));
		binhluans.setNguoidungs(nguoidungDAO.findById(tenDN));
		
		binhluanDAO.create(binhluans);
	}
	
	// nhập sai tên đăng nhập
	@Ignore
	@Test(expected = Exception.class)
	public void createTest6() {
		String maPhim = "FZ2";
		String tenDN = "datvan1234";
		
		BinhLuans binhluans = new BinhLuans();
		BinhLuanDAO binhluanDAO = new BinhLuanDAO();
		PhimDAO phimDAO = new PhimDAO();
		NguoiDungDAO nguoidungDAO = new NguoiDungDAO();
		binhluans.setPhims(phimDAO.findById(maPhim));
		binhluans.setNguoidungs(nguoidungDAO.findById(tenDN));
		
		binhluanDAO.create(binhluans);
	}
				
	// nhập ký tự đặt biệt vào mã phim
	@Test(expected = Exception.class)
	public void createTest7() {
		String maPhim = "$$#$#$";
		String tenDN = "datvan123";
		
		BinhLuans binhluans = new BinhLuans();
		BinhLuanDAO binhluanDAO = new BinhLuanDAO();
		PhimDAO phimDAO = new PhimDAO();
		NguoiDungDAO nguoidungDAO = new NguoiDungDAO();
		binhluans.setPhims(phimDAO.findById(maPhim));
		binhluans.setNguoidungs(nguoidungDAO.findById(tenDN));
		
		binhluanDAO.create(binhluans);
	}
	
	
	//TestCase Create()
	
	//TestCase Delete()
	//Nhập đúng mã phim xoá
	@Test(expected = Exception.class)
	public void deleteTest1() {
		String maBinhLuan = "8";
		BinhLuanDAO binhLuanDAO = new BinhLuanDAO();
		binhLuanDAO.delete(maBinhLuan);
	}
	//Nhập sai mã phim cần xoá
	@Test(expected = Exception.class)
	public void deleteTest2() {
		String maBinhLuan = "2334444";
		BinhLuanDAO binhLuanDAO = new BinhLuanDAO();
		binhLuanDAO.delete(maBinhLuan);
	}
	//TestCase Delete()
	@After
	public void tearDownTest() {
		em.close();
		emf.close();
	}
}
