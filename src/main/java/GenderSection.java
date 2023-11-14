import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Scanner;

public class GenderSection extends BasePage {
    //

    // private WebDriver driver; AYNI ŞEKİLDE BURADADA GEREK YOK
    private List<WebElement> radioButtons;


    public  GenderSection(WebDriver driver){
        super(driver); // yani yapıcı method sınıfta ilk çalışan şey ve tüm sınıfı kapsıyor
        // super(driver) nesne yönenlimli programlamada üst sınıfta driver nesnesini almayı sağlar !
        this.driver = driver;
        radioButtons = driver.findElements(By.xpath("//input[@name='gender']"));
    }

    public void clickRadioBUtton(int index){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hangi indeksi seçmek istersiniz (0: Erkek, 1: Kadın, 2: Diğer): ");
        index = scanner.nextInt(); // pythondaki a=int(input("")) gibi
        if (index >= 0 && index < radioButtons.size()) { // dinamiklik sağlıyor
            radioButtons.get(index).click();
            boolean radioButtonSelected = radioButtons.get(index).isSelected(); // isSelected bu tür durumlarda kullanılır
            assert radioButtonSelected : "Radyo düğmesi tıklanmadı veya seçilmedi.";
        } else {
            System.out.println("Geçersiz indeks. Lütfen geçerli bir indeks seçin.");
        }

    }

    public boolean isRadioButtonChecked(){
        return true;
    }


}