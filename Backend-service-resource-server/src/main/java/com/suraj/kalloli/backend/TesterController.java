package com.suraj.kalloli.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
public class TesterController {

    @GetMapping("/tester")
    @RolesAllowed({"tester"})
    public String getProduct(Principal principal) {
        return "Response from Product Service, User Id:" + principal.getName();
    }
}