package ir.springframework.oauth2.github.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/secure")
public class SampleController {

    @GetMapping()
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello from secure endpoint.");
    }

}
