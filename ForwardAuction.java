package venilascript;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForwardAuction {
public static void main(String[] args) throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.bidproc.com/common/user/register");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Login with Credentials
	driver.findElement(By.id("j_username")).sendKeys("babu@yopmail.com");
	driver.findElement(By.id("j_password")).sendKeys("tender@123");
	driver.findElement(By.name("submit")).click();
	//mouse over create icon
	WebElement create = driver.findElement(By.xpath("//i[@class='epro icon-RFX']"));
	Actions builder=new Actions(driver);
	builder.moveToElement(create).build().perform();
	//click create eAuction
	driver.findElement(By.linkText("Create eAuction")).click();
	//project id
	driver.findElement(By.id("txtProjectId")).sendKeys("65439");
	//project title
	driver.findElement(By.id("txtProjectTitle")).sendKeys("Auction for Construction Tool Title");
	//project reference number
	driver.findElement(By.id("txtAuctionNo")).sendKeys("65436");
	//Auction title
	driver.findElement(By.id("txtBriefScope")).sendKeys("Building Material");
	//Auction Description 
	driver.findElement(By.id("txtauctiondetails")).sendKeys("Description Auction for Construction Tool Title");
	//select variant
	WebElement drop1 = driver.findElement(By.id("rdoAuctionVariant"));
	Select drop=new Select(drop1);
	drop.selectByValue("1");
	System.out.println("varient");
	WebElement drop2= driver.findElement(By.id("rdoAuctionMethod"));
	Select dropDown2=new Select(drop2);
	dropDown2.selectByValue("1");
	System.out.println("method");
	driver.findElement(By.id("equipment")).click();
	
	WebElement drop3= driver.findElement(By.id("optBaseCurrency"));
	Select dropDown3=new Select(drop3);
	dropDown3.selectByValue("112");
	System.out.println("base");
	

	WebElement drop4= driver.findElement(By.id("optDecimalVal"));
	Select dropDown4=new Select(drop4);
	dropDown4.selectByVisibleText("3");
	
	WebElement drop5= driver.findElement(By.id("rdobiddingType"));
	Select dropDown5=new Select(drop5);
	dropDown5.selectByValue("1");
	driver.findElement(By.id("txtProductLoc")).sendKeys("Oman");
	//1st next button
	driver.findElement(By.linkText("Next")).click();
	//bidding Access
	WebElement biddingAccess= driver.findElement(By.id("rdoBiddingAccess"));
	Select Access=new Select(biddingAccess);
	Access.selectByVisibleText("Limited");
	
	WebElement multipleLine= driver.findElement(By.id("selIsPartialFillingAllowed"));
	Select multiLine=new Select(multipleLine);
	multiLine.selectByVisibleText("Applicable");
	
	WebElement price = driver.findElement(By.id("rdoAddReservePrice"));
	Select reversePricing= new Select(price);
	reversePricing.selectByVisibleText("Yes");
	
	WebElement autoExtension = driver.findElement(By.id("rdoAutoExtension"));
	Select AExtension= new Select(autoExtension);
	AExtension.selectByVisibleText("Yes");
	
	WebElement exyendTime= driver.findElement(By.id("txtExtendedTime"));
	Select time=new Select(exyendTime);
	time.selectByVisibleText("5");
	
	WebElement extend= driver.findElement(By.id("txtExtendedTimeBy"));
	Select exTime=new Select(extend);
	exTime.selectByVisibleText("5");
	
	WebElement autoExtensionMode = driver.findElement(By.id("rdoAutoExtensionMode"));
	Select extensionMode= new Select(autoExtensionMode);
	extensionMode.selectByVisibleText("Limited");
	
	
	driver.findElement(By.id("txtNoOfExtension")).sendKeys("2");
	WebElement resultSharing = driver.findElement(By.id("optAutoResultSharing"));
	Select ResultSharing= new Select(resultSharing);
	ResultSharing.selectByVisibleText("No");
	
	WebElement flowrequire = driver.findElement(By.id("optWorkFlowRequire"));
	Select FlowRequire= new Select(flowrequire);
	FlowRequire.selectByVisibleText("No");
	
	driver.findElement(By.id("txtEstimatedValue")).sendKeys("345");
	driver.findElement(By.xpath("//label[@for='encryptionFlagN']")).click();
	
	WebElement ipaddress = driver.findElement(By.id("optIPAddress"));
	Select IpAddress= new Select(ipaddress);
	IpAddress.selectByVisibleText("Yes");
	//next button 2nd
	driver.findElement(By.id("configAuctionNext")).click();
	
	WebElement docfees = driver.findElement(By.id("optDocFees"));
	Select DocFess= new Select(docfees);
	DocFess.selectByVisibleText("Not Applicable");

	WebElement partfees = driver.findElement(By.id("optPartFees"));
	Select partFees= new Select(partfees);
	partFees.selectByVisibleText("Not Applicable");

	WebElement emdreq = driver.findElement(By.id("optEMDReq"));
	Select EmdReq= new Select(emdreq);
	EmdReq.selectByVisibleText("Not Applicable");
	
	
	driver.findElement(By.id("paymentDetailsNext")).click();
	//Bidder Response End Date & Time
	driver.findElement(By.id("txtDocumentEndDate")).click();
	driver.findElement(By.xpath("//td[text()='26']")).click();
	driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-time']")).click();
	driver.findElement(By.className("timepicker-hour")).click();
	driver.findElement(By.xpath("(//td[text()='13'])[2]")).click();
	driver.findElement(By.className("timepicker-minute")).click();
	driver.findElement(By.xpath("(//td[text()='15'])[3]")).click();
	
	//eAuction Start Date & Time
	driver.findElement(By.id("txtAuctionStartDate")).click();
	driver.findElement(By.xpath("//td[text()='26']")).click();
	driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-time']")).click();
	driver.findElement(By.xpath("(//span[@class='timepicker-hour'])[1]")).click();
	driver.findElement(By.xpath("(//td[text()='14'])[2]")).click();
	driver.findElement(By.xpath("//span[@class='timepicker-minute']")).click();
	driver.findElement(By.xpath("(//td[text()='30'])[3]")).click();
	
	driver.findElement(By.id("auction-conf")).click();
	driver.findElement(By.id("auctionConfig-date")).click();
	//eAuction End Date & Time
	//Thread.sleep(5000);
//	WebElement click = driver.findElement(By.id("txtAuctionEndDate"));
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.elementToBeClickable(click));
	//WebElement endDate = driver.findElement);
	driver.findElement(By.id("txtAuctionEndDate")).click();
	driver.findElement(By.xpath("(//td[text()='28'])[2]")).click();
	driver.findElement(By.xpath("//a[@data-action='togglePicker']/span[@class='glyphicon glyphicon-time']")).click();
	driver.findElement(By.xpath("(//span[@class='timepicker-hour'])[1]")).click();
	driver.findElement(By.xpath("//div[@class='timepicker-hours']//td[text()='02']")).click();
	driver.findElement(By.xpath("//span[@class='timepicker-minute']")).click();
	driver.findElement(By.xpath("//td[text()='50']")).click();
	driver.findElement(By.xpath("//button[@id='btnSubmitForm']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
	Thread.sleep(5000);
	String title = driver.getTitle();
	System.out.println(title);
}
}
