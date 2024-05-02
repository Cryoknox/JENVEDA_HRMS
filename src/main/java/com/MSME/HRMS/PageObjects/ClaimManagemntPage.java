package com.MSME.HRMS.PageObjects;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class ClaimManagemntPage extends BaseClass{
	
	ControlFunctionalities cf= new ControlFunctionalities();

	@FindBy(xpath="//a[text()='Claim Management']")
	public WebElement claimMngtHdr;
	
	@FindBy(xpath="//div[@class='k-widget k-grid']")
	public WebElement claimMngtGrid;
	
	@FindBy(xpath="//span[contains(@class,'icon add-permi')]")
	public WebElement addIcon;
	
	@FindBy(xpath="//div[@data-tip='Edit']")
	public WebElement editIcon;
	
	@FindBy(xpath="//div[@data-tip='View']")
	public WebElement viewIcon;
	
	@FindBy(xpath="//span[@class='icon md hamburger cursor-pointer active']")
	public WebElement gridViewIcon;
	
	@FindBy(xpath="//span[@class='icon md menu-icon cursor-pointer']")
	public WebElement menuViewIcon;
	
	@FindBy(xpath="//h1[text()='Apply Claim']")
	public WebElement addPageHdr;
	
	@FindBy(xpath="//h5[text()='Clear Data']")
	public WebElement clearDataLink;
	
	@FindBy(xpath="//select[@name='employeeId']")
	public WebElement empNameCmb;
	
	@FindBy(xpath="//select[@name='claimTypeId']")
	public WebElement claimTypeCmb;
	
	@FindBy(xpath="//select[@name='projectId']")
	public WebElement projectCmb;
	
	@FindBy(xpath="//input[@name='fromDate']")
	public WebElement fromDateTxtbx;
	
	@FindBy(xpath="//input[@name='toDate']")
	public WebElement toDateTxtBx;
	
	@FindBy(xpath="//input[@name='amount']")
	public WebElement amountTxtBx;
	
	@FindBy(xpath="//input[@name='approvedAmount']")
	public WebElement approvedAmountTxtBx;
	
	@FindBy(xpath="//button[text()='Apply Claim']")
	public WebElement applyBtn;
	
	@FindBy(xpath="//h1[text()='Edit Claim']")
	public WebElement editClaimPageHdr;
	
	@FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Submitted']")
	public WebElement submittedClaimStateHdr;
	
	@FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Processed']")
	public WebElement processedStateClaimHdr;
	
	@FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Processed']")
	public WebElement viewProcessedHdr;
	
	@FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Cancelled']")
	public WebElement cancelledStateClaimHdr;
	
	@FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Approved']")
	public WebElement viewApproveHdr;
	
	@FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Rejected']")
	public WebElement rejectedClaimHdr;
	
	@FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Approved']")
	public WebElement approvedClaimHdr;
	
	@FindBy(xpath="//textarea[@name='remarks']")
	public WebElement remarkstxtBx;
	
	@FindBy(xpath="//button[text()='Cancel Claim']")
	public WebElement cancelClaimBtn;
	
	@FindBy(xpath="//button[text()='Cancel']")
	public WebElement cancelBtn;
	
	@FindBy(xpath="//span[text()='Claim Limit :']/../..//span[2]")
	public WebElement claimLimit;
	
	@FindBy(xpath="//h1[text()='View Claim']")
	public WebElement viewPageHdr;
	
	@FindBy(xpath="//span[@class='k-icon k-i-arrow-s']")
	public WebElement recordPerPageCmb;
	
	@FindBy(xpath="//div[contains(@class,'grid lg:grid-cols-3 xl:grid')]")
	public WebElement menuGrid;
	
	@FindBy(xpath="//button[text()='All']")
	public WebElement allButton;
	
	@FindBy(xpath="//button[@class='w-full btn-14 cvf custom-btn']")
	public WebElement verifiedBtn;
	
	@FindBy(xpath="//button[text()='Approved']")
	public WebElement approvedBtn;
	
	@FindBy(xpath="//button[text()='Processed']")
	public WebElement processedBtn;
	
	@FindBy(xpath="//button[text()='Rejected']")
	public WebElement rejectedBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Employee Name']")
	public WebElement searchBar;
	
	@FindBy(xpath="//p[text()='Verified']/..//h1")
	public WebElement verifiedTab;
	
	@FindBy(xpath="//p[text()='Approved']/..//h1")
	public WebElement approvedTab;
	
	@FindBy(xpath="//p[text()='Processed']/..//h1")
	public WebElement processedTab;
	
	@FindBy(xpath="//p[text()='Rejected']/..//h1")
	public WebElement rejectedTab;
	
	@FindBy(xpath="//div[@class='error-msg flex justify-between align-top mt-2.5 mb-7']']")
	public WebElement errorTag;
	
    @FindBy(xpath="//span[@class='k-select']")
    public WebElement pagePerDownCmb;
    
    @FindBy(xpath="//li[text()='All']")
	 public WebElement all;
	
	@FindBy(xpath="//button[text()=' Verify']")
	public WebElement verifyBtn;
    
    @FindBy(xpath="//button[@class='w-full btn-14 cvf custom-btn']")
    public WebElement approveBtn;
    
    @FindBy(xpath="//textarea[@name='reason']")
    public WebElement reasonTxtBx;
    
    @FindBy(xpath="//button[text()=' Process']")
    public WebElement processBtn;
    
    @FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Cancelled']")
    public WebElement viewCancelHdr;
    
    @FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Verified']")
    public WebElement viewVerifiedClaimHdr;
    
    @FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Verified']")
    public WebElement verifiedClaimStateHdr;
    
    @FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Submitted']")
    public WebElement editSubmitHdr;
    
    @FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Cancelled']")
    public WebElement editCancelHdr;
    
    @FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Verified']")
    public WebElement editVerifyHdr;
    
    @FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Approved']")
    public WebElement editApproveHdr;
    
    @FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Rejected']")
    public WebElement editRejectHdr;
    
    @FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Processed']")
    public WebElement editProcessedHdr;
    
    @FindBy(xpath="//span[@class='icon sm errorclose-icon cursor-pointer']")
    public WebElement errorCloseIcon;
    
	String SubmitClaimState="Submitted";
    String CancelClaimState;
    String RejectedState;
    String ProcessedState;
    String AddClaimNumber;
	
	public ClaimManagemntPage()
	{
	  PageFactory.initElements(driver, this);
	}
	
	public boolean verifiyClaimMngtHdr() throws Throwable
	{
		Thread.sleep(3000);
		return claimMngtHdr.isDisplayed();
	}
	
	public boolean verifiyGrid() throws InterruptedException
	{
		Thread.sleep(3000);
		return claimMngtGrid.isDisplayed();
	}
	
	public void verifiyError()
	{
		if(errorTag.isDisplayed()==true)
		{
			System.out.println(errorTag.getText());
			return;
		}
		else
		{
			System.out.println("---------------No Error Found------------");
			return;
		}
	}
	
	String ClaimLimitAmount;
	float ClaimAmountLimit;
	float ClaimAmntLmt;
	String AppAmount;
	float ApprAmount;
	
	public float getClaim()
	{
		ClaimLimitAmount=driver.findElement(By.xpath("//span[text()='Claim Limit :']/following-sibling::span")).getText();
		ClaimLimitAmount = ClaimLimitAmount.replace(",", "");
		ClaimAmountLimit = Float.parseFloat(ClaimLimitAmount);
		return ClaimAmountLimit;
	}
	
	public float getApprovedAmount() throws Throwable
	{
		AppAmount=driver.findElement(By.xpath("//label[text()='Approved Amount']/following-sibling::input")).getAttribute("value");
		//System.out.println(AppAmount);
		AppAmount = AppAmount.replace(",", "");
	    ApprAmount=Float.parseFloat(AppAmount);
	    System.out.println(ApprAmount);
	    return ApprAmount;
	}
	
	public void addClaimMngt(String employeeName, String ClaimType, String ProjectName, String fromDate, String toDate, String amount, String Remarks) throws Throwable
	{
		cf.selectElement(addIcon, 3000);
		Thread.sleep(3000);
		if(addPageHdr.isDisplayed()==true)
		{
			cf.setValue(empNameCmb, employeeName, 3000);
			cf.setValue(claimTypeCmb, ClaimType, 3000);
			Thread.sleep(3000);
			cf.setValue(projectCmb, ProjectName, 3000);
			cf.setValue(fromDateTxtbx, fromDate, 3000);
			Thread.sleep(3000);
			cf.setValue(toDateTxtBx, toDate, 3000);
			getClaim();
			try {
			    float CellAmount= Float.parseFloat(amount);
			    Thread.sleep(3000);
			    ClaimAmntLmt=getClaim();
			    Thread.sleep(3000);
			if(CellAmount < ClaimAmountLimit||CellAmount==ClaimAmountLimit)
			{	
				String Amount= Float.toString(CellAmount);
			    cf.setValue(amountTxtBx, Amount, 3000);
			    Thread.sleep(3000);
                cf.setValue(remarkstxtBx, Remarks, 3000);
                Thread.sleep(3000);
                applyBtn.click();
                Thread.sleep(3000);
			}
			else 
			{
				System.out.println("--------------------The Given Amount is More than Limit Amount so our Automation given valid Amount to apply------------------------");
				String ClaimLimit= Float.toString(ClaimAmountLimit);
			    cf.setMultiValue(amountTxtBx, ClaimLimit, 3000);
			    Thread.sleep(3000);
	            cf.setValue(remarkstxtBx, Remarks, 3000);
	            Thread.sleep(3000);
	            applyBtn.click();
	            Thread.sleep(3000);  
			}
			verifiyError();
		    Thread.sleep(3000); 
			if(cf.iselementExists(addIcon)==true)
			{
				System.out.println("---------------Apply-Claim-Test-Pass--------------");
                return;			
 			}
		   
		}
		 catch(NumberFormatException e)
			{
				e.printStackTrace();;
			}
		}
		
	}
	
	public void editClaim( String editClaimNumber,String fromDate, String toDate, String Editamount, String Remarks) throws Throwable
	{
		pagePerDownCmb.click();
		all.click();
	    Thread.sleep(3000);
	    selectClaimMngtCheckBx(editClaimNumber).click();
	    editIcon.click();
	    Thread.sleep(3000);
		if(cf.iselementExists(submittedClaimStateHdr)==true)
		{
			cf.setValue(fromDateTxtbx, fromDate, 3000);
			cf.setValue(toDateTxtBx, toDate, 3000);
			Thread.sleep(3000);
			getClaim();
			try {
			    float CellAmount= Float.parseFloat(Editamount);
			    Thread.sleep(3000);
			    ClaimAmntLmt=getClaim();
			    Thread.sleep(3000);
			    if(CellAmount < ClaimAmountLimit||CellAmount==ClaimAmountLimit)
				{ 
			    	String EditAmount= Float.toString(CellAmount);
			        cf.setValue(amountTxtBx, EditAmount, 3000);
			        cf.setValue(remarkstxtBx, Remarks, 3000);
			        Thread.sleep(3000);
			        applyBtn.click();
			        Thread.sleep(3000);
				}
			else 
			{
				System.out.println("--------------------The Given Amount is More than Limit Amount so our Automation given valid Amount to apply------------------------");
				String ClaimLimit= Float.toString(ClaimAmountLimit);
				 cf.setMultiValue(amountTxtBx, ClaimLimit, 3000);
				    Thread.sleep(3000);
		            cf.setValue(remarkstxtBx, Remarks, 3000);
		            Thread.sleep(3000);
		            applyBtn.click();
		            Thread.sleep(3000);  
			}
			
			
			if(verifiyClaimMngtHdr())
			{
				System.out.println("--------------The Submitted State Claim is Tested------------");
                return;		
			}
		}
		 catch(NumberFormatException e)
			{
				e.printStackTrace();;
			}
		}	
	
		else if  (cf.iselementExists(cancelledStateClaimHdr)==true) 
		{
			Thread.sleep(3000);
			cancelBtn.click();
			Thread.sleep(3000);
			if(claimMngtGrid.isDisplayed())
			{
				System.out.println("-----------The Cancelled State Claim is Tested-------------");
	            return;		
			}
		}
		else if (cf.iselementExists(processedStateClaimHdr)==true)
		 {
			 Thread.sleep(3000);
			 cancelBtn.click();
			 Thread.sleep(3000);
			 verifiyError();
			 if(claimMngtHdr.isDisplayed())
			 {
				 System.out.println("----------The Processed State Claim is Tested-----------");
			     return;
			 }
		 }
		  if  (cf.iselementExists(rejectedClaimHdr)==true)
		 {
				Thread.sleep(3000);
				cancelBtn.click();
				Thread.sleep(3000);
				if(claimMngtGrid.isDisplayed())
				{
					System.out.println("-----------The Rejected State Claim is Tested-------------");
		            return;		
		 
				}
		 }
		  
		 if(cf.iselementExists(approvedClaimHdr)==true)
		 {
			 Thread.sleep(3000);
				cancelBtn.click();
				Thread.sleep(3000);
				if(claimMngtGrid.isDisplayed())
				{
					System.out.println("-----------The Rejected State Claim is Tested-------------");
		            return;		
		 
				}
		 }
		 
		 if(cf.iselementExists(verifiedClaimStateHdr)==true)
			{
				cf.setValue(reasonTxtBx, Remarks, 3000);
				Thread.sleep(3000);
				applyBtn.click();
				if(claimMngtGrid.isDisplayed())
				{
					System.out.println("-----------The Verified State Claim is Tested-------------");
		            return;		
		 
				}}
			
	}
	
	public void editClaimAuto(String fromDate, String toDate, String Editamount, String Remarks) throws Throwable
	{
		Thread.sleep(3000);
		pagePerDownCmb.click();
		Thread.sleep(3000);
		all.click();
	    Thread.sleep(3000);
	    AddClaimNumber=getNewAddClaimNumber();
	    selectClaimMngtAutoCheckBx(AddClaimNumber).click();
	    Thread.sleep(3000);
	    editIcon.click();
	    Thread.sleep(3000);
		if(cf.iselementExists(editSubmitHdr)==true)
		{
			cf.setValue(fromDateTxtbx, fromDate, 3000);
			cf.setValue(toDateTxtBx, toDate, 3000);
			Thread.sleep(3000);
			getClaim();
			try {
			    float CellAmount= Float.parseFloat(Editamount);
			    Thread.sleep(3000);
			    ClaimAmntLmt=getClaim();
			    Thread.sleep(3000);
			    if(CellAmount < ClaimAmountLimit||CellAmount==ClaimAmountLimit)
				{ 
			    	String EditAmount= Float.toString(CellAmount);
			        cf.setValue(amountTxtBx, EditAmount, 3000);
		        	cf.setValue(remarkstxtBx, Remarks, 3000);
			        Thread.sleep(3000);
			        applyBtn.click();
			        Thread.sleep(3000);
				}
			    else 
				{
					System.out.println("--------------------The Given Amount is More than Limit Amount so our Automation given valid Amount to apply------------------------");
					String ClaimLimit= Float.toString(ClaimAmountLimit);
				    cf.setMultiValue(amountTxtBx, ClaimLimit, 3000);
				    Thread.sleep(3000);
		            cf.setValue(remarkstxtBx, Remarks, 3000);
		            Thread.sleep(3000);
		            applyBtn.click();
		            Thread.sleep(3000);  
				}
				verifiyError();
			    Thread.sleep(3000);     
			if(verifiyClaimMngtHdr())
			{
				System.out.println("--------------The Submitted State Edit-Claim is Tested------------");
                return;		
			}
		}
			 catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
		}
		else if  (cf.iselementExists(editCancelHdr)==true) 
		{
			Thread.sleep(3000);
			cancelBtn.click();
			Thread.sleep(3000);
			if(claimMngtGrid.isDisplayed())
			{
				System.out.println("-----------The Cancelled State Claim is Tested-------------");
	            return;		
			}
		}
		else if (cf.iselementExists(editProcessedHdr)==true)
		 {
			 Thread.sleep(3000);
			 cancelBtn.click();
			 Thread.sleep(3000);
			// verifiyError();
			 if(claimMngtHdr.isDisplayed())
			 {
				 System.out.println("----------The Processed State Claim is Tested-----------");
			     return;
			 }
		 }
		  if  (cf.iselementExists(editRejectHdr)==true)
		 {
				Thread.sleep(3000);
				cancelBtn.click();
				Thread.sleep(3000);
				if(claimMngtGrid.isDisplayed())
				{
					System.out.println("-----------The Rejected State Claim is Tested-------------");
		            return;		
		 
				}
		 }
		  
		 if(cf.iselementExists(editApproveHdr)==true)
		 {
			 Thread.sleep(3000);
				cancelBtn.click();
				Thread.sleep(3000);
				if(claimMngtGrid.isDisplayed())
				{
					System.out.println("-----------The Approved State Claim is Tested-------------");
		            return;		
		 
				}
		 }
		 
		 if(cf.iselementExists(editVerifyHdr)==true)
			{
				cf.setValue(reasonTxtBx, Remarks, 3000);
				Thread.sleep(3000);
				applyBtn.click();
				if(claimMngtGrid.isDisplayed())
				{
					System.out.println("-----------The Verified State Claim is Tested-------------");
		            return;		
		 
				}
			}
	}
	public void viewClaimMngt(String viewClaimNumber, String approvedAmount, String reason) throws Throwable
	{
		pagePerDownCmb.click();
		all.click();
		Thread.sleep(3000);
	    selectClaimMngtCheckBx(viewClaimNumber).click();
	    Thread.sleep(3000);
	    viewIcon.click();
	    Float ApproveAmount;
	    Float ApproAmnt;
	    if (cf.iselementExists(submittedClaimStateHdr)==true) 
	    {
	    	try
	    	{
	    		Thread.sleep(3000);
	    	    ApproAmnt=getApprovedAmount();
		        Thread.sleep(3000);
		    	ApproveAmount=Float.parseFloat(approvedAmount);
		    	Thread.sleep(3000);
	    	 if(ApproveAmount<ApproAmnt||ApproveAmount==ApproAmnt)
	    	{
	    	 String approveddAmount=Float.toString(ApproveAmount);
			 cf.setValue(approvedAmountTxtBx, approveddAmount, 3000);
			 cf.setValue(reasonTxtBx, reason, 3000);
			 cf.selectElement(verifiedBtn, 3000);
			 Thread.sleep(3000);
			 if(addIcon.isDisplayed())
			 {
			     System.out.println("-------The Submitted View-Claim is Verified--------");
		   	     return;
		   	 }
	    	}
	    	else 
	    	{
	    		Thread.sleep(3000);
	    		String ApprAmnt=Float.toString(ApproAmnt);
	    		Thread.sleep(3000);
	    		cf.setValue(approvedAmountTxtBx, ApprAmnt, 3000);
	    		cf.setValue(reasonTxtBx, reason, 3000);
	    		Thread.sleep(3000);
				verifiedBtn.click();
				verifiyClaimMngtHdr();
				System.out.println("-------The Submitted View-Claim is Verified & The Approved Amount is Greater then Amount--------");
			   	return;
	    	}
	    	}
	    	catch (NumberFormatException e) {
	    		e.printStackTrace();;
			}
		}
	    else if(cf.iselementExists(viewVerifiedClaimHdr)==true)
	    {
	    	try
	    	{
	    		Thread.sleep(3000);
	    	    ApproAmnt=getApprovedAmount();
		        Thread.sleep(3000);
		    	ApproveAmount=Float.parseFloat(approvedAmount);
		    	Thread.sleep(3000);
	    	 if(ApproveAmount<ApproAmnt||ApproveAmount==ApproAmnt)
	    	{
	    	 String approveddAmount=Float.toString(ApproveAmount);
			 cf.setValue(approvedAmountTxtBx, approveddAmount, 3000);
			 cf.setValue(reasonTxtBx, reason, 3000);
			 cf.selectElement(approveBtn, 3000);
			 Thread.sleep(3000);
			 if(addIcon.isDisplayed())
			 {
			     System.out.println("-------The Submitted View-Claim is Verified--------");
		   	     return;
		   	 }
	    	}
	    	else 
	    	{
	    		Thread.sleep(3000);
	    		String ApprAmnt=Float.toString(ApproAmnt);
	    		Thread.sleep(3000);
	    		cf.setValue(approvedAmountTxtBx, ApprAmnt, 3000);
	    		cf.setValue(reasonTxtBx, reason, 3000);
	    		Thread.sleep(3000);
	    		applyBtn.click();
	    		Thread.sleep(3000);
			 if(cf.iselementExists(addIcon, 3000)) {
			 System.out.println("-------The Verifed View-Claim is Verified But the Given Amount in Test Data is More Than the Limit--------");
			 return;
	    }}}
    	
    	catch (NumberFormatException e) {
    		e.printStackTrace();;
		}}
	    else if(cf.iselementExists(viewCancelHdr)==true)
	   {
	    	System.out.println("--------The Cancelled View-Claim is Viewed--------");
		   cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Cancelled View-Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(viewProcessedHdr)==true)
	   {
	    	  System.out.println("--------The Processed Claim is Viewed--------");
	    	cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Processed View-Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(rejectedClaimHdr)==true)
	   {
	    	 System.out.println("--------The Rejected Claim is Viewed--------");
		   cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Rejected View-Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(viewApproveHdr)==true)
	   {
	    	System.out.println("--------The Approve-------");
	    	processBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Approved View-Claim is Viewed--------");
		   return;
	   }
	   
	}
	
	public void viewClaimMngtAuto(String viewClaimNumber, String approvedAmount, String reason) throws Throwable
	{
		pagePerDownCmb.click();
		all.click();
		Thread.sleep(3000);
		AddClaimNumber=getNewAddClaimNumber();
		selectClaimMngtAutoCheckBx(AddClaimNumber).click();
	    Thread.sleep(3000);
	    viewIcon.click();
	    if (cf.iselementExists(submittedClaimStateHdr)==true) 
	    {
			cf.setValue(approvedAmountTxtBx, approvedAmount, 3000);
			cf.setValue(reasonTxtBx, reason, 3000);
			cf.selectElement(verifiedBtn, 3000);
			verifiyClaimMngtHdr();
			System.out.println("-------The Submitted View-Claim is Verified--------");
			return;
		}
	    else if(cf.iselementExists(viewVerifiedClaimHdr)==true)
	    {
	    	cf.setValue(approvedAmountTxtBx, approvedAmount, 3000);
			cf.setValue(reasonTxtBx, reason, 3000);
			cf.selectElement(approveBtn, 3000);
			verifiyClaimMngtHdr();
			System.out.println("-------The Verifed View-Claim is Verified--------");
			return;
	    }
	    else if(cf.iselementExists(viewCancelHdr)==true)
	   {
		   cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Cancelled View-Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(viewProcessedHdr)==true)
	   {
	    	cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Processed View-Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(rejectedClaimHdr)==true)
	   {
		   cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Rejected View-Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(viewApproveHdr)==true)
	   {
	    	processBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Approved View-Claim is Viewed--------");
		   return;
	   }
	   
	}
	
	public WebElement verifiyClaimState(String EditClaimNumber, long timeout)
	{
		return driver.findElement(By.xpath("//td[text()='"+EditClaimNumber+"']/following-sibling::td[7]//div//div//span"));
	}
	
	public WebElement selectClaimMngtCheckBx(String ClaimMngtNumber)
	{
		return driver.findElement(By.xpath("//td[text()='"+ClaimMngtNumber+"']/preceding-sibling::td//div[@class='text-center']"));
		 
	}
	
	public WebElement selectClaimMngtAutoCheckBx(String AddedClaimNum)
	{
		return driver.findElement(By.xpath("//td[text()='"+AddedClaimNum+"']/preceding-sibling::td//div[@class='text-center']"));
		 
	}
	
	
	
	public String getNewAddClaimNumber()
	{
		AddClaimNumber=driver.findElement(By.xpath("//tr[@class='k-master-row' and @aria-rowindex='2']/..//td[2]")).getText();
	    return AddClaimNumber;
	}
}
