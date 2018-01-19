package qa.sensiple.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import qa.sensiple.directories.FileDirectories;
import qa.sensiple.logfiles.WriteToNotePad;
import qa.sensiple.webdrivers.commands.Manipulation;
import qa.sensiple.webdrivers.commands.Navigate;


public class LMSTestNG {
	// @SuppressWarnings("unused")
	private static WebDriver driver = null;
	static WriteToNotePad writeFile = new WriteToNotePad();

	@BeforeClass
	public void startUp() throws IOException, InterruptedException {
		WriteToNotePad delExistingFile = new WriteToNotePad();
		delExistingFile.deleteLogFiles();
		Properties prop = new Properties();
		prop.load(new FileReader(
				FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE + FileDirectories.CONFIGURATION_PROP_DIRECTORIES));
		System.out.println("FilePathDirectories Properties File :- " + FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE
				+ FileDirectories.CONFIGURATION_PROP_DIRECTORIES);
		String strBrowserValue = prop.getProperty("browser").trim();
		System.out.println("strBrowserValue :- " + strBrowserValue);
		if (strBrowserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(FileDirectories.WEBDRIVER_FIREFOX_GECKO_SYNTAX,
					FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE + FileDirectories.FIREFOX_DRIVER_DIRECTORIES);
			driver = new FirefoxDriver();
			System.out.println("Broswer started up successfully for :- " + strBrowserValue);
			String writeBrowserValue = "Broswer started up successfully for " + strBrowserValue;
			WriteToNotePad.writeAllLines(writeBrowserValue);
		} else if (strBrowserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(FileDirectories.WEBDRIVER_CHROME_SYNTAX,
					FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE + FileDirectories.CHROME_DRIVER_DIRECTORIES);
			driver = new ChromeDriver();
			System.out.println("strBrowserValue started up successfully for :- " + strBrowserValue);
			String writeBrowserValue = "strBrowserValue started up successfully for :- " + strBrowserValue;
			WriteToNotePad.writeAllLines(writeBrowserValue);

		}
		String strGetURL_Link = prop.getProperty("getURL").trim();
		if (strGetURL_Link != null) {
			Navigate.navigateGetUrl(driver, strGetURL_Link);
		} else {

		}
		Navigate.navigateToMaximizeWindow(driver);

	}// End Method - BeforeClass

