package com.MSME.HRMS.PageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class ImportExcelPage extends BaseClass{
	ControlFunctionalities cf = new ControlFunctionalities();
	@FindBy(xpath="//h4[text()='Employee Management']")
	 @CacheLookup
	 public WebElement employeeManagement;
	
	@FindBy(xpath="(//a[text()='Import Excel'])[1]")
	@CacheLookup
	public WebElement importExcel;
	
	@FindBy(xpath="//a[text()='Import Excel']")
	@CacheLookup
	public WebElement importExcelHdr;
	
	@FindBy(xpath="//div[text()='Download Sample file ']")
	@CacheLookup
	public WebElement downloadSampleFile;
	
	@FindBy(xpath="//span[@class='icon upload-icon']")
	@CacheLookup
	public WebElement uploadIcon;
	
	@FindBy(xpath="//button[@class=' btn-14 custom-btn c-pointer gap-1']")
	@CacheLookup
	public WebElement refreshButton;
	
	@FindBy(xpath="//span[@class='k-select']")
	@CacheLookup
	public WebElement dropDown;
	
	@FindBy(xpath="//li[text()='All']")
	@CacheLookup
	public WebElement all;
	
	@FindBy(xpath="//div[@class='leavebalance-grid']")
	@CacheLookup
	public WebElement grid;
	
	@FindBy(xpath="//button[text()='Upload File']")
	@CacheLookup
	public WebElement uploadFile;
	
	@FindBy(xpath="//button[@class=' btn-14 custom-btn c-pointer']")
	@CacheLookup
	public WebElement okButton ;
	
	@FindBy(xpath="//div[@class=\"ml-2\"]")
	@CacheLookup
	public WebElement errorText ;
	
	@FindBy(xpath="//div[@class='ml-2']")
	@CacheLookup
	public WebElement errorText1 ;
	
	
	
	
	public ImportExcelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	 public boolean verifyImportExcelPageHdr() throws Throwable {
	    	
			Thread.sleep(3000);
			importExcelHdr.getText();
			return importExcelHdr.isDisplayed();	
		}
	public void uploadFile()throws Throwable {
		cf.waitforElement(grid,10000);
		cf.selectElement(uploadIcon, 3000);
		 Actions actions = new Actions(driver); 
		 actions.moveToElement(uploadFile).click().build().perform();
		//cf.selectElement(uploadFile, 3000);
		Thread.sleep(3000);
		Robot r =new Robot();
		StringSelection str= new StringSelection("C:\\Users\\Lenovo\\Downloads\\3T-INFOTECH_6471578460_6626215591.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		cf.selectElement(okButton, 3000);
		Thread.sleep(3000);
		
		
	}
	
	public void downloadSampleFile() throws Throwable{
		cf.waitforElement(grid,10000);
		cf.selectElement(downloadSampleFile, 3000);
		Thread.sleep(3000);
		
	}
	
	public void refresh() throws Throwable{
		cf.waitforElement(grid, 10000);
		cf.selectElement(refreshButton, 3000);
		Thread.sleep(3000);
	}
	
	public void uploadWrongFile1()throws Throwable {
		cf.waitforElement(grid,10000);
		cf.selectElement(uploadIcon, 3000);
		 Actions actions = new Actions(driver); actions.moveToElement(uploadFile).click().build().perform();
		//cf.selectElement(uploadFile, 3000);
		Thread.sleep(3000);
		Robot r =new Robot();
		StringSelection str= new StringSelection("C:\\Users\\Lenovo\\Downloads\\Credit Note (2).xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		cf.selectElement(okButton, 3000);
		Thread.sleep(3000);
		
		System.out.println(errorText.getText());
		
	}
	
	public void uploadWrongFile2()throws Throwable {
		cf.waitforElement(grid,10000);
		cf.selectElement(uploadIcon, 3000);
		 Actions actions = new Actions(driver); actions.moveToElement(uploadFile).click().build().perform();
		//cf.selectElement(uploadFile, 3000);
		Thread.sleep(3000);
		Robot r =new Robot();
		StringSelection str= new StringSelection("C:\\Users\\Lenovo\\Desktop\\Cryoknox\\Janveda\\11 Manual Journals-V2.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		cf.selectElement(okButton, 3000);
		Thread.sleep(3000);
		
		System.out.println(errorText.getText());
		
	}
	
	
	
	
	
	
	
	

}
