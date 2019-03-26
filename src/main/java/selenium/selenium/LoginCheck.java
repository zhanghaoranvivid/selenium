package selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginCheck {
	public WebDriver driver;
	public void Init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZTE_Ting\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imooc.com/");
		this.Wait(3000);
	    
	}
	public void LoginUser() {
		String email ="841847539@qq.com";
		String passwordNumber = "Zhr196811";
		String buttonLogin = "js-signin-btn";
		String emailElement = "email";
		String passwordElement = "password";
		String loginButton = "moco-btn-red";
		String headerElement = "header-avator";
		String checkUser = "name";
		String classBy = "className";
		String idBy = "id";
		String classNameBy = "className";
		String nameBy= "name";
		
		this.element(this.ByStr(idBy,buttonLogin )).click();
	    this.Wait(5000);
		WebElement user = this.element(this.ByStr(nameBy,emailElement));
		user.sendKeys(email);
		WebElement password = this.element(this.ByStr(nameBy,passwordElement));
		password.sendKeys(passwordNumber);
		driver.findElement(this.ByStr(classNameBy,loginButton)).click();
		this.Wait(5000);
		WebElement header = this.element(this.ByStr(idBy,headerElement));
		Actions actions = new Actions(driver);
		actions.moveToElement(header).perform();
		String status = this.element(this.ByStr(classNameBy,checkUser)).getText();
	    if(status.equals("qq_ViVi的_03185443")){
	    	System.out.println("login susccess");
	    	}
	    else {
	    	System.out.println("login unsuccess");
	    }
;		
	}
	public By ByStr(String by, String local) {
		if(by.equals("name")) {
			return By.name(local);
		}
		else if(by.equals("className")){
			return By.className(local);
		}
		else if(by.equals("id")){
			return By.id(local);
		}
		else {
			return By.xpath(local);
		}
		
	}
	/*
	 * 封装element
	 */
	public WebElement element(By by) {
		WebElement elm = driver.findElement(by);
		return elm;
	}
	
	public void Wait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginCheck action = new LoginCheck();
		action.Init();
		action.Wait(5000);
		action.LoginUser();
	}

}
