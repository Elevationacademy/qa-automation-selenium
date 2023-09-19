package steps;

import context.TestContext;
import io.cucumber.java.en.When;

public class LoginSteps {
    private TestContext testContext;

    public LoginSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @When("I login with the random user")
    public void iLoginWithTheRandomUser() {
        String username = testContext.get(ContextKeys.RANDOM_USER.toString());
        login(username);

    }

    private void login(String username){
        System.out.println("Logging user: " + username);
    }
}
