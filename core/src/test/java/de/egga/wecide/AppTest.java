package de.egga.wecide;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {


    @Test
    public void app_should_have_proper_version() {
        App app = new App();
        assertThat(app.version).isEqualTo("0.0");
    }
}