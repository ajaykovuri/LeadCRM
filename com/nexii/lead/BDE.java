package com.nexii.lead;

import java.util.List;

import org.testng.annotations.Test;

public class BDE extends Helper {
 
  @Test    
  public void bde_test() {
	  helper.openBrowser();

	  //helper.login_CRM();

	 // helper.login_CRM();

	  //Sreekar, continue the code heressss
	  @Test   
		public void aBDM_test_expand_close_menu() 
		{
		  List<WebElement> lis = driver.findElement(By.className("menu")).findElements(By.className("close"));
		  helper.sleep(3);
		  System.out.println(lis.size());
		  helper.sleep(1);
		  for (int i = 0; i < lis.size(); i++)
		  {
		    System.out.println("Expanding::"+lis.get(i).getText());
			lis.get(i).findElement(By.className("    symbol-close")).click();
			helper.sleep(1);
		  }
		  helper.sleep(3);
		  List<WebElement> lis2 = driver.findElement(By.className("menu")).findElements(By.className("open"));
		  helper.sleep(1);
		  System.out.println(lis2.size());
		  helper.sleep(1);
		  for (int i = 0; i < lis2.size(); i++)
		  {
		    System.out.println("Closing::"+lis2.get(i).getText());
			lis.get(i).findElement(By.className("     symbol-open")).click();
			helper.sleep(1);
		  }  
		  driver.close();
	    }
	  
  }
}
