package qa.sensiple.webdrivers.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import qa.sensiple.logfiles.WriteToNotePad;

public class Interrogation {
	static WriteToNotePad writeFile = new WriteToNotePad();
	

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the expected test data for a
	 *       given title page.
	 */

	@SuppressWarnings("static-access")
	public static void getTitle(WebDriver driver, String strTestDataValue) throws IOException {
		
		String strGetTitle = driver.getTitle();
		try {

			if (strGetTitle.equals(strTestDataValue)) {							
				String strStatus = "Page title " + strGetTitle + " and test data" + strTestDataValue
						+ " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {								
				String strStatus = "Page title " + strGetTitle + " and test data" + strTestDataValue
						+ " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "Page title " + strGetTitle + " and test data" + strTestDataValue
					+ " are not verified successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the expected test data for a
	 *       given current URL.
	 */

	@SuppressWarnings("static-access")
	public static void getCurrentURL(WebDriver driver, String strTestDataValue) throws IOException {
		
		String actualUrl = driver.getCurrentUrl();
		try {

			if (actualUrl.equals(strTestDataValue)) {
				String strStatus = "Verification of given " + actualUrl + " and test data" + strTestDataValue
						+ " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "Verification of given " + actualUrl + " and test data" + strTestDataValue
						+ " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "Verification of given " + actualUrl + " and test data" + strTestDataValue
					+ " are not verified successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the expected test data for a
	 *       given Page Source.
	 */

	@SuppressWarnings("static-access")
	public static void getPageSource(WebDriver driver, String strTestDataValue) throws IOException {
		
		String actualUrl = driver.getPageSource();
		try {

			if (actualUrl.equals(strTestDataValue)) {			
				String strStatus = "Verification of given " + actualUrl + " and test data" + strTestDataValue
						+ " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "Verification of given " + actualUrl + " and test data" + strTestDataValue
						+ " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
						String strStatus = "Verification of given " + actualUrl + " and test data" + strTestDataValue
					+ " are not verified successfully and exception is thrown";
						System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the expected test data for a
	 *       given Text Page Value.
	 */

	@SuppressWarnings("static-access")
	public static void getTextValue_By_Id(WebDriver driver, String strLocatorElement, String strTestDataValue)
			throws IOException {
		
		if (strLocatorElement != null) {
			String strGetTextValue = driver.findElement(By.id(strLocatorElement)).getText();
			if (strGetTextValue == strTestDataValue) {
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getTextValue_By_xpath(WebDriver driver, String strLocatorElement, String strTestDataValue)
			throws IOException {
		
		if (strLocatorElement != null) {
			String strGetTextValue = driver.findElement(By.xpath(strLocatorElement)).getText();
			if (strGetTextValue == strTestDataValue) {
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getTextValue_By_className(WebDriver driver, String strLocatorElement, String strTestDataValue)
			throws IOException {
		
		if (strLocatorElement != null) {
			String strGetTextValue = driver.findElement(By.className(strLocatorElement)).getText();
			if (strGetTextValue == strTestDataValue) {			
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
								
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getTextValue_By_name(WebDriver driver, String strLocatorElement, String strTestDataValue)
			throws IOException {
		
		if (strLocatorElement != null) {
			String strGetTextValue = driver.findElement(By.name(strLocatorElement)).getText();
			if (strGetTextValue == strTestDataValue) {
				System.out.println("Driver instance of getTextValue is found");
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				System.out.println("Driver instance of getTextValue is found");
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getTextValue_By_linkText(WebDriver driver, String strLocatorElement, String strTestDataValue)
			throws IOException {
		
		if (strLocatorElement != null) {
			String strGetTextValue = driver.findElement(By.linkText(strLocatorElement)).getText();
			if (strGetTextValue == strTestDataValue) {
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				String strStatus = "Verification of given text " + strGetTextValue + " and test data" + strTestDataValue
						+ " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the expected test data for a
	 *       given Attribute Page Value.
	 */

	@SuppressWarnings("static-access")
	public static void getAttributeValue_By_Id(WebDriver driver, String strLocatorElement, String strTestDataValue)
			throws IOException {
		
		if (strLocatorElement != null) {
			String strGetAttributeValue = driver.findElement(By.id(strLocatorElement)).getAttribute(strTestDataValue);
			if (strGetAttributeValue != null) {
				System.out.println("Driver instance of getTextValue is found");
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getAttributeValue_By_xpath(WebDriver driver, String strLocatorElement, String strTestDataValue)
			throws IOException {
		if (strLocatorElement != null) {
			String strGetAttributeValue = driver.findElement(By.xpath(strLocatorElement))
					.getAttribute(strTestDataValue);
			if (strGetAttributeValue != null) {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getAttributeValue_By_className(WebDriver driver, String strLocatorElement,
			String strTestDataValue) throws IOException {
		if (strLocatorElement != null) {
			String strGetAttributeValue = driver.findElement(By.className(strLocatorElement))
					.getAttribute(strTestDataValue);
			if (strGetAttributeValue != null) {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getAttributeValue_By_cssSelector(WebDriver driver, String strLocatorElement,
			String strTestDataValue) throws IOException {
		
		if (strLocatorElement != null) {
			String strGetAttributeValue = driver.findElement(By.cssSelector(strLocatorElement))
					.getAttribute(strTestDataValue);
			if (strGetAttributeValue != null) {			
					String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are verified successfully";
					System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getAttributeValue_By_name(WebDriver driver, String strLocatorElement, String strTestDataValue)
			throws IOException {
		if (strLocatorElement != null) {
			String strGetAttributeValue = driver.findElement(By.name(strLocatorElement)).getAttribute(strTestDataValue);
			if (strGetAttributeValue != null) {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getAttributeValue_By_linkText(WebDriver driver, String strLocatorElement,
			String strTestDataValue) throws IOException {
		
		if (strLocatorElement != null) {
			String strGetAttributeValue = driver.findElement(By.linkText(strLocatorElement))
					.getAttribute(strTestDataValue);
			if (strGetAttributeValue != null) {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			} else {
				String strStatus = "Verification of given attribute " + strGetAttributeValue + " and test data"
						+ strTestDataValue + " are not verified successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);

			}
		}

	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the expected test data for a
	 *       given Attribute Page Value.
	 */

	@SuppressWarnings({ "unused", "static-access" })
	public static void getTagNameValue(WebDriver driver, String strTagNameObject) throws IOException {
		
		List<WebElement> getAllTagName = driver.findElements(By.tagName(strTagNameObject));
		System.out.println("Links count is: " + getAllTagName.size());
		if (getAllTagName != null) {
			for (int i = 0; i < getAllTagName.size(); i++) {
				String strStatus = "Verification of given tagnames are " + getAllTagName.get(i).getText() +"are listed";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}

		} else {
			String strStatus = "Verification of given tagnames are not listed";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify if the element is found or
	 *       not - Enabled
	 */

	@SuppressWarnings("static-access")
	public static void getORLocatorEnabled_By_Id(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		
		try {
			boolean objectLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			if (objectLocators == true) {
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorEnabled_By_xpath(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		
		try {
			boolean objectLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
			if (objectLocators == true) {
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorEnabled_By_className(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
			if (objectLocators == true) {
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorEnabled_By_cssSelector(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
			if (objectLocators == true) {
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorEnabled_By_name(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorEnabled_By_linkText(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify if the element is found or
	 *       not - Displayed
	 */

	@SuppressWarnings("static-access")
	public static void getORLocatorDisplayed_By_Id(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element for " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element for " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorDisplayed_By_xpath(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
		
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorDisplayed_By_className(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorDisplayed_By_cssSelector(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorDisplayed_By_name(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorDisplayed_By_linkText(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		
		try {
			boolean objectLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify if the element is found or
	 *       not - Selected
	 */

	@SuppressWarnings("static-access")
	public static void getORLocatorSelected_By_Id(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.id(strLocatorElement)).isSelected();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorSelected_By_xpath(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		
		try {
			boolean objectLocators = driver.findElement(By.xpath(strLocatorElement)).isSelected();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
			
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorSelected_By_className(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.className(strLocatorElement)).isSelected();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorSelected_By_cssSelector(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		
		try {
			boolean objectLocators = driver.findElement(By.cssSelector(strLocatorElement)).isSelected();
			if (objectLocators == true) {
	
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
			
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorSelected_By_name(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.name(strLocatorElement)).isSelected();
			if (objectLocators == true) {
			
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method

	@SuppressWarnings("static-access")
	public static void getORLocatorSelected_By_linkText(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		

		try {
			boolean objectLocators = driver.findElement(By.linkText(strLocatorElement)).isSelected();
			if (objectLocators == true) {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void selectMultipleValues_By_Id(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		
		ArrayList<String> DropdownValues = new ArrayList<String>();
		try {
			Select clickThis = new Select(driver.findElement(By.id(strLocatorElement)));
			if (strLocatorElement!=null && clickThis!=null) {
				for(int i=0;i<clickThis.getOptions().size();i++){
					DropdownValues.add(i,clickThis.getOptions().get(i).getText());
					clickThis.selectByIndex(i); 
					
					String strStatus = "Multiple List Values  " + clickThis.getOptions().size() + " is selected successfully";
					System.out.println(strStatus);
					writeFile.writeAllLines(strStatus);
					break; 
					}
				
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void selectMultipleValues_By_xpath(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		
		ArrayList<String> DropdownValues = new ArrayList<String>();
		try {
			Select clickThis = new Select(driver.findElement(By.xpath(strLocatorElement)));
			if (strLocatorElement!=null && clickThis!=null) {
				for(int i=0;i<clickThis.getOptions().size();i++){
					DropdownValues.add(i,clickThis.getOptions().get(i).getText());
					clickThis.selectByIndex(i); 
					
					String strStatus = "Multiple List Values  " + clickThis.getOptions().size() + " is selected successfully";
					System.out.println(strStatus);
					writeFile.writeAllLines(strStatus);
					break; 
					}
				
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void selectMultipleValues_By_className(WebDriver driver, String strLocatorElement,
			String strApplFieldName) throws IOException {
		
		ArrayList<String> DropdownValues = new ArrayList<String>();
		try {
			Select clickThis = new Select(driver.findElement(By.className(strLocatorElement)));
			if (strLocatorElement!=null && clickThis!=null) {
				for(int i=0;i<clickThis.getOptions().size();i++){
					DropdownValues.add(i,clickThis.getOptions().get(i).getText());
					clickThis.selectByIndex(i); 
					
					String strStatus = "Multiple List Values  " + clickThis.getOptions().size() + " is selected successfully";
					System.out.println(strStatus);
					writeFile.writeAllLines(strStatus);
					break; 
					}
				
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("The Locator Element " + strApplFieldName + " is not enabled successfully");
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not enabled successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method




@SuppressWarnings({ "unused", "static-access" })
public static void selectMultipleValues_By_name(WebDriver driver, String strLocatorElement,
		String strApplFieldName) throws IOException {
	
	ArrayList<String> DropdownValues = new ArrayList<String>();
	try {
		Select clickThis = new Select(driver.findElement(By.name(strLocatorElement)));
		if (strLocatorElement!=null && clickThis!=null) {
			for(int i=0;i<clickThis.getOptions().size();i++){
				DropdownValues.add(i,clickThis.getOptions().get(i).getText());
				clickThis.selectByIndex(i); 
				
				String strStatus = "Multiple List Values  " + clickThis.getOptions().size() + " is selected successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				break; 
				}
			
		} else {
			
			String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}
	} catch (IOException e) {
		
		String strStatus = "The Locator Element " + strApplFieldName
				+ " is not enabled successfully and exception is thrown";
		System.out.println(strStatus);
		writeFile.writeAllLines(strStatus);
	}

}// End Method



@SuppressWarnings({ "unused", "static-access" })
public static void selectMultipleValues_By_linkText(WebDriver driver, String strLocatorElement,
		String strApplFieldName) throws IOException {
	
	ArrayList<String> DropdownValues = new ArrayList<String>();
	try {
		Select clickThis = new Select(driver.findElement(By.linkText(strLocatorElement)));
		if (strLocatorElement!=null && clickThis!=null) {
			for(int i=0;i<clickThis.getOptions().size();i++){
				DropdownValues.add(i,clickThis.getOptions().get(i).getText());
				clickThis.selectByIndex(i); 
				String strStatus = "Multiple List Values  " + clickThis.getOptions().size() + " is selected successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
				break; 
				}
			
		} else {
			
			String strStatus = "The Locator Element " + strApplFieldName + " is not enabled successfully";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}
	} catch (IOException e) {
		
		String strStatus = "The Locator Element " + strApplFieldName
				+ " is not enabled successfully and exception is thrown";
		System.out.println(strStatus);
		writeFile.writeAllLines(strStatus);
	}

}// End Method









}// End class

