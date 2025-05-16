import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest extends DriverSetup {
    @Test
    public void testWebPageLoad (){

        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    public void testWebPageTitle(){

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

    }


}
