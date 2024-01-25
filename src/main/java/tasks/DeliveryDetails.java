package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetailsPage.*;

public class DeliveryDetails implements Task {

    private String observation;
    public DeliveryDetails(String observation){
        this.observation = observation;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(observation).into(INPUT_THE_OBSERVATION_ONE), //Ingreso de observación
                Click.on(BUTTON_TO_CONTINUE_THREE),
                Enter.theValue(observation).into(INPUT_THE_OBSERVATION_TWO), //Ingreso de observación dos
                Click.on(INPUT_THE_OBSERVATION_TWO), //time to select
                Click.on(SELECT_CONDITION_OPTION), //Seleccionar términos y condiciones
                Click.on(BUTTON_TO_CONTINUE_FOUR), //Presionar botón continuar
                Click.on(BUTTON_CONFIRM_ORDER) // Confirmar orden
        );
    }

    public static DeliveryDetails writeObservation(String observation) {
        return instrumented(DeliveryDetails.class, observation);
    }
}
