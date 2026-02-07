package com.denden.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloController {

    // 2. @GetMapping("/hello"): When clients call the '/hello' URL
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello DenDen-Mushi! This is the Walking Skeleton.";
    }

    /* 3. API Health Check: Allows the monitoring system to know
            if the app is alive or dead
    */
   @GetMapping("/health")
   public String checkHealth() {
       return "OK"; // return 200 OK
   }
   
    
    
}