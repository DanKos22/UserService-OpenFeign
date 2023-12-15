package ie.atu.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service", url = "$feign.url")
public interface RegistrationServiceClient {

    // Call endpoint confirm on port 8081
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails user);

}
