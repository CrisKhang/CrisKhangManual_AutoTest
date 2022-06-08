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

public class DeleteTest {
	private WebDriver webDriver;
	private final String SRC = ExcelUtils.DATA_SRC + "DeleteDataTest.xlsx";
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
	
	private void processPhim() throws Exception{

		WebElement deleteInput = webDriver.findElement(By.xpath("/html/body/form/div/table/tbody/tr[1]/td[5]/a"));
		deleteInput.click();
		
		WebElement xacnhanInput = webDriver.findElement(By.xpath("/html/body/form/div/div[2]/div/div/div[3]/button[2]"));
		xacnhanInput.click();
	}
	
	@Test(dataProvider = "DeletephimData")
	public void multiplePhim(String expectedResult) throws Exception {
		processPhim();
		String currenUrl = webDriver.getCurrentUrl();
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
	
	@DataProvider(name="DeletephimData")
	public Object[][] data() throws Exception {
		XSSFWorkbook xssfWorkbook = ExcelUtils.getWorkbook(SRC);
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("DeletePhim_Data");
		Object[][] data = ExcelUtils.readSheetData(xssfSheet);
		return data;
	}
}
