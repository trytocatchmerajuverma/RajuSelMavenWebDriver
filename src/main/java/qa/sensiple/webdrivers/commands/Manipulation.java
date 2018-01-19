package qa.sensiple.webdrivers.commands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import qa.sensiple.logfiles.WriteToNotePad;

public class Manipulation {
	static WriteToNotePad writeFile = new WriteToNotePad();
	

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the click the particular element of given application
	 */

	@SuppressWarnings("static-access")
	public static void click_By_Id(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.id(strLocatorElement)).click();
				String strStatus = "The Locator Element " + strApplFieldName + " is clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "The Locator Element " + strApplFieldName + " is not clicked successfully";
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not clicked successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void click_By_xpath(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.xpath(strLocatorElement)).click();
				String strStatus = "The Locator Element " + strApplFieldName + " is clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				System.out.println("Driver instance of getORLocatorEnabled is not found");
				String strStatus = "The Locator Element " + strApplFieldName + " is not clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not clicked successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void click_By_className(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.className(strLocatorElement)).click();
				String strStatus = "The Locator Element " + strApplFieldName + " is clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "The Locator Element " + strApplFieldName + " is not clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not clicked successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void click_By_cssSelector(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.cssSelector(strLocatorElement)).click();
				
				String strStatus = "The Locator Element " + strApplFieldName + " is clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {				
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not clicked successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void click_By_name(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.cssSelector(strLocatorElement)).click();
				
				String strStatus = "The Locator Element " + strApplFieldName + " is clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
		
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not clicked successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void click_By_linkText(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.cssSelector(strLocatorElement)).click();
				
				String strStatus = "The Locator Element " + strApplFieldName + " is clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
		
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not clicked successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the clear the particular element of given application
	 */
	
	@SuppressWarnings("static-access")
	public static void clear_By_Id(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		
		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.id(strLocatorElement)).clear();
				
				String strStatus = "The Locator Element " + strApplFieldName + " is cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not cleared successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void clear_By_xpath(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.xpath(strLocatorElement)).clear();
				String strStatus = "The Locator Element " + strApplFieldName + " is cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "The Locator Element " + strApplFieldName + " is not clicked successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not cleared successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void clear_By_className(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.className(strLocatorElement)).clear();
				String strStatus = "The Locator Element " + strApplFieldName + " is cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "The Locator Element " + strApplFieldName + " is not cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not cleared successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void clear_By_cssSelector(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
	

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.cssSelector(strLocatorElement)).clear();
				String strStatus = "The Locator Element " + strApplFieldName + " is cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {				
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not cleared successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void clear_By_name(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.cssSelector(strLocatorElement)).clear();
			
				String strStatus = "The Locator Element " + strApplFieldName + " is cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus = "The Locator Element " + strApplFieldName + " is not cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not cleared successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void clear_By_linkText(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		
		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.cssSelector(strLocatorElement)).clear();
				String strStatus = "The Locator Element " + strApplFieldName + " is cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "The Locator Element " + strApplFieldName + " is not cleared successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "The Locator Element " + strApplFieldName
					+ " is not cleared successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the send the values to application text box area
	 */
	
	@SuppressWarnings("static-access")
	public static void sendkeys_By_Id(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
	

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.id(strLocatorElement)).clear();
				driver.findElement(By.id(strLocatorElement)).sendKeys(strTestDataInput);
				
				String strStatus = "Entered Value of " + strApplFieldName + " is set successfully";
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully";
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void sendkeys_By_xpath(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.xpath(strLocatorElement)).clear();
				driver.findElement(By.xpath(strLocatorElement)).sendKeys(strTestDataInput);
				
				String strStatus = "Entered Value of " + strApplFieldName + " is set successfully";
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully";
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void sendkeys_By_className(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.className(strLocatorElement)).clear();
				driver.findElement(By.className(strLocatorElement)).sendKeys(strTestDataInput);
				String strStatus = "Entered Value of " + strApplFieldName + " is set successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void sendkeys_By_cssSelector(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.cssSelector(strLocatorElement)).clear();
				driver.findElement(By.cssSelector(strLocatorElement)).sendKeys(strTestDataInput);
				String strStatus = "Entered Value of " + strApplFieldName + " is set successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void sendkeys_By_name(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.name(strLocatorElement)).clear();
				driver.findElement(By.name(strLocatorElement)).sendKeys(strTestDataInput);
				
