package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    private final Environment environment;

    @Autowired
    public BasicController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/devName")
    public String getDevName() {
        return environment.getProperty("myCustomEnvs.devName");
    }
}
