package org.rishav.bffservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class BFFService {
    public static void main(String[] args) {
        SpringApplication.run(BFFService.class, args);
    }

    @RequestMapping(value = "/bff-service/hello")
    String hello() {
        return new RestTemplate().getForObject("http://be-service-rishav-dev/products/hello", String.class);
    }
}
