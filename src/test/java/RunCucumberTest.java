import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
@RunWith(Cucumber.class)
public class RunCucumberTest {
}
