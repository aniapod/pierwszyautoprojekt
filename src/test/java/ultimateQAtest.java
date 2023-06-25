import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ultimateQAtest extends setup{

    @Test
    public void testone() {
        WebElement butteon = driver.findElementById( "idExample");
        butteon.click();

        WebElement tekst =   driver.findElementByClassName( "entry-title");
        Assertions.assertEquals("butteon success", tekst.getText());


    }
}





