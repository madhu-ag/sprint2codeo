package StepDefination1;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class retaillogin {
	WebDriver driver;
	
	@Given("Admin is on login page of Retail site")
	public void admin_is_on_login_page_of_Retail_site() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\capgemini\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://retailm1.upskills.in/admin/");
			System.out.println("Admin is at retail site ");

			}
			catch(Exception e) {
				System.out.println("Not able to get Retail site page" +e);
			}
	}

	@When("Admin enters the username and password")
	public void admin_enters_the_username_and_password() {
		try { 
			 driver.findElement(By.id("input-username")).sendKeys("admin");
			 Thread.sleep(1000);
			 driver.findElement(By.id("input-password")).sendKeys("admin@123");	 
			 Thread.sleep(1000);
			 System.out.println("Admin enters user name and password");
		}
			 catch(Exception e){
			 System.out.println("Not able to enter user name and password" +e);
			 }
	}

	@When("Admin clicks on login button")
	public void admin_clicks_on_login_button() {
		try {
			
			driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
			System.out.println("admin clicks on login");
		}
		catch(Exception e){
			System.out.println("Not able to login" +e);
		}
	}

	@Then("he verifies that he is navigated to the Dashboard")
	public void he_verifies_that_he_is_navigated_to_the_Dashboard() {
		try {
			String val=driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
			System.out.println("Admin is at Dashboard");
			Thread.sleep(1000);
			System.out.println("User is navigated to Dashboard");
		}
		catch(Exception e) {
			System.out.println("User is not navigated to Dashboard" +e);
		}
	}

	@Then("admin clicks on Marketing icon")
	public void admin_clicks_on_Marketing_icon() {
		try {
			
			driver.findElement(By.xpath("//*[@class='fa fa-share-alt fw']")).click();
			System.out.println("Admin clicks on marketing");
		}
		catch(Exception e){
			System.out.println("Not able to click on marketing" +e);
		}
	}

	@Then("admin clicks on marketing")
	public void admin_clicks_on_marketing() {
		try {
			
			driver.findElement(By.xpath("//li/a[text()='Marketing']")).click();
			Thread.sleep(1000);
			System.out.println("Admin clicks on marketing under marketing section");
		}
		catch(Exception e){
			System.out.println("Not able to click on marketing under marketing section" +e);
		}
	}

	@Given("Admin is on Markertin tracking page")
	public void admin_is_on_Markertin_tracking_page() {
		try {
			String val1=driver.findElement(By.xpath("//h1[text()='Marketing Tracking']")).getText();
			System.out.println("Admin is on marketing tracking page");
			Thread.sleep(1000);
			System.out.println("Admin is navigated to marketing tracking page");
		}
		catch(Exception e) {
			System.out.println("User is not navigated to marketing tracking page" +e);
		}
	}

	@When("Admin verifies Campaign name text field")
	public void admin_verifies_Campaign_name_text_field() {
		try {
			boolean Campaign = driver.findElement(By.name("filter_name")).isEnabled();
			Assert.assertEquals(Campaign,true);
			System.out.println("Campaign name text field verified");
			
		}
		catch(Exception e) {
			System.out.println("Campaign name text field not present" +e);
		}
	}

	@Then("Admin enters {string} by already existing data in list and non existing data in the list")
	public void admin_enters_by_already_existing_data_in_list_and_non_existing_data_in_the_list(String cname) {
		 
		try {
			driver.findElement(By.name("filter_name")).sendKeys(cname);
			Thread.sleep(1000);
			System.out.println("Admin entered campaign name");
			}
			catch(Exception e){
				System.out.println("Not able to enter campaign name" +e);
			}
	}

	@Then("clicks on filter")
	public void clicks_on_filter() {
		try {
			
			driver.findElement(By.id("button-filter")).click();
			System.out.println("Admin clicked on filter");
			
		}
		catch(Exception e){
			System.out.println("Not able to click on filter" +e);
		}
	    
	}

	@Then("verifies the list")
	public void verifies_the_list() {
		try {

			boolean text=driver.findElement(By.xpath("//td[contains(text(),'abc')]")).isDisplayed();
			Assert.assertEquals(text,true);
			System.out.println("List verified");
			
		}
		catch(Exception e) {
			System.out.println("list is not present or No result" +e);
		}
	
	}

	@When("Admin verifies Date added text field and calender icon")
	public void admin_verifies_Date_added_text_field_and_calender_icon() {
		try {
			boolean date = driver.findElement(By.name("filter_date_added")).isEnabled();
			Assert.assertEquals(date,true);
			System.out.println("Date added text field verified");
		}
		catch(Exception e) {
			System.out.println("Date added text field not present" +e);
		}
	}

	@Then("Admin enters {string}")
	public void admin_enters(String date) {
            
			try {
			driver.findElement(By.name("filter_date_added")).sendKeys(date);
			System.out.println("Date entered");
			}
			catch(Exception e){
				System.out.println("Not able to enter date" +e);
			}
	}
	

	@When("Admin verifies Tracking code text field")
	public void admin_verifies_Tracking_code_text_field() {
		try {
			boolean track = driver.findElement(By.name("filter_code")).isEnabled();
			Assert.assertEquals(track,true);
			System.out.println("Tracking code text field verified");
	
		}
		catch(Exception e) {
			System.out.println("Date added text field not present" +e);
		}
	}
	@Then("Admin enters {string} in trabking code field by already existing data in listand non existing data in the list")
	public void admin_enters_in_trabking_code_field_by_already_existing_data_in_listand_non_existing_data_in_the_list(String tcode) {
		try {
			driver.findElement(By.name("filter_code")).sendKeys(tcode);
			System.out.println("entered tracking code");
			}
			catch(Exception e){
				System.out.println("Not able to enter tracking code" +e);
				
			}
	}
	@When("Admin verifies and clicks the add button")
	public void admin_verifies_and_clicks_the_add_button() {
		try {
		boolean addicon = driver.findElement(By.xpath("//*[@class='fa fa-plus']")).isDisplayed();
        boolean addiconenable = driver.findElement(By.xpath("//*[@class='fa fa-plus']")).isEnabled();
        System.out.println("Add button verified");

        if (addicon==true && addiconenable==true)
        {
               // click on the add button
        	driver.findElement(By.xpath("//*[@class='fa fa-plus']")).click();
        	Thread.sleep(1000);
        }

	}	
	catch(Exception e) {
		 System.out.println("Add data icon not present" +e);
	}
	}

	@Then("admin verifies that he is navigated to add marketing tracking page")
	public void admin_verifies_that_he_is_navigated_to_add_marketing_tracking_page() {
		 try {
			 String Actual=driver.findElement(By.xpath("//*[@class='panel-title']")).getText();
			 System.out.println(Actual);
			  String Expected="Add Marketing Tracking";
			 Assert.assertEquals(Expected, Actual);
			 System.out.println("Admin is navigated to Add Marketing tracking page");
			 }
			 catch(Exception e)
		 	{ 
				 System.out.println("Not able to find Add marketing tracking page"+e); }
			
	}

	@Then("verifies Campaign name, Campaign Description, Tracking code and Examples text field")
	public void verifies_Campaign_name_Campaign_Description_Tracking_code_and_Examples_text_field() {
		try {
			boolean Campaign = driver.findElement(By.name("name")).isEnabled();
			boolean desc = driver.findElement(By.name("description")).isEnabled();
			boolean Track = driver.findElement(By.name("code")).isEnabled();
			boolean Examples = driver.findElement(By.id("input-example1")).isEnabled();
			boolean Examples2 = driver.findElement(By.id("input-example2")).isEnabled();
			Assert.assertEquals(Campaign,true);
			Assert.assertEquals(desc,true);
			Assert.assertEquals(Track,true);
			Assert.assertEquals(Examples,true);
			Assert.assertEquals(Examples2,true);
			System.out.println("Campaign name, Campaign Description, Tracking code and Examples text field verified");
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Campaign name, Campaign Description, Tracking code and Examples text field not present" +e);
		}
	}
	@Then("add {string}, {string} with alphanumeric,special character,twenty five characters")
	public void add_with_alphanumeric_special_character_twenty_five_characters(String Cname, String Cdesc) { 
		try { 
			 driver.findElement(By.id("input-name")).sendKeys(Cname);
			 Thread.sleep(000);
			 driver.findElement(By.id("input-description")).sendKeys(Cdesc);
			 Thread.sleep(1000);
			 System.out.println("entered Campaign name and description");
		}
			 catch(Exception e){
			 System.out.println("Not able to enter Campaign name and description" +e);
			 }
	}


	@Then("verifies tracking code is given by default example field has default URL")
	public void verifies_tracking_code_is_given_by_default_example_field_has_default_URL() {
		try {

			 boolean tcode=driver.findElement(By.id("input-code")).isDisplayed();
			 boolean Example1=driver.findElement(By.id("input-example1")).isDisplayed();
			 boolean Example2=driver.findElement(By.id("input-example2")).isDisplayed();
			 System.out.println("Example field has default url");
			 }
			 catch(Exception e)
		 	{ 
				 System.out.println("Trackin field and Example field does not have default value"+e); }
	    
	}

	
	@Then("Verifies Examples text fields adds the tracking code to the end of the URL")
	public void verifies_Examples_text_fields_adds_the_tracking_code_to_the_end_of_the_URL() {
		try {
			
			String Actual1= driver.findElement(By.id("input-example1")).getText();
			String tcode= driver.findElement(By.id("input-code")).getText();
			 System.out.println("Example1= "+Actual1+tcode);
			 String Expected1="http://retailm1.upskills.in/?tracking="+tcode;
			 Assert.assertEquals(Expected1, Actual1);
			 
			 String Actual2=driver.findElement(By.id("input-example2")).getText();
			 System.out.println("Example2= "+Actual2+tcode);
			 String Expected2="http://retailm1.upskills.in/index.php?route=common/home&tracking="+tcode;
			 Assert.assertEquals(Expected2, Actual2);
			 Thread.sleep(1000);
			 System.out.println("Example field is adding tracking code at the end"); 

		}	
		catch(Exception e) {
			 System.out.println("Example field is not adding tracking code at the end" +e);
		}
	    
	}

	@Then("verifies and click on Save icon")
	public void verifies_and_click_on_Save_icon() {
		try {
			boolean saveicon = driver.findElement(By.xpath("//*[@class='fa fa-save']")).isDisplayed();
	        boolean saveiconenable = driver.findElement(By.xpath("//*[@class='fa fa-save']")).isEnabled();

	        if (saveicon==true && saveiconenable==true)
	        {
	               // click on the add button
	        	driver.findElement(By.xpath("//*[@class='fa fa-save']")).click();
	        	System.out.println("verified and clicked on Save icon"); 
	        }

		}	
		catch(Exception e) {
			 System.out.println("save data icon not present" +e);
		}
		}
	

	@Then("verifeis the successful modification message")
	public void verifeis_the_successful_modification_message() {
		try {
			
			  String Actual=driver.findElement(By.xpath("//div[contains (text(),' Success: ')]")).getText();
			  System.out.println(Actual);
			  String Expected="Success: You have modified marketing tracking!";
			  System.out.println(Expected);
			  Assert.assertTrue(Actual.contains(Expected));	 
			}
		
			 catch(Exception e)
		 	{ 
				 System.out.println("successfull modification message does not come"+e); }
			
	}
	
	@Then("add {string} with any value and {string} with two hundred fifty seven characters")
	public void add_with_any_value_and_with_two_hundred_fifty_seven_characters(String cname, String tcode) {
		try { 
			driver.findElement(By.id("input-name")).sendKeys(cname);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"input-code\"]")).sendKeys(Keys.BACK_SPACE);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"input-code\"]")).sendKeys(tcode);
			 Thread.sleep(2000);
			 System.out.println("Tracking field is accepting two hundred fifty seven characters");
			 Assert.fail();
			
		}
			 catch(Exception e){
			 System.out.println("Not able to enter Campaign name and two hundred fifty seven characters in tracking field" +e);
			 }
	}
	
	
	@Then("add {string}, {string} with null value and two hundred fifty seven characters")
	public void add_with_null_value_and_two_hundred_fifty_seven_characters(String Cname, String Cdesc) { try {
		  
			  
		   
	  driver.findElement(By.id("input-name")).sendKeys(Cname);
	  Thread.sleep(1000);
	  driver.findElement(By.id("input-description")).sendKeys(Cdesc);
	  Thread.sleep(1000);
	  System.out.println("able to enter Campaign name and description");
	  } catch(Exception e){
	System.out.println("Not able to enter Campaign name and description" +e); } }
	 
	
	@Then("verifies the Error message")
	public void verifies_the_Error_message() {
		try {
		String Actual=driver.findElement(By.xpath("//*[@class='text-danger']")).getText();
		 System.out.println(Actual);
		 String Expected="Campaign must be between 1 and 32 characters!";
		 System.out.println(Expected);
		 Assert.assertTrue(Actual.contains(Expected));
		 Thread.sleep(1000);
		 System.out.println("Error message displayed"); 
		}
		catch(Exception e) {
			System.out.println("Error message not displayed" +e);
		}
	}

	@Then("Verifies and clicks on save button")
	public void verifies_and_clicks_on_save_button() {
		try {
			boolean cancelicon = driver.findElement(By.xpath("//*[@class='fa fa-reply']")).isDisplayed();
	        boolean canceliconenable = driver.findElement(By.xpath("//*[@class='fa fa-reply']")).isEnabled();

	        if (cancelicon==true && canceliconenable==true)
	        {
	               // click on the add button
	        	driver.findElement(By.xpath("//*[@class='fa fa-reply']")).click();
	        	System.out.println("Cancel icon clicked");
	        }
		}
	        catch(Exception e) {
	   		 System.out.println("Cancel icon not present" +e);
	   	}
	
	}

	@Then("verifies he is navigated to previous Marketing Tracking page")
	public void verifies_he_is_navigated_to_previous_Marketing_Tracking_page() {
		try {
			String val1=driver.findElement(By.xpath("//h1[text()='Marketing Tracking']")).getText();
			System.out.println("Admin navigated to previous Marketing tracking page");
		}
		catch(Exception e) {
			System.out.println("Admin is not navigated to marketing tracking page" +e);
		}
	}
	
	
	@Given("Admin is on Marketing Tracking page")
	public void admin_is_on_Marketing_Tracking_page() {
		try {
			String val1=driver.findElement(By.xpath("//h1[text()='Marketing Tracking']")).getText();
			System.out.println("Admin on Marketing tracking page");
		}
		catch(Exception e) {
			System.out.println("User is not navigated to marketing tracking page" +e);
		}
	}

	
	@When("Admin verifies the checkbox {string} and delete button")
	public void admin_verifies_the_checkbox_and_delete_button(String value) {
		try {
			boolean checkbox = driver.findElement(By.xpath("//input[@value='20']")).isEnabled();
			boolean delete=driver.findElement(By.xpath("//*[@class='btn btn-danger']")).isDisplayed();
	        Assert.assertEquals(checkbox, true);
	        Assert.assertEquals(delete, true);
	    	   System.out.println("Checkbox is displayed");
	    	   System.out.println("Delete icon is displayed");
	    	  
	        
		}	
		catch(Exception e) {
			 System.out.println("Checkbox not present" +e);
			 System.out.println("Delete icon not present" +e);
		}
	}

	@Then("he checks the checkbox {string}")
	public void he_checks_the_checkbox(String value) {
		try {
			driver.findElement(By.xpath("//input[@value='20']")).click();	
			Thread.sleep(3000);
			boolean checkbox = driver.findElement(By.xpath("//input[@value='20']")).isSelected();
			if(checkbox==true) {
				
				System.out.println("Checkbox is selected");
			}
			else {
				System.out.println("Checkbox is not preent");
			}
		}
			catch(Exception e) {
				 System.out.println("Not able to check Checkbox" +e);
			}
	}

	@Then("click on delete button")
	public void click_on_delete_button() {
	   try {
		   driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		   Thread.sleep(1000);
		   System.out.println("able to click delete icon");
	   }
	   catch(Exception e){
		   System.out.println("Not able to click delete icon" +e);
	   }
	}
	@Then("admin checks the alert message")
	public void admin_checks_the_alert_message() {
		try {
		  String Actual=driver.switchTo().alert().getText();
		  System.out.println(Actual);
		  String Expected="Are you sure?";
		  System.out.println(Expected);
		  Assert.assertTrue(Actual.contains(Expected));	 
		  Thread.sleep(2000);
		  System.out.println("Alert box present");
		}
	
		 catch(Exception e)
	 	{ 
			 System.out.println("Alert box not present"+e); }
		
	}

	@Then("admin accept the message in the alert box")
	public void admin_accept_the_message_in_the_alert_box() {
	    try {
	    	
	    	driver.switchTo().alert().accept();  
	    	Thread.sleep(1000);
	    	System.out.println("able to accept in the alert box");
	    }
	    catch(Exception e)
	 	{ 
			 System.out.println("Not able to accept in the alert box"+e); }
	}


	@Then("Validate the modification message")
	public void validate_the_modification_message() {
		try {
			
			  String Actual=driver.findElement(By.xpath("//div[contains (text(),' Success: ')]")).getText();
			  System.out.println(Actual);
			  String Expected="Success: You have modified marketing tracking!";
			  System.out.println(Expected);
			  Assert.assertTrue(Actual.contains(Expected));	 
			}
		
			 catch(Exception e)
		 	{ 
				 System.out.println("successfull modification message does not come"+e); }
			
	}
	@Then("admin cancel in the alert box")
	public void admin_cancel_in_the_alert_box() {

try {
	    	
	    	driver.switchTo().alert().dismiss(); 
	    	Thread.sleep(1000);
	    	System.out.println("able to accept in the alert box");
	    }
	    catch(Exception e)
	 	{ 
			 System.out.println("Not able to accept in the alert box"+e); }

}
	@When("Admin verifies and click on edit icon")
	public void admin_verifies_and_click_on_edit_icon() {
		try {
			boolean editicon = driver.findElement(By.xpath("//*[@id=\"form-marketing\"]/div/table/tbody/tr[1]/td[7]/a")).isDisplayed();
	        boolean editiconenable = driver.findElement(By.xpath("//*[@id=\"form-marketing\"]/div/table/tbody/tr[1]/td[7]/a")).isEnabled();

	  
	        if (editicon==true && editiconenable==true)
	        {
	               // click on the add button
	        	driver.findElement(By.xpath("//*[@id=\"form-marketing\"]/div/table/tbody/tr[1]/td[7]/a")).click();
	        	System.out.println("Edit data icon present and clicked");
	        }

		}	
		catch(Exception e) {
			 System.out.println("Edit data icon not present " +e);
		}
	}
	
	@Then("admin verifies that he is navigated to edit marketing tracking page")
	public void admin_verifies_that_he_is_navigated_to_edit_marketing_tracking_page() {
		 try {
			 String Actual=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/h3")).getText();
			 System.out.println(Actual);
			  String Expected="Edit Marketing Tracking";
			 Assert.assertEquals(Expected, Actual);
			 System.out.println("able to find Add marketing tracking page");
			 }
			 catch(Exception e)
		 	{ 
				 System.out.println("Not able to find Add marketing tracking page"+e); }
			
	}

	@Then("edit {string}")
	public void edit(String cname) {
		try { 
			 driver.findElement(By.id("input-name")).sendKeys(cname);
			 Thread.sleep(1000);
			 System.out.println("able to edit Campaign name");
			 
		}
			 catch(Exception e){
			 System.out.println("Not able to edit Campaign name" +e);
			 }
	}


}



