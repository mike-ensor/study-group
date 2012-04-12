package cc.ensor.study.web;

import cc.ensor.study.service.DateService;
import cc.ensor.study.service.MockDateService;
import cc.ensor.study.web.model.HomeModel;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HomeControllerTest {

    private HomeController controller;

    @Before
    public void setUp() throws Exception {
        controller = new HomeController();
//        MockDateService mockDateService = new MockDateService();
//        mockDateService.setDate(new Date());
        controller.dateService = mock(DateService.class);
    }

    @Test
    public void testShowHome() throws Exception {
        when(controller.dateService.getNow()).thenReturn(new Date());
        String view = controller.showHome(new HomeModel());
        assertThat(view, is("home"));
    }
}
