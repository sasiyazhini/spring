package projectofmavean.demoproject;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerclass {

    @PostMapping("/greet")
    public String greet(@RequestBody KeyValue keyValue) {
        return "Hello, " + keyValue.getKey() + "! Your value is: " + keyValue.getValue();
    }
}

