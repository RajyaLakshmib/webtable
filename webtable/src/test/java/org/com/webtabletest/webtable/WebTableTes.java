package org.com.webtabletest.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTes {
	
	public static void main(String arg[]) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajya Lakshmi\\eclipse-workspace\\webtable\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		////*[@id="customers"]/tbody/tr[1]/th[1]
		////*[@id="customers"]/tbody/tr[2]/td[1]
		////*[@id="customers"]/tbody/tr[3]/td[1]
		////*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2;i<=7;i++) {
			//System.out.println(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[1]")).getText());
			String xpathh = beforeXpath+i+afterXpath;
			System.out.println(xpathh.equals("//*[@id='customers']/tbody/tr[2]/td[1]")+" " +xpathh +" "+"//*[@id='customers']/tbody/tr[2]/td[1]");
			WebElement temp = driver.findElement(By.xpath(xpathh));
			System.out.println(temp.getText());
		}
		
	}

}
