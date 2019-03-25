package selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
	public static void main(String[] args){
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","/Users/zhanghaoran/Downloads/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.imooc.com/user/newlogin");
		 driver.findElement(By.tagName("input")).sendKeys("88888");
		 driver.findElement(By.name("password")).sendKeys("66666");
		 }
}
