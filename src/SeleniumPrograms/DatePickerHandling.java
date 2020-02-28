package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DatePickerHandling {

    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
        driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        WebElement element = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody"));

        List<WebElement> e = element.findElements(By.tagName("td"));

        for(WebElement i:e){
            if(i.getText().equalsIgnoreCase("20")){
                i.click();
            }
        }

    }

}
