import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Setting_Name_LastName_Email extends BaseTest{
    // extends sayesinde BaseTest sınıfındaki değişkenler, metodlar ve davranışlar Test_Setting_Name_LastName_Email sınıfına miras(kalıtım) olarak geçer.
    PracticeForm practiceFormPage = new PracticeForm(driver);

    public Test_Setting_Name_LastName_Email(WebDriver driver) {
        super(driver);
    }

    @Test
    public void setName(){
        practiceFormPage.setName("Hakan");
        Assertions.assertEquals("Mustafa",practiceFormPage.getName(),"Name value is not correct!"); // karşılaştırma
    }
    @Test @Ignore // Ignore test metodunun bakım aşamsında veya sıkıntılı olunca atlatılmasını sağlar
    public void setLastName(){
        practiceFormPage.setLastName("sadsdsad@gmail.com");
        Assertions.assertEquals("sadsdsad@gmail.com",practiceFormPage.getLastName(),"");
    }

    @Test
    public void setEmail(){
        practiceFormPage.setEmail("sadsdsad@gmail.com");
        Assertions.assertEquals("sadsdsad@gmail.com",practiceFormPage.getEmail(),"");
    }
}
