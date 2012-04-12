package cc.ensor.study.web;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomeControllerTest {

    private HomeController controller;

    @Before
    public void setUp() throws Exception {
        controller = new HomeController();
    }

    @Test
    public void testShowHome() throws Exception {
        String view = controller.showHome();
        assertThat(view, is("home"));
    }
}
