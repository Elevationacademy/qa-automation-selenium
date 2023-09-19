package steps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateUserSteps {

    private TestContext testContext;

    public CreateUserSteps(TestContext context){
        testContext = context;
    }
     @Given("I create a random user")
    public void iCreateARandomUser() {
         String username = "something random";
         testContext.put(ContextKeys.RANDOM_USER.toString(), username);
    }


}
