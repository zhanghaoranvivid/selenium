package selenium.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {
	public WebDriver driver;
	public void InitDriver(){
		System.setProperty("webdriver.chrome.driver","/Users/zhanghaoran/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.imooc.com/user/newlogin");
	}
	public void InputBox() {
		WebElement user = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		user.sendKeys("841847539@qq.com"); 
		password.sendKeys("Zhr196811");
		driver.findElement(By.className("moco-btn-red")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String user_info = user.getAttribute("placeholder");
		System.out.println(user_info);
		String user_value = user.getAttribute("value");
		System.out.println(user_value);
		boolean enable = user.isEnabled();
		System.out.println(enable);
	}
	public void RedioBox() {
		
		driver.get("https://www.imooc.com/user/setprofile");
		driver.findElement(By.className("pull-right")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement sex_value =  driver.findElement(By.className("moco-control-input"));
		List<WebElement> sex_list = sex_value.findElements(By.tagName("input"));
		for(WebElement sex:sex_list) {
			boolean flag = sex.isSelected();
			if(flag == true) {
				continue;
			}
			else {
				sex.click();
				break;
			}
		}
		
	}
	
	public void checkBox() {
		WebElement check = driver.findElement(By.id("auto-signin"));
		System.out.println("是否选择" + check.isSelected());
		System.out.println("是否可选" + check.isEnabled());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		check.click();
	}
	public void button() {
		WebElement Login_button = driver.findElement(By.className("moco-btn-red"));
		String jscript ="document.getElementsByClassName(\'moco-btn-red \')[0].style.display='none'";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(jscript);
		System.out.println("是否有按键" + Login_button.isDisplayed());
		System.out.println("是否有按键" + Login_button.isEnabled());
		Login_button.click();		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selenium2 action = new selenium2();
		action.InitDriver();
		//action.button();
		//action.checkBox();
		action.InputBox();
		 action.RedioBox();
			
	}

}
