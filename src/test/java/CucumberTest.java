import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        glue = {"com/epam/jdi/httptests/steps", "com/epam/jdi/http/stepdefs/en"},
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
)
public class CucumberTest {

}