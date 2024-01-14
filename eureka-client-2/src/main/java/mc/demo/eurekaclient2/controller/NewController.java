package mc.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class NewController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
