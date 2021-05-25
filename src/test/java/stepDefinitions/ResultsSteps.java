package stepDefinitions;

import common.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ResultsSteps {
    Calculator calc = new Calculator();
    private int trackResult;
    private int lengthResult;

    @Given("I have entered track {double} in seconds")
    public void i_have_entered_track_in_seconds(double results) {

        calc.setTrackSeconds(results);
    }

    @When("I ask for results")
    public void i_ask_for_results() {
        trackResult = calc.getTrackResults();

    }

    @Then("I should get track {int} back")
    public void i_should_get_track_back(int points) {

        Assert.assertEquals(points, trackResult);
    }


    @Given("I ask for cm {double}")
    public void i_ask_for_cm(Double result) {


    }


    @When("I ask for cm results")
    public void i_ask_for_cm_results() {



    }

    @Then("i should get cm {int} back")
    public void i_should_get_cm_back(int points) {

    }
}
