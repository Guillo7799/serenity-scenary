package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CheckoutPage.*;

public class GuestCheckout implements Task {
    public static GuestCheckout selection() {
        return instrumented(GuestCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_TYPE_GUEST),//Select guest type checkout
                Click.on(BUTTON_TO_CONTINUE) //Continue with the checkout
        );

    }
}
