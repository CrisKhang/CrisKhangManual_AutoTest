package com.poly.UnitTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.poly.DAO.TheLoaiDAO;
import com.poly.Entity.PhimTHs;
import com.poly.Entity.TheLoais;

public class TheLoaiDAOTest {
	private EntityManagerFactory emf;
	private EntityManager em;

	@Before
	public void initTest() {
		emf = Persistence.createEntityManagerFactory("ASM_JAVA4_PS14885");
		em = emf.createEntityManager();
	}

	
	
	
	// create
	
	
	
	@Test(expected = Exception.class)
	public void createTest1() {
		// Dữ liệu mẫu
		String maTheLoai = "AN01";
		String tenTheLoai = "Kinh di";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void createTest2() {
		// Dữ liệu mẫu
		String maTheLoai = "AN01";
		String tenTheLoai = "";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void createTest3() {
		// Dữ liệu mẫu
		String maTheLoai = "";
		String tenTheLoai = "";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void createTest4() {
		// Dữ liệu mẫu
		String maTheLoai = "CT01";
		String tenTheLoai = "";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void createTest5() {
		// Dữ liệu mẫu
		String maTheLoai = "PL01";
		String tenTheLoai = "dsadas";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void createTest6() {
		// Dữ liệu mẫu
		String maTheLoai = "TT01";
		String tenTheLoai = "Than Thoai";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}
	
	@Test(expected = Exception.class)
	public void createTest7() {
		// Dữ liệu mẫu
		String maTheLoai = "TC01";
		String tenTheLoai = "Phieu Luu";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}
	
	@Test(expected = Exception.class)
	public void createTest8() {
		// Dữ liệu mẫu
		String maTheLoai = "HS01";
		String tenTheLoai = "Hinh Su";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	
	
	
	
	// update
	
	
	
	
	@Test(expected = Exception.class)
	public void updateTest1() {
		// Dữ liệu mẫu
		String maTheLoai = "dsadasjhbdsabh";
		String tenTheLoai = "Kinh di";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.update(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void updateTest2() {
		// Dữ liệu mẫu
		String maTheLoai = "";
		String tenTheLoai = "Phieu Luu";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void updateTest3() {
		// Dữ liệu mẫu
		String maTheLoai = "";
		String tenTheLoai = "Than Thoai";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void updateTest4() {
		// Dữ liệu mẫu
		String maTheLoai = "";
		String tenTheLoai = "Chien Tranh";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void updateTest5() {
		// Dữ liệu mẫu
		String maTheLoai = "";
		String tenTheLoai = "";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}
	
	@Test(expected = Exception.class)
	public void updateTest6() {
		// Dữ liệu mẫu
		String maTheLoai = "DSNAJ";
		String tenTheLoai = "dsadsa";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}
	
	@Test(expected = Exception.class)
	public void updateTest7() {
		// Dữ liệu mẫu
		String maTheLoai = "Kinh Di";
		String tenTheLoai = "Phieu Luu";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoai.setTenTheLoai(tenTheLoai);
		theLoaiDAO.create(theLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	
	
	// delete

	@Test(expected = Exception.class)
	public void deleteTest1() {
		// Dữ liệu mẫu
		String maTheLoai = "";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoaiDAO.delete(maTheLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	@Test(expected = Exception.class)
	public void deleteTest2() {
		// Dữ liệu mẫu
		String maTheLoai = "dsandjksanjk";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoaiDAO.delete(maTheLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}
	
	@Test(expected = Exception.class)
	public void deleteTest3() {
		// Dữ liệu mẫu
		String maTheLoai = "Phieu Luu";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoaiDAO.delete(maTheLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}
	
	@Test(expected = Exception.class)
	public void deleteTest4() {
		// Dữ liệu mẫu
		String maTheLoai = "dnsajdnsaj";
		// Dữ liệu mẫu
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử
		TheLoais theLoai = new TheLoais();
		TheLoaiDAO theLoaiDAO = new TheLoaiDAO();
		theLoai.setMaTheLoai(maTheLoai);
		theLoaiDAO.delete(maTheLoai);
		// DAO và Model cần thiết để set dữ liệu vào Model cần kiểm
		// thử

		// Hàm này cần kiểm thử
	}

	// TestCase Delete()
	@After
	public void tearDownTest() {
		em.close();
		emf.close();
	}

}
