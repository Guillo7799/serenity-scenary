package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opencart.abstracta.us/index.php?route=checkout/checkout")
public class DetailsPage {

    public static final Target INPUT_THE_OBSERVATION_ONE = Target.the("Observation one").located(By.xpath("/html/body/div[2]/div/div/div/div[4]/div[2]/div/p[4]/textarea"));
    public static final Target PRESS_OPTION_AREA = Target.the("Option area").located(By.xpath("/html/body/div[2]/div/div/div/div[4]/div[1]/h4/a"));
    public static final Target BUTTON_TO_CONTINUE_THREE = Target.the("Button continue three").located(By.xpath("/html/body/div[2]/div/div/div/div[4]/div[2]/div/div[2]/div/input"));
    public static final Target INPUT_THE_OBSERVATION_TWO = Target.the("Observation two").located(By.xpath("/html/body/div[2]/div/div/div/div[5]/div[2]/div/p[3]/textarea"));
    public static final Target SELECT_CONDITION_OPTION = Target.the("Terms & conditions").located(By.xpath("//*[@name=\"agree\"]"));
    public static final Target BUTTON_TO_CONTINUE_FOUR = Target.the("Observation four").located(By.xpath("/html/body/div[2]/div/div/div/div[5]/div[2]/div/div[3]/div/input[2]"));
    public static final Target BUTTON_CONFIRM_ORDER = Target.the("Button confirm order").located(By.xpath("/html/body/div[2]/div/div/div/div[6]/div[2]/div/div[3]/div/input"));


}
