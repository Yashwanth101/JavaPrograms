public class WindowHandling {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String mainwindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String childwindow = itr.next();
			
			if(!mainwindow.equalsIgnoreCase(childwindow)){
				String title = driver.switchTo().window(childwindow).getTitle();
				System.out.println(title);
				driver.close();
				
			}
			driver.switchTo().window(mainwindow)
;		}
		
	}
	
	

}
