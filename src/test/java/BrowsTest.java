
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by mattiassvensson on 2017-07-07.
 */
public class BrowsTest {

    public WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
    }
    @Test
    public void openBrowser(){

        driver.get("https://www.danielwellington.com/se/");
    }
}
