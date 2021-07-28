package steps;

import base.baseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class steps extends baseTest {

    String text ="";

    @Given("I want to go to choucair portal")
    public void i_want_to_go_to_choucair_portal() {
        // Write code here that turns the phrase above into concrete actions
        text= hPage.empleoText();
    }

    @Then("I should see empleo button")
    public void i_should_see_empleo_button() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(text,"Empleos");
    }




}
