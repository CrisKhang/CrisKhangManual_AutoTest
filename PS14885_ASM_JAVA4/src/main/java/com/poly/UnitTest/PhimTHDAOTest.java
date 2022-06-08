package com.poly.UnitTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.poly.DAO.PhimDAO;
import com.poly.DAO.PhimTHDAO;
import com.poly.DAO.TheLoaiDAO;
import com.poly.Entity.PhimTHs;

public class PhimTHDAOTest {
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
		String maPhim = "BAT";
		String maTheLoai = "HD01";
		boolean loaiPhim = true;
		//Dữ liệu mẫu
		
		//DAO và Model cần thiết để set dữ liệu vào Model cần kiểm thử
		PhimTHs phimTHs = new PhimTHs();
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		PhimDAO phimDAO = new PhimDAO();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		phimTHs.setPhims(phimDAO.findById(maPhim));
		phimTHs.setTheloais(theLoaiDAO.findById(maTheLoai));
		phimTHs.setLoaiPhim(loaiPhim);
		//DAO và Model cần thiết để set dữ liệu vào Model cần kiểm thử
		
		//Hàm này cần kiểm thử
		phimTHDAO.create(phimTHs);
	}
	@Ignore	
	@Test(expected = Exception.class)
	public void createTest2() {
		String maPhim = "";
		String maTheLoai = "HD01";
		boolean loaiPhim = true;
		
		PhimTHs phimTHs = new PhimTHs();
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		PhimDAO phimDAO = new PhimDAO();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		phimTHs.setPhims(phimDAO.findById(maPhim));
		phimTHs.setTheloais(theLoaiDAO.findById(maTheLoai));
		phimTHs.setLoaiPhim(loaiPhim);
		
		phimTHDAO.create(phimTHs);
	}
	@Ignore	
	@Test(expected = Exception.class)
	public void createTest3() {
		String maPhim = "BAT";
		String maTheLoai = "";
		boolean loaiPhim = true;
		
		PhimTHs phimTHs = new PhimTHs();
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		PhimDAO phimDAO = new PhimDAO();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		phimTHs.setPhims(phimDAO.findById(maPhim));
		phimTHs.setTheloais(theLoaiDAO.findById(maTheLoai));
		phimTHs.setLoaiPhim(loaiPhim);

		phimTHDAO.create(phimTHs);
	}
	@Ignore	
	@Test(expected = Exception.class)
	public void createTest4() {
		String maPhim = "";
		String maTheLoai = "";
		boolean loaiPhim = true;
		
		PhimTHs phimTHs = new PhimTHs();
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		PhimDAO phimDAO = new PhimDAO();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		phimTHs.setPhims(phimDAO.findById(maPhim));
		phimTHs.setTheloais(theLoaiDAO.findById(maTheLoai));
		phimTHs.setLoaiPhim(loaiPhim);

		phimTHDAO.create(phimTHs);
	}
	@Ignore	
	@Test(expected = Exception.class)
	public void createTest5() {
		String maPhim = "BAT123";
		String maTheLoai = "HD01";
		boolean loaiPhim = true;
		
		PhimTHs phimTHs = new PhimTHs();
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		PhimDAO phimDAO = new PhimDAO();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		phimTHs.setPhims(phimDAO.findById(maPhim));
		phimTHs.setTheloais(theLoaiDAO.findById(maTheLoai));
		phimTHs.setLoaiPhim(loaiPhim);

		phimTHDAO.create(phimTHs);
	}
	@Ignore	
	@Test(expected = Exception.class)
	public void createTest6() {
		String maPhim = "BAT";
		String maTheLoai = "Hd00001111";
		boolean loaiPhim = true;
		
		PhimTHs phimTHs = new PhimTHs();
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		PhimDAO phimDAO = new PhimDAO();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		phimTHs.setPhims(phimDAO.findById(maPhim));
		phimTHs.setTheloais(theLoaiDAO.findById(maTheLoai));
		phimTHs.setLoaiPhim(loaiPhim);

		phimTHDAO.create(phimTHs);
	}
	@Ignore	
	@Test(expected = Exception.class)
	public void createTest7() {

		String maPhim = "BAT";
		String maTheLoai = "HD01";
		boolean loaiPhim = false;

		PhimTHs phimTHs = new PhimTHs();
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		PhimDAO phimDAO = new PhimDAO();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		phimTHs.setPhims(phimDAO.findById(maPhim));
		phimTHs.setTheloais(theLoaiDAO.findById(maTheLoai));
		phimTHs.setLoaiPhim(loaiPhim);

		phimTHDAO.create(phimTHs);
	}
	@Ignore
	@Test(expected = Exception.class)
	public void createTest8() {
		String maPhim = "BAT0001111";
		String maTheLoai = "Hd00001111";
		boolean loaiPhim = false;
		PhimTHs phimTHs = new PhimTHs();
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		PhimDAO phimDAO = new PhimDAO();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		phimTHs.setPhims(phimDAO.findById(maPhim));
		phimTHs.setTheloais(theLoaiDAO.findById(maTheLoai));
		phimTHs.setLoaiPhim(loaiPhim);
		phimTHDAO.create(phimTHs);
	}
	//TestCase Create()
	
	//TestCase Delete()

	@Test(expected = Exception.class)
	public void deleteTest1() {
		String idPhimTH = "65";
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		phimTHDAO.delete(idPhimTH);
	}

	@Test(expected = Exception.class)
	public void deleteTest2() {
		String idPhimTH = "9999";
		PhimTHDAO phimTHDAO = new PhimTHDAO();
		phimTHDAO.delete(idPhimTH);
	}
	//TestCase Delete()
	@After
	public void tearDownTest() {
		em.close();
		emf.close();
	}
}
