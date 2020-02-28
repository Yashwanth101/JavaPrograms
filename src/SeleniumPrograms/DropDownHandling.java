package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHandling {
    public static void main(String[] args) {
        WebDriver driver = null;
        Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        List<WebElement> drop = s.getOptions();
        for(WebElement d:drop){
            if(d.getText().equalsIgnoreCase("INDIA")){
                d.click();
            }
        }

    }
}
