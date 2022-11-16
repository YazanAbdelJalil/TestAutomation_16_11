import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Home_pag {

 public static void main(String[] args) {
	    
	System.setProperty("webdriver.edgedriver.driver", "D:\\edgedriver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://127.0.0.1:5500/index.html");
	List<WebElement> myOption=driver.findElements(By.tagName("option"));
		for(int i=0; i<myOption.size();i++) {
			
			if(i%2!=0) {
				myOption.get(i).click();
				System.err.println("sorry i will remove" + myOption.get(i).getText());
				driver.findElement(By.id("remove")).click();
				
			}else {
				
				System.out.println("i will keeep"+ myOption.get(i).getText());
			}
			
		}
		
		

	}

}
