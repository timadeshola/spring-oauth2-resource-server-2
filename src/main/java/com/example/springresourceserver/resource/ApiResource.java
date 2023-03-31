package com.example.springresourceserver.resource;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project title: spring-resource-server
 *
 * @author johnadeshola
 * Date: 3/31/23
 * Time: 9:25 AM
 */
@RestController
public class ApiResource {

    @GetMapping("test")
    public String home(Authentication auth) {
        return "Welcome Home! " + auth.getName();
    }
}
