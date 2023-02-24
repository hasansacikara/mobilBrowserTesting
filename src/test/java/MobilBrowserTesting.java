import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;


public class MobilBrowserTesting {

    @Test
    public void Mobil() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "PIXEL");
        caps.setCapability("browserName", "chrome");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
        caps.setCapability("chromedriverExecutable", "C:\\Users\\DELL\\IdeaProjects\\mobilBrowserTesting\\src\\driver\\chromedriver.exe");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);
/*
        // müsteri amazon anasayafaya gider
        driver.get("https://www.amazon.com.tr");

        // Applikasyonun hangi türleri oldugunu görmek icin getContextHandles(); kullanıyoruz

        Set<String> butunTurler = driver.getContextHandles();

        for (String tur : butunTurler) {

            System.out.println(tur);

            if (tur.contains("WEBVIEW_chrome")) {

                driver.context(tur);

            }
        }
        System.out.println(driver.getContext() + " Anasayfaya ulasildi");

 */


        // müsteri amazon anasayafaya gider
        // driver.get("https://www.amazon.com.tr");
        // cookies kabul ett
        //MobileElement cokies = driver.findElement(By.xpath("//input[@name='accept']"));
        // cokies.click();

        // MobileElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        //Assert.assertTrue(logo.isEnabled());
        //MobileElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //search.sendKeys("iphone" + Keys.ENTER);


        // müsteri amazon anasayafaya gider
        driver.get("https://www.amazon.com.tr");
        // cookies kabul ett
        MobileElement cokies = driver.findElement(By.xpath("//input[@name='accept']"));
        cokies.click();
        MobileElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(logo.isEnabled());

        MobileElement singUp = driver.findElement(By.xpath("//a[@id='nav-logobar-greeting']"));
        singUp.click();

        MobileElement singUpTitle = driver.findElement(By.tagName("h2"));
        Assert.assertTrue(singUpTitle.isEnabled());

        MobileElement newAccount = driver.findElement(By.xpath("//a[@id='register_accordion_header']"));
        newAccount.isDisplayed();
        newAccount.click();

        driver.findElement(By.xpath("//*[@id='ap_customer_name']"))
                .sendKeys("Hasan sacikara" + Keys.ENTER);
    }
}
























