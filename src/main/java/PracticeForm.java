import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeForm extends BasePage {


    // private WebDriver driver; BU DRİVER GEREK YOK ÇUNKU BASEPAGE'deki DRİVER KULLANIYORUZ !!!
    private final By name = By.id("firstName");
    private final By lastname = By.id("lastName");
    private final By email = By.id("userEmail"); // private yapılmasının sebebi bu class dışından başka class ile erişim yasağı koyuyor

    private String nameText = "Ahmet";

    private GenderSection genderSection;


    public PracticeForm(WebDriver driver) {
        super(driver); // driver dememizin sebebi driver ile üst sınıftaki methodlara ulaşabiliyoruz !
        driver.get(baseUrl.concat("/automation-practice-form/")); // her methoda bu get işlemini yapmak yerine sadece yapıcı method kullanıp bütün class çalışmasını sağlıyoruz
        this.driver = driver;
        genderSection = new GenderSection(driver);
    }


    public void  setName(){
        //WebElement nameSpace = driver.findElement(name);
        //nameSpace.click();
        //nameSpace.sendKeys(nameText);
        type(name, nameText);
    }

    public void setLastName(String lastNameText){
        WebElement nameSpace = driver.findElement(lastname);
        nameSpace.click();
        nameSpace.sendKeys(lastNameText);
    }

    public void  setEmail(String emailText){
        WebElement nameSpace = driver.findElement(email);
        nameSpace.click();
        nameSpace.sendKeys(emailText);
    }

    public String getName(){
        WebElement nameSpace = driver.findElement(name);
        return nameSpace.getAttribute("value"); // bu şekilde isim yazıldığı vakit text görünmeyenleri alabiliyoruz

    }

    public  String getLastName(){
        WebElement lastnameSpace = driver.findElement(lastname);
        return lastnameSpace.getAttribute("value");
    }

    public  String getEmail() {
        WebElement lastnameSpace = driver.findElement(email);
        return lastnameSpace.getAttribute("value");
    }


}
