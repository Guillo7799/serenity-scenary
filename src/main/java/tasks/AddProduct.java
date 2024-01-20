package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {

    private String producto;
    public AddProduct(String producto){
        this.producto=producto;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on() // add to cart
        );
    }
    public static AddProduct cart(String producto) {
        return instrumented(AddProduct.class, producto);
    }
}
