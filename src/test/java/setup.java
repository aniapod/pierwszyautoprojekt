import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.Writer;

public class setup {
    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;

    @BeforeEach
    public void setup() {


        System.setProperty("webdriver.chrome.driver", projectLocation + "/sterownik.chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }
    @AfterEach
    public void close() {

        //driver.close();

    }
}