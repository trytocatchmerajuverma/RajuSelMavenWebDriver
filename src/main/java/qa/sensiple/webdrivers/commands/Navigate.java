package qa.sensiple.webdrivers.commands;

import java.io.IOException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import qa.sensiple.logfiles.WriteToNotePad;

public class Navigate {
	static WriteToNotePad writeFile = new WriteToNotePad();
	

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is click back button
	 */

	@SuppressWarnings("static-access")
	public static void backButton(WebDriver driver) throws IOException {
		
		boolean blAlertCheck = false;
		try {
			driver.switchTo().alert();
			blAlertCheck = true;
			if (blAlertCheck == true) {
				driver.navigate().back();
				String strStatus = "Back Button is able to navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			} else {
				String strStatus = "Back Button is able to not navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			}
		} catch (NoAlertPresentException e) {
			String strStatus = "Back Button is able to not navigate successfully";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
			
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void forwardButton(WebDriver driver) throws IOException {
		
		boolean blAlertCheck = false;
		try {
			driver.switchTo().alert();
			blAlertCheck = true;
			if (blAlertCheck == true) {
				driver.navigate().forward();
				String strStatus = "Forward Button is able to navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				

			} else {
				String strStatus = "Forward Button is able to not navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			}
		} catch (NoAlertPresentException e) {
			String strStatus = "Forward Button is able to not navigate successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
			
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void refreshButton(WebDriver driver) throws IOException {
		
		boolean blAlertCheck = false;
		try {
			driver.switchTo().alert();
			blAlertCheck = true;
			if (blAlertCheck == true) {
				driver.navigate().refresh();
				String strStatus = "Refresh Button is able to navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			} else {
				String strStatus = "Refresh Button is able to not navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			}
		} catch (NoAlertPresentException e) {
			String strStatus = "Refresh Button is able to not navigate successfully";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
			
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void navigateToUrl(WebDriver driver, String strURL) throws IOException {
		
		boolean blAlertCheck = false;
		try {
			driver.switchTo().alert();
			blAlertCheck = true;
			if (blAlertCheck == true) {
				driver.navigate().to(strURL);
				String strStatus = "URL " + strURL + " is able to navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			} else {
				String strStatus = "URL " + strURL + " is not able to navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			}
		} catch (NoAlertPresentException e) {
			String strStatus = "URL " + strURL + " is not able to navigate successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
			
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void navigateGetUrl(WebDriver driver, String strURL) throws IOException, InterruptedException {
		try {

			if (strURL != null) {
				driver.get(strURL);
				Thread.sleep(3000);
				String strStatus = "URL " + strURL + " is able to navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			} else {
				String strStatus = "URL " + strURL + " is not able to navigate successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			}
		} catch (NoAlertPresentException e) {
			String strStatus = "URL " + strURL + " is not able to navigate successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
			
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void navigateToMaximizeWindow(WebDriver driver) throws IOException, InterruptedException {
		try {
			if (driver != null) {
				driver.manage().window().maximize();
				Thread.sleep(3000);
				String strStatus = "Window is maximized successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				
			} else {
				String strStatus = "Window is not maximized successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (NoAlertPresentException e) {
			String strStatus = "Window is not maximized successfully";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
			
		}

	}// End Method

}// End class
