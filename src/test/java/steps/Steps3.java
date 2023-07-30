package steps;

import context.TestContext;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Steps3 {
    private TestContext context;
    public Steps3(TestContext context) {
        this.context=context;
    }

    @Then("Context key {} has value {}")
    public void contextKeyThingHasValueSomething(String key, String value) {
        assertEquals(value, this.context.get(key));
    }
}
