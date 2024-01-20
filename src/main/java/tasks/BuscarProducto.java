package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {

    private String descripcion;
    public BuscarProducto(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcion).into(),
                SelectFromOptions.byVisibleText("").from()
        );
    }
    public static BuscarProducto conDescripcion(String descripcion) {
        return instrumented(BuscarProducto.class, descripcion);
    }
}
