package co.edu.unisabana.parcial.controllerTest;

import co.edu.unisabana.parcial.controller.GateController;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(profiles = "test")
public class GateControllerTest {
    @Mock

    @InjectMocks
    GateController gateController;
}