	@SuppressWarnings("static-access")
	@Test
	public void sensipleLogin() throws InterruptedException, IOException, BiffException {
		ExtentReports extent = ExtentReports.get(LMSTestNG.class);
		extent.init(FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE + FileDirectories.SENSIPLE_HTML_REPORTS_DIRECTORIES,
				true);
		Properties prop = null;
		prop = new Properties();
		extent.startTest("Sensiple Scenario 1 - Login Button");
		try {
			prop.load(new FileReader(
					FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE + FileDirectories.CONFIGURATION_PROP_DIRECTORIES));
			System.out.println("FilePathDirectories Properties File :- " + FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE
					+ FileDirectories.FILEPATH_PROP_DIRECTORIES);
		} catch (FileNotFoundException e) {
			System.out.println("No Properties file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading properties file");
			e.printStackTrace();
		}

		try {
			prop.load(new FileReader(
					FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE + FileDirectories.ORLOCATORS_PROP_DIRECTORIES));
			System.out.println("OR Properties File :- " + FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE
					+ FileDirectories.ORLOCATORS_PROP_DIRECTORIES);
		} catch (FileNotFoundException e) {
			System.out.println("No OR Properties file found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading properties file - OR");
			e.printStackTrace();
		}

		String userNameOR = prop.getProperty("Username_xpath").trim();
		System.out.println("getUserNameObjectLocator :: " + userNameOR);
		String passwordOR = prop.getProperty("Password_xpath").trim();
		System.out.println("getPasswordNameObjectLocator :: " + passwordOR);

		String signButtonOR = prop.getProperty("SignButton_xpath").trim();
		System.out.println("signButtonOR :: " + signButtonOR);
		String createRequestOR = prop.getProperty("CreateRequest_xpath").trim();
		System.out.println("createRequestOR :: " + createRequestOR);

		String LeaveRequest_xpath = prop.getProperty("LeaveRequest_xpath").trim();
		System.out.println("LeaveRequest_xpath :: " + LeaveRequest_xpath);
		String LeaveTypeDropdown_xpath = prop.getProperty("LeaveTypeDropdown_xpath").trim();
		System.out.println("LeaveTypeDropdown_xpath :: " + LeaveTypeDropdown_xpath);

		FileInputStream excelWorkBookFilePath = new FileInputStream(
				FileDirectories.ECLIPSE_WORKSPACE_STRUCTURE + FileDirectories.READ_EXCEL_TESTDATA_FILE);
		Workbook wb = Workbook.getWorkbook(excelWorkBookFilePath);
		jxl.Sheet sh = wb.getSheet("Sheet1");
		int allRowsCount = sh.getRows();
		System.out.println("No of Rows:" + allRowsCount);
		for (int row = 1; row < allRowsCount; row++) {
			String getUserNameValue = sh.getCell(0, row).getContents();
			System.out.println("UserName Value :- " + getUserNameValue);

			String getPasswordValue = sh.getCell(1, row).getContents();
			System.out.println("Password Value :- " + getPasswordValue);

			String getLeaveTypeDropdownValue = sh.getCell(2, row).getContents();
			System.out.println("LeaveDropdown Value :- " + getPasswordValue);

			if (userNameOR != null) {
				if (getUserNameValue != null) {
					Manipulation.sendkeys_By_xpath(driver, userNameOR, "UserNameTextBox", getUserNameValue);
					extent.log(LogStatus.INFO, "Username value is Logged Successfully");
					extent.log(LogStatus.PASS, "Username value is Logged Successfully");
				} else {
					extent.log(LogStatus.ERROR, "UserName value is not Logged Successfully");
					extent.log(LogStatus.FAIL, "UserName value is not Logged Successfully");
				}
			} else {
				extent.log(LogStatus.ERROR, "UserName object is not found");
				extent.log(LogStatus.FAIL, "UserName object is not found");
				String strStatus = "UserName object is not found";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}

			if (passwordOR != null) {
				if (getPasswordValue != null) {

					Manipulation.sendkeys_By_xpath(driver, passwordOR, "PasswordTextBox", getPasswordValue);
					extent.log(LogStatus.INFO, "Password value is Logged Successfully");
					extent.log(LogStatus.PASS, "Password value is Logged Successfully");

				} else {
					extent.log(LogStatus.ERROR, "Password value is not Logged Successfully");
					extent.log(LogStatus.FAIL, "Password value is not Logged Successfully");

				}
			} else {
				extent.log(LogStatus.ERROR, "Password object is not found");
				extent.log(LogStatus.FAIL, "Password object is not found");
				String printLogValue = "Password object " + passwordOR + " is not entered successfully";
				WriteToNotePad.writeAllLines(printLogValue);
			}

			if (signButtonOR != null) {
				Manipulation.click_By_xpath(driver, signButtonOR, "SignInButton");
				extent.log(LogStatus.INFO, "Sign Button is clicked successfully");
				extent.log(LogStatus.PASS, "Sign Button is clicked successfully");

			} else {
				extent.log(LogStatus.ERROR, "Sign Button is not clicked successfully");
				extent.log(LogStatus.FAIL, "Sign Button is not clicked successfully");

			}

			Thread.sleep(3000);

			extent.startTest("Sensiple Scenario 2 - Leave Request");

			if (createRequestOR != null) {
				Manipulation.click_By_xpath(driver, createRequestOR, "Create Request");
				extent.log(LogStatus.INFO, "Create Request is clicked successfully");
				extent.log(LogStatus.PASS, "Create Request is clicked successfully");

			} else {
				extent.log(LogStatus.ERROR, "Create Request is not clicked successfully");
				extent.log(LogStatus.FAIL, "Create Request is not clicked successfully");

			}

			if (LeaveRequest_xpath != null) {
				Manipulation.click_By_xpath(driver, LeaveRequest_xpath, "Leave request");
				extent.log(LogStatus.INFO, "Leave Request is clicked successfully");
				extent.log(LogStatus.PASS, "Leave Request is clicked successfully");

			} else {
				extent.log(LogStatus.ERROR, "Leave Request is not clicked successfully");
				extent.log(LogStatus.FAIL, "Leave Request is not clicked successfully");

			}

			if (LeaveTypeDropdown_xpath != null) {
				Manipulation.selectByVisibleText_By_Id(driver, LeaveTypeDropdown_xpath, "Leave Type",
						getLeaveTypeDropdownValue);

				if (LeaveTypeDropdown_xpath == getLeaveTypeDropdownValue) {
					extent.log(LogStatus.INFO,
							"Leave Type Dropdown value " + getLeaveTypeDropdownValue + " is selected successfully");
					extent.log(LogStatus.PASS,
							"Leave Type Dropdown value " + getLeaveTypeDropdownValue + " is selected successfully");

				} else {
					extent.log(LogStatus.INFO,
							"Leave Type Dropdown value " + getLeaveTypeDropdownValue + " is not selected successfully");
					extent.log(LogStatus.PASS,
							"Leave Type Dropdown value " + getLeaveTypeDropdownValue + " is not selected successfully");

				}

			} else {
				extent.log(LogStatus.ERROR, "Leave Request is not clicked successfully");
				extent.log(LogStatus.FAIL, "Leave Request is not clicked successfully");

			}
		} // For Loop

	}// End Method for sensipleLogin()

	@AfterClass
	public void closebrowser() {
		System.out.print("Browser closed");
		driver.close();
	}

}// End Class
