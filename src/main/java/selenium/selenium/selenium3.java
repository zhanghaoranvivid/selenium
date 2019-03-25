package selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium3 {

	public WebDriver driver;
	public void Init() {
		System.setProperty("webdriver.chrome.driver", "/Users/zhanghaoran/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.imooc.com/user/newlogin");
	}
	public void Input() {
		WebElement user = driver.findElement(By.tagName("input"));
		user.sendKeys("1111");
	}
	public void redio() {
		driver.get("https://www.imooc.com/user/setprofile");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selenium3 action = new selenium3();
		action.Init();
		action.Input();
		
	}

}
