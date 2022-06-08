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
import com.poly.DAO.YeuThichDAO;
import com.poly.Entity.NguoiDungs;

public class NguoiDungDaoTest {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	@Before
	public void initTest() {
		emf = Persistence.createEntityManagerFactory("ASM_JAVA4_PS14885");
		em = emf.createEntityManager();
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest1() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
		
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest2() {
		String tenDN = "";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest3() {
		String tenDN = "trankhang";
		String Ho = "";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest4() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest5() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest6() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest7() {
		String tenDN = "";
		String Ho = "";
		String Ten = "";
		String Email = "";
		String matKhau = "";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest8() {
		String tenDN = "khangggggggggggg";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest9() {
		String tenDN = "trankhang";
		String Ho = "1";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest10() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "1";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest11() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest12() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void createTest13() {
		String tenDN = "trankhang2";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = false;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.create(nguoiDungs);
	}
	
	
	@Test(expected = Exception.class)
	public void deleteTest1() {
		String tenDN = "trankhang";
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		nguoiDungDao.delete(tenDN);
	}
	
	
	@Test(expected = Exception.class)
	public void deleteTest2() {
		String tenDN = "1";
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		nguoiDungDao.delete(tenDN);
	}
	
	
	@Test(expected = Exception.class)
	public void deleteTest3() {
		String tenDN = "";
		NguoiDungDAO nguoiDungDao = new NguoiDungDAO();
		nguoiDungDao.delete(tenDN);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest1() {
		String tenDN = "trankhang";
		String Ho = "trangia";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest2() {
		String tenDN = "";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest3() {
		String tenDN = "trankhang";
		String Ho = "";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest4() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest5() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest6() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest7() {
		String tenDN = "";
		String Ho = "";
		String Ten = "";
		String Email = "";
		String matKhau = "";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest8() {
		String tenDN = "trankhangggggggg";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest9() {
		String tenDN = "trankhang";
		String Ho = "trannnnnnnn";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest10() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khanggggggg";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest11() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "sai";
		String matKhau = "1234567";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest12() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "sai";
		boolean vaiTro = true;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@Ignore
	@Test(expected = Exception.class)
	public void updateTest13() {
		String tenDN = "trankhang";
		String Ho = "tran";
		String Ten = "khang";
		String Email = "khang@gmail.com";
		String matKhau = "1234567";
		boolean vaiTro = false;
		
		NguoiDungs nguoiDungs = new NguoiDungs();
		NguoiDungDAO nguoiDungDao  = new NguoiDungDAO();
		
		nguoiDungs.setTenDN(tenDN);
		nguoiDungs.setHo(Ho);
		nguoiDungs.setTen(Ten);
		nguoiDungs.setEmail(Email);
		nguoiDungs.setMatKhau(matKhau);
		nguoiDungs.setVaiTro(vaiTro);
		
		nguoiDungDao.update(nguoiDungs);
	}
	
	@After
	public void tearDownTest() {
		em.close();
		emf.close();
	}
}
