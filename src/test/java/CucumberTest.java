import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "pretty", "summary", "json:target/cucumber-report/report.json"},
        glue = {"com/epam/jdi/httptests/steps", "com/epam/jdi/http/stepdefs/en"}
)
public class CucumberTest {

}
