package org.orgselenium.pagefactory.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.orgselenium.pagefactory.pages.LandingPage;
import org.testng.annotations.AfterMethod;

public class DigitasLbiTest {
  public WebDriver driver;
  @Test
  public void testLandingPage() {
	  LandingPage lp = PageFactory.initElements(driver,LandingPage.class);
	  lp.gotoAllLinks();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.navigate().to("http://www.digitaslbi.com/nl/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
