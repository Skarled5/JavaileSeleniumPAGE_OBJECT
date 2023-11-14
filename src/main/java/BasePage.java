import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver; // bu aynı class ve alt sınıflardan erişim sağlanabilir
    String baseUrl = "https://demoqa.com";

    public BasePage(WebDriver driver){
        this.driver = driver; // super(driver) bunu kendi classına alıp bu classs method iletişim sağlıyor
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public  void click(By locator){
        find(locator).click();
    }

    public void type(By locator,String text){
        find(locator).sendKeys(text);
    }

    public  Boolean isSelected(By locator){
        return find(locator).isSelected();
    }
}