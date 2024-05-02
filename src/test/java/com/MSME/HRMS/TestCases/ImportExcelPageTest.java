package com.MSME.HRMS.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.ImportExcelPage;
import com.MSME.HRMS.PageObjects.LoginPage;

public class ImportExcelPageTest extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;
	ImportExcelPage importExcelPage;
	
	public ImportExcelPageTest() {
		super();
	}

	@BeforeMethod
	public ImportExcelPage setUp() throws Throwable {
		initialization();
	    loginPage = new LoginPage();
	    homePage = loginPage.Login(prop.getProperty("tenantname"),prop.getProperty("username"), prop.getProperty("password"));
		return importExcelPage = homePage.clickOnImportExcel();
	}
	
	@Test(priority=1)
	public void assetPageHdrTest() throws Throwable {
		 boolean flag = importExcelPage.verifyImportExcelPageHdr(); 
	     Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void uploadFile() throws Throwable{
		importExcelPage.uploadFile();
		
	}
	
	@Test(priority=2)
	public void downloadSampleFile() throws Throwable{
		importExcelPage.downloadSampleFile();
		
	}
	
	@Test(priority=6)
	public void refresh() throws Throwable{
		importExcelPage.refresh();
		
	}
	
	@Test(priority=4)
	public void uploadWrongFile1() throws Throwable{
		importExcelPage.uploadWrongFile1();
		
	}
	
	@Test(priority=5)
	public void uploadWrongFile2() throws Throwable{
		importExcelPage.uploadWrongFile2();
		
	}
	
	
	@AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  
	  }
}
