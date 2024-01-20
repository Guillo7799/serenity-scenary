package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CartPage.*;
import static userinterfaces.HomePage.*;

public class SeeCart implements Task {

    public static SeeCart viewCheckout() {
        return instrumented(SeeCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_PAGE_CART),//Click to see the resume
                Click.on(CLICK_TO_CHECKOUT) //Click to checkout the purchase
        );

    }
}
