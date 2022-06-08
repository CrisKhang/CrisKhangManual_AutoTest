package com.poly.AutomationTest;

import static org.testng.Assert.assertEquals;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.poly.TestData.PhimData;
import com.poly.Utils.ExcelUtils;

public class EditPhimTest {
	private WebDriver webDriver;
	private final String SRC_TEST_DATA_IMG = System.getProperty("user.dir") + "/test-resources/imagesTestData/";
	private final String SRC = ExcelUtils.DATA_SRC + "EditPhimDataTest.xlsx";
	private Set<PhimData> logs;
	private PhimData log;
	
	@BeforeClass
	public void init() throws Exception {
		System.setProperty("webdriver.chrome.driver", ExcelUtils.CHROME_DRIVER_SRC);
		logs = new LinkedHashSet<>();

	}
	
	@BeforeMethod
	public void setUp() {
		webDriver = new ChromeDriver();
		webDriver.get("http://localhost:8080/PS14885_ASM_JAVA4/manager/editPage/index");
		log = new PhimData();
	}
	
	private void processEditPhim(String maPhim, String tiTle, String noiDung, String doPhanGiai, String daoDien,
			String ngayCongChieu, String thoiLuong, String phuDe, String traiLer, String link, String poster,
			String hinh1, String hinh2, String hinh3, String hinh4, String hieuLuc) throws Exception {
		WebElement btnEdit = webDriver.findElement(By.xpath("/html/body/form/div/table/tbody/tr[4]/td[5]/button[1]"));
		btnEdit.click();
		
		Thread.sleep(1000);
		
		WebElement titileInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[2]/input"));
		titileInput.sendKeys("");
		titileInput.sendKeys(tiTle);
		
		WebElement noiDungInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[3]/textarea"));
		noiDungInput.sendKeys("");
		noiDungInput.sendKeys(noiDung);
		
		WebElement doPhanGiaiInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[4]/select"));
		doPhanGiaiInput.sendKeys("");
		doPhanGiaiInput.sendKeys(doPhanGiai);
		
		WebElement daoDienInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[5]/input"));
		daoDienInput.sendKeys("");
		daoDienInput.sendKeys(daoDien);
		
		WebElement ngayCongChieuInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[6]/input"));
		ngayCongChieuInput.sendKeys("");
		ngayCongChieuInput.sendKeys(ngayCongChieu);
		
		WebElement thoiLuongInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[7]/input"));
		thoiLuongInput.sendKeys("");
		thoiLuongInput.sendKeys(thoiLuong);
		
		WebElement phuDeInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[8]/input"));
		phuDeInput.sendKeys(phuDe);
		
		
		WebElement trailerInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[9]/input"));
		trailerInput.sendKeys("");
		trailerInput.sendKeys(traiLer);
		
		WebElement linkInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[10]/input"));
		linkInput.sendKeys("");
		linkInput.sendKeys(link);
		
		WebElement hieuLucInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[11]/select"));
		hieuLucInput.sendKeys("");
		hieuLucInput.sendKeys(hieuLuc);
		
		WebElement posterInput = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[12]/input"));
		posterInput.sendKeys("");
		posterInput.sendKeys(SRC_TEST_DATA_IMG + poster);
		
		WebElement hinh1Input = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[13]/input"));
		hinh1Input.sendKeys("");
		hinh1Input.sendKeys(SRC_TEST_DATA_IMG + hinh1);
		
		WebElement hinh2Input = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[14]/input"));
		hinh2Input.sendKeys("");
		hinh2Input.sendKeys(SRC_TEST_DATA_IMG + hinh2);
		
		WebElement hinh3Input = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[15]/input"));
		hinh3Input.sendKeys("");
		hinh3Input.sendKeys(SRC_TEST_DATA_IMG + hinh3);
		
		WebElement hinh4Input = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[16]/input"));
		hinh4Input.sendKeys("");
		hinh4Input.sendKeys(SRC_TEST_DATA_IMG + hinh4);
		
		WebElement luuButton = webDriver.findElement(By.xpath("/html/body/div[2]/form/div[17]/button[1]"));
		luuButton.click();
		
	}
	
	@Test(dataProvider = "phimData")
	public void multiplePhim(String maPhim, String tiTle, String noiDung, String doPhanGiai, String daoDien,
			String ngayCongChieu, String thoiLuong, String phuDe, String traiLer, String link, String poster,
			String hinh1, String hinh2, String hinh3, String hinh4, String hieuLuc, String expectedResult) throws Exception {
		processEditPhim(maPhim, tiTle, noiDung, doPhanGiai, daoDien, ngayCongChieu, thoiLuong, phuDe, traiLer, link, poster, hinh1, hinh2, hinh3, hinh4, hieuLuc);
		String currenUrl = webDriver.getCurrentUrl();
		log.setMaPhim(maPhim);
		log.setTiTle(tiTle);
		log.setNoiDung(noiDung);
		log.setDoPhanGiai(doPhanGiai);
		log.setDaoDien(daoDien);
		log.setNgayCongChieu(ngayCongChieu);
		log.setThoiLuong(thoiLuong);
		log.setPhuDe(phuDe);
		log.setTraiLer(traiLer);
		log.setLink(link);
		log.setPoster(poster);
		log.setHinh1(hinh1);
		log.setHinh2(hinh2);
		log.setHinh3(hinh3);
		log.setHinh4(hinh4);
		log.setHieuLuc(hieuLuc);
		log.setAction("The movies");
		log.setLogTime(new Date());
		log.setExpected(expectedResult);
		log.setActual(currenUrl);
		
		assertEquals(expectedResult, currenUrl);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		log.setTestMethod(result.getName());
		switch(result.getStatus()) {
		case ITestResult.SUCCESS:
			log.setStatus("PASS");
			break;
		case ITestResult.FAILURE:
			log.setStatus("FAIL");
			log.setException(result.getThrowable().getMessage());
			String path = ExcelUtils.IMG_SRC + "failure-" + System.currentTimeMillis() + ".png";
			ExcelUtils.takeScreenShot(webDriver, path);
			log.setImage(path);
			break;
		case ITestResult.SKIP:
			log.setStatus("SKIP");
			break;
		default:
			break;
		}
		logs.add(log);
		webDriver.close();
	}
	
	@AfterClass
	public void destroy() throws Exception {
		log.writeLog(SRC, "Result_Test", logs);
	}
	
	@DataProvider(name="phimData")
	public Object[][] data() throws Exception {
		XSSFWorkbook xssfWorkbook = ExcelUtils.getWorkbook(SRC);
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Phim_Data");
		Object[][] data = ExcelUtils.readSheetData(xssfSheet);
		return data;
	}
}
