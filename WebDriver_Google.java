package Home_WithgoogleChorme1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Google
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // WebDriver driver= new ChromeDriver();
        //  System.setProperty("Manisha","C:/Software/Driver/chromedriver.exe");
        driver.get("https://www.ebay.co.uk/");
       // driver.get("https://mail.google.com/mail/u/0/");
        String url= driver.getCurrentUrl();
        String Title=driver.getTitle();
        String  Text =driver.toString();

        System.out.println("web  site name"+url);
        System.out.println("title"+Title);
        System.out.println("text ="+Text);
      /*  if(url.contentEquals())
        {
            System.out.println("it is  successfully");
        }
        else
        {
            System.out.println("it is not successfully");
        }*/




    }
}