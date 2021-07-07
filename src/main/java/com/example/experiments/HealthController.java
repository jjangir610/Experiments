package com.example.experiments;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @RequestMapping("/ping")
  String ping(){
    return "pong";
  }

}
