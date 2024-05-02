package com.MSME.HRMS.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.ClaimManagemntPage;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.LoginPage;
import com.MSME.HRMS.Util.TestUtil;

public class ClaimManagementTest extends BaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	ClaimManagemntPage claimManagemntPage;
	
	String SheetName="ClaimMngt";

	public  ClaimManagementTest()
	{
		super();
	}
	
	@BeforeMethod
	public ClaimManagemntPage setUp() throws Throwable
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.Login(prop.getProperty("tenantname"), prop.getProperty("username"), prop.getProperty("password"));
	    return claimManagemntPage=homePage.ClaimMngtIcon();	
	}
	
	@DataProvider
	public Object[] [] getHRMSTestData()
	{
		Object[][] data=TestUtil.getTestData(SheetName);
		return data;
		
	}

	@Test(enabled = false, dataProvider = "getHRMSTestData")
	public void AddClaim(String EmployeeName, String ClaimType, String ProjectName, String FromDate, String ToDate, String Amount, String Remarks, String EditClaimNumber, String EditAmount, String ViewClaimNumber, String ApprovedAmount, String Reason) throws Throwable
	{
		claimManagemntPage.addClaimMngt(EmployeeName, ClaimType, ProjectName, FromDate, ToDate, Amount, Remarks);
	}
	
	@Test(enabled = false, dataProvider="getHRMSTestData")
	public void EditClaimMngt( String EmployeeName, String ClaimType, String ProjectName, String FromDate, String ToDate, String Amount, String Remarks, String EditClaimNumber, String EditAmount, String ViewClaimNumber, String ApprovedAmount, String Reason) throws Throwable
	{
		claimManagemntPage.editClaim( EditClaimNumber, FromDate, ToDate,EditAmount, Remarks);
	}
	
	@Test(enabled = false, dataProvider = "getHRMSTestData")
	public void EditClaimAutoNumber(String EmployeeName, String ClaimType, String ProjectName, String FromDate, String ToDate, String Amount, String Remarks, String EditClaimNumber, String EditAmount, String ViewClaimNumber, String ApprovedAmount, String Reason) throws Throwable
	{
		claimManagemntPage.editClaimAuto(FromDate, ToDate, EditAmount, Remarks);
	}
	
	@Test(priority = 1, dataProvider = "getHRMSTestData")
	public void ViewClaimMngt(String EmployeeName, String ClaimType, String ProjectName, String FromDate, String ToDate, String Amount, String Remarks, String EditClaimNumber, String EditAmount, String ViewClaimNumber, String ApprovedAmount, String Reason) throws Throwable
	{
		claimManagemntPage.viewClaimMngt(ViewClaimNumber, ApprovedAmount, Reason);
	}
	
	@Test(enabled = false, dataProvider = "getHRMSTestData")
	public void ViewClaimMngtAuto(String EmployeeName, String ClaimType, String ProjectName, String FromDate, String ToDate, String Amount, String Remarks, String EditClaimNumber, String EditAmount, String ViewClaimNumber, String ApprovedAmount, String Reason) throws Throwable
	{
		claimManagemntPage.viewClaimMngtAuto(ViewClaimNumber, ApprovedAmount, Reason);
	}
	
	@Test(enabled = false)
	public  void GetAddedClaim()
	{
		claimManagemntPage.getClaim();
	}
	
	
	
	  @AfterMethod 
	  public void tearDown()
	  {
		  driver.quit(); 
	  }
	 
	 
}
