package de.egga.wecide;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class ApplicationTest {

    @Test
    public void it_should_be_an_application() {
        Application app = new Application();
        assertThat(app).isInstanceOf(Application.class);
    }
}