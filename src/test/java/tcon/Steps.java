package tcon;

import cucumber.api.java.en.When;

public class Steps {


    @When("^I wait$")
    public void wait_for(){
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}