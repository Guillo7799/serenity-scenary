package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class SearchProduct implements Task {

    private String producto;
    public SearchProduct(String producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(INPUT_SEARCH_OBJECT), //Put name product
                Click.on(BUTTON_SEARCH_OBJECT), //click search
                Hit.the(Keys.ENTER).into(BUTTON_SEARCH_OBJECT), //press enter
                Click.on(LINK_FOUND_OBJECT)//Select the product
        );
    }
    public static SearchProduct withNames(String producto) {
        return instrumented(SearchProduct.class, producto);
    }
}
