package org.orgselenium.pagefactory.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.orgselenium.pagefactory.utilities.TestUtilities;
import org.testng.Assert;

import static org.junit.Assert.*;

public class LandingPage {
	WebDriver driver;
	String pageTitle="Een marketing & technologie bureau voor de digitale wereld - DigitasLBi";
	@FindBy (xpath ="//*[@id='where-we-are']/ul")
	private WebElement where_we_are;
	
			
public LandingPage(WebDriver driver){
	this.driver = driver;
	Assert.assertEquals(pageTitle,driver.getTitle());
}
	
public void gotoAllLinks(){
	TestUtilities testUtil = new TestUtilities();
	List<WebElement> countries = where_we_are.findElements(By.tagName("a"));
	List<String> actualcountries = Arrays.asList(new String[]
			{"http://www.digitaslbi.com/global/",
					"http://www.digitaslbi.com/us/",
					"http://www.digitaslbi.com/be/",
					"http://www.digitaslbi.com/dk/",
					"http://www.digitaslbi.com/fr/",
					"http://www.digitaslbi.com/de/",
					"http://www.digitaslbi.com/it/",
					"http://www.digitaslbi.com/nl/",
					"http://www.digitaslbi.com/no/",
					"http://www.digitaslbi.com/es/",
					"http://www.digitaslbi.com/se/",
					"http://www.digitaslbi.com/ch/",
					"http://www.digitaslbi.com/uk/",
					"http://www.digitaslbi.com/au/",
					"http://www.digitaslbi.com/global/",
					"http://www.digitaslbi.com/hk/",
					"http://www.digitaslbi.com/in/",
					"http://www.digitaslbi.com/sg/",
					"http://www.digitaslbi.com/mena/",
					"http://www.liquorice.co.za/"
			});
	List<String> arr_countries = new ArrayList<String>();
	for (int i=0; i < actualcountries.size(); i++){
		arr_countries.add(countries.get(i).getAttribute("href"));
		assertEquals(actualcountries.get(i),arr_countries.get(i));
		assertEquals(200,testUtil.getResponseCode(countries.get(i).getAttribute("href")));
	}
	assertArrayEquals(arr_countries.toArray(), arr_countries.toArray());
}

}