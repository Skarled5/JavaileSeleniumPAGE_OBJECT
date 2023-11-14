import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest extends BasePage  {
    // protected WebDriver driver ; BasePage driver alındoğı için sorun olmaz
    PracticeForm practiceForm ;

    public BaseTest(WebDriver driver) {
        super(driver);
    }

    @BeforeAll // bu bütüm methodlardan "önce" çalışacak TestNG de BeforeCLass olarak kullanılır
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hakan\\IdeaProjects\\Java ile Selenium PAGE OBJECT\\drivers\\chromedriver_win32 (2).zip");
        driver = new ChromeDriver();
        driver.get(baseUrl.concat("/automation-practice-form/")); // concat birleştirme sağlıyor
    }
    @AfterAll // bütün methodlardan "sonra" çalışacak
    public void setClose(){
        driver.quit();
    }
}
