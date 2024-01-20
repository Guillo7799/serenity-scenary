package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CartPage.*;

public class SeeCart implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SEE_CART), //Click to see the resume
                Click.on(CLICK_TO_CHECKOUT) //Click to checkout the purchase
        );

    }
    public static SeeCart viewCheckout() {
        return instrumented(SeeCart.class);
    }

}
