package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProduct implements Task {

    private String producto;
    public SearchProduct(String producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(), //Put name product
                Click.on(), //click search
                Hit.the(Keys.ENTER).into(), //press enter
                Click.on()//Select the product
        );
    }
    public static SearchProduct withNames(String producto) {
        return instrumented(SearchProduct.class, producto);
    }
}
