package de.egga.wecide;

import org.assertj.core.api.SoftAssertions;
import org.junit.After;

public class TestBase {

    protected SoftAssertions softly = new SoftAssertions();

    @After
    public void tearDown() throws Exception {
        softly.assertAll();
    }
}
