package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class AssetPage extends BaseClass {

	ControlFunctionalities cf = new ControlFunctionalities();

	@FindBy(xpath = "//h4[text()='Master Screen Settings']")
	@CacheLookup
	public WebElement masterScreenSetting;

	@FindBy(xpath = "//a[text()='Assets']")
	@CacheLookup
	public WebElement assetIcon;

	@FindBy(xpath = "//a[text()='assets']")
	@CacheLookup
	public WebElement assetHdr;

	@FindBy(xpath = "//h1[text()='Item Details']")
	@CacheLookup
	public WebElement itemDetailsHdr;

	@FindBy(xpath = "//div[@class='k-widget k-grid']")
	@CacheLookup
	public WebElement grid;

	@FindBy(xpath = "//div[@class='table-scroll table-br']")
	@CacheLookup
	public WebElement itemgrid;

	@FindBy(xpath = "//div[@data-tip='Add']")
	@CacheLookup
	public WebElement addIcon;

	@FindBy(xpath = "//span[@class='icon add-permission c-pointer  pulse']")
	@CacheLookup
	public WebElement ItemAddIcon;

	//span[@class='icon add-permission c-pointer  pulse']

	@FindBy(xpath = "//span[@class='icon edit-permission c-pointer  pulse']")
	public WebElement editIcon;

	@FindBy(xpath = "//span[@class='icon disable-permission c-pointer  pulse']")
	@CacheLookup
	public WebElement disableIcon;

	@FindBy(xpath="//span[@class='k-select']")
	@CacheLookup
	public WebElement PageNumm;

	@FindBy(xpath="//span[@class='k-dropdown-wrap']")
	@CacheLookup
	public WebElement PageNum;

	@FindBy(xpath="//li[text()='All']")
	@CacheLookup
	public WebElement all;

	@FindBy(xpath="//select[@name='category']")
	@CacheLookup
	public WebElement categoryCmb;

	@FindBy(xpath="//input[@name='itemName']")
	@CacheLookup
	public WebElement itemNameTxtBx;

	@FindBy(xpath="//input[@name='itemCode']")
	@CacheLookup
	public WebElement itemCodeTxtBx;

	@FindBy(xpath="//input[@name='quantity']")
	@CacheLookup
	public WebElement quantityTxtBx;

	@FindBy(xpath="//input[@name='balance']")
	@CacheLookup
	public WebElement balance;

	@FindBy(xpath="//textarea[@name='remarks']")
	@CacheLookup
	public WebElement remarksTxtBx;

	@FindBy(xpath="//input[@name='itemNumber']")
	@CacheLookup
	public WebElement itemNumTxtBx;

	@FindBy(xpath="//input[@name='purchaseDate']")
	@CacheLookup
	public WebElement purchase;

	@FindBy(xpath="//textarea[@name='description']")
	@CacheLookup
	public WebElement description;

	@FindBy(xpath="(//button[text()='Save'])[1]")
	@CacheLookup
	public WebElement ItemsaveBtn;

	@FindBy(xpath="//button[text()='Save']")
	@CacheLookup
	public WebElement saveBtn;

	@FindBy(xpath="(//button[text()=' Cancel'])[1]")
	@CacheLookup
	public WebElement cancelBtn;

	@FindBy(xpath="//div[contains(@class,'err')]")
	@CacheLookup
	public WebElement errorTag;

	@FindBy(xpath = "//button[text()='Ok']")
	@CacheLookup
	public WebElement okBtn;

	@FindBy(xpath="//p[text()='Confirm Active ?']")
	public
	WebElement activeHdr;

	@FindBy(xpath="//p[text()='Confirm Inactive ?']")
	public
	WebElement inactiveHdr;

	public AssetPage()
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getItemCode(String itemCode) {
		return driver.findElement(By.xpath("//td[text()='"+itemCode+"']/preceding-sibling::td/../td[1]/div[1]/label[1]")); 
	}

	public WebElement getItemNum(String itemNumber) {

		return driver.findElement(By.xpath("//h4[text()='"+itemNumber+"']/../../td/label")); 	
	}

	public WebElement getCategory(String categoryName) {
		return driver.findElement(By.xpath("//span[text()='"+categoryName+"']")); 
	}

	public WebElement getClaimType(String claimType) {
		return driver.findElement(By.xpath("//span[text()='"+claimType+"']/../../preceding-sibling::td[1]//div")); 
	}

	public WebElement velidataStatus(String EditItemCode) {
		return driver.findElement(By.xpath("//td[text()='"+EditItemCode+"']/../following-sibling::tr[1]/..//td[7]//div//span"));
	}

	public WebElement velidataItemStatus(String EditItemNum) {
		return driver.findElement(By.xpath("//h4[text()='"+EditItemNum+"']/../following-sibling::td[4]//h4//span"));
	}


	public boolean verifyAssetPageHdr() throws Throwable {

		Thread.sleep(3000);
		assetHdr.getText();
		return assetHdr.isDisplayed();	
	}

	/*
	 * public void addAsset(String Category,String ItemName,String ItemCode,String
	 * Quantity,String InLoan,String Balance,String Remarks,String ItemNumber,String
	 * PurchaseDate,String LendTo,String Description) throws Throwable {
	 * cf.waitforElement(grid,10000); cf.selectElement(addIcon,3000);
	 * cf.SelectCombobyVisibleText(categoryCmb, Category,3000);
	 * cf.setValue(itemNameTxtBx, ItemName, 3000); cf.setValue(itemCodeTxtBx,
	 * ItemCode, 3000); cf.setValue(quantityTxtBx, Quantity, 3000);
	 * cf.setValue(remarksTxtBx, Remarks, 3000); cf.selectElement(ItemAddIcon,3000);
	 * cf.setValue(itemNumTxtBx, ItemNumber, 3000); cf.setValue(purchase,
	 * PurchaseDate, 3000); cf.setValue(description, Description, 3000);
	 * cf.selectElement(ItemsaveBtn,3000); Thread.sleep(3000);
	 * if(cf.iselementExists(errorTag, 3000)==false) {
	 * cf.waitforElement(itemDetailsHdr, 1000); cf.selectElement(saveBtn, 1000);
	 * 
	 * if(cf.iselementExists(errorTag, 3000)==false) {
	 * 
	 * System.out.println("Asset SetUp Success"); }
	 * 
	 * else { errorTag.getText(); System.out.println("1");
	 * System.out.println("Failed to SetUp a Asset"); } }
	 * 
	 * else { System.out.println("Item Details are not added");
	 * System.out.println("1"); } }
	 */


	public void addAsset1(String Category,String ItemName,String EditItemCode,String ItemCode,String Quantity,String InLoan,String Balance,String Remarks,String EditItemNum,String ItemNumber,String PurchaseDate,String LendTo,String Description,String AssetAdd, String AssetEdit,String ItemAdd, String ItemEdit) throws Throwable {
		cf.waitforElement(grid,10000);
		if(AssetAdd=="TRUE" && ItemAdd=="TRUE")
		{
			cf.selectElement(addIcon,3000);
			cf.SelectCombobyVisibleText(categoryCmb, Category,3000);
			cf.setValue(itemNameTxtBx, ItemName, 3000);
			cf.setValue(itemCodeTxtBx, ItemCode, 3000);
			cf.setValue(quantityTxtBx, Quantity, 3000);
			cf.setValue(remarksTxtBx, Remarks, 3000);
			cf.selectElement(ItemAddIcon,3000);
			cf.setValue(itemNumTxtBx, ItemNumber, 3000);
			cf.setValue(purchase, PurchaseDate, 3000);
			cf.setValue(description, Description, 3000);
			cf.selectElement(ItemsaveBtn,3000);
			Thread.sleep(3000);
			if(cf.iselementExists(errorTag, 3000)==false)
			{
				cf.waitforElement(itemDetailsHdr, 1000);
				cf.selectElement(saveBtn, 1000);

				if(cf.iselementExists(errorTag, 3000)==false)
				{

					System.out.println("Asset SetUp Success");
				}

				else
				{
					errorTag.getText();
					System.out.println("1");
					System.out.println("Failed to SetUp a Asset");
				}
			}

			else
			{
				System.out.println("Item Details are not added");
			}
		}

		else if(AssetEdit=="TRUE" && ItemEdit=="FALSE") {
			cf.selectElement(getItemCode(EditItemCode),3000);
			cf.selectElement(editIcon,3000);
			cf.SelectCombobyVisibleText(categoryCmb, Category,3000);
			cf.setValue(itemNameTxtBx, ItemName, 3000);
			cf.setValue(itemCodeTxtBx, ItemCode, 3000);
			cf.setValue(quantityTxtBx, Quantity, 3000);
			cf.setValue(remarksTxtBx, Remarks, 3000);
			cf.selectElement(saveBtn, 1000);
			if(cf.iselementExists(errorTag, 3000)) {
				System.out.println("Asset is not Updated Successfully");
			}
			else
			{
				System.out.println("Asset Updated Successfully");
			}
		}
		else if(AssetEdit=="TRUE" && ItemAdd=="TRUE") {

			cf.waitforElement(grid,10000);
			cf.waitforElement(PageNumm,10000);  
			cf.selectElement(PageNumm, 3000);
			cf.selectElement(all, 3000);
			cf.waitforElement(grid,10000);
			//select Check box
			cf.selectElement(getItemCode(EditItemCode),3000);
			//Select Add Icon
			cf.selectElement(editIcon,3000);
			cf.selectElement(ItemAddIcon,3000);
			cf.setValue(itemNumTxtBx, ItemNumber, 3000);
			cf.setValue(purchase, PurchaseDate, 3000);
			cf.setValue(description, Description, 3000);
			cf.selectElement(ItemsaveBtn,3000);

			//Item validation steps
			if (cf.iselementExists(errorTag)==false)
			{
				cf.selectElement(saveBtn,3000);
				//Item validation steps
				if (cf.iselementExists(errorTag)==false)
				{
					System.out.println("Successfully Updated");
				}
				else
				{
					errorTag.getText();
					System.out.println("Failed To Update");
				}

			}
			else
			{
				errorTag.getText();
			}	
		}		

		else if(AssetEdit=="TRUE" && ItemEdit=="TRUE") {
			cf.selectElement(getItemCode(EditItemCode),3000);
			cf.selectElement(editIcon,3000);
			cf.SelectCombobyVisibleText(categoryCmb, Category,3000);
			cf.setValue(itemNameTxtBx, ItemName, 3000);
			cf.setValue(itemCodeTxtBx, ItemCode, 3000);
			cf.setValue(quantityTxtBx, Quantity, 3000);
			cf.setValue(remarksTxtBx, Remarks, 3000);
			cf.waitforElement(itemgrid,10000);
			cf.selectElement(getItemNum(EditItemNum),3000);
			cf.selectElement(editIcon,3000);
			cf.setValue(itemNumTxtBx, ItemNumber, 3000);
			cf.setValue(purchase, PurchaseDate, 3000);
			cf.setValue(description, Description, 3000);
			cf.selectElement(ItemsaveBtn,3000);
			Thread.sleep(3000);
			if(cf.iselementExists(errorTag, 3000)==false)
			{
				cf.waitforElement(itemDetailsHdr, 1000);
				cf.selectElement(saveBtn, 1000);

				if(cf.iselementExists(errorTag, 3000)==false)
				{

					System.out.println("Asset Updated Successfully");
				}

				else
				{
					errorTag.getText();
					System.out.println("1");
					System.out.println("Failed to Update Asset");
				}
			}

			else
			{
				System.out.println("Item Details are not added");
				System.out.println("1");
			}
		}
	} 

	public void changeAssetStatus(String EditItemCode,String Active, String Inactive) throws Throwable {
		cf.waitforElement(assetHdr,10000);

		if (cf.iselementExists(assetHdr,3000)==true)
		{
			cf.waitforElement(grid,10000);

			cf.selectElement(PageNum, 3000);
			cf.selectElement(all, 3000);
			cf.waitforElement(grid,10000);
			String status = velidataStatus(EditItemCode).getText();
			if(status=="Active")
			{
				//select Check box
				cf.selectElement(getItemCode(EditItemCode),3000);    //Select Disable Icon
				cf.selectElement(disableIcon,3000);
				//Click on OK button
				cf.selectElement(okBtn,3000);
				cf.waitforElement(grid,10000);
				System.out.println("---------Asset Inactive Successfully----------");
			}

			else {
				//select Check box
				cf.selectElement(getItemCode(EditItemCode),3000);    //Select Disable Icon
				cf.selectElement(disableIcon,3000);
				//Click on OK button
				cf.selectElement(okBtn,3000);
				cf.waitforElement(grid,10000);
				System.out.println("---------Asset Active Successfully----------");
			}
		}
	}

	public void changeItemStatus(String EditItemCode,String EditItemNum) throws Throwable {
		cf.waitforElement(assetHdr,10000);

		if (cf.iselementExists(assetHdr,3000)==true)
		{
			cf.waitforElement(grid,10000);

			cf.selectElement(PageNum, 3000);
			cf.selectElement(all, 3000);
			cf.waitforElement(grid,10000);
			cf.selectElement(getItemCode(EditItemCode),3000);
			cf.selectElement(editIcon,3000);
			cf.waitforElement(itemDetailsHdr,10000);
			String status = velidataItemStatus(EditItemNum).getText();
			if(status=="Active")
			{
				//select Check box
				cf.selectElement(getItemNum(EditItemNum),3000);    //Select Disable Icon
				cf.selectElement(disableIcon,3000);
				//Click on OK button
				cf.selectElement(okBtn,3000);
				cf.waitforElement(grid,10000);
				System.out.println("---------Asset Inactive Successfully----------");
			}

			else {
				//select Check box
				cf.selectElement(getItemNum(EditItemNum),3000);    //Select Disable Icon
				cf.selectElement(disableIcon,3000);
				//Click on OK button
				cf.selectElement(okBtn,3000);
				cf.waitforElement(grid,10000);
				System.out.println("---------Asset Active Successfully----------");
			}
		}

	}

}







