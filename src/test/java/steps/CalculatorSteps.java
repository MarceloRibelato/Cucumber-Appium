package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalculatorPage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;

public class CalculatorSteps extends BaseSteps{

    CalculatorPage calc;

    public CalculatorSteps() {
        this.calc = new CalculatorPage();
    }

    @Given("que insiro os dois numeros")
    public void que_insiro_os_dois_numeros() throws MalformedURLException {


    }

    @When("tocar no sum")
    public void tocar_no_sum() {
        calc.sum();
    }

    @Then("devo ver o resultado da soma")
    public void devo_ver_o_resultado_da_soma() {
        assertTrue(calc.getResult().equals("10"));
    }

    @Given("^the user types the first number\"([^\"]*)\" and second number\"([^\"]*)\"$")
    public void the_user_types_the_first_number_and_second_number(String first_number, String second_number) throws Throwable {
        calc.typeFirstNumber(first_number);
        calc.typeSecondNumber( second_number);
        calc.closeKeyboard();
    }

    @When("^the user clicks on sum button$")
    public void the_user_clicks_on_sum_button() throws Throwable {
        calc.sum();
    }

    @Then("^the result should be displayed \"([^\"]*)\"$")
    public void the_result_should_be_displayed(String expectedResult) throws Throwable {
        assertTrue(calc.getResult().equals(expectedResult));
    }
}