package de.egga.wecide.eggs;

import de.egga.wecide.configuration.WebConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.jayway.restassured.RestAssured.*;
import static net.javacrumbs.jsonunit.JsonMatchers.jsonEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author egga
 */
@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest
@SpringApplicationConfiguration(classes = {WebConfiguration.class})
@WebAppConfiguration
@ActiveProfiles("local")
public class EggsTest {

    @Test
    public void it_should_list_eggs() {
        get("/eggs").then().statusCode(200);
    }

    @Test
    public void it_should_get_egg() {
        get("/eggs/123").then().statusCode(200);
    }

    @Test
    public void it_should_add_egg() {
        EggView person = randomPerson();
        given()
                .body(person)
                .header("Content-Type", APPLICATION_JSON_VALUE)

                .put("/eggs/123")

                .then()
                .statusCode(204);
    }

    @Test
    public void it_should_delete_egg() {
        delete("/eggs/123").then().statusCode(204);
    }


    @Test
    public void it_should_support_complete_lifecycle() throws Exception {
        String id = "1337";
        String fixture = fixture("test_person");

        given()
                .body(fixture)
                .header("Content-Type", APPLICATION_JSON_VALUE)

                .put("/eggs/" + id)

                .then()
                .statusCode(204);

        get("/eggs/" + id).
                then().body(jsonEquals(fixture));
    }


    private String fixture(String fileName) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        Path path = Paths.get(classLoader.getResource("json_fixtures/" + fileName + ".json").getPath());
        return new String(Files.readAllBytes(path));
    }

    private EggView randomPerson() {
        EggView person = new EggView();
        person.setName("Hank");
        person.setState("CC");
        return person;
    }
}
