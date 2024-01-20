package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AddProduct;
import tasks.BuscarProducto;
import tasks.SearchProduct;
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

    @When("^the customer adds (.*) to the cart$")
    public void theCustomerAddsTheSecondItemToTheCart(List<String> Data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }

    @Then("^the customer could the shopping cart$")
    public void theCustomerCouldTheShoppingCart() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^the customer checkout the cart as a Guest$")
    public void theCustomerCheckoutTheCartAsAGuest() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^the customer completes the formulary with the following information$")
    public void theCustomerCompletesTheFormularyWithTheFollowingInformation(List<String> Data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }

    @Then("^the customer finish to purchase the order$")
    public void theCustomerFinishToPurchaseTheOrder() {
        // Write code here that turns the phrase above into concrete actions

    }
}
