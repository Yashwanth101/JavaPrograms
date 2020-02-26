package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableHandling {

    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
        driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/WebTable.html");

        String pages = driver.findElement(By.xpath("//div[@class='ui-grid-pager-panel ng-scope']/div/div[1]/span"))
                .getText();
        System.out.println(pages);

        String Pages = "/ 100";
        String x = Pages.replace(" ", "");
        // System.out.println(x);
        String b[] = x.split("/");
        // System.out.println(b[1]);
        int q = Integer.parseInt(b[1]);
        int z = 0;
        for (int j = 1; j <= q; j++) {

            for (int i = 1; i <= 10; i++) {

                String LastName = driver
                        .findElement(By.xpath("//div[@class='ui-grid-canvas']/div[" + i + "]/div/div[4]")).getText();

                if (LastName.equalsIgnoreCase("Schinner")) {
                    // System.out.println(LastName);
                    Actions a = new Actions(driver);
                    WebElement element = driver.findElement(By.xpath(
                            "//div[@class='ui-grid-canvas']/div[" + i + "]/div/div[6]/user-click-select/div/button/i"));
                    a.doubleClick(element).build().perform();
                    i = 11;
                    q += 1;
                    z++;

                }

                if (i == 7) {
                    WebElement element = driver
                            .findElement(By.xpath("//div[@class='ui-grid-canvas']/div[10]/div/div[4]"));
                    js.executeScript("arguments[0].scrollIntoView()", element);
                }

            }

            if (z == 0) {
                js.executeScript("scroll(0, -250);");

                driver.findElement(By
                        .xpath("//div[@class='ui-grid-pager-panel ng-scope']/div/div/button[@class='ui-grid-pager-next']"))
                        .click();
            }

        }
    }


}
