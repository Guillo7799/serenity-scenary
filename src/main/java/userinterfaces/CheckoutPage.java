package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opencart.abstracta.us/index.php?route=checkout/checkout")
public class CheckoutPage {

    public static final Target SELECT_TYPE_GUEST = Target.the("Checkbox to select type Guest").located(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input"));
    public static final Target BUTTON_TO_CONTINUE = Target.the("Button continue").located(By.xpath("//*[@id=\"button-account\"]"));
    public static final Target INPUT_THE_FIRSTNAME = Target.the("First Name").located(By.xpath("//*[@id=\"input-payment-firstname\"]"));
    public static final Target INPUT_THE_LASTNAME = Target.the("Last Name").located(By.xpath("//*[@id=\"input-payment-lastname\"]"));
    public static final Target INPUT_THE_EMAIL = Target.the("Email").located(By.xpath("//*[@id=\"input-payment-email\"]"));
    public static final Target INPUT_THE_PHONE = Target.the("Phone").located(By.xpath("//*[@id=\"input-payment-telephone\"]"));
    public static final Target INPUT_THE_ADDRESS = Target.the("Address 1").located(By.xpath("//*[@id=\"input-payment-address-1\"]"));
    public static final Target INPUT_THE_CITY = Target.the("City").located(By.xpath("//*[@id=\"input-payment-city\"]"));
    public static final Target INPUT_THE_POSTCODE = Target.the("Post code").located(By.xpath("//*[@id=\"input-payment-postcode\"]"));
    public static final Target LINK_PAGE_COUNTRY = Target.the("Country").located(By.xpath("//*[@id=\"input-payment-country\"]"));
    public static final Target LINK_PAGE_REGION = Target.the("Region").located(By.xpath("//*[@id=\"input-payment-zone\"]"));

}
