package com.poly.AutomationTest;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.poly.TestData.RegisterData;
import com.poly.Utils.ExcelUtils;

public class RegisterTest {
	private WebDriver webDriver;

	private final String SRC = ExcelUtils.DATA_SRC + "RegisterTestData.xlsx";

	private Set<RegisterData> logs;

	private RegisterData log;

	@BeforeClass
	private void init() throws Exception {
		System.setProperty("webdriver.chrome.driver", ExcelUtils.CHROME_DRIVER_SRC);
		logs = new LinkedHashSet<>();
	}

	@BeforeMethod
	private void setUp() throws Exception {
		webDriver = new ChromeDriver();
		webDriver.get("http://localhost:8080/PS14885_ASM_JAVA4/register");
		log = new RegisterData();
	}

	private void processRegister(String lastName, String firstName, String userName, String email, String password,
			String confirmPassword) {
		WebElement lastname = webDriver.findElement(By.xpath("/html/body/div/form/div[1]/div/div[1]/input"));
		lastname.sendKeys(lastName);

		WebElement firstname = webDriver.findElement(By.xpath("/html/body/div/form/div[1]/div/div[2]/input"));
		firstname.sendKeys(firstName);

		WebElement username = webDriver.findElement(By.xpath("/html/body/div/form/div[2]/input"));
		username.sendKeys(userName);

		WebElement mail = webDriver.findElement(By.xpath("/html/body/div/form/div[3]/input"));
		mail.sendKeys(email);

		WebElement pass = webDriver.findElement(By.xpath("/html/body/div/form/div[4]/input"));
		pass.sendKeys(password);

		WebElement confirmPass = webDriver.findElement(By.xpath("/html/body/div/form/div[5]/input"));
		confirmPass.sendKeys(confirmPassword);

		WebElement confirmCheckbox = webDriver.findElement(By.xpath("/html/body/div/form/div[6]/label/input"));
		confirmCheckbox.click();

		WebElement buttonRegister = webDriver.findElement(By.xpath("/html/body/div/form/div[7]/button"));
		buttonRegister.click();
	}

	@Test(dataProvider = "registerData")
	private void multipleRegister(String lastName, String firstName, String userName, String email, String password,
			String confirmPassowrd, String expected) throws Exception {
		processRegister(lastName, firstName, userName, email, password, confirmPassowrd);
		String currentURL = webDriver.getCurrentUrl();
		log.setLastName(lastName);
		log.setFirstName(firstName);
		log.setUserName(userName);
		log.setEmail(email);
		log.setPassword(password);
		log.setConfirmPassword(confirmPassowrd);
		log.setAction("Register Account");
		log.setLogTime(new Date());
		log.setExpected(expected);
		log.setActual(currentURL);
		
		Assert.assertEquals(expected, currentURL);
	}
	
	@AfterMethod
	private void tearDown(ITestResult iTestResult) throws Exception {
		log.setTestMethod(iTestResult.getName());
		switch(iTestResult.getStatus()) {
		case ITestResult.SUCCESS:
			log.setStatus("PASS");
			break;
		case ITestResult.FAILURE:
			log.setStatus("FAIL");
			log.setException(iTestResult.getThrowable().getMessage());
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
	private void destroy() throws Exception {
		log.writeLog(SRC, "Test_Result", logs);
	}
	
	@DataProvider(name = "registerData")
	private Object[][] data() throws Exception {
		XSSFWorkbook xssfWorkbook = ExcelUtils.getWorkbook(SRC);
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Register_Data");
		Object[][] data = ExcelUtils.readSheetData(xssfSheet);
		return data;
	}
}
