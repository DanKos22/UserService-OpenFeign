package ie.atu.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private RegistrationServiceClient registrationServiceClient;

    @Autowired
    // Inject the Feign client interface using @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient){
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("/confirm-and-register")

    // Method to handle user registration requests
    public String confirmAndRegister(@RequestBody UserDetails user) {
        String confirm = registrationServiceClient.someDetails(user);
        //Map<String, String> responseMessage = new HashMap<>();
        //responseMessage.put("message", confirm);
        return confirm;
    }
}
