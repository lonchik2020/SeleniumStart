package SeleniumOur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumCssIlcarro {

    WebDriver driver;

    @Test
    public void test1(){
        driver = new ChromeDriver();//to go to chrome
        driver.navigate().to("https://ilcarro.web.app/search");//to move to the url
        driver.manage().window().maximize();//to make the window browser full screen
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //when looking for a new elements - waiting 60 sec max. if not found the element -
        // will received exception or empty list

        WebElement h2TextElement = driver.findElement(By.cssSelector("h2"));//h2 it`s a tag name
        //to find element by css selector
        System.out.println(h2TextElement.getText());//to see the text from the element

        WebElement h2ByTagName = driver.findElement(By.tagName("h2"));

        //By.cssSelector("h2.subtitle")

        WebElement h2TextElementByClass = driver.findElement(By.cssSelector(".subtitle"));//by class value
        System.out.println(h2TextElementByClass.getText());

        WebElement h2TextElementByClassName = driver.findElement(By.className("subtitle"));//by class name
        System.out.println(h2TextElementByClassName.getText());

        WebElement h2ByClassAndTagTogether = driver.findElement(By.cssSelector("h2.subtitle"));
        //to find from a fragment from html tree

        WebElement inputCityById = driver.findElement(By.cssSelector("#city"));//by id value
        System.out.println(inputCityById.getAttribute("type"));//value of attribute type

        WebElement inputCityByIdDirectly = driver.findElement(By.id("city"));//by id value
        System.out.println(inputCityByIdDirectly.getAttribute("type"));//value of attribute type


        WebElement wildElementAttribute = driver.findElement(By.cssSelector("[style='touch-action: none; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);']"));
        //find by full attribute incl name and value

        //WebElement h2ByText = driver.findElement(By.linkText("Type your data and hit Yalla!"));
        WebElement h2ByText = driver.findElement(By.partialLinkText("hit"));




//        try {
//            Thread.sleep(5000);//to freeze all actions for 5000 mil seconds
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //xpath!!!!!!!!!

        WebElement xpathLabel = driver.findElement(By.xpath("//label[@for='city']"));
        // //label[for='city']/.. jump to 1 tag up
        // //label[for='city']/ span

        System.out.println(xpathLabel.getText());


        driver.quit();
    }
}
