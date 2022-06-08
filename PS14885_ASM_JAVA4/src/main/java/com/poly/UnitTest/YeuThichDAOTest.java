package com.poly.UnitTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.poly.DAO.NguoiDungDAO;
import com.poly.DAO.PhimDAO;
import com.poly.DAO.YeuThichDAO;
import com.poly.Entity.NguoiDungs;
import com.poly.Entity.YeuThichs;

public class YeuThichDAOTest {
	private EntityManagerFactory emf;
	private EntityManager em;
	@Before
	public void initTest( ) {
		emf = Persistence.createEntityManagerFactory("ASM_JAVA4_PS14885");
		em = emf.createEntityManager();
	}
	@Test(expected = Exception.class)
	public void testLike1() {
		String tenDN = "duyan123";
		String maPhim = "THOR11";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();
		YeuThichs yeuThichs = new YeuThichs();
		NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
		PhimDAO phimDAO = new PhimDAO();
		
		yeuThichs.setNguoidungs(nguoiDungDAO.findById(tenDN));
		yeuThichs.setPhim(phimDAO.findById(maPhim));
		
		yeuThichDAO.create(yeuThichs);
	}
	@Test(expected = Exception.class)
	public void testLike2() {
		String tenDN = "duyan12344";
		String maPhim = "THOR11";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();
		YeuThichs yeuThichs = new YeuThichs();
		NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
		PhimDAO phimDAO = new PhimDAO();
		
		yeuThichs.setNguoidungs(nguoiDungDAO.findById(tenDN));
		yeuThichs.setPhim(phimDAO.findById(maPhim));
		
		yeuThichDAO.create(yeuThichs);
	}

	@Test(expected = Exception.class)
	public void testLike3() {
		String tenDN = "";
		String maPhim = "THOR11";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();
		YeuThichs yeuThichs = new YeuThichs();
		NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
		PhimDAO phimDAO = new PhimDAO();
		
		yeuThichs.setNguoidungs(nguoiDungDAO.findById(tenDN));
		yeuThichs.setPhim(phimDAO.findById(maPhim));
		
		yeuThichDAO.create(yeuThichs);
	}

	@Test(expected = Exception.class)
	public void testLike4() {
		String tenDN = "duyan12344444";
		String maPhim = "THOR1144444";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();
		YeuThichs yeuThichs = new YeuThichs();
		NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
		PhimDAO phimDAO = new PhimDAO();
		
		yeuThichs.setNguoidungs(nguoiDungDAO.findById(tenDN));
		yeuThichs.setPhim(phimDAO.findById(maPhim));
		
		yeuThichDAO.create(yeuThichs);
	}

	@Test(expected = Exception.class)
	public void testLike5() {
		String tenDN = "duyan123";
		String maPhim = "THOR113333";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();
		YeuThichs yeuThichs = new YeuThichs();
		NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
		PhimDAO phimDAO = new PhimDAO();
		
		yeuThichs.setNguoidungs(nguoiDungDAO.findById(tenDN));
		yeuThichs.setPhim(phimDAO.findById(maPhim));
		
		yeuThichDAO.create(yeuThichs);
	}

	@Test(expected = Exception.class)
	public void testLike6() {
		String tenDN = "duyan123";
		String maPhim = "";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();
		YeuThichs yeuThichs = new YeuThichs();
		NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
		PhimDAO phimDAO = new PhimDAO();
		
		yeuThichs.setNguoidungs(nguoiDungDAO.findById(tenDN));
		yeuThichs.setPhim(phimDAO.findById(maPhim));
		
		yeuThichDAO.create(yeuThichs);
	}

	@Test(expected = Exception.class)
	public void testLike7() {
		String tenDN = "";
		String maPhim = "";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();
		YeuThichs yeuThichs = new YeuThichs();
		NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
		PhimDAO phimDAO = new PhimDAO();
		
		yeuThichs.setNguoidungs(nguoiDungDAO.findById(tenDN));
		yeuThichs.setPhim(phimDAO.findById(maPhim));
		
		yeuThichDAO.create(yeuThichs);
	}

	@Test(expected = Exception.class)
	public void dislikeTest1() {
		String tenDn = "duyan123";
		String maPhim = "THOR11";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();

		long likeCanXoa = yeuThichDAO.selectId(maPhim, tenDn);
		yeuThichDAO.delete(likeCanXoa);
		
	}

	@Test(expected = Exception.class)
	public void dislikeTest2() {
		String tenDn = "duyan12344";
		String maPhim = "THOR11";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();

		long likeCanXoa = yeuThichDAO.selectId(maPhim, tenDn);
		yeuThichDAO.delete(likeCanXoa);
		
	}

	@Test(expected = Exception.class)
	public void dislikeTest3() {
		String tenDn = "duyan123";
		String maPhim = "THOR1144444";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();

		long likeCanXoa = yeuThichDAO.selectId(maPhim, tenDn);
		yeuThichDAO.delete(likeCanXoa);
		
	}

	@Test(expected = Exception.class)
	public void dislikeTest4() {
		String tenDn = "";
		String maPhim = "THOR11";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();

		long likeCanXoa = yeuThichDAO.selectId(maPhim, tenDn);
		yeuThichDAO.delete(likeCanXoa);
		
	}

	@Test(expected = Exception.class)
	public void dislikeTest5() {
		String tenDn = "duyan123";
		String maPhim = "";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();

		long likeCanXoa = yeuThichDAO.selectId(maPhim, tenDn);
		yeuThichDAO.delete(likeCanXoa);
		
	}
	@Test(expected = Exception.class)
	public void dislikeTest6() {
		String tenDn = "";
		String maPhim = "";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();

		long likeCanXoa = yeuThichDAO.selectId(maPhim, tenDn);
		yeuThichDAO.delete(likeCanXoa);
		
	}
	@Test(expected = Exception.class)
	public void dislikeTest7() {
		String tenDn = "duyan12311111";
		String maPhim = "THOR1133333";
		
		YeuThichDAO yeuThichDAO = new YeuThichDAO();

		long likeCanXoa = yeuThichDAO.selectId(maPhim, tenDn);
		yeuThichDAO.delete(likeCanXoa);
		
	}
	@After
	public void tearDownTest() {
		em.close();
		emf.close();
	}
}
