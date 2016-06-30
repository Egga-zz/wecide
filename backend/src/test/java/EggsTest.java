import de.egga.wecide.configuration.MainConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.get;

/**
 * @author egga
 */
@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest
@SpringApplicationConfiguration(classes = {MainConfiguration.class})
@WebAppConfiguration
@ActiveProfiles("local")
public class EggsTest {

    @Test
    public void it_should_get_egg() {
        get("/eggs/123").then().statusCode(200);
    }
}
