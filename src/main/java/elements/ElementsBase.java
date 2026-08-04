package elements;

import org.openqa.selenium.WebDriver;

import com.automationexecrise.genericutilities.WaitStratergy;

public class ElementsBase {
protected WebDriver driver;
protected WaitStratergy wait;
	
	
 public	ElementsBase(WebDriver driver) {
	 this.driver=driver;
	 wait=new WaitStratergy(driver);
 }
}
