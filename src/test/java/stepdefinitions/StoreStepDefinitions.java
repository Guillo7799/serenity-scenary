package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;
import userinterfaces.HomePage;

import java.util.List;

public class StoreStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("GalesDv");
    private HomePage homePage = new HomePage();

    @Given("^the customer is in the home page$")
    public void theCustomerIsInTheHomePage() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^the customer adds (.*) to the cart$")
    public void theCustomerAddsTheFirtsItemToTheCart(String producto) {
        actor.wasAbleTo(
                SearchProduct.withNames(producto),
                AddProduct.cart(producto)
        );
    }

    @When("^the customer puts (.*) to the cart$")
    public void theCustomerAddsTheSecondItemToTheCart(String secondproduct) {
        actor.wasAbleTo(
                SearchProduct.withNames(secondproduct),
                AddProduct.cart(secondproduct)
        );

    }

    @Then("^the customer could see the shopping cart$")
    public void theCustomerCouldTheShoppingCart() {
        actor.attemptsTo(
                SeeCart.viewCheckout()
        );

    }

    @When("^the customer checkout the cart as a Guest$")
    public void theCustomerCheckoutTheCartAsAGuest() {
        actor.attemptsTo(
                GuestCheckout.selection()
        );

    }

    @When("^the customer completes the formulary with these data (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), in the form$")
    public void theCustomerCompletesTheFormularyWithTheFollowingInformation(String name, String lastname, String email, String phone, String address, String city, String code, String observation ) {
        actor.attemptsTo(
                CompleteForm.addInfo(name,lastname,email,phone,address,city,code,observation),
                DeliveryDetails.writeObservation(observation)
        );
    }

    @Then("^the customer finish to purchase the order$")
    public void theCustomerFinishToPurchaseTheOrder() {
        // Write code here that turns the phrase above into concrete actions

    }
}
