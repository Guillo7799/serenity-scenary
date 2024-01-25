package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.CheckoutPage.*;

public class CompleteForm implements Task {
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String code;
    private String observation;


    public CompleteForm(String name, String lastname, String email, String phone, String address, String city, String code, String observation){
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.code = code;
        this.name = observation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_THE_FIRSTNAME), //Presionar en campo name
                Enter.theValue(name).into(INPUT_THE_FIRSTNAME), //Ingresa el valor del nombre
                Enter.theValue(lastname).into(INPUT_THE_LASTNAME), //Ingresa el valor del apellido
                Enter.theValue(email).into(INPUT_THE_EMAIL), //Ingresa el valor del correo
                Enter.theValue(phone).into(INPUT_THE_PHONE), //Ingresa el valor del telefono
                Enter.theValue(address).into(INPUT_THE_ADDRESS), //Ingresa el valor de la dirección
                Enter.theValue(city).into(INPUT_THE_CITY), //Ingresa el valor de la ciudad
                Enter.theValue(code).into(INPUT_THE_POSTCODE), //Ingresa el valor del código postal
                Click.on(LINK_PAGE_COUNTRY), //Presiona en campo country
                Click.on(INPUT_THE_CITY), //time to data
                Click.on(INPUT_THE_POSTCODE), //time to data two
                Click.on(LINK_PAGE_REGION), //Presiona en campo region
                Click.on(BUTTON_TO_CONTINUE_TWO) //botón en continuar dos
        );

    }

    public static CompleteForm addInfo(String name, String lastname, String email, String phone, String address, String city, String code, String observation){
        return instrumented(CompleteForm.class, name, lastname, email, phone,address,city,code,observation);
    }
}
