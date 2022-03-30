import com.exercise.VowelCount;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class VowelSteps {

    String[] stringArray;

    @When("I pass the string")
    public void iPassTheString(List<String> data) {
        this.stringArray = data.toArray(new String[0]);
    }

    @Then("I should see the count of the vowel and consonant")
    public void iShouldSeeTheCountofVowelAndConsonant() {
        assertThat(VowelCount.main(stringArray),is(true));
    }

    @When("I pass more than 4 string")
    public void iPassMoreThan4String(List<String> data) {
        this.stringArray = data.toArray(new String[0]);
    }

    @Then("I should see the error")
    public void iShouldSeeTheError() {
        assertThat(VowelCount.main(stringArray),is(false));
    }


}
