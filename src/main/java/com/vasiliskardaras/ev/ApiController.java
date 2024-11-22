package com.vasiliskardaras.ev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Value("${app.api.key}")
    private String apiKey;

    @GetMapping("/")
    public String home() {
        return apiKey;
    }
}