				String strStatus = "Entered Value of " + strApplFieldName + " is set successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void sendkeys_By_linkText(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		
		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.linkText(strLocatorElement)).clear();
				driver.findElement(By.linkText(strLocatorElement)).sendKeys(strTestDataInput);
				String strStatus = "Entered Value of " + strApplFieldName + " is set successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	
	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the send the values to application text box area
	 */
	
	@SuppressWarnings("static-access")
	public static void submit_By_Id(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.id(strLocatorElement)).submit();				
				
				String strStatus = ""+ strApplFieldName + " is submitted successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	
	@SuppressWarnings("static-access")
	public static void submit_By_xpath(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.id(strLocatorElement)).submit();			
				
				String strStatus = ""+ strApplFieldName + " is submitted successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void submit_By_className(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.className(strLocatorElement)).submit();	
				
				String strStatus = ""+ strApplFieldName + " is submitted successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}
	}//End Method
	
	@SuppressWarnings("static-access")
	public static void submit_By_cssSelector(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		

		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.cssSelector(strLocatorElement)).submit();					
				String strStatus = ""+ strApplFieldName + " is submitted successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}
	}//End Method
	
	@SuppressWarnings("static-access")
	public static void submit_By_name(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
		
		try {
			
			if (strLocatorElement!=null) {
				driver.findElement(By.name(strLocatorElement)).click();				
				String strStatus = ""+ strApplFieldName + " is submitted successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			System.out.println("Entered Value of " + strApplFieldName + " is not set successfully");
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			writeFile.writeAllLines(strStatus);
		}
	}//End Method
	
	@SuppressWarnings("static-access")
	public static void submit_By_linkText(WebDriver driver, String strLocatorElement, String strApplFieldName)
			throws IOException {
	
		try {
			
			if (strLocatorElement!=null) {
				
				String strStatus = ""+ strApplFieldName + " is submitted successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			} else {
				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
		
			String strStatus = "Entered Value of " + strApplFieldName + " is not set successfully and exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}
	}//End Method
	
	
	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is to verify the send the values to application text box area
	 */
	
	@SuppressWarnings("static-access")
	public static void selectByVisibleText_By_Id(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		
        ArrayList<String> DropdownValues = new ArrayList<String>();
		try {			
			if (strLocatorElement!=null) {
				Select selectValues = new Select(driver.findElement(By.id(strLocatorElement)));					
				for(int i=0;i<selectValues.getOptions().size();i++){
					DropdownValues.add(i,selectValues.getOptions().get(i).getText());
					if(selectValues.getOptions().get(i).getText().equalsIgnoreCase(strTestDataInput)){ 
						selectValues.selectByVisibleText(strTestDataInput); 						
						String strStatus = "Value of  "+strTestDataInput+ "from "+ strApplFieldName + " is selected successfully";
						System.out.println(strStatus);
						writeFile.writeAllLines(strStatus);
						break; 
						} 
					}			
				
			} else {				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = ""+ strApplFieldName + " exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings("static-access")
	public static void selectByVisibleText_By_xpath(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		
        ArrayList<String> DropdownValues = new ArrayList<String>();
		try {			
			if (strLocatorElement!=null) {
				Select selectValues = new Select(driver.findElement(By.xpath(strLocatorElement)));					
				for(int i=0;i<selectValues.getOptions().size();i++){
					DropdownValues.add(i,selectValues.getOptions().get(i).getText());
					if(selectValues.getOptions().get(i).getText().equalsIgnoreCase(strTestDataInput)){ 
						selectValues.selectByVisibleText(strTestDataInput); 						
						String strStatus = "Value of  "+strTestDataInput+ "from "+ strApplFieldName + " is selected successfully";
						System.out.println(strStatus);
						writeFile.writeAllLines(strStatus);
						break; 
						} 
					}			
				
			} else {				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = ""+ strApplFieldName + " exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void selectByVisibleText_By_className(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		
        ArrayList<String> DropdownValues = new ArrayList<String>();
		try {			
			if (strLocatorElement!=null) {
				Select selectValues = new Select(driver.findElement(By.className(strLocatorElement)));					
				for(int i=0;i<selectValues.getOptions().size();i++){
					DropdownValues.add(i,selectValues.getOptions().get(i).getText());
					if(selectValues.getOptions().get(i).getText().equalsIgnoreCase(strTestDataInput)){ 
						selectValues.selectByVisibleText(strTestDataInput); 						
						String strStatus = "Value of  "+strTestDataInput+ "from "+ strApplFieldName + " is selected successfully";
						System.out.println(strStatus);
						writeFile.writeAllLines(strStatus);
						break; 
						} 
					}			
				
			} else {				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = ""+ strApplFieldName + " exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void selectByVisibleText_By_cssSelector(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		
        ArrayList<String> DropdownValues = new ArrayList<String>();
		try {			
			if (strLocatorElement!=null) {
				Select selectValues = new Select(driver.findElement(By.cssSelector(strLocatorElement)));					
				for(int i=0;i<selectValues.getOptions().size();i++){
					DropdownValues.add(i,selectValues.getOptions().get(i).getText());
					if(selectValues.getOptions().get(i).getText().equalsIgnoreCase(strTestDataInput)){ 
						selectValues.selectByVisibleText(strTestDataInput); 						
						String strStatus = "Value of  "+strTestDataInput+ "from "+ strApplFieldName + " is selected successfully";
						System.out.println(strStatus);
						writeFile.writeAllLines(strStatus);
						break; 
						} 
					}			
				
			} else {				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = ""+ strApplFieldName + " exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void selectByVisibleText_By_name(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		
        ArrayList<String> DropdownValues = new ArrayList<String>();
		try {			
			if (strLocatorElement!=null) {
				Select selectValues = new Select(driver.findElement(By.name(strLocatorElement)));					
				for(int i=0;i<selectValues.getOptions().size();i++){
					DropdownValues.add(i,selectValues.getOptions().get(i).getText());
					if(selectValues.getOptions().get(i).getText().equalsIgnoreCase(strTestDataInput)){ 
						selectValues.selectByVisibleText(strTestDataInput); 						
						String strStatus = "Value of  "+strTestDataInput+ "from "+ strApplFieldName + " is selected successfully";
						System.out.println(strStatus);
						writeFile.writeAllLines(strStatus);
						break; 
						} 
					}			
				
			} else {				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = ""+ strApplFieldName + " exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	
	@SuppressWarnings("static-access")
	public static void selectByVisibleText_By_linkText(WebDriver driver, String strLocatorElement, String strApplFieldName, String strTestDataInput)
			throws IOException {
		
        ArrayList<String> DropdownValues = new ArrayList<String>();
		try {			
			if (strLocatorElement!=null) {
				Select selectValues = new Select(driver.findElement(By.linkText(strLocatorElement)));					
				for(int i=0;i<selectValues.getOptions().size();i++){
					DropdownValues.add(i,selectValues.getOptions().get(i).getText());
					if(selectValues.getOptions().get(i).getText().equalsIgnoreCase(strTestDataInput)){ 
						selectValues.selectByVisibleText(strTestDataInput); 						
						String strStatus = "Value of  "+strTestDataInput+ "from "+ strApplFieldName + " is selected successfully";
						System.out.println(strStatus);
						writeFile.writeAllLines(strStatus);
						break; 
						} 
					}			
				
			} else {				
				
				String strStatus =""+ strApplFieldName + " is submitted not successfully";
				System.out.println(strStatus);
				writeFile.writeAllLines(strStatus);
			}
		} catch (IOException e) {
			String strStatus = ""+ strApplFieldName + " exception is thrown";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}

	}// End Method
	
	@SuppressWarnings({ "null", "static-access" })
	public static void keyWordsActions(String strActionKeywords) throws AWTException, IOException {
		Robot robot = null;
		try {
			switch(strActionKeywords) {
		case "UpArrow":
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
			String strStatus =" "+ strActionKeywords + " is pressed up successfully";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
			break;
			
		case "DownArrow":
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			String strPrintStatus =" "+ strActionKeywords + " is pressed down successfully";
			System.out.println(strPrintStatus);
			writeFile.writeAllLines(strPrintStatus);
			break;
			}
		}catch(Exception e) {			
			String strStatus =""+ strActionKeywords + " is failed";
			System.out.println(strStatus);
			writeFile.writeAllLines(strStatus);
		}
		
	}
	
	
	
	
	
	

}//End Class
