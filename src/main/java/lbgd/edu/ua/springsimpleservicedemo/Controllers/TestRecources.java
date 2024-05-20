package lbgd.edu.ua.springsimpleservicedemo.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRecources {

    @GetMapping("recources/{name}")
    public String getName(@PathVariable String name) {return "Hello "+name;}
}
