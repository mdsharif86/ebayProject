package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base;

public class verifyCellPhonesCount extends Base {
	
	@Test
	public void test_verifyCellPhonesCount() throws InterruptedException {
		
		navigateURL(configProp.getProperty("url"));

		// option[text()= 'Cameras & Photo']
		
		//click(By.xpath(locatorProp.getProperty("search_Box")));
		//click(By.xpath(locatorProp.getProperty("select_cellphones")));
		//click(By.xpath(locatorProp.getProperty("click_search_button")));
		Thread.sleep(2000);
		//click(By.xpath(locatorProp.getProperty("shop_by_item_iphone")));
		//click(By.xpath(locatorProp.getProperty("shop_by_iphone12_pro")));
		sendKeys(By.xpath(locatorProp.getProperty("search_Box")),"camera" + Keys.ENTER);

		Thread.sleep(2000);
		List<WebElement> cameras = driver.findElements(By.xpath(locatorProp.getProperty("list_camera")));
		// String cameraList =
		// getText(By.xpath(locatorProp.getProperty("lsit_of_camera_per_page")));

		Thread.sleep(2000);
		int result = cameras.size();
		System.out.println("Length: " + result);
		//Hard Assertion
		Assert.assertEquals(result, 65); //false
		Assert.assertTrue(55==65); //result failed
		Assert.assertFalse(55==65); //result passed
		System.out.println("$$$$$$$$$$");
		String res=getText(By.xpath(locatorProp.getProperty("result_camera")));
		
		//Soft Assertion
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(55, 65);  //false
		System.out.println("@@@@@@@@@@@@@@@@@@");
		
		System.out.println(res);
	}
	

}
