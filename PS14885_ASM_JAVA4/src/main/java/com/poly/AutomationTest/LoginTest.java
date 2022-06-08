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

import com.poly.TestData.LoginData;
import com.poly.Utils.ExcelUtils;



public class LoginTest {
	private WebDriver webDriver;

	private final String SRC = ExcelUtils.DATA_SRC + "LoginDataTest.xlsx";

	private Set<LoginData> logs;

	private LoginData log;

	@BeforeClass
	public void init() throws Exception {
		System.setProperty("webdriver.chrome.driver", ExcelUtils.CHROME_DRIVER_SRC);
		logs = new LinkedHashSet<>();
	}

	@BeforeMethod
	public void setUp() {
		webDriver = new ChromeDriver();
		webDriver.get("http://localhost:8080/PS14885_ASM_JAVA4/login");
		log = new LoginData();
	}

	private void processLogin(String username, String password) {
		WebElement usernameInput = webDriver.findElement(By.xpath("/html/body/div/form/div[1]/input"));
		usernameInput.sendKeys(username);

		WebElement passwordInput = webDriver.findElement(By.xpath("/html/body/div/form/div[2]/input"));
		passwordInput.sendKeys(password);

		WebElement loginButton = webDriver
				.findElement(By.xpath("/html/body/div/form/div[4]/button"));
		loginButton.click();
	}
	
	@Test(dataProvider = "loginData")
	public void multipleLogin(String username, String password, String expectedResult) throws Exception {
		processLogin(username, password);
		String currentUrl = webDriver.getCurrentUrl();
		log.setUsername(username);
		log.setPassword(password);
		log.setAction("Login into website");
		log.setLogTime(new Date());
		log.setExpected(expectedResult);
		log.setActual(currentUrl);
		
		assertEquals(expectedResult, currentUrl);
		
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

	@DataProvider(name="loginData")
	public Object[][] data() throws Exception {
		XSSFWorkbook xssfWorkbook = ExcelUtils.getWorkbook(SRC);
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Login_Data");
		Object[][] data = ExcelUtils.readSheetData(xssfSheet);
		return data;
	}
}
