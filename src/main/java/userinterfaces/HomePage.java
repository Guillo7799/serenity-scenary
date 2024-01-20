package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://opencart.abstracta.us/")
public class HomePage extends PageObject {

    public static final Target INPUT_SEARCH_OBJECT = Target.the("Input to put the name of the product").located(By.xpath("//*[@id=\"search\"]/input"));
    public static final Target BUTTON_SEARCH_OBJECT = Target.the("Button search").located(By.xpath("//*[@id=\"search\"]/span/button"));
    public static final Target LINK_FOUND_OBJECT = Target.the("Found object in screen").located(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]"));
}
